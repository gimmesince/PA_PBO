/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hotel.User;

import java.awt.HeadlessException;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Hotel.Login.SambungDatabase;
import Hotel.Menu.Transaksi;


/**
 *
 * @author Admin
 */
public class UserPesan extends javax.swing.JFrame {
    SambungDatabase DB = new SambungDatabase();
    String KodeSQL, CEKIN, CEKOUT, SEKARANG;
    Transaksi TRAN = new Transaksi();
    long lama, pilihTanggal1 ;
    int a = 0, b = 0;
    ResultSet rs;
    String EMAIL;
    String pass;

    public UserPesan(String Email) {
        initComponents();
        setLocationRelativeTo(null);
        this.EMAIL = Email;

        System.out.println(this.EMAIL);
        try {
            String KodeSQL = "SELECT * FROM login WHERE email='" + EMAIL + "';";
            rs = DB.STATMENT().executeQuery(KodeSQL);
            rs.next();
            NamaUser.setText(rs.getString("first_name"));
            nama.setText(rs.getString("first_name") + " " + rs.getString("last_name"));
            email.setText(rs.getString("email"));

        } catch (SQLException x) {
            System.out.println("Eror : " + x);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NamaUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();
        btn_total_harga = new javax.swing.JButton();
        fasilitas = new javax.swing.JComboBox<>();
        btn_pesan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        harga_permalam = new javax.swing.JTextField();
        lantai_kamar = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tgl_cekout = new com.toedter.calendar.JDateChooser();
        tgl_cekin = new com.toedter.calendar.JDateChooser();
        jenis_kamar = new javax.swing.JComboBox<>();
        jumlah_hari = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        KolomFasilitas2 = new javax.swing.JLabel();
        titel = new javax.swing.JLabel();
        KolomFasilitas1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 510));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        NamaUser.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        NamaUser.setForeground(new java.awt.Color(255, 51, 51));
        NamaUser.setText("Nama User");
        jPanel1.add(NamaUser);
        NamaUser.setBounds(760, 0, 150, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/pict/oyo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 0, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hotel/pict/user.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 0, 34, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 40);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(890, 800));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CRUD Transaksi");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(380, 0, 190, 28);

        kembali.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("<< Kembali");
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        jPanel2.add(kembali);
        kembali.setBounds(30, 10, 71, 17);

        btn_total_harga.setBackground(new java.awt.Color(255, 255, 48));
        btn_total_harga.setText("Hitung Total");
        btn_total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_total_hargaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_total_harga);
        btn_total_harga.setBounds(730, 200, 120, 30);

        fasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "VIP    (+100000)", "VVIP  (+200000)" }));
        fasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fasilitasActionPerformed(evt);
            }
        });
        jPanel2.add(fasilitas);
        fasilitas.setBounds(570, 160, 280, 30);

        btn_pesan.setBackground(new java.awt.Color(77, 250, 152));
        btn_pesan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_pesan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pesan.setText("Pesan !!");
        btn_pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesanActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pesan);
        btn_pesan.setBounds(250, 340, 600, 40);

        btn_reset.setBackground(new java.awt.Color(255, 255, 204));
        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 0, 51));
        btn_reset.setText("Reset Form");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reset);
        btn_reset.setBounds(30, 340, 190, 40);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel5.setText("Harga Permalam");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(480, 120, 79, 30);

        harga_permalam.setEditable(false);
        harga_permalam.setMinimumSize(new java.awt.Dimension(8, 20));
        jPanel2.add(harga_permalam);
        harga_permalam.setBounds(570, 120, 280, 30);

        lantai_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7" }));
        lantai_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lantai_kamarActionPerformed(evt);
            }
        });
        jPanel2.add(lantai_kamar);
        lantai_kamar.setBounds(570, 80, 280, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel4.setText("Lantai Kamar");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(480, 80, 62, 30);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel7.setText("ID ");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 40, 42, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel8.setText("Tanggal Cek-In");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(30, 160, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel9.setText("Tanggal Cek-Out");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(30, 200, 90, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel10.setText("Total Harga");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(480, 200, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel3.setText("Jenis Kamar");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(480, 40, 57, 30);

        id.setEditable(false);
        jPanel2.add(id);
        id.setBounds(120, 40, 280, 30);

        total_harga.setEditable(false);
        jPanel2.add(total_harga);
        total_harga.setBounds(570, 200, 150, 30);

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel11.setText("Nama");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 80, 42, 30);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel12.setText("Email");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(30, 120, 42, 30);

        nama.setEditable(false);
        jPanel2.add(nama);
        nama.setBounds(120, 80, 280, 30);
        jPanel2.add(email);
        email.setBounds(120, 120, 280, 30);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 12)); // NOI18N
        jLabel13.setText("Fasilitas");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(480, 160, 70, 30);
        jPanel2.add(tgl_cekout);
        tgl_cekout.setBounds(120, 200, 210, 30);
        jPanel2.add(tgl_cekin);
        tgl_cekin.setBounds(120, 160, 210, 30);

        jenis_kamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Standar", "Supperior", "Deluxe", "Suite", "Presidential Suite" }));
        jenis_kamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_kamarActionPerformed(evt);
            }
        });
        jPanel2.add(jenis_kamar);
        jenis_kamar.setBounds(570, 40, 280, 30);

        jumlah_hari.setEditable(false);
        jumlah_hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_hariActionPerformed(evt);
            }
        });
        jPanel2.add(jumlah_hari);
        jumlah_hari.setBounds(340, 200, 60, 30);

        jLabel14.setText("Jumlah Hari");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(340, 160, 80, 40);

        KolomFasilitas2.setText("-");
        jPanel2.add(KolomFasilitas2);
        KolomFasilitas2.setBounds(30, 310, 820, 14);

        titel.setText("Fasilitas :");
        jPanel2.add(titel);
        titel.setBounds(30, 250, 70, 14);

        KolomFasilitas1.setText("-");
        jPanel2.add(KolomFasilitas1);
        KolomFasilitas1.setBounds(30, 280, 820, 14);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 910, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void reset() {
        tgl_cekin.setDate(null);
        tgl_cekout.setDate(null);
        jenis_kamar.setSelectedIndex(0);
        lantai_kamar.setSelectedIndex(0);
        fasilitas.setSelectedIndex(0);
        harga_permalam.setText("");
        total_harga.setText("");
        jumlah_hari.setText("");
    }

    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        this.setVisible(false);
        new HalamanUser(EMAIL).setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    private void btn_total_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_total_hargaActionPerformed
        try {
            if ("".equals(nama.getText())
                    || "".equals(email.getText().toLowerCase())
                    || tgl_cekin.getDate() == null
                    || tgl_cekout.getDate() == null
                    || "".equals(TRAN.getJenis_kamar())
                    || TRAN.getLantai_kamar() == 0) {
                JOptionPane.showMessageDialog(this, "Mohon isi seluruh data !!", "Pesan", JOptionPane.WARNING_MESSAGE);

            } else {
                Date sekarang = new Date();
                SimpleDateFormat FormatTanggal = new SimpleDateFormat("dd MMMM yyyy");
                CEKIN = FormatTanggal.format(tgl_cekin.getDate());
                CEKOUT = FormatTanggal.format(tgl_cekout.getDate());
                SEKARANG = FormatTanggal.format(sekarang);

                try {

                    DateFormat format = new SimpleDateFormat("dd MMMM yyyy");
                    Date tanggalcekin = format.parse(CEKIN);
                    Date tanggalcekout = format.parse(CEKOUT);
                    Date tanggalsekarang = format.parse(SEKARANG);

                    long tanggalcekin1 = tanggalcekin.getTime();
                    long tanggalcekout1 = tanggalcekout.getTime();
                    long tanggalsekarang1 = tanggalsekarang.getTime();
                    long pilihTanggal = tanggalcekin1 - tanggalsekarang1;
                    long diff = tanggalcekout1 - tanggalcekin1;

                    lama          = diff / (24 * 60 * 60 * 1000);
                    pilihTanggal1 = pilihTanggal / (24 * 60 * 60 * 1000);

                } catch (ParseException e) {
                    System.out.println("" + e.getMessage());
                }

                if (lama > 0 && pilihTanggal1 >= 0) {
                    jumlah_hari.setText(Long.toString(lama));
                    int c = Integer.parseInt(jumlah_hari.getText());
                    total_harga.setText(String.valueOf((a + b) * c));
                } else {
                    JOptionPane.showMessageDialog(this, "Masukan Tanggal dengan Benar !", "Pesan", JOptionPane.WARNING_MESSAGE);
                }

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Masukan Data dengan Benar !", "Pesan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btn_total_hargaActionPerformed

    private void fasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fasilitasActionPerformed
        switch (fasilitas.getSelectedIndex()) {
            case 0:
                b = 0;
                TRAN.setFasilitas("Default");
                KolomFasilitas1.setText("- AC     - 2 Bed     - 1 Kamar mandi     - 2 buah bedside cabinet ");
                KolomFasilitas2.setText("- Overbed table      - 2 kursi penunggu  - 2 buah TV ");
                break;
            case 1:
                b = 100000;
                TRAN.setFasilitas("VIP (+100000)");
                KolomFasilitas1.setText("- AC   - 1 Bed   - 1 Kamar mandi   - Bed penunggu   - Kulkas  - Bedside Cabinet   - Kursi tunggu ");
                KolomFasilitas2.setText("- 1 Dispenser   - 1 buah LCD 32   - Lemari Pakaian   - Meja   - Sofa   - Telepon ");
                break;
            case 2:
                b = 200000;
                TRAN.setFasilitas("VVIP (+200000)");
                KolomFasilitas1.setText("- AC   - 1 Bed   - 1 Kamar mandi   - Bedside cabinet   - Kulkas   - Kursi tunggu   - Overbed Table   - Meja TV   - Lemari pakaian ");
                KolomFasilitas2.setText("- Dispenser   - Meja -   Sofabed   - Smart TV 72   - Bed Penunggu    - Telepon    - Ruang keluarga   - 1 set meja makan ");
                break;

        }
    }//GEN-LAST:event_fasilitasActionPerformed

    private void btn_pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesanActionPerformed
        try {
            if ("".equals(total_harga.getText())) {
                JOptionPane.showMessageDialog(this, "Lihat Total Dulu weyyy", "Pesan", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    String cekin = new SimpleDateFormat("dd-MM-yyyy").format(tgl_cekin.getDate());
                    String cekout = new SimpleDateFormat("dd-MM-yyyy").format(tgl_cekout.getDate());

                    TRAN.setNama(nama.getText());
                    TRAN.setEmail(email.getText());
                    TRAN.setTgl_cekin(cekin);
                    TRAN.setTgl_cekout(cekout);
                    TRAN.setTotal_harga(Integer.parseInt(total_harga.getText()));
                    TRAN.setHarga_permalam(Integer.parseInt(harga_permalam.getText()));

                    DB.STATMENT().executeUpdate("INSERT INTO Transaksi VALUES"
                            + "(NULL, '" + TRAN.getNama() + "','" + TRAN.getEmail() + "','" + TRAN.getTgl_cekin() + "','" + TRAN.getTgl_cekout() + "','"
                            + TRAN.getJenis_kamar() + "'," + TRAN.getLantai_kamar() + "," + TRAN.getHarga_permalam() + ",'"
                            + TRAN.getFasilitas() + "'," + TRAN.getTotal_harga() + ")");

                    reset();
                    JOptionPane.showMessageDialog(null, "Pemesanan Berhasil!");

                    this.setVisible(false);
                    new userTransaksi(this.EMAIL ).setVisible(true);

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "ID Sudah Tersedia");
                }
            }
        } catch (HeadlessException e) {
            System.out.println("eror : " + e);
        }
    }//GEN-LAST:event_btn_pesanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void lantai_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lantai_kamarActionPerformed
        switch (lantai_kamar.getSelectedIndex()) {
            case 0:
                TRAN.setLantai_kamar(0);
                break;
            case 1:
                TRAN.setLantai_kamar(1);
                break;
            case 2:
                TRAN.setLantai_kamar(2);
                break;
            case 3:
                TRAN.setLantai_kamar(3);
                break;
            case 4:
                TRAN.setLantai_kamar(4);
                break;
            case 5:
                TRAN.setLantai_kamar(5);
                break;
            case 6:
                TRAN.setLantai_kamar(6);
                break;
            case 7:
                TRAN.setLantai_kamar(7);
                break;
        }
    }//GEN-LAST:event_lantai_kamarActionPerformed

    private void jenis_kamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_kamarActionPerformed
        switch (jenis_kamar.getSelectedIndex()) {

            case 0:
                TRAN.setJenis_kamar("");
                harga_permalam.setText(null);
                total_harga.setText(null);

                break;

            case 1:
                a = 300000;
                TRAN.setJenis_kamar("Standar");
                harga_permalam.setText("300000");
                break;

            case 2:
                a = 450000;
                TRAN.setJenis_kamar("Supperior");
                harga_permalam.setText("450000");
                break;

            case 3:
                a = 600000;
                TRAN.setJenis_kamar("Deluxe");
                harga_permalam.setText("600000");
                break;

            case 4:
                a = 650000;
                TRAN.setJenis_kamar("Suite");
                harga_permalam.setText("650000");

                break;

            case 5:
                a = 850000;
                TRAN.setJenis_kamar("Presidential Suite");
                harga_permalam.setText("850000");
                break;
        }
    }//GEN-LAST:event_jenis_kamarActionPerformed

    private void jumlah_hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_hariActionPerformed

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
            java.util.logging.Logger.getLogger(UserPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPesan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserPesan("riadi@gmail.com").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KolomFasilitas1;
    private javax.swing.JLabel KolomFasilitas2;
    private javax.swing.JLabel NamaUser;
    private javax.swing.JButton btn_pesan;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_total_harga;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> fasilitas;
    private javax.swing.JTextField harga_permalam;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jenis_kamar;
    private javax.swing.JTextField jumlah_hari;
    private javax.swing.JLabel kembali;
    private javax.swing.JComboBox<String> lantai_kamar;
    private javax.swing.JTextField nama;
    private com.toedter.calendar.JDateChooser tgl_cekin;
    private com.toedter.calendar.JDateChooser tgl_cekout;
    private javax.swing.JLabel titel;
    private javax.swing.JTextField total_harga;
    // End of variables declaration//GEN-END:variables
}
