/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package De02;

import De01.Student;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class frmNhapThongTin extends javax.swing.JFrame {

    /**
     * Creates new form frmNhapThongTin
     */
    private  ArrayList<NhanVien> list= new ArrayList<>();
    public frmNhapThongTin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gioitinh = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txthsl = new javax.swing.JTextField();
        txtthamnien = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtlcb = new javax.swing.JTextField();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();
        rd_khac = new javax.swing.JRadioButton();
        phongban = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nh???p th??ng tin nh??n vi??n");

        jLabel2.setText("H??? T??n:");

        jLabel3.setText("Ngay Sinh:");

        jLabel4.setText("?????a ch???:");

        jLabel5.setText("Ph??ng Ban:");

        jLabel6.setText("Gi???i tinh:");

        jLabel7.setText("H??? s??? L????ng:");

        jLabel8.setText("Th??m Ni??n:");

        jLabel9.setText("L????ng c?? b???n:");

        txtlcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlcbActionPerformed(evt);
            }
        });

        gioitinh.add(rd_nam);
        rd_nam.setText("nam");

        gioitinh.add(rd_nu);
        rd_nu.setText("n???");

        gioitinh.add(rd_khac);
        rd_khac.setText("kh??c");

        phongban.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thi???t b???", "Nh??n s???", "R & D", "Kinh doanh" }));
        phongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phongbanActionPerformed(evt);
            }
        });

        jButton1.setText("Th??m nh??n vi??n");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnsave.setText("L??u");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthsl)
                            .addComponent(txtthamnien)
                            .addComponent(txtdiachi)
                            .addComponent(txtlcb)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rd_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rd_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rd_khac, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                            .addComponent(phongban, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtngaysinh)
                            .addComponent(txtname)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu)
                    .addComponent(rd_khac))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(phongban)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthamnien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnsave))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       boolean check=true;
       String hoten=this.txtname.getText();
       String ngaysinh=this.txtngaysinh.getText();
       String diachi=this.txtdiachi.getText();
       String gioitinh="";
       String phongban="";
       int hsl=0;
       int thamnien=0;
       double lcb=0;
        try {
            hsl=Integer.parseInt(txthsl.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"h??? s??? l????ng l?? s??? , kh??ng ph???i k?? t???");
       check=false;
        }
        try {
            thamnien=Integer.parseInt(txtthamnien.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"th??m ni??n l?? s??? , kh??ng ph???i k?? t???");
       check=false;
        }
        try {
            lcb=Double.parseDouble(txtlcb.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"luong c?? b???n l?? s??? , kh??ng ph???i k?? t???");
       check=false;
        }
        if(this.rd_nam.isSelected()){
            gioitinh="nam";
        }
        else if(this.rd_nu.isSelected()){
            gioitinh="n???";
        }
        else {
            gioitinh="kh??c";
        }
        phongban =(String) this.phongban.getSelectedItem();
        if(check){
        NhanVien nv=new NhanVien(hoten,ngaysinh,diachi,gioitinh,phongban,hsl,thamnien,lcb);
            list.add(nv);
            for(NhanVien a:list){
        System.out.println(a);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    private void txtlcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlcbActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if(list.isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "l??u kh??ng th??nh c??ng");
        }
        else{
        BufferedWriter bfw= null;
        FileWriter fw=null;
        File f= new File("nhanvien.dat");
        try {
            fw= new FileWriter(f);
            bfw=new BufferedWriter(fw);
            for(NhanVien x:list){
             
                    bfw.write(x.toString());
            }
            
            JOptionPane.showMessageDialog(rootPane, "l??u th??nh c??ng");
            bfw.close();
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"l??u kh??ng th??nh c??ng");
        }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void phongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phongbanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phongbanActionPerformed

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
            java.util.logging.Logger.getLogger(frmNhapThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhapThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhapThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhapThongTin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhapThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup gioitinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> phongban;
    private javax.swing.JRadioButton rd_khac;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthsl;
    private javax.swing.JTextField txtlcb;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtthamnien;
    // End of variables declaration//GEN-END:variables
}
