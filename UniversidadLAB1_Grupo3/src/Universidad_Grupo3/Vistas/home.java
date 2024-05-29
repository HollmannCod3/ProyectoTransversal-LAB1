/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Universidad_Grupo3.Vistas;

import javax.swing.JInternalFrame;

/**
 *
 * @author Hollmann
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiFormularioAlm = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiFormularioMat = new javax.swing.JMenuItem();
        jmAdministracion = new javax.swing.JMenu();
        jmiInscripciones = new javax.swing.JMenuItem();
        jmiNotas = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmiAlumnoMat = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jmiFormularioAlm.setText("Formulario de Alumno");
        jmiFormularioAlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioAlmActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiFormularioAlm);

        jMenuBar.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiFormularioMat.setText("Formulario de Materia");
        jmMateria.add(jmiFormularioMat);

        jMenuBar.add(jmMateria);

        jmAdministracion.setText("Administración");

        jmiInscripciones.setText("Manejo de Inscripciones");
        jmAdministracion.add(jmiInscripciones);

        jmiNotas.setText("Manipulacion de notas");
        jmAdministracion.add(jmiNotas);

        jMenuBar.add(jmAdministracion);

        jmConsulta.setText("Consultas");

        jmiAlumnoMat.setText("Alumno por Materia");
        jmConsulta.add(jmiAlumnoMat);

        jMenuBar.add(jmConsulta);

        jmSalir.setText("Salir");
        jMenuBar.add(jmSalir);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void dibujarVentana(JInternalFrame ventana) {
        escritorio.removeAll();
        escritorio.repaint();
        ventana.setVisible(true);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
    }
    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed
    
    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmiFormularioAlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioAlmActionPerformed
        // TODO add your handling code here:
          Alumnos ventana = new Alumnos();
            dibujarVentana(ventana);
    }//GEN-LAST:event_jmiFormularioAlmActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlumnoMat;
    private javax.swing.JMenuItem jmiFormularioAlm;
    private javax.swing.JMenuItem jmiFormularioMat;
    private javax.swing.JMenuItem jmiInscripciones;
    private javax.swing.JMenuItem jmiNotas;
    // End of variables declaration//GEN-END:variables
}
