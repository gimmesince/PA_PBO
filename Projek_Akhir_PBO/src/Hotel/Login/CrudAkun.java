package Hotel.Login;

import Hotel.Admin.HalamanAdmin;
import Hotel.Menu.interfaceCRUD;
import Hotel.Menu.interfaceTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CrudAkun extends javax.swing.JFrame implements interfaceTable, interfaceCRUD {

    SambungDatabase DB = new SambungDatabase();
    DefaultTableModel model;

    public CrudAkun() {
        initComponents();
        setLocationRelativeTo(null);
        String[] judul = {
            "Email",
            "Password",
            "Nama Depan",
            "Nama Belakang",
            "Action"};
        model = new DefaultTableModel(judul, 0);
        tabel.setModel(model);
        tampilkanTabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        first_name = new javax.swing.JTextField();
        last_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(745, 580));
        getContentPane().setLayout(null);
        getContentPane().add(first_name);
        first_name.setBounds(125, 45, 579, 20);
        getContentPane().add(last_name);
        last_name.setBounds(125, 71, 579, 20);
        getContentPane().add(email);
        email.setBounds(125, 97, 579, 20);
        getContentPane().add(password);
        password.setBounds(125, 123, 579, 20);

        btn_tambah.setBackground(new java.awt.Color(77, 250, 152));
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_tambah);
        btn_tambah.setBounds(230, 149, 474, 23);

        btn_ubah.setBackground(new java.awt.Color(255, 255, 48));
        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ubah);
        btn_ubah.setBounds(20, 506, 57, 23);

        btn_hapus.setBackground(new java.awt.Color(250, 86, 77));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(641, 506, 63, 23);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel2.setText("Nama Depan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 48, 62, 14);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 181, 684, 319);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel3.setText("Nama Belakang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 74, 74, 14);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 25, 14);

        btn_reset.setBackground(new java.awt.Color(255, 255, 204));
        btn_reset.setText("Reset Form");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(125, 149, 87, 23);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 126, 45, 14);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Info Login User");

        kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("<< Kembali");
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kembali))
                .addContainerGap(501, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CREATE() {
        try {

            Akun AKUN = new Akun(email.getText().toLowerCase(), password.getText(), first_name.getText(), last_name.getText());
            DB.STATMENT().executeUpdate("INSERT INTO login VALUES" + "('" + AKUN.getEmail() + "','" + AKUN.getPassword() + "','" + AKUN.getFirst_name() + "','" + AKUN.getLast_name() + "')");
            tampilkanTabel();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada yang belum di isi");
        }
    }

    public void DELETE() {
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?");
        switch (opsi) {
            case JOptionPane.YES_OPTION:
            try {
                Akun AKUN = new Akun();
                AKUN.setEmail(email.getText().toLowerCase());
                DB.STATMENT().executeUpdate("DELETE FROM login WHERE email ='" + AKUN.getEmail() + "'");
                tampilkanTabel();
                reset();
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
            } catch (SQLException ex) {
            }
            break;
            default:
                break;
        }
    }

    public void UPDATE() {
        try {
            Akun AKUN = new Akun(email.getText().toLowerCase(), password.getText(), first_name.getText(), last_name.getText());
            DB.STATMENT().executeUpdate("UPDATE login SET email ='" + AKUN.getEmail() + "',password ='" + AKUN.getPassword() + "',first_name ='" + AKUN.getFirst_name() + "',last_name ='" + AKUN.getLast_name() + "' WHERE email = '" + AKUN.getEmail() + "'");
            tampilkanTabel();
            reset();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ada yang belum di isi");
        }
    }


    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        CREATE();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        UPDATE();
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed

        DELETE();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int i = tabel.getSelectedRow();
        if (i > -1) {
            email.setText(model.getValueAt(i, 0).toString().toLowerCase());
            password.setText(model.getValueAt(i, 1).toString());
            first_name.setText(model.getValueAt(i, 2).toString());
            last_name.setText(model.getValueAt(i, 3).toString());

        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        this.setVisible(false);
        new HalamanAdmin().setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    public void reset() {
        email.setText("");
        password.setText("");
        first_name.setText("");
        last_name.setText("");
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
            java.util.logging.Logger.getLogger(CrudAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JTextField email;
    private javax.swing.JTextField first_name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kembali;
    private javax.swing.JTextField last_name;
    private javax.swing.JTextField password;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
    public void tampilkanTabel() {
        int row = tabel.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {

            ResultSet rs = DB.STATMENT().executeQuery("SELECT * FROM login");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudAkun.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
