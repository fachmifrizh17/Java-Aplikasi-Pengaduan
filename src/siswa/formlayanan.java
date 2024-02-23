/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import javax.swing.table.DefaultTableModel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

/**
 *
 * @author FBS
 */
public class formlayanan extends javax.swing.JFrame {
private DefaultTableModel data;
 byte[] person_image;
    Connection conn;
    Statement stm;
    ResultSet rs;
    /**
     * Creates new form formlayanan
     */
    public formlayanan() {
        initComponents();
        this.person_image=null;
        ImageIcon img = new ImageIcon("src/icon/logo.png");
        this.setIconImage(img.getImage());
        initUI();
        kosong();
        block();
        table();
        kode();
    }
    
     protected void block(){
    id.setEnabled(false);
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
        id.setText("");
        nama.setText("");
        keterangan.setText("");
        imageTF.setIcon(null);
        Imgpath =null;
    }
     
    public void kode() {
        try {
        
            String sql = "SELECT * FROM layanan ORDER by id desc";
            java.sql.Statement stat = conn.createStatement();
            ResultSet r = stat.executeQuery(sql);

            if (r.next()) {
                String nofak = r.getString("id").substring(1);
                String AN = "" + (Integer.parseInt(nofak) + 1);
                String Nol = "";

                if (AN.length() == 1) {
                    Nol = "000";
                } else if (AN.length() == 2) {
                    Nol = "00";
                } else if (AN.length() == 3) {
                    Nol = "0";
                } else if (AN.length() == 4) {
                    Nol = "";
                }

               id.setText("L" + Nol + AN);
            } else {
               id.setText("L0001");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }  
    
    private ImageIcon ResizeImage(String imagePath, int width, int height) {
    ImageIcon imageIcon = new ImageIcon(imagePath);
    Image image = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    return new ImageIcon(image);
}
    
    String Imgpath = null;
      int pos=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        imageTF = new javax.swing.JLabel();
        fileBT = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        keterangan = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PENGADUAN LAYANAN");
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, 120));
        jPanel1.add(imageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 240, 80));

        fileBT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fileBT.setText("AMBIL FOTO");
        fileBT.setOpaque(false);
        fileBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fileBTMouseEntered(evt);
            }
        });
        fileBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBTActionPerformed(evt);
            }
        });
        jPanel1.add(fileBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 170, 30));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel6.setText("FOTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, -1));

        id.setOpaque(false);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 670, 40));

        save.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        save.setText("SIMPAN");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.setMaximumSize(new java.awt.Dimension(84, 29));
        save.setMinimumSize(new java.awt.Dimension(84, 29));
        save.setOpaque(false);
        save.setPreferredSize(new java.awt.Dimension(84, 29));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 120, -1));

        cancel.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        cancel.setText("BATAL");
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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 120, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel4.setText("KETERANGAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel3.setText("NAMA SISWA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel2.setText("ID PENGADUAN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        nama.setOpaque(false);
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 670, 40));

        keterangan.setColumns(20);
        keterangan.setRows(5);
        keterangan.setOpaque(false);
        jScrollPane1.setViewportView(keterangan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 426, 670, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foto/12.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel5.setText("NAMA SISWA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

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

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       String sql = "INSERT INTO layanan (id, namasiswa, keterangan, img, status) VALUES (?, ?, ?, ?, ?)";

    try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, id.getText());
        stat.setString(2, nama.getText());
        stat.setString(3, keterangan.getText());

        // Read the photo file and convert it to bytes
        if (Imgpath != null) {
            Path imagePath = Paths.get(Imgpath);
            byte[] imageBytes = Files.readAllBytes(imagePath);

            // Convert image bytes to Base64 string
            String base64Image = Base64.getEncoder().encodeToString(imageBytes);

            stat.setString(4, base64Image);
        } else {
            stat.setNull(4, java.sql.Types.VARCHAR);
        }

        stat.setBoolean(5, false);

        stat.executeUpdate();

        JOptionPane.showMessageDialog(null, "Data saved successfully");
        kosong();
        id.requestFocus();
        table();
        kode();
    } catch (SQLException | IOException e) {
        JOptionPane.showMessageDialog(null, "Failed to save data: " + e.getMessage());
        table();
    }
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        kosong();
        table();
    }//GEN-LAST:event_cancelActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new siswa. menusiswa().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void fileBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileBTMouseEntered
        // TODO add your handling code here:
        fileBT.setBackground(new Color(0,153,153));
        fileBT.setForeground(Color.red);
    }//GEN-LAST:event_fileBTMouseEntered

    private void fileBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileBTActionPerformed
       JFileChooser file = new JFileChooser();
    file.setCurrentDirectory(new File(System.getProperty("user.home")));
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
    file.addChoosableFileFilter(filter);
    int result = file.showOpenDialog(null);
    if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = file.getSelectedFile();
        String path = selectedFile.getAbsolutePath();
        ImageIcon imageIcon = ResizeImage(path, imageTF.getWidth(), imageTF.getHeight());
        imageTF.setIcon(imageIcon);
        Imgpath = path;
    } else {
        System.out.println("No file selected.");
    }
    }//GEN-LAST:event_fileBTActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        save.setEnabled(false);
        int baris = table.getSelectedRow();
        id.setText(table.getModel().getValueAt(baris, 0).toString());
        nama.setText(table.getModel().getValueAt(baris, 1).toString());
        keterangan.setText(table.getModel().getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tableMouseClicked
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
    
    public void table(){
        Object header[]={"ID LAYANAN","NAMA SISWA","KETERANGAN","IMG"};
        DefaultTableModel data=new DefaultTableModel(null,header);
        setKoneksi();
        String sql="SELECT * FROM layanan";
        try {
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                String kolom1=rs.getString("id");
                String kolom2=rs.getString("namasiswa");
                String kolom3=rs.getString("keterangan");
                String kolom4=rs.getString("img");

                String kolom[]={kolom1,kolom2,kolom3,kolom4};
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
            java.util.logging.Logger.getLogger(formlayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formlayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formlayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formlayanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formlayanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton fileBT;
    private javax.swing.JTextField id;
    private javax.swing.JLabel imageTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea keterangan;
    private javax.swing.JTextField nama;
    private javax.swing.JButton save;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}