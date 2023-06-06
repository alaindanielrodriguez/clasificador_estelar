/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package visual;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author alain
 */
public class Resultado extends javax.swing.JDialog {
    
    
    public Resultado(java.awt.Frame parent, boolean modal, String idObj, String ascension, String declinacion, String tipo) {
        super(parent, modal);
        initComponents();
        
        String nombre_imagen="";
        
        switch (tipo){
            case "estrella": nombre_imagen="Pleiades_cluster_tõrva.jpg"; break;
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
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setText("RESULTADO DE LA CLASIFICACIÓN");
        jPanel1.add(jLabelResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 260, -1));

        jLabelIdentificador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdentificador.setText("Identificador:");
        jPanel1.add(jLabelIdentificador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 240, -1));

        jLabelPosicion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosicion.setText("Posición:");
        jPanel1.add(jLabelPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jLabelDeclinacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDeclinacion.setText("Declinación:");
        jPanel1.add(jLabelDeclinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, -1));

        jLabelClase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClase.setText("Tipo de objeto: ");
        jPanel1.add(jLabelClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, -1));

        jLabelAscension.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAscension.setText("Ascensión:");
        jPanel1.add(jLabelAscension, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/48_Cancri.jpg"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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