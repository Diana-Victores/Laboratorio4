/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.sql.*;
import javax.swing.JOptionPane;
//Programa Demostracion de trabajo con base de datos Mysql
/**
 *
.
 */
public class RegistroAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form RegistroAlumnos 
     */
    public RegistroAlumnos() {
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
        txt_concepto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_empleado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nominaE = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nominaD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el código del alumno: ");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setText("NominaE");

        jLabel5.setText("NominaD:");

        jLabel6.setText("Departamento:");

        jLabel7.setText("Puesto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4))
                .addGap(0, 143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txt_concepto, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txt_empleado)
                    .addComponent(label_status)
                    .addComponent(jLabel4)
                    .addComponent(nominaE)
                    .addComponent(jLabel5)
                    .addComponent(nominaD)
                    .addComponent(jLabel6)
                    .addComponent(txt_departamento)
                    .addComponent(jLabel7)
                    .addComponent(txt_puesto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nominaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nominaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(55, 55, 55)
                .addComponent(label_status)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Maestradeconceptos", "root", "");//conecta a MYSQL  
            PreparedStatement pst = cn.prepareStatement("insert into concepto values(?,?,?,?,?,?)");
            
            pst.setString(1, txt_concepto.getText().trim()); 
            pst.setString(2, txt_empleado.getText().trim()); 
            pst.setString(3, nominaE.getText().trim()); // txt_direccion
            pst.setString(4, nominaD.getText().trim()); // txt_telefono
            pst.setString(5, txt_departamento.getText().trim()); // txt_correo
          pst.setString(6, txt_puesto.getText().trim()); // txt_status
            pst.executeUpdate();
            
            txt_concepto.setText("");
            txt_empleado.setText("");
            label_status.setText("Registro exitoso.");
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from concepto where CodigoMaestro = ?");
            pst.setString(1, txt_buscar.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_concepto.setText(rs.getString("CodigoMaestro"));
                txt_empleado.setText(rs.getString("NombreMaestro"));
                nominaE.setText(rs.getString("DireccionMaestro"));
                nominaD.setText(rs.getString("TelefonoMaestro"));
                txt_departamento.setText(rs.getString("CorreoMaestro"));
                txt_puesto.setText(rs.getString("StatusMaestro"));
   
            } else {
                JOptionPane.showMessageDialog(null, "Maestro no registrado.");
            }
            
        }catch (Exception e){
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("update concepto set CodigoConcepto = ?, NombreEmpleado = ?, NominaE = ?, NominaD = ?, Departamento = ?, Puesto = ?, where ID = " + ID);
            
            /*
            ESTO YA NO ESTA BIEN PORQUE TUS COLUMNAS SON DISTINTAS
            TIENES QUE QUE TENER BIEN CLARO QUE ESOS NOMBRES SERAN TUS COLUMNAS
            POR ENDE AQUI VAN 6 COLUMNAS
            */
            
            pst.setString(1, txt_concepto.getText().trim());
            pst.setString(2, txt_empleado.getText().trim());
            pst.setString(1, nominaE.getText().trim());
            pst.setString(2, nominaD.getText().trim());
            pst.setString(1, txt_departamento.getText().trim());
             pst.setString(1, txt_puesto.getText().trim());
            /*
            AQUI ES LO MISMO DE ARRIBA USA LOS TXT QUE VAS A CREAR
            */
            pst.executeUpdate();
            
            label_status.setText("Modificación exitosa.");
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from concepto where CodigoMaestro = ?");
            
            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();
            
            txt_concepto.setText("");
            txt_empleado.setText("");
            txt_buscar.setText("");
            nominaE.setText("");
            nominaD.setText("");
            txt_departamento.setText("");
            txt_puesto.setText("");
            /*
            TUS CAMPOS BLA BLA BLA YA SABES
            */
            
            label_status.setText("Registro eliminado.");
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField nominaD;
    private javax.swing.JTextField nominaE;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_concepto;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_empleado;
    private javax.swing.JTextField txt_puesto;
    // End of variables declaration//GEN-END:variables
}