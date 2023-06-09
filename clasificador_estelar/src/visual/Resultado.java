/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author alain
 */
public class Resultado extends javax.swing.JDialog {
    private String idObj, ascension, declinacion, corrimiento_rojo, ultravioleta, verde, infrarrojo, infrarrojo_cercano, tipo;
    
    public Resultado(java.awt.Frame parent, boolean modal, 
            String idObj, String ascension, String declinacion, String tipo, 
            String corrimiento_rojo, String ultravioleta, String verde, 
            String infrarrojo, String infrarrojo_cercano) {
        
        super(parent, modal);
        
        this.setUndecorated(true);
        initComponents();
        
        this.idObj=idObj;
        this.ascension=ascension;
        this.declinacion=declinacion;
        this.corrimiento_rojo=corrimiento_rojo;
        this.ultravioleta=ultravioleta;
        this.verde=verde;
        this.infrarrojo=infrarrojo;
        this.infrarrojo_cercano=infrarrojo_cercano;
        this.tipo=tipo;
        
        String nombre_imagen="";
        
        switch (tipo){
            case "estrella": nombre_imagen="Aldebaran_DSS.png"; break;
            case "galaxia": nombre_imagen="NGC_2683_Spiral_galaxy.jpg"; break;
            case "cuasar": nombre_imagen="Artist's_rendering_ULAS_J1120+0641.jpg"; break;
            default:;        
        }
        
        ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/"+nombre_imagen))); // load the image to a imageIcon
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(jLabelFondo.getWidth(), jLabelFondo.getHeight(), Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        jLabelFondo.setIcon(imageIcon);
        
        jLabelIdentificador.setText("Identificador: "+idObj+".");
        jLabelPosicion.setText("Posición: ");
        jLabelAscension.setText("Ascensión: "+ascension+" °.");
        jLabelDeclinacion.setText("Declinación: "+declinacion+" °.");
        jLabelClase.setText("Tipo: "+tipo+ ".");
        
        
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
        jLabelResultado = new javax.swing.JLabel();
        jLabelIdentificador = new javax.swing.JLabel();
        jLabelPosicion = new javax.swing.JLabel();
        jLabelDeclinacion = new javax.swing.JLabel();
        jLabelClase = new javax.swing.JLabel();
        jLabelAscension = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icons8-shooting-stars-48.png")).getImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelResultado.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("RESULTADO DE LA CLASIFICACIÓN");
        jPanel1.add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 400, 40));

        jLabelIdentificador.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelIdentificador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdentificador.setText("Identificador:");
        jPanel1.add(jLabelIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, -1));

        jLabelPosicion.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelPosicion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosicion.setText("Posición:");
        jPanel1.add(jLabelPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jLabelDeclinacion.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelDeclinacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDeclinacion.setText("Declinación:");
        jPanel1.add(jLabelDeclinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 320, -1));

        jLabelClase.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelClase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClase.setText("Tipo de objeto: ");
        jPanel1.add(jLabelClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 360, -1));

        jLabelAscension.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jLabelAscension.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAscension.setText("Ascensión:");
        jPanel1.add(jLabelAscension, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 280, -1));

        jButtonGuardar.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setFocusPainted(false);
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jButtonAceptar.setFont(new java.awt.Font("Junicode", 0, 18)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setFocusPainted(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/48_Cancri.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String texto="Identificador: "+idObj+".\nAscensión recta: "+ascension+
                ".\nDeclinación: "+declinacion+".\nCorrimiento al rojo: "+
                corrimiento_rojo+".\nFiltro ultravioleta: "+ultravioleta
                +".\nFiltro verde: "+verde+".\nFiltro infrarrojo: "+infrarrojo
                +".\nFiltro infrarrojo cercano: "+infrarrojo_cercano+".\n\nTIPO: "+tipo.toUpperCase();
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Seleccionar ubicación del archivo.");

        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            String ruta = archivo.getAbsolutePath();

            try {
                FileWriter escritor = new FileWriter(ruta);
                escritor.write(texto);
                escritor.close();
                
                JOptionPane.showMessageDialog(rootPane, "El fichero de texto con los datos ha sido creado.");
                this.dispose();
                
            } catch (IOException e) {
               
            }
        }
               
    }//GEN-LAST:event_jButtonGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelAscension;
    private javax.swing.JLabel jLabelClase;
    private javax.swing.JLabel jLabelDeclinacion;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelPosicion;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
