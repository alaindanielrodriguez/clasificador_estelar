/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import clasificador_estelar.PrologProgram;
import javax.swing.JOptionPane;
import utiles.keyboradUtil;

/**
 *
 * @author alain
 */
public class IntroducirDatos extends javax.swing.JDialog {

    /**
     * Creates new form IntroducirDatos
     */
    public IntroducirDatos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/pexels-felix-mittermeier-956999.jpg"))); // load the image to a imageIcon
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabelFondo.setIcon(imageIcon);
        
        siguienteCampo();
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldAscension = new javax.swing.JTextField();
        jLabelId1 = new javax.swing.JLabel();
        jLabelId2 = new javax.swing.JLabel();
        jTextFieldDeclinacion = new javax.swing.JTextField();
        jTextFieldCorrimiento = new javax.swing.JTextField();
        jTextFieldUltravioleta = new javax.swing.JTextField();
        jLabelId3 = new javax.swing.JLabel();
        jLabelId4 = new javax.swing.JLabel();
        jLabelId5 = new javax.swing.JLabel();
        jTextFieldVerde = new javax.swing.JTextField();
        jTextFieldInfrarrojoCercano = new javax.swing.JTextField();
        jLabelId6 = new javax.swing.JLabel();
        jLabelId7 = new javax.swing.JLabel();
        jTextFieldInfrarrojo = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("CLASIFICACIÓN DE OBJETO ESTELAR");
        jPanel1.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 420, 60));

        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Identificador de objeto:");
        jPanel1.add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 130, 20));

        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });
        jTextFieldId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldIdKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, -1));

        jTextFieldAscension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAscensionActionPerformed(evt);
            }
        });
        jTextFieldAscension.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAscensionKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldAscension, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 70, -1));

        jLabelId1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId1.setText("Ascensión recta:");
        jPanel1.add(jLabelId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 20));

        jLabelId2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId2.setText("Declinación:");
        jPanel1.add(jLabelId2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 20));

        jTextFieldDeclinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDeclinacionActionPerformed(evt);
            }
        });
        jTextFieldDeclinacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDeclinacionKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldDeclinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, -1));

        jTextFieldCorrimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorrimientoActionPerformed(evt);
            }
        });
        jTextFieldCorrimiento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCorrimientoKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldCorrimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, -1));

        jTextFieldUltravioleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltravioletaActionPerformed(evt);
            }
        });
        jTextFieldUltravioleta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldUltravioletaKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldUltravioleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 70, -1));

        jLabelId3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId3.setText("Corrimiento al rojo:");
        jPanel1.add(jLabelId3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 20));

        jLabelId4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId4.setText("Filtro ultravioleta*:");
        jPanel1.add(jLabelId4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 130, 20));

        jLabelId5.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId5.setText("Filtro de verde*:");
        jPanel1.add(jLabelId5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 90, 20));

        jTextFieldVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVerdeActionPerformed(evt);
            }
        });
        jTextFieldVerde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldVerdeKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 70, -1));

        jTextFieldInfrarrojoCercano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInfrarrojoCercanoActionPerformed(evt);
            }
        });
        jTextFieldInfrarrojoCercano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInfrarrojoCercanoKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldInfrarrojoCercano, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 70, -1));

        jLabelId6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId6.setText("Filtro de infrarrojo cercano*:");
        jPanel1.add(jLabelId6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 170, 20));

        jLabelId7.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId7.setText("Filtro de infrarrojo*:");
        jPanel1.add(jLabelId7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 110, 20));

        jTextFieldInfrarrojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInfrarrojoActionPerformed(evt);
            }
        });
        jTextFieldInfrarrojo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldInfrarrojoKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldInfrarrojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 70, -1));

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setEnabled(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 80, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("*En el sistema fotométrico del SDSS.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 340, 20));

        jLabelFondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pexels-igor-mashkov-6325001.jpg"))); // NOI18N
        jLabelFondo.setText("Identifi");
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUltravioletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUltravioletaActionPerformed

    }//GEN-LAST:event_jTextFieldUltravioletaActionPerformed

    private void jTextFieldAscensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAscensionActionPerformed

    }//GEN-LAST:event_jTextFieldAscensionActionPerformed

    private void jTextFieldCorrimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorrimientoActionPerformed

    }//GEN-LAST:event_jTextFieldCorrimientoActionPerformed

    private void jTextFieldInfrarrojoCercanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInfrarrojoCercanoActionPerformed

    }//GEN-LAST:event_jTextFieldInfrarrojoCercanoActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        String idObj = jTextFieldId.getText();
        String ascension = jTextFieldAscension.getText();
        String declinacion = jTextFieldDeclinacion.getText();
        String corrimiento_rojo = jTextFieldCorrimiento.getText();
        String ultravioleta = jTextFieldUltravioleta.getText();
        String verde = jTextFieldVerde.getText();
        String infrarrojo = jTextFieldInfrarrojo.getText();
        String infrarrojo_cercano = jTextFieldInfrarrojoCercano.getText();

            PrologProgram programa = new PrologProgram(idObj, corrimiento_rojo, ultravioleta, verde, infrarrojo, infrarrojo_cercano);

            JOptionPane.showMessageDialog(rootPane, "El objeto de identificador " + idObj + " ha sido clasificado como " + programa.clasificar() + " .");
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiar();
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed

    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTextFieldDeclinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDeclinacionActionPerformed

    }//GEN-LAST:event_jTextFieldDeclinacionActionPerformed

    private void jTextFieldVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVerdeActionPerformed

    }//GEN-LAST:event_jTextFieldVerdeActionPerformed

    private void jTextFieldInfrarrojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInfrarrojoActionPerformed

    }//GEN-LAST:event_jTextFieldInfrarrojoActionPerformed

    private void jTextFieldIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIdKeyPressed
       habilitarAceptar();
    }//GEN-LAST:event_jTextFieldIdKeyPressed

    private void jTextFieldAscensionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAscensionKeyPressed
       habilitarAceptar();
    }//GEN-LAST:event_jTextFieldAscensionKeyPressed

    private void jTextFieldDeclinacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDeclinacionKeyPressed
       habilitarAceptar();
    }//GEN-LAST:event_jTextFieldDeclinacionKeyPressed

    private void jTextFieldCorrimientoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorrimientoKeyPressed
        habilitarAceptar();
    }//GEN-LAST:event_jTextFieldCorrimientoKeyPressed

    private void jTextFieldUltravioletaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUltravioletaKeyPressed
        habilitarAceptar();
    }//GEN-LAST:event_jTextFieldUltravioletaKeyPressed

    private void jTextFieldVerdeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVerdeKeyPressed
        habilitarAceptar();
    }//GEN-LAST:event_jTextFieldVerdeKeyPressed

    private void jTextFieldInfrarrojoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInfrarrojoKeyPressed
        habilitarAceptar();
    }//GEN-LAST:event_jTextFieldInfrarrojoKeyPressed

    private void jTextFieldInfrarrojoCercanoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldInfrarrojoCercanoKeyPressed
        habilitarAceptar();
    }//GEN-LAST:event_jTextFieldInfrarrojoCercanoKeyPressed

    private void limpiar() {
        jTextFieldId.setText("");
        jTextFieldAscension.setText("");
        jTextFieldDeclinacion.setText("");
        jTextFieldCorrimiento.setText("");
        jTextFieldUltravioleta.setText("");
        jTextFieldVerde.setText("");
        jTextFieldInfrarrojo.setText("");
        jTextFieldInfrarrojoCercano.setText("");
    }

    public void verificarLlenos() throws CamposIncorrectosException {
        if (jTextFieldId.getText().isEmpty()
                || jTextFieldAscension.getText().isEmpty()
                || jTextFieldDeclinacion.getText().isEmpty()
                || jTextFieldCorrimiento.getText().isEmpty()
                || jTextFieldUltravioleta.getText().isEmpty()
                || jTextFieldVerde.getText().isEmpty()
                || jTextFieldInfrarrojo.getText().isEmpty()
                || jTextFieldInfrarrojoCercano.getText().isEmpty()) {
            throw new CamposIncorrectosException();
        }
    }

    public void verificarValores() throws NumberFormatException, CamposIncorrectosException {

        double ascension = Double.parseDouble(jTextFieldAscension.getText());
        if (ascension < 0 || ascension > 360) {
            throw new CamposIncorrectosException();
        }

        double declinacion = Double.parseDouble(jTextFieldDeclinacion.getText());
        if (declinacion < -90 || declinacion > 90) {
            throw new CamposIncorrectosException();
        }

        Double.parseDouble(jTextFieldUltravioleta.getText());

        Double.parseDouble(jTextFieldVerde.getText());

        Double.parseDouble(jTextFieldInfrarrojo.getText());

        Double.parseDouble(jTextFieldInfrarrojoCercano.getText());

    }

    public void habilitarAceptar(){
        try{
            verificarLlenos();
            verificarValores();
            jButtonAceptar.setEnabled(true);
        }
        catch(Exception e){
        }
    }
    
    public void siguienteCampo(){
        keyboradUtil.siguienteCampo(jTextFieldId, jTextFieldAscension);
        keyboradUtil.siguienteCampo(jTextFieldAscension, jTextFieldDeclinacion);
        keyboradUtil.siguienteCampo(jTextFieldDeclinacion, jTextFieldCorrimiento);
        keyboradUtil.siguienteCampo(jTextFieldCorrimiento, jTextFieldUltravioleta);
        keyboradUtil.siguienteCampo(jTextFieldUltravioleta, jTextFieldVerde);
        keyboradUtil.siguienteCampo(jTextFieldVerde, jTextFieldInfrarrojo);
        keyboradUtil.siguienteCampo(jTextFieldInfrarrojo, jTextFieldInfrarrojoCercano);
    }
    
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
            java.util.logging.Logger.getLogger(IntroducirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroducirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroducirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroducirDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IntroducirDatos dialog = new IntroducirDatos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    class CamposIncorrectosException extends Exception {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelId1;
    private javax.swing.JLabel jLabelId2;
    private javax.swing.JLabel jLabelId3;
    private javax.swing.JLabel jLabelId4;
    private javax.swing.JLabel jLabelId5;
    private javax.swing.JLabel jLabelId6;
    private javax.swing.JLabel jLabelId7;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAscension;
    private javax.swing.JTextField jTextFieldCorrimiento;
    private javax.swing.JTextField jTextFieldDeclinacion;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldInfrarrojo;
    private javax.swing.JTextField jTextFieldInfrarrojoCercano;
    private javax.swing.JTextField jTextFieldUltravioleta;
    private javax.swing.JTextField jTextFieldVerde;
    // End of variables declaration//GEN-END:variables
}
