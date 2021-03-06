/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import planetfood.dao.CategoriesDao;
import planetfood.dao.ProductDao;
import planetfood.pojo.Product;
import planetfood.pojo.UserProfile;

/**
 *
 * @author pawan
 */
public class EditProductFrame extends javax.swing.JFrame {
    private HashMap<String,String> categories;
    private HashMap<String,Product> productList;
    private String prodName;
    private String catId;
    private double prodPrice;
    private String prodId;
    private String prodIsActive;
  
    private Product p;
    /**
     * Creates new form EditProductFrame
     */
    public EditProductFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("HELLO "+UserProfile.getUsername());
        loadProductDetails();
    }
    public void loadProductDetails(){
        try
        {
            categories=CategoriesDao.getAllCategoryId();
            for(String CatName:categories.keySet())
                jcCatId.addItem(CatName);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Exception in DB","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    public int validateInput(){
        int result=1;
        prodName=txtProdName.getText();
       String catName=jcCatId.getSelectedItem().toString();
        catId=categories.get(catName);
        if(chkIsActive.isSelected())
            prodIsActive="Y";
        else
            prodIsActive="N";
        try
        {
            prodPrice=Double.parseDouble(txtProdPrice.getText());
        }
        catch(Exception e)
        {
            result=0;
        }
        if(prodName.isEmpty())
            result=-1;
        return result;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcCatId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcProdId = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        chkIsActive = new javax.swing.JCheckBox();
        btnSaveChanges = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtProdName = new javax.swing.JTextField();
        txtProdPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PRODUCT EDITING PANEL");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CHOOSE PRODUCT TO EDIT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Product Category");

        jcCatId.setBackground(new java.awt.Color(0, 102, 102));
        jcCatId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcCatId.setForeground(new java.awt.Color(204, 204, 204));
        jcCatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCatIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Product ID");

        jcProdId.setBackground(new java.awt.Color(0, 102, 102));
        jcProdId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcProdId.setForeground(new java.awt.Color(204, 204, 204));
        jcProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProdIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Product Name");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Product Price");
        jLabel5.setToolTipText("");

        chkIsActive.setBackground(new java.awt.Color(0, 102, 102));
        chkIsActive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        chkIsActive.setForeground(new java.awt.Color(204, 204, 204));
        chkIsActive.setText("Is Active");
        chkIsActive.setBorder(null);
        chkIsActive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIsActiveActionPerformed(evt);
            }
        });

        btnSaveChanges.setBackground(new java.awt.Color(102, 102, 102));
        btnSaveChanges.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveChanges.setText("SAVE CHANGES");
        btnSaveChanges.setBorder(null);
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtProdName.setBackground(new java.awt.Color(0, 102, 102));
        txtProdName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdName.setForeground(new java.awt.Color(255, 255, 255));
        txtProdName.setBorder(null);

        txtProdPrice.setBackground(new java.awt.Color(0, 102, 102));
        txtProdPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtProdPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtProdPrice.setBorder(null);
        txtProdPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtProdPrice, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkIsActive)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jcCatId, 0, 211, Short.MAX_VALUE)
                                    .addComponent(jcProdId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkIsActive)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(btnSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfood/gui/diet.png"))); // NOI18N

        lblLogout.setBackground(new java.awt.Color(255, 255, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 0));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));
        lblUsername.setText("jLabel8");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblLogout)
                    .addComponent(lblUsername))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdPriceActionPerformed

    private void chkIsActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIsActiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkIsActiveActionPerformed

    private void jcCatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCatIdActionPerformed
        // TODO add your handling code here:
        try
        {
            String catName=jcCatId.getSelectedItem().toString();
            String CatId=categories.get(catName);
            productList=ProductDao.getProductsByCategory(CatId);
            jcProdId.removeAllItems();
            for(String prodId:productList.keySet())
                jcProdId.addItem(prodId);
                
                
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error while connecting to DB!","Exception!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } 
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,"catId not found!","Exception!",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  
        }
    }//GEN-LAST:event_jcCatIdActionPerformed

    private void jcProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProdIdActionPerformed
        // TODO add your handling code here:
        if(jcProdId.getSelectedItem()==null)
         return;
         prodId=jcProdId.getSelectedItem().toString();
         p=productList.get(prodId);
         
         txtProdName.setText(p.getProdName());
         txtProdPrice.setText(String.valueOf(p.getProdPrice()));
         prodIsActive=p.getIsActive();
         if(prodIsActive.equalsIgnoreCase("Y"))
             chkIsActive.setSelected(true);
         else
             chkIsActive.setSelected(false);
    }//GEN-LAST:event_jcProdIdActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        int result=validateInput();
        if(result==0)
        {
            JOptionPane.showMessageDialog(null,"Please input numeric value for product price","Invalid Input!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(result==-1)
        {
         JOptionPane.showMessageDialog(null,"Please input product name","Invalid Input!",JOptionPane.ERROR_MESSAGE);   
        return;
        }
        try
        {
            p.setCatId(catId);
            p.setProdId(prodId);
            p.setProdName(prodName);
            p.setIsActive(prodIsActive);
            p.setProdPrice(prodPrice);
            boolean status=ProductDao.updateProduct(p);
            if(status)
            JOptionPane.showMessageDialog(null,"Product successfully updated!","Success!", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null,"Product not updated!","updation Denied!",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR while adding Products","ERROR!",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        AdminOptionsFrame adminFrame=new AdminOptionsFrame();
        adminFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox chkIsActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcCatId;
    private javax.swing.JComboBox<String> jcProdId;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    // End of variables declaration//GEN-END:variables
}
