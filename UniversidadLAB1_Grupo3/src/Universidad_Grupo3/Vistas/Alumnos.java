/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Universidad_Grupo3.Vistas;

import  Universidad_Grupo3.AccesoADatos.AlumnoData;
import  Universidad_Grupo3.Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import  java.util.Date;
import  javax.swing.JOptionPane;


/**
 *
 * @author Hollmann
 * @adamrigg
 */
public class Alumnos extends javax.swing.JInternalFrame {

    
    private AlumnoData alumnodata;
    /**
     * Creates new form Alumnos
     */
    public Alumnos() {
        initComponents();
        alumnodata = new AlumnoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlAlumno = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jcActivo = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jdFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jlAlumno.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlAlumno.setText("Alumno");

        jlDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlDocumento.setText("Documento:");

        jlApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlApellido.setText("Apellido:");

        jlNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlNombre.setText("Nombre:");

        jlFecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlFecha.setText("Fecha de Nacimiento:");

        jtDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDocumentoKeyTyped(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });

        jcActivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcActivo.setText(" Activo.");

        jbBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jbNuevo)
                .addGap(68, 68, 68)
                .addComponent(jbEliminar)
                .addGap(78, 78, 78)
                .addComponent(jbGuardar)
                .addGap(74, 74, 74)
                .addComponent(jbSalir)
                .addGap(137, 137, 137))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(368, 368, 368)
                .addComponent(jlAlumno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDocumento)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlApellido)
                            .addComponent(jlNombre)
                            .addComponent(jlFecha))
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jcActivo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jdFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(76, 76, 76)
                                .addComponent(jbBuscar)))))
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlAlumno)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDocumento)
                    .addComponent(jbBuscar)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jcActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFecha)
                    .addComponent(jdFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        Alumno alumno = null;
        Integer dni = Integer.valueOf(jtDocumento.getText());
        if (dni == null){
            JOptionPane.showMessageDialog(null, "El campo se encuentra vacío" );
            return;
        }
            alumno = alumnodata.buscarAlumnoPorDni(dni);  
            
        if (alumno == null){
            JOptionPane.showMessageDialog(null, "No se encuentra el alumno" );
          
            return;
        }
         jtApellido.setText(alumno.getApellido());
         jtNombre.setText(alumno.getNombre());
         if (alumno.isActivo() == true){
             jcActivo.setSelected(isSelected);
         }
         Date date = Date.from(alumno.getFechaNac().atStartOfDay(java.time.ZoneId.systemDefault()).toInstant());
         jdFecha.setDate(date);
    }//GEN-LAST:event_jbBuscarActionPerformed


    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        AlumnoData alumnoData = new AlumnoData();
        Alumno alu;
        Date fechaSeleccionada = jdFecha.getDate();

        if (jtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de documento");
            return;
        } else if (jtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un Apellido");
            return;
        } else if (jtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
            return;
        } else if (fechaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha");
            return;
        }

        fechaSeleccionada = jdFecha.getDate();
        LocalDate FechaNacimiento = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Integer dni = Integer.valueOf(jtDocumento.getText());
        boolean activo = jcActivo.isSelected();

        alu = alumnoData.buscarAlumnoPorDni(dni);

        if (alu != null) {
            
            alu.setApellido(jtApellido.getText());
            alu.setNombre(jtNombre.getText());
            alu.setFechaNac(FechaNacimiento);
            alu.setActivo(activo);
            alumnoData.modificarAlumno(alu);
        } else {
       
            alu = new Alumno();
            alu.setDni(dni);
            alu.setApellido(jtApellido.getText());
            alu.setNombre(jtNombre.getText());
            alu.setFechaNac(FechaNacimiento);
            alu.setActivo(activo);
            alumnoData.guardarAlumno(alu);
        }

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocumentoKeyTyped
           char caracter = evt.getKeyChar();
        if (!Character.isDigit(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDocumentoKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
         char caracter = evt.getKeyChar();
        if (!Character.isAlphabetic(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        char caracter = evt.getKeyChar();
        if (!Character.isAlphabetic(caracter)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

      private void limpiarCampos(){
        jtDocumento.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jcActivo.setSelected(false);
        jdFecha.setDate(null);
    }
    
    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
      AlumnoData alumnoData=new AlumnoData();
        Alumno alu = null;
        Date fechaSeleccionada = jdFecha.getDate();
        
        if (jtDocumento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero de documento");
            return;
            
        } 
            fechaSeleccionada = jdFecha.getDate();
          
            Integer dni = Integer.valueOf(jtDocumento.getText());
            jcActivo.setSelected(isSelected);
            
           alu = alumnoData.buscarAlumnoPorDni(dni);
           int id=alu.getIdAlumno();
           alumnoData.eliminarAlumno(id);
           limpiarCampos();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
         this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcActivo;
    private com.toedter.calendar.JDateChooser jdFecha;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
