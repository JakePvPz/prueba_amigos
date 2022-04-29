/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto_final_nomina;

import java.awt.Color;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author raynickrosario
 */
public class Mantenimiento_usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Mantenimiento_usuarios
     */
    
    boolean id_existe = false;
    String linea_antigua;
    
    public Mantenimiento_usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        btn_grupo.add(btn_es_admin);
        btn_grupo.add(btn_es_user);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_grupo = new javax.swing.ButtonGroup();
        lbl_titulo = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_login = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        lbl_pass = new javax.swing.JLabel();
        txt_clave = new javax.swing.JPasswordField();
        lbl_acceso = new javax.swing.JLabel();
        btn_es_admin = new javax.swing.JRadioButton();
        btn_es_user = new javax.swing.JRadioButton();
        lbl_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        lbl_apellido = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
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

        lbl_titulo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lbl_titulo.setText("Mantenimiento de Usuarios");

        lbl_id.setText("ID:");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        lbl_login.setText("Login_user: ");

        lbl_pass.setText("Pass_user:");

        lbl_acceso.setText("Acceso: ");

        btn_es_admin.setText("Admin");

        btn_es_user.setText("User");

        lbl_nombre.setText("Nombre:");

        lbl_apellido.setText("Apellido:");

        lbl_email.setText("E-mail:");

        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_guardarMouseClicked(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_email)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_acceso)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_es_admin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_es_user))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_pass)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_login)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_id)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_apellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_apellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_login)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_pass)
                    .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_acceso)
                    .addComponent(btn_es_admin)
                    .addComponent(btn_es_user))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombre)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellido)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_email)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_guardar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        
        String id_input = txt_id.getText();

        txt_login.setText("");
        txt_clave.setText("");
        btn_es_admin.setSelected(false);
        btn_es_user.setSelected(false);
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_email.setText("");
        
        try {
            
            File archivo = new File("archivos/login.txt");

            if(!archivo.exists()){//No existe Archivo
            
                archivo.createNewFile();
                
            }//Fin archivo no existe

            BufferedReader br = new BufferedReader(new FileReader(archivo));
            Scanner sc = new Scanner(archivo);
            
            while(sc.hasNextLine() && !id_existe){
            
                String linea = sc.nextLine();
                Scanner sl = new Scanner(linea);
                sl.useDelimiter("\\s*;\\s*");
                
                String id = sl.next();
                String user_name = sl.next();
                String pw = sl.next();
                int rol = Integer.valueOf(sl.next());
                String nombre_usuario = sl.next();
                String apellido = sl.next();
                String email = sl.next();
                
                if(id_input.equals(id)){//Comprobamos que el ID exista y si lo hace entonces queremos llenar todos los campos de la interfaz

                    id_existe = true;
                    linea_antigua = id + "; " + user_name + "; " + pw + "; " + rol + "; " + nombre_usuario + "; " + apellido + "; " + email;
                    
                    txt_login.setText(user_name);
                    txt_clave.setText(pw);
                    
                    if(rol == 0){//Comprobamos que el ID sea de un admin. Si lo es seleccionamos el btn de admin.
                    
                        btn_es_admin.setSelected(true);
                        
                    }else{// De lo contrario seleccionamos el btn de user
                    
                        btn_es_user.setSelected(true);
                        
                    }
                    
                    txt_nombre.setText(nombre_usuario);
                    txt_apellido.setText(apellido);
                    txt_email.setText(email);
                    
                    JOptionPane.showMessageDialog(null, "Puede Modificar");
                
                }else{
                
                    id_existe = false;
                    
                }
                              
            }
            
            if(!id_existe){
            
                JOptionPane.showMessageDialog(null, "Creando Nuevo");
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseClicked
        
        boolean correr = false; // Esta varialbe se usa despues de comprobar que todos los campos estan llenos.
        int total = 0; // Esta variable sumara 6 si todos los campos estan llenos.
        
        String id = txt_id.getText();
        String login = txt_login.getText();
        String pw = String.valueOf(txt_clave.getPassword());
        
        int rol;
        
        if(btn_es_admin.isSelected()){// Es Admin
        
            rol = 0;
            
        }else if(btn_es_user.isSelected()){// Es User
        
            rol = 1;
            
        }else{ // No fue seleccionado
        
            rol = -1;
            
        }
        
        String nombre = txt_nombre.getText();
        String apellido = txt_apellido.getText();
        String email = txt_email.getText();
        
        // Evaluar que los campos esten llenos.
        
        if(!id.isBlank()){// Si el ID no esta vacio, pasamos a evaluar el siguiente campo.
        
            total += 1;
            lbl_id.setForeground(Color.black);
            
        }else{// Si el ID esta vacio, lo marcamos con rojo.
        
            lbl_id.setForeground(Color.red);
            
        }
        
        if(!login.isBlank()){// Si el login no esta vacio, pasamos a evaluar el siguiente campo.
            
            total += 1;
            lbl_login.setForeground(Color.black);
            
        }else{ // Si el login esta vacio, lo marcamos con rojo.
            
            lbl_login.setForeground(Color.red);
                
        }
        
        if(!pw.isBlank()){// Si la clave no esta vacia, pasamos a evaluar el siguiente campo.

            total += 1;
            lbl_pass.setForeground(Color.black);
        
        } else {// Si la clave esta vacia, la marcamos con rojo.
                
            lbl_pass.setForeground(Color.red);
                    
        }
        
        if(rol != -1){// Si el rol fue seleccionado, pasamos a evaluar el siguiente campo.
                    
            total += 1;
            lbl_acceso.setForeground(Color.black);
                        
        } else {// Si el rol no fue seleccionado, marcamos el campo con rojo.
                    
            lbl_acceso.setForeground(Color.red);
        
        }
        
        if(!nombre.isBlank()){// Si el nombre no esta vacio, pasamos a evaluar el siguiente campo.
            
            total += 1;
            lbl_nombre.setForeground(Color.black);

        } else {// Si el nombre esta vacio, lo marcamos con rojo.
                        
            lbl_nombre.setForeground(Color.red);
        
        }
        
        if(!apellido.isBlank()){// Si, finalmente, el apellido no esta vacio cambiamos el valor de correr.
                            
            total += 1;
            lbl_apellido.setForeground(Color.black);
            
        }else{// Si el apellido esta vacia, la marcamos con rojo.
                            
            lbl_apellido.setForeground(Color.red);
                                
        }
        
        if(total == 6){
        
            System.out.println("Todos los campos de Mantenimiento Usuarios estan llenos.");
            correr = true;
            
        }else{
        
            System.out.println("Alguno de los campos de Mantenimiento Usuarios esta vacio.");
        
        }
        
        // Fin de evaluacion de campos llenos.
        
        // Comenzamos a guardar.
        
        if(correr){
        
            try{
                
                File archivo = new File("archivos/login.txt");

                if(!archivo.exists()){//No existe Archivo
            
                    archivo.createNewFile();
                
                }//Fin archivo no existe

                BufferedReader br = new BufferedReader(new FileReader(archivo));
                Scanner sc = new Scanner(archivo);
                String linea_nueva = id + "; " + login + "; " + pw + "; " + rol + "; " + nombre + "; " + apellido + "; " + email; // Definimos la linea modificada
                
                if(id_existe){// Modificamos
                
                    File archivo_nuevo = new File("archivos/temp.txt");// Creamos el archivo nuevo con nombre temporal
                    BufferedWriter bw = new BufferedWriter(new FileWriter(archivo_nuevo, true));// Preparamos el objeto para escribir
                    String linea;
                    
                    try{
                        
                        if(!archivo_nuevo.exists()){
                        
                            archivo_nuevo.createNewFile();
                            
                        }
                        
                        while( (linea = br.readLine()) != null){// Recorremos el archivo original y la variable linea guarda los datos de la linea actual.
                    
                            if(linea.equals(linea_antigua)){// Evaluamos la linea actual. Si estamos en la linea que queremos modificar, cambiamos lo que se escribe en el nuevo archivo. Escribimos la linea modificada.

                                bw.write(linea_nueva + "\r\n");// Escribimos linea modificada

                            }else{// No es la linea modificada. Se pasa igual.

                                bw.write(linea + "\r\n");// No es la linea modificada. Se pasa igual.

                            }
                        
                        }
                    
                        bw.close();// Cerramos el archivo.
                        
                        String nombre_arch_antiguo = archivo.getName();
                        
                        if(archivo.exists()){
                        
                            archivo.delete();
                            System.out.println("Archivo: " + nombre_arch_antiguo);
                            
                        }
                        
                        archivo_nuevo.renameTo(archivo);
                        
                        JOptionPane.showMessageDialog(null, "Modificado con exito!");
                        
                    
                    }catch(Exception e){
                    
                        System.out.println("Error Creando archivo para modificar");
                        
                    }
                    
                    
                }else{// Agregamos
                
                    try{
                    
                        FileWriter F1 = new FileWriter(archivo, true);
                        PrintWriter esc = new PrintWriter(F1);   
                        esc.println(linea_nueva);
                        esc.close();
                        
                        JOptionPane.showMessageDialog(null, "Guardado con exito!");
                        
                    }catch(Exception e){
                    
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Error Creando.");
                    }
                    
                }
                
                sc.close();
              
                txt_id.setText("");
                txt_login.setText("");
                txt_clave.setText("");
                btn_es_admin.setSelected(false);
                btn_es_user.setSelected(false);
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_email.setText("");
                
            } catch (Exception e){
            
                e.printStackTrace();
                
            }
            
        }
        
        
    }//GEN-LAST:event_btn_guardarMouseClicked

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
            java.util.logging.Logger.getLogger(Mantenimiento_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento_usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mantenimiento_usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btn_es_admin;
    private javax.swing.JRadioButton btn_es_user;
    private javax.swing.ButtonGroup btn_grupo;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JMenu consulta_de_departamento;
    private javax.swing.JMenu consulta_de_puestos;
    private javax.swing.JMenu consulta_empleado;
    private javax.swing.JMenu consulta_nomina;
    private javax.swing.JLabel lbl_acceso;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_titulo;
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
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
