/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author FBS
 */
public class mastersiswa extends javax.swing.JFrame {
private DefaultTableModel data;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form mastersiswa
     */
    public mastersiswa() {
        initComponents();
        pilihkelas();
        kosong();
        tabel();
        id_kelas.setVisible(false); 
        ImageIcon img = new ImageIcon("src/icon/logo.png");
        this.setIconImage(img.getImage());
        initUI();
    }
    
    private void initUI(){ 
        getContentPane().setBackground(new Color(245, 245, 245));
        
        Dimension windowSize = getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;    
        setLocation(dx, dy);
    }
    
    protected void kosong(){
        save.setEnabled(true);
        edit.setEnabled(false);
        nisn.setText("");
        nis.setText("");
        nasis.setText("");
        kls.setSelectedItem(0);
        tlpn.setText("");
        alamat.setText("");
    }
    
    private void pilihkelas(){
        try {Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pengaduanapp","root","");
            stm=conn.createStatement();
            String sql = "SELECT * FROM kelas";
            rs = stm.executeQuery(sql);
            while(rs.next()){
                kls.addItem(rs.getString("nama_kelas"));
            }
            rs.last();
            int jumlahdata = rs.getRow();
            rs.first();
            
        }catch(Exception e){
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nisn = new javax.swing.JTextField();
        nis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nasis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kls = new javax.swing.JComboBox<>();
        id_kelas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lk = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        tlpn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Master Siswa");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel6.setText("NISN");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel2.setText("NIS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        nisn.setOpaque(false);
        jPanel1.add(nisn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 160, 30));

        nis.setOpaque(false);
        jPanel1.add(nis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 150, 30));

        jLabel8.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel8.setText("NAMA SISWA");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        nasis.setOpaque(false);
        jPanel1.add(nasis, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 360, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel4.setText("KELAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        kls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH KELAS" }));
        kls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kls.setOpaque(false);
        kls.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                klsItemStateChanged(evt);
            }
        });
        jPanel1.add(kls, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 360, 30));
        jPanel1.add(id_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 10, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel9.setText("JENIS KELAMIN");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        lk.setText("LAKI - LAKI");
        lk.setOpaque(false);
        jPanel1.add(lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        pr.setText("PEREMPUAN");
        pr.setOpaque(false);
        jPanel1.add(pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel10.setText("NO. TELEPON SISWA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        tlpn.setOpaque(false);
        jPanel1.add(tlpn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 360, 30));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel3.setText("ALAMAT LENGKAP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        alamat.setColumns(20);
        alamat.setRows(5);
        alamat.setOpaque(false);
        jScrollPane2.setViewportView(alamat);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 360, 120));

        save.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        save.setText("Simpan");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        edit.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        edit.setText("Ubah");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setMaximumSize(new java.awt.Dimension(84, 29));
        edit.setMinimumSize(new java.awt.Dimension(84, 29));
        edit.setOpaque(false);
        edit.setPreferredSize(new java.awt.Dimension(84, 29));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 83, -1));

        delete.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        delete.setText("Hapus");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setMaximumSize(new java.awt.Dimension(84, 29));
        delete.setMinimumSize(new java.awt.Dimension(84, 29));
        delete.setOpaque(false);
        delete.setPreferredSize(new java.awt.Dimension(84, 29));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 80, -1));

        cancel.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cancel.setText("Batal");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.setMaximumSize(new java.awt.Dimension(84, 29));
        cancel.setMinimumSize(new java.awt.Dimension(84, 29));
        cancel.setOpaque(false);
        cancel.setPreferredSize(new java.awt.Dimension(84, 29));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 80, -1));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel.setOpaque(false);
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 370, 210));

        cari.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cari.setText("CARI. . . .");
        cari.setOpaque(false);
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariKeyPressed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 370, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/8.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new petugas. menumaster().setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void klsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_klsItemStateChanged
        // TODO add your handling code here:
        String[] opsii = kls.getSelectedItem().toString().split("//s+");
        String kode = opsii[0];
        if(!kode.equals("KELAS")){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost/pengaduanapp","root","");
                stm=conn.createStatement();
                String namas = "";
                String opsiii = kls.getSelectedItem().toString();
                switch(kls.getSelectedIndex()){
                    case 1: namas = "1"; break;
                    case 2: namas = "2"; break;
                    case 3: namas = "3"; break;
                    case 4: namas = "4"; break;
                    case 5: namas = "5"; break;
                    case 6: namas = "6"; break;
                    case 7: namas = "7"; break;
                    case 8: namas = "8"; break;
                    case 9: namas = "9"; break;
                    case 10: namas = "10"; break;
                    case 11: namas = "11"; break;
                    case 12: namas = "12"; break;
                }
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet rs = stm.executeQuery("SELECT * FROM kelas WHERE nama_kelas='"+opsiii+"'");
                if(rs.next()){;
                    id_kelas.setText(rs.getString("id_kelas"));
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(mastersiswa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        }
    }//GEN-LAST:event_klsItemStateChanged

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        String jenis = null;
        if(lk.isSelected()){jenis = "laki-laki";}else{jenis = "perempuan";}
        String sql = "insert into siswa values (?,?,?,?,?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, nisn.getText());
            stat.setString(2, nis.getText());
            stat.setString(3, nasis.getText());
            stat.setString(4, kls.getSelectedItem().toString());
            stat.setString(5, jenis);
            stat.setString(6, tlpn.getText());
            stat.setString(7, alamat.getText());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data akan disimpan");
            kosong();
            nisn.requestFocus();
            tabel();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
            tabel();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        try {
            String sql ="UPDATE siswa SET namasiswa = '"+nasis.getText()+"',telepon ='"+tlpn.getText()+"',alamat ='"+alamat.getText()+"' WHERE nisn = '"+nisn.getText()+"'";
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pengaduanapp","root","");
            stm=conn.createStatement();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        tabel();
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null,"Hapus data ini?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from siswa where namasiswa ='"+nasis.getText()+"'";
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data akan di hapus dari sistem?");
                kosong();
                nisn.requestFocus();
            }
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, "data gagal dihapus"+e);
            }
            tabel();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        kosong();
        tabel();
    }//GEN-LAST:event_cancelActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        save.setEnabled(false);
        edit.setEnabled(true);
        int baris = tabel.getSelectedRow();
        nisn.setText(tabel.getModel().getValueAt(baris, 0).toString());
        nis.setText(tabel.getModel().getValueAt(baris, 1).toString());
        nasis.setText(tabel.getModel().getValueAt(baris, 2).toString());
        kls.setSelectedItem(tabel.getModel().getValueAt(baris, 3));
        tlpn.setText(tabel.getModel().getValueAt(baris, 5).toString());
        alamat.setText(tabel.getModel().getValueAt(baris, 6).toString());
    }//GEN-LAST:event_tabelMouseClicked

    private void cariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyPressed
        // TODO add your handling code here:Object header[]={"ID","NAMA","JENIS KELAMIN","WA","EMAIL","ALAMAT"};
        Object header[]={"NISN","NIS","NAMA SISWA","KELAS","JENIS KELAMIN","TELEPON","ALAMAT"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel.setModel(data);

        setKoneksi();
        String sql="Select * from siswa where nisn like '%" + cari.getText() + "%'" +"or nis like '%" + cari.getText()+"%'"+ "%'" +"or namasiswa like '%" + cari.getText()+"%'"+ "%'" +"or kelas like '%" + cari.getText()+"%'";

        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("nisn");
                String kolom2=rs.getString("nis");
                String kolom3=rs.getString("namasiswa");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("jenis_kelamin");
                String kolom6=rs.getString("telepon");
                String kolom7=rs.getString("alamat");

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7};
                data.addRow(kolom);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_cariKeyPressed

    public Connection setKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/pengaduanapp","root","");
            stm=conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal :" +e);
        }
       return conn; 
    }

public void tabel(){
        Object header[]={"NISN","NIS","NAMA SISWA","KELAS","JENIS KELAMIN","TELEPON","ALAMAT"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        tabel.setModel(data);
        setKoneksi();
        String sql="SELECT * FROM siswa";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("nisn");
                String kolom2=rs.getString("nis");
                String kolom3=rs.getString("namasiswa");
                String kolom4=rs.getString("kelas");
                String kolom5=rs.getString("jenis_kelamin");
                String kolom6=rs.getString("telepon");
                String kolom7=rs.getString("alamat");

                String kolom[]={kolom1,kolom2,kolom3,kolom4,kolom5,kolom6,kolom7};
                data.addRow(kolom);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dipanggil"+e);
        }
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
            java.util.logging.Logger.getLogger(mastersiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mastersiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mastersiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mastersiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mastersiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cari;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id_kelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> kls;
    private javax.swing.JRadioButton lk;
    private javax.swing.JTextField nasis;
    private javax.swing.JTextField nis;
    private javax.swing.JTextField nisn;
    private javax.swing.JRadioButton pr;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tlpn;
    // End of variables declaration//GEN-END:variables
}