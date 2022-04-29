/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_nomina;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author raynickrosario
 */
public class Procesos_reversar_nomina extends javax.swing.JFrame {

    /**
     * Creates new form Procesos_reversar_nomina
     */
    public Procesos_reversar_nomina() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Combo_meses = new javax.swing.JComboBox<>();
        Combo_año = new javax.swing.JComboBox<>();
        btn_reversar = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();
        menu_principal = new javax.swing.JMenu();
        menu_Mantenimientos = new javax.swing.JMenu();
        mantenimiento_de_usuarios = new javax.swing.JMenu();
        mantenimiento_de_departamentos = new javax.swing.JMenu();
        mantenimiento_de_puestos = new javax.swing.JMenu();
        mantenimiento_de_empleados = new javax.swing.JMenu();
        menu_procesos = new javax.swing.JMenu();
        proceso_generar_nomina = new javax.swing.JMenu();
        proceso_reversar_nomina = new javax.swing.JMenu();
        menu_consultas = new javax.swing.JMenu();
        consulta_de_departamento = new javax.swing.JMenu();
        consulta_de_puestos = new javax.swing.JMenu();
        consulta_empleado = new javax.swing.JMenu();
        consulta_nomina = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Proceso reversar nomina");

        Combo_meses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        Combo_año.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        btn_reversar.setText("Reversar");
        btn_reversar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reversarMouseClicked(evt);
            }
        });

        menu_principal.setText("Principal");
        menu_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_principalMouseClicked(evt);
            }
        });
        menu.add(menu_principal);

        menu_Mantenimientos.setText("Mantenimientos");

        mantenimiento_de_usuarios.setText("De Usuarios");
        mantenimiento_de_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mantenimiento_de_usuariosMouseClicked(evt);
            }
        });
        menu_Mantenimientos.add(mantenimiento_de_usuarios);

        mantenimiento_de_departamentos.setText("De Departamentos");
        mantenimiento_de_departamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mantenimiento_de_departamentosMouseClicked(evt);
            }
        });
        menu_Mantenimientos.add(mantenimiento_de_departamentos);

        mantenimiento_de_puestos.setText("De Puestos");
        mantenimiento_de_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mantenimiento_de_puestosMouseClicked(evt);
            }
        });
        menu_Mantenimientos.add(mantenimiento_de_puestos);

        mantenimiento_de_empleados.setText("De Empleados");
        mantenimiento_de_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mantenimiento_de_empleadosMouseClicked(evt);
            }
        });
        menu_Mantenimientos.add(mantenimiento_de_empleados);

        menu.add(menu_Mantenimientos);

        menu_procesos.setText("Procesos");

        proceso_generar_nomina.setText("Generar Nomina");
        proceso_generar_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceso_generar_nominaMouseClicked(evt);
            }
        });
        menu_procesos.add(proceso_generar_nomina);

        proceso_reversar_nomina.setText("Reversar Nomina");
        proceso_reversar_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proceso_reversar_nominaMouseClicked(evt);
            }
        });
        menu_procesos.add(proceso_reversar_nomina);

        menu.add(menu_procesos);

        menu_consultas.setText("Consultas");

        consulta_de_departamento.setText("De Departamento");
        consulta_de_departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulta_de_departamentoMouseClicked(evt);
            }
        });
        menu_consultas.add(consulta_de_departamento);

        consulta_de_puestos.setText("De Puestos");
        consulta_de_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulta_de_puestosMouseClicked(evt);
            }
        });
        menu_consultas.add(consulta_de_puestos);

        consulta_empleado.setText("De Empleado");
        consulta_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulta_empleadoMouseClicked(evt);
            }
        });
        menu_consultas.add(consulta_empleado);

        consulta_nomina.setText("De Nomina");
        consulta_nomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulta_nominaMouseClicked(evt);
            }
        });
        menu_consultas.add(consulta_nomina);

        menu.add(menu_consultas);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Combo_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Combo_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_reversar)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Combo_meses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_reversar)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_principalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_principalMouseClicked

        this.setVisible(false);
        new Principal().setVisible(true);
    }//GEN-LAST:event_menu_principalMouseClicked

    private void mantenimiento_de_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mantenimiento_de_usuariosMouseClicked

        this.setVisible(false);
        new Mantenimiento_usuarios().setVisible(true);
    }//GEN-LAST:event_mantenimiento_de_usuariosMouseClicked

    private void mantenimiento_de_departamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mantenimiento_de_departamentosMouseClicked

        this.setVisible(false);
        new Mantenimiento_departamentos().setVisible(true);
    }//GEN-LAST:event_mantenimiento_de_departamentosMouseClicked

    private void mantenimiento_de_puestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mantenimiento_de_puestosMouseClicked

        this.setVisible(false);
        new Mantenimiento_puestos().setVisible(true);
    }//GEN-LAST:event_mantenimiento_de_puestosMouseClicked

    private void mantenimiento_de_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mantenimiento_de_empleadosMouseClicked

        this.setVisible(false);
        new Mantenimiento_empleados().setVisible(true);
    }//GEN-LAST:event_mantenimiento_de_empleadosMouseClicked

    private void proceso_generar_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceso_generar_nominaMouseClicked

        this.setVisible(false);
        new Procesos_generar_nomina().setVisible(true);
    }//GEN-LAST:event_proceso_generar_nominaMouseClicked

    private void proceso_reversar_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proceso_reversar_nominaMouseClicked

        this.setVisible(false);
        new Procesos_reversar_nomina().setVisible(true);
    }//GEN-LAST:event_proceso_reversar_nominaMouseClicked

    private void consulta_de_departamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_de_departamentoMouseClicked

        this.setVisible(false);
        new Consulta_departamentos().setVisible(true);
    }//GEN-LAST:event_consulta_de_departamentoMouseClicked

    private void consulta_de_puestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_de_puestosMouseClicked

        this.setVisible(false);
        new Consulta_puestos().setVisible(true);
    }//GEN-LAST:event_consulta_de_puestosMouseClicked

    private void consulta_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_empleadoMouseClicked

        this.setVisible(false);
        new Consulta_empleados().setVisible(true);

    }//GEN-LAST:event_consulta_empleadoMouseClicked

    private void consulta_nominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consulta_nominaMouseClicked

        this.setVisible(false);
        new Consulta_nomina().setVisible(true);

    }//GEN-LAST:event_consulta_nominaMouseClicked

    private void btn_reversarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reversarMouseClicked
        
        String fecha_nomina;
        boolean correcto = true;
        int id_nomina;
        
        if((Combo_meses.getSelectedIndex()+1) < 10){
                
            
            if(Combo_meses.getSelectedIndex() == 1){
            
                fecha_nomina = (Combo_año.getSelectedItem() + "-" + 0 + (Combo_meses.getSelectedIndex()+1) + "-" + 28);   
                
            }else{
            
                fecha_nomina = (Combo_año.getSelectedItem() + "-" + 0 + (Combo_meses.getSelectedIndex()+1) + "-" + 30);
                
            }
                    
        }else{
                
            fecha_nomina = (Combo_año.getSelectedItem() + "-" + (Combo_meses.getSelectedIndex()+1) + "-" + 30);
                    
        }
        
        //Fin de darle valores a la fecha con valores seleccionados
        
        try {
            
            File archivo_nomina = new File("archivos/nomina.txt");
            File archivo_empleado = new File("archivos/empleados.txt");
            File archivo_departamento = new File("archivos/departamentos.txt");
            File archivo_puesto = new File("archivos/puestos.txt");
            File archivo_coop = new File("archivos/coop.txt");
            File archivo_nuevo_nom = new File("archivos/temp.txt");
            
            BufferedReader br_nomina;
            BufferedReader br_empleado;
            BufferedReader br_departamento;
            BufferedReader br_coop;
            BufferedReader br_puesto;
            
            boolean fecha_encontrada = false;
            
            String[] arrStrNom = {""};
            
            if(!archivo_nomina.exists()){
            
                archivo_nomina.createNewFile();
                
            }
            
            try{
            
                br_nomina = new BufferedReader(new FileReader(archivo_nomina));
                
                String linea_nomina_antigua = "";
                String linea_nomina;
                
                while((linea_nomina = br_nomina.readLine()) != null){
                
                    arrStrNom = linea_nomina.split("; ");
                    
                    if(fecha_nomina.equals(arrStrNom[2])){
                    
                        correcto = true;
                        linea_nomina_antigua = linea_nomina;
                        
                        arrStrNom = linea_nomina_antigua.split("; ");

                        id_nomina = Integer.valueOf(arrStrNom[0]);

                        if(correcto){

                            int id_empleado = Integer.valueOf(arrStrNom[1]);
                            double salario_bruto = Double.valueOf(arrStrNom[3]);
                            double valor_afp = Double.valueOf(arrStrNom[4]);
                            double valor_ars = Double.valueOf(arrStrNom[5]);
                            double valor_coop = Double.valueOf(arrStrNom[6]);
                            double valor_isr = Double.valueOf(arrStrNom[7]);
                            double sueldo_neto = Double.valueOf(arrStrNom[8]);

                            if(valor_coop != 0.0){

                                try{

                                    br_coop = new BufferedReader(new FileReader(archivo_coop));
                                    File archivo_nuevo_coop = new File("archivos/temp2.txt");
                                    BufferedWriter bw_coop = new BufferedWriter(new FileWriter(archivo_nuevo_coop, true));

                                    String linea_coop;

                                    while((linea_coop = br_coop.readLine()) != null){

                                        String[] arrStrCop = linea_coop.split("; ");

                                        String lnueva = id_empleado + "; " + arrStrCop[1] + "; " + ((Double.valueOf(arrStrCop[2])) - valor_coop);
                                        String lantigua = arrStrCop[0] + "; " + arrStrCop[1] + "; " + arrStrCop[2];

                                        if(arrStrCop[0].equals(String.valueOf(id_empleado))){

                                            bw_coop.write(lnueva + "\r\n");

                                        }else{

                                            bw_coop.write(lantigua + "\r\n");

                                        }

                                    }

                                    if(archivo_coop.exists()){

                                        archivo_coop.delete();                                

                                    }

                                    archivo_nuevo_coop.renameTo(archivo_coop);

                                    br_coop.close();
                                    bw_coop.close();
                                    
                                    fecha_encontrada = true;

                                }catch(Exception e){

                                    e.printStackTrace();

                                }

                            }

                        }                                                              
                        
                    }else{
                                                                    
                        try{
                                                    
                            BufferedWriter bw_nom = new BufferedWriter(new FileWriter(archivo_nuevo_nom, true));
                            
                            bw_nom.write(linea_nomina + "\r\n");
                            
                            bw_nom.close();
                            
                        }catch(Exception e){
                        
                            e.printStackTrace();
                            
                        }                                                
                        
                    }                    

                }      
               
                
                if(archivo_nomina.exists()){
                
                    archivo_nomina.delete();
                    
                }
                
                archivo_nuevo_nom.renameTo(archivo_nomina);
                
                br_nomina.close();
                
                if(fecha_encontrada){
                
                    JOptionPane.showMessageDialog(null, "Borrada con Exito!");
                    
                }else{
                
                    JOptionPane.showMessageDialog(null, "No Existe.");
                    
                }               
                
            }catch(Exception e){
            
                e.printStackTrace();
                
            }           
            
        }catch (Exception e){
        
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_btn_reversarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Procesos_reversar_nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Procesos_reversar_nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Procesos_reversar_nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Procesos_reversar_nomina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Procesos_reversar_nomina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo_año;
    private javax.swing.JComboBox<String> Combo_meses;
    private javax.swing.JButton btn_reversar;
    private javax.swing.JMenu consulta_de_departamento;
    private javax.swing.JMenu consulta_de_puestos;
    private javax.swing.JMenu consulta_empleado;
    private javax.swing.JMenu consulta_nomina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu mantenimiento_de_departamentos;
    private javax.swing.JMenu mantenimiento_de_empleados;
    private javax.swing.JMenu mantenimiento_de_puestos;
    private javax.swing.JMenu mantenimiento_de_usuarios;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_Mantenimientos;
    private javax.swing.JMenu menu_consultas;
    private javax.swing.JMenu menu_principal;
    private javax.swing.JMenu menu_procesos;
    private javax.swing.JMenu proceso_generar_nomina;
    private javax.swing.JMenu proceso_reversar_nomina;
    // End of variables declaration//GEN-END:variables
}
