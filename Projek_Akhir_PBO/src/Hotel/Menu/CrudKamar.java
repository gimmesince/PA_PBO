package Hotel.Menu;

import Hotel.Admin.HalamanAdmin;
import Hotel.Login.SambungDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class CrudKamar extends javax.swing.JFrame implements interfaceTable, interfaceCRUD {

    SambungDatabase DB = new SambungDatabase();

    Kamar KAMAR = new Kamar();
    boolean status;
    DefaultTableModel model;

    String KodeSQL;

    public CrudKamar() {
        initComponents();
        setLocationRelativeTo(null);
        String[] judul = {"ID Kamar",
            "Jenis Kamar",
            "Lantai",
            "Harga Permalam",
            "Action"};
        model = new DefaultTableModel(judul, 0);
        tabel.setModel(model);
        tampilkanTabel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id_kamar = new javax.swing.JTextField();
        harga_permalam = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btn_reset = new javax.swing.JButton();
        jenis_kamar = new javax.swing.JComboBox<>();
        lantai_kamar = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(133, 180, 255));
        setMinimumSize(new java.awt.Dimension(745, 545));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel2.setText("ID Kamar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 48, 42, 14);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel3.setText("Jenis Kamar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 74, 57, 14);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setText("Lantai Kamar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 62, 14);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setText("Harga Permalam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 126, 79, 14);
        getContentPane().add(id_kamar);
        id_kamar.setBounds(125, 45, 579, 20);
        getContentPane().add(harga_permalam);
        harga_permalam.setBounds(125, 123, 579, 20);

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
        btn_ubah.setBounds(20, 472, 90, 23);

        btn_hapus.setBackground(new java.awt.Color(250, 86, 77));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hapus);
        btn_hapus.setBounds(614, 472, 90, 23);

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
        jScrollPane1.setBounds(20, 181, 684, 285);

        btn_reset.setBackground(new java.awt.Color(255, 255, 204));
        btn_reset.setText("Reset Form");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(125, 149, 87, 23);

        jenis_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Standar", "Supperior", "Deluxe", "Suite", "Presidential Suite" }));
        jenis_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_kamarActionPerformed(evt);
            }
        });
        getContentPane().add(jenis_kamar);
        jenis_kamar.setBounds(125, 71, 579, 20);

        lantai_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7" }));
        lantai_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lantai_kamarActionPerformed(evt);
            }
        });
        getContentPane().add(lantai_kamar);
        lantai_kamar.setBounds(125, 97, 579, 20);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CRUD Kamar");

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembali)
                .addGap(212, 212, 212)
                .addComponent(jLabel6)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(kembali))
                .addContainerGap(471, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void CREATE() {
        if ("".equals(id_kamar.getText()) || "".equals(harga_permalam.getText()) || "".equals(KAMAR.getJenis_kamar()) || KAMAR.getLantai_kamar() == 0) {
            JOptionPane.showMessageDialog(null, "Ada yang belum di isi");
        } else {
            try {
                KAMAR.setId_kamar(Integer.parseInt(id_kamar.getText()));
                KAMAR.setHarga_permalam(Integer.parseInt(harga_permalam.getText()));
                DB.STATMENT().executeUpdate("INSERT INTO Kamar VALUES" + "('" + KAMAR.getId_kamar() + "','" + KAMAR.getJenis_kamar() + "','" + KAMAR.getLantai_kamar() + "','" + KAMAR.getHarga_permalam() + "')");
                tampilkanTabel();
                reset();
                JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ID Sudah Tersedia");
            }
        }
    }

    public void DELETE() {
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin menghapus data ini ?");
        switch (opsi) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
                try {
                    DB.STATMENT().executeUpdate("DELETE FROM Kamar WHERE id='" + id_kamar.getText() + "'");
                    tampilkanTabel();
                    reset();
                } catch (SQLException ex) {

                }
                break;
            default:
                break;
        }
    }

    public void UPDATE() {
        if ("".equals(id_kamar.getText()) || "".equals(harga_permalam.getText()) || "".equals(KAMAR.getJenis_kamar()) || KAMAR.getLantai_kamar() == 0) {
            JOptionPane.showMessageDialog(null, "Ada yang belum di isi");
        } else {
            try {
                KAMAR.setId_kamar(Integer.parseInt(id_kamar.getText()));
                KAMAR.setHarga_permalam(Integer.parseInt(harga_permalam.getText()));

                KodeSQL = "UPDATE Kamar SET jenis_kamar ='" + KAMAR.getJenis_kamar() + "',lantai_kamar ='" + KAMAR.getLantai_kamar() + "',harga_permalam ='" + KAMAR.getHarga_permalam() + "' WHERE id = '" + KAMAR.getId_kamar() + "'";
                DB.STATMENT().executeUpdate(KodeSQL);
                tampilkanTabel();
                reset();
                JOptionPane.showMessageDialog(null, KAMAR.notice("Kamar"));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ID Sudah Tersedia");
            }
        }
    }

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        DELETE();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        UPDATE();

    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        CREATE();
    }//GEN-LAST:event_btn_tambahActionPerformed


    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int i = tabel.getSelectedRow();
        if (i > -1) {
            id_kamar.setText(model.getValueAt(i, 0).toString());
            jenis_kamar.setSelectedItem(model.getValueAt(i, 1).toString());
            lantai_kamar.setSelectedItem(model.getValueAt(i, 2).toString());
            harga_permalam.setText(model.getValueAt(i, 3).toString());

        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void jenis_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_kamarActionPerformed
        switch (jenis_kamar.getSelectedIndex()) {
            case 0:
                status = false;
                break;
            case 1:
                KAMAR.setJenis_kamar("Standar");
                harga_permalam.setText("300000");
                break;
            case 2:
                KAMAR.setJenis_kamar("Supperior");
                harga_permalam.setText("450000");
                break;
            case 3:
                KAMAR.setJenis_kamar("Deluxe");
                harga_permalam.setText("600000");
                break;
            case 4:
                KAMAR.setJenis_kamar("Suite");
                harga_permalam.setText("650000");
                break;
            case 5:
                KAMAR.setJenis_kamar("Presidential Suite");
                harga_permalam.setText("850000");
                break;
        }
    }//GEN-LAST:event_jenis_kamarActionPerformed

    private void lantai_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lantai_kamarActionPerformed
        switch (lantai_kamar.getSelectedIndex()) {
            case 0:
                status = false;
                KAMAR.setLantai_kamar(0);
                break;
            case 1:
                KAMAR.setLantai_kamar(1);
                break;
            case 2:
                KAMAR.setLantai_kamar(2);
                break;
            case 3:
                KAMAR.setLantai_kamar(3);
                break;
            case 4:
                KAMAR.setLantai_kamar(4);
                break;
            case 5:
                KAMAR.setLantai_kamar(5);
                break;
            case 6:
                KAMAR.setLantai_kamar(6);
                break;
            case 7:
                KAMAR.setLantai_kamar(7);
                break;
        }
    }//GEN-LAST:event_lantai_kamarActionPerformed

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        this.setVisible(false);
        new HalamanAdmin().setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    public void reset() {
        id_kamar.setText("");
        jenis_kamar.setSelectedIndex(0);
        lantai_kamar.setSelectedIndex(0);
        harga_permalam.setText("");
    }

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
            java.util.logging.Logger.getLogger(CrudKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JTextField harga_permalam;
    private javax.swing.JTextField id_kamar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jenis_kamar;
    private javax.swing.JLabel kembali;
    private javax.swing.JComboBox<String> lantai_kamar;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

    public void tampilkanTabel() {
        int row = tabel.getRowCount();
        for (int a = 0; a < row; a++) {
            model.removeRow(0);
        }
        try {

            ResultSet rs = DB.STATMENT().executeQuery("SELECT * FROM Kamar");
            while (rs.next()) {
                String data[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CrudKamar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
