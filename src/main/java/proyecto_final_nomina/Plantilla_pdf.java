
package proyecto_final_nomina;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.commons.logging.Log;

/**
 *
 * @author raynickrosario
 */
public class Plantilla_pdf {
    
        public void Plantilla(String nombre_empresa, String id_empleado, String nombre ,String apellido ,String fecnomina,
            double salario_bruto ,double AFP ,double ARS ,double Cooperativa, double ISR ,double Sueldo_neto,  
            String Departamento, String Puesto, double Descuento){
                
                String [] fecha_limpia = fecnomina.split("-");
                String mesyano = null;
                switch (fecha_limpia[1]) {

                    case "01":
                      mesyano = "Enero";
                      break;

                    case "02":
                      mesyano = "Febrero";
                      break;
                
                    case "03":
                      mesyano = "Marzo";
                      break;
                
                    case "04":
                      mesyano = "Abril";
                      break;
                
                    case "05":
                      mesyano = "Mayo";// code
                      break;
                
                    case "06":
                      mesyano = "Junio";// code
                      break;
                
                    case "07":
                      mesyano = "Julio";// code
                      break;
                
                    case "08":
                      mesyano = "Agosto";
                      break;
                
                    case "09":
                      mesyano = "Septiembre";
                      break;
                
                    case "10":
                      mesyano = "Octubre";
                      break;
                
                    case "11":
                      mesyano = "Noviembre";
                      break;
                
                    case "12":
                      mesyano = "Diciembre";
                      break;
                }
                      
                      mesyano= mesyano+"_"+fecha_limpia[2];
                      
//            File archivo1 = new File("Nomina_empleado_ID_0.pdf");
            
            File archivo1 = new File("nominas/Nominas_" + mesyano + "/nomina_empleado_ID_0" + id_empleado +".pdf");
            
            if(!archivo1.getParentFile().exists())  archivo1.getParentFile().mkdir();
            
            DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            PDDocument documento = new PDDocument();
            PDPage pag = new PDPage(PDRectangle.LETTER);
            documento.addPage(pag);
            PDPageContentStream content = new PDPageContentStream(documento, pag);
            
            content.beginText();
            content.setFont(PDType1Font.TIMES_BOLD, 18);
            content.newLineAtOffset((pag.getMediaBox().getWidth()/3), pag.getMediaBox().getHeight()-52);
            content.showText(nombre_empresa);
            content.endText();
            
            content.beginText();
            //content.setFont(PDType1Font.HELVETICA_BOLD, 14);
            content.newLineAtOffset(50, pag.getMediaBox().getHeight()-70);
            content.showText("REPORTE DE NOMINA MENSUAL CORREPONDIENTE AL PERIODO " + fecnomina);
            content.endText();
            
            content.beginText();
            //content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-120);
            content.showText("NOMBRE: " + nombre+" "+apellido +  "        " + "ID EMPLEADO: "+ id_empleado + "                     " + "FECHA " + dtf4.format(LocalDateTime.now()));
            content.endText();
            
            content.beginText();
            //content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-140);
            content.showText("DEPARTAMENTO: " + Departamento + "        " + "PUESTO: " + Puesto);
            content.endText();
            
            content.beginText();
            //content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-180);
            content.showText("CONCEPTO: ");
            content.endText();

            content.beginText();
            //content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-195);
            content.showText("                      SALARIO BRUTO:     RD$ "+ salario_bruto);
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 10);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-225);
            content.showText("DEDUCCIONES: ");
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 10);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-240);
            content.showText("ARS(3.04%)                                    ARS:     RD$"+ ARS);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 10);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-255);
            content.showText("AFP(2.87%)                                    AFP:     RD$"+ AFP);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 10);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-270);
            content.showText("COOPERATIVA("+Descuento+"%)                  COOP:     RD$"+ Cooperativa);
            content.endText();
            
            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 10);
            content.newLineAtOffset(25 , pag.getMediaBox().getHeight()-285);
            content.showText("IMP SOBRE LA RENTA:                 ISR:     RD$"+ ISR);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(370 , pag.getMediaBox().getHeight()-300);
            content.showText("SUELDO NETO:     RD$"+ Sueldo_neto);
            content.endText();

            content.beginText();
            content.setFont(PDType1Font.HELVETICA, 12);
            content.newLineAtOffset(0, pag.getMediaBox().getHeight()-305);
            content.showText("__________________________________________________________________________________________________");
            content.endText();

            content.close();
            
            
            
            documento.save(archivo1);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    
    }
    
}
