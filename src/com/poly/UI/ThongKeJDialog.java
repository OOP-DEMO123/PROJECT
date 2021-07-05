/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.UI;

import com.poly.dao.LoaiSanPhamDAO;
import com.poly.dao.SanPhamDAO;
import com.poly.entity.LoaiSanPham;
import com.poly.entity.SanPham;
import com.poly.utils.MsgBox;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThongKeJDialog
     */
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboLoaiSanPham = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiDung = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Tổng hợp và thống kê");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("LOẠI");
        jPanel6.add(jLabel2, java.awt.BorderLayout.LINE_START);

        cboLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSanPhamActionPerformed(evt);
            }
        });
        jPanel6.add(cboLoaiSanPham, java.awt.BorderLayout.PAGE_END);

        jPanel1.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "SỐ LƯỢNG", "ĐƠN GIÁ", "HÌNH", "MÃ LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setGridColor(new java.awt.Color(255, 0, 0));
        tblSanPham.setRowHeight(25);
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        tabs.addTab("SẢN PHẨM", jPanel1);

        jPanel3.setLayout(new java.awt.BorderLayout());

        tblNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TÊN NGƯỜI DÙNG", "MẬT KHẨU", "ĐỊA CHỈ", "EMAIL", "HÌNH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiDung.setGridColor(new java.awt.Color(255, 0, 0));
        tblNguoiDung.setRowHeight(25);
        tblNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiDungMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNguoiDung);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        tabs.addTab("NGƯỜI DÙNG", jPanel3);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void cboLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        //fillTableLoaiSanPham();
    }//GEN-LAST:event_cboLoaiSanPhamActionPerformed

    private void tblNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiDungMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblNguoiDungMouseClicked

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboLoaiSanPham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNguoiDung;
    private javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables

    SanPhamDAO dao = new SanPhamDAO();
    LoaiSanPhamDAO lspdao = new LoaiSanPhamDAO();

    void init() {
        setLocationRelativeTo(null);
        setSize(600,600);
        fillComboBoxLoaiSanPham();
        //fillTableLoaiSanPham();

        this.selectTab(0);
        

        tblSanPham.getColumnModel().getColumn(0).setMaxWidth(100);
        tblSanPham.getColumnModel().getColumn(2).setMaxWidth(70);
        tblSanPham.getColumnModel().getColumn(3).setMaxWidth(120);

        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblSanPham.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);

        tblNguoiDung.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        tblNguoiDung.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblNguoiDung.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblNguoiDung.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);

    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        
    }
    
    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    void fillComboBoxLoaiSanPham() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiSanPham.getModel();
        model.removeAllElements();
        List<LoaiSanPham> list = lspdao.selectAll();
        for(LoaiSanPham lsp : list){
            model.addElement(lsp.getTenLSP());
        }
    }

    void fillTableLoaiSanPham() {
        DefaultTableModel model = (DefaultTableModel) tblSanPham.getModel();
        model.setRowCount(0);
        LoaiSanPham kh = (LoaiSanPham) cboLoaiSanPham.getSelectedItem();
        try {
            List<SanPham> list = dao.selectById(kh);
            for (SanPham sp : list) {
                Object[] row = {
                    sp.getMaSP(),
                    sp.getTenSP(),
                    sp.getSoLuong(),
                    sp.getDonGia(),
                    sp.getHinh(),
                    sp.getMaLoaiSP()
                };
                model.addRow(row);
            }
        } 
        catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }


}
