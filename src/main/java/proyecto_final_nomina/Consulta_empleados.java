/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_nomina;

import java.io.*;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raynickrosario
 */
public class Consulta_empleados extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_empleados
     */
    
    DefaultTableModel Tabla;
    
    public Consulta_empleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Tabla = (DefaultTableModel) this.JTable.getModel();
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        btn_consultar = new javax.swing.JButton();
        btn_ordenar_x_fecha = new javax.swing.JButton();
        btn_ordenar_x_puesto = new javax.swing.JButton();
        btn_ordenar_x_dept = new javax.swing.JButton();
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
        jLabel1.setText("Consulta de Empleados");

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Appelido Paterno", "Apellido Materno", "Direccion", "Telefono", "Sexo", "ID Departamento", "Fecha de Ingreso", "ID Puesto", "Coop", "Salario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTable);

        btn_consultar.setText("Consultar");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });

        btn_ordenar_x_fecha.setText("X Fecha");

        btn_ordenar_x_puesto.setText("X ID Puesto");

        btn_ordenar_x_dept.setText("X ID Dept");

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
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(btn_ordenar_x_dept)
                .addGap(69, 69, 69)
                .addComponent(btn_ordenar_x_puesto)
                .addGap(95, 95, 95)
                .addComponent(btn_ordenar_x_fecha)
                .addGap(85, 85, 85)
                .addComponent(btn_consultar)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ordenar_x_dept)
                    .addComponent(btn_ordenar_x_puesto)
                    .addComponent(btn_ordenar_x_fecha)
                    .addComponent(btn_consultar))
                .addContainerGap(80, Short.MAX_VALUE))
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

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked
        
        Tabla.setRowCount(0);
        
        String id;
        String nombre;
        String apellido_paterno;
        String apellido_materno;
        String direccion;
        String telefono;
        String sexo;
        String id_dept;
        String fecha;
        String id_puesto;
        String coop;
        String salario;
        
        File arch = new File("archivos/empleados.txt");
        
        try {
            
            if(arch.exists()){
            
                String linea;
                
                Scanner a = new Scanner(arch);
                
                while(a.hasNextLine()){
                
                    linea = a.nextLine();
                    Scanner k = new Scanner(linea);
                    k.useDelimiter("\\s*;\\s*");
                    
                    id = k.next();
                    nombre = k.next();
                    apellido_paterno = k.next();
                    apellido_materno = k.next();
                    direccion = k.next();
                    telefono = k.next();
                    sexo = k.next();
                    id_dept = k.next();
                    fecha = k.next();
                    id_puesto = k.next();
                    coop = k.next();
                    salario = k.next();
                    
                    Tabla.addRow(new Object [] {id, nombre, apellido_paterno, apellido_materno, direccion, telefono, sexo, id_dept, fecha, id_puesto, coop, salario});
                    
                }
                
                a.close();
                
            }
            
        } catch (Exception e) {
            
            System.out.println(e);
            
        }
        
    }//GEN-LAST:event_btn_consultarMouseClicked

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
            java.util.logging.Logger.getLogger(Consulta_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_ordenar_x_dept;
    private javax.swing.JButton btn_ordenar_x_fecha;
    private javax.swing.JButton btn_ordenar_x_puesto;
    private javax.swing.JMenu consulta_de_departamento;
    private javax.swing.JMenu consulta_de_puestos;
    private javax.swing.JMenu consulta_empleado;
    private javax.swing.JMenu consulta_nomina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
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
