/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Anasayfa.java
 *
 * Created on Dec 14, 2011, 10:34:49 PM
 */

package wsdesk2;

import java.util.ArrayList;

/**
 *
 * @author BSTNC
 */
public class Anasayfa extends javax.swing.JFrame {

    
    public Anasayfa() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbTip = new javax.swing.JComboBox();
        txtSure1 = new javax.swing.JTextField();
        cmbDosyaAdi = new javax.swing.JComboBox();
        txtSure2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbYon = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Resim Aktar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Süre -1: ");

        jLabel2.setText("Dosya Adı :");

        cmbTip.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "raster", "vector" }));

        cmbDosyaAdi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.png", "2.png", "11.png", "12.png", "22.png", "21.png", "gokce.png" }));

        jLabel3.setText("Süre -2: ");

        jLabel4.setText("t0+t1+t2");

        jLabel5.setText("t0+t1+t2+t3");

        cmbYon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1.png icin sag sol yukari", "2.png icin sag sol asagi", "11.png icin sol yukari", "12.png icin sag yukari", "22.png icin sag asagi", "21.png icin sol asagi", "gokce.png icin sag sol yukari asagi" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbYon, 0, 341, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSure2, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                            .addComponent(cmbDosyaAdi, javax.swing.GroupLayout.Alignment.TRAILING, 0, 189, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(cmbTip, 0, 189, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSure1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbDosyaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmbTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSure1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSure2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(cmbYon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainMet mmt = new MainMet();

        if (cmbTip.getSelectedItem().toString().equals("raster")) {
            ArrayList al = new ArrayList();
            al =mmt.RasterImageAl(cmbDosyaAdi.getSelectedItem().toString());
            txtSure1.setText(al.get(0).toString());
            txtSure2.setText(al.get(1).toString());
        }else {
            ArrayList al = new ArrayList();
            al = mmt.VecctorImageAl(cmbDosyaAdi.getSelectedItem().toString(), cmbYon.getSelectedItem().toString());
            txtSure1.setText(al.get(0).toString());
            txtSure2.setText(al.get(1).toString());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbDosyaAdi;
    private javax.swing.JComboBox cmbTip;
    private javax.swing.JComboBox cmbYon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtSure1;
    private javax.swing.JTextField txtSure2;
    // End of variables declaration//GEN-END:variables

}