/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel.User;



import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Hotel.Login.MenuUtama;
import Hotel.Login.SambungDatabase;
import Hotel.Login.Akun;
import Hotel.Login.MenuUtama;

public class UserAkun extends javax.swing.JFrame {
    SambungDatabase DB = new SambungDatabase();

    Akun AKUN = new Akun();
    ResultSet rs;


    public UserAkun(String Email) {
        initComponents();
        setLocationRelativeTo(null);
        AKUN.setEmail(Email);


        try {

            String KodeSQL = "SELECT * FROM login WHERE email='" + AKUN.getEmail() + "';";
            rs = DB.STATMENT().executeQuery(KodeSQL);
            rs.next();
            NamaUser.setText(rs.getString("first_name"));
            first_name.setText(rs.getString("first_name"));
            last_name.setText(rs.getString("last_name"));
            AKUN.setPassword(rs.getString("password"));
            AKUN.setFirst_name(rs.getString("first_name"));
            AKUN.setLast_name(rs.getString("last_name"));

        } catch (SQLException x) {
            System.out.println("Eror : " + x);
        }
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
        NamaUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kembali = new javax.swing.JLabel();
        btn_hapusAkun = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        first_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btn_logout1 = new javax.swing.JButton();
        btn_ubahAkun = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 530));
        setPreferredSize(new java.awt.Dimension(730, 530));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        NamaUser.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        NamaUser.setForeground(new java.awt.Color(255, 51, 51));
        NamaUser.setText("Nama User");
        jPanel1.add(NamaUser);
        NamaUser.setBounds(600, 0, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/pict/oyo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 0, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/pict/user.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(560, 0, 34, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 40);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(null);

        kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("<< Kembali");
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        jPanel2.add(kembali);
        kembali.setBounds(12, 13, 71, 17);

        btn_hapusAkun.setBackground(new java.awt.Color(255, 255, 255));
        btn_hapusAkun.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_hapusAkun.setForeground(new java.awt.Color(255, 51, 51));
        btn_hapusAkun.setText("Hapus Akun");
        btn_hapusAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusAkunActionPerformed(evt);
            }
        });
        jPanel2.add(btn_hapusAkun);
        btn_hapusAkun.setBounds(440, 360, 140, 30);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(email);
        email.setBounds(240, 260, 340, 30);

        last_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(last_name);
        last_name.setBounds(240, 160, 340, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(160, 170, 64, 18);

        first_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        first_name.setMinimumSize(new java.awt.Dimension(6, 26));
        jPanel2.add(first_name);
        first_name.setBounds(240, 110, 340, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(160, 120, 66, 18);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(160, 268, 34, 20);

        password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(password);
        password.setBounds(240, 303, 340, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(160, 308, 59, 20);

        btn_logout1.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_logout1.setForeground(new java.awt.Color(255, 51, 51));
        btn_logout1.setText("Log-Out");
        btn_logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logout1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout1);
        btn_logout1.setBounds(560, 10, 140, 30);

        btn_ubahAkun.setBackground(new java.awt.Color(255, 255, 255));
        btn_ubahAkun.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        btn_ubahAkun.setForeground(new java.awt.Color(255, 51, 51));
        btn_ubahAkun.setText("Ubah Data");
        btn_ubahAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahAkunActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ubahAkun);
        btn_ubahAkun.setBounds(160, 360, 140, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Info Akun");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(310, 50, 180, 34);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Masuka email dan sandi Jika Ingin Melakukan Action");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(270, 230, 380, 14);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 790, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        this.setVisible(false);
        new HalamanUser(AKUN.getEmail()).setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    private void btn_logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logout1ActionPerformed

        int opsi = JOptionPane.showConfirmDialog(null, "Anda Ingin Log-Out ?");
        switch (opsi) {
            case JOptionPane.YES_OPTION:
                this.setVisible(false);
                new MenuUtama().setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_logout1ActionPerformed

    private void btn_ubahAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahAkunActionPerformed

        if (email.getText().equals(AKUN.getEmail()) && String.valueOf(password.getPassword()).equals(AKUN.getPassword())) {

            try {
            AKUN.setFirst_name(first_name.getText());
            AKUN.setLast_name(last_name.getText());
                DB.STATMENT().executeUpdate("UPDATE login SET first_name ='" + AKUN.getFirst_name() + "',last_name ='" + AKUN.getLast_name() + "' WHERE email = '" + AKUN.getEmail() + "'");

                JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
                this.setVisible(false);
                new UserAkun(AKUN.getEmail()).setVisible(true);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Password atau email salah");
            }

            this.setVisible(false);
            new UserAkun(AKUN.getEmail()).setVisible(true);

        } else {
            JOptionPane.showMessageDialog(null, "Password atau email salahhhhhh");
        }


    }//GEN-LAST:event_btn_ubahAkunActionPerformed

    private void btn_hapusAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusAkunActionPerformed
        if (email.getText().equals(AKUN.getEmail()) && String.valueOf(password.getPassword()).equals(AKUN.getPassword())) {
            int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?");
            switch (opsi) {
                case JOptionPane.YES_OPTION:
            try {
                    Akun AKUN = new Akun();
                    AKUN.setEmail(email.getText().toLowerCase());
                    DB.STATMENT().executeUpdate("DELETE FROM login WHERE email ='" + AKUN.getEmail() + "'");
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                    this.setVisible(false);
                    new MenuUtama().setVisible(true);
                } catch (SQLException ex) {
                }
                break;
                default:
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password atau email salahhhhhh");
        }
    }//GEN-LAST:event_btn_hapusAkunActionPerformed

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
            java.util.logging.Logger.getLogger(UserAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAkun("riadi@gmail.com").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NamaUser;
    private javax.swing.JButton btn_hapusAkun;
    private javax.swing.JButton btn_logout1;
    private javax.swing.JButton btn_ubahAkun;
    private javax.swing.JTextField email;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField last_name;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
