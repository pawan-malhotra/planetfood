/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import planetfood.pojo.UserProfile;

/**
 *
 * @author pawan
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminOptionsFrame
     */
    public AdminOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("HELLO "+UserProfile.getUsername());
    }
    public String getOption()
    {
        if(jrbAddPrd.isSelected())
            return jrbAddPrd.getText();
        else if(jrbEditPrd.isSelected())
            return jrbEditPrd.getText();
        else if(jrbRemovePrd.isSelected())
            return jrbRemovePrd.getText();
        else if(jrbViewPrd.isSelected())
            return jrbViewPrd.getText();
        else if(jrbAddEmp.isSelected())
            return jrbAddEmp.getText();
        else if(jrbViewEmp.isSelected())
            return jrbViewEmp.getText();
        else if(jrbEditEmp.isSelected())
            return jrbEditEmp.getText();
        else if(jrbRemoveEmp.isSelected())
            return jrbRemoveEmp.getText();
        else if(jrbRegCash.isSelected())
            return jrbRegCash.getText();
        else if(jrbRemoveCash.isSelected())
            return jrbRemoveCash.getText();
        else if(jrbViewOrder.isSelected())
            return jrbViewOrder.getText();
        else if(jrbViewDate.isSelected())
            return jrbViewDate.getText();
        else if(jrbAddCat.isSelected())
            return jrbAddCat.getText();
        else if(jrbEditCat.isSelected())
            return jrbEditCat.getText();
        else if(jrbViewCat.isSelected())
            return jrbViewCat.getText();
        return null;
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jrbAddEmp = new javax.swing.JRadioButton();
        jrbViewEmp = new javax.swing.JRadioButton();
        jrbEditEmp = new javax.swing.JRadioButton();
        jrbRemoveEmp = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jrbRegCash = new javax.swing.JRadioButton();
        jrbRemoveCash = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrbViewOrder = new javax.swing.JRadioButton();
        jrbViewDate = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jrbAddCat = new javax.swing.JRadioButton();
        jrbEditCat = new javax.swing.JRadioButton();
        jrbViewCat = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrbAddPrd = new javax.swing.JRadioButton();
        jrbViewPrd = new javax.swing.JRadioButton();
        jrbEditPrd = new javax.swing.JRadioButton();
        jrbRemovePrd = new javax.swing.JRadioButton();
        btnDoTask = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("PLANET FOOD ADMIN PANEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(0.6F);
        jSeparator1.setAlignmentY(0.6F);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 458, 10));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Make A Choice");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfood/gui/manager.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 160));

        lblUsername.setBackground(new java.awt.Color(0, 102, 102));
        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));
        lblUsername.setText("hello admin   ");
        jPanel1.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 20));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "EMPLOYEE OPTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jrbAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbAddEmp);
        jrbAddEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAddEmp.setForeground(new java.awt.Color(204, 204, 204));
        jrbAddEmp.setText("Add Employee");
        jrbAddEmp.setBorder(null);

        jrbViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewEmp);
        jrbViewEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewEmp.setForeground(new java.awt.Color(204, 204, 204));
        jrbViewEmp.setText("View Employee");
        jrbViewEmp.setBorder(null);

        jrbEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbEditEmp);
        jrbEditEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditEmp.setForeground(new java.awt.Color(204, 204, 204));
        jrbEditEmp.setText("Edit Employee");
        jrbEditEmp.setBorder(null);

        jrbRemoveEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbRemoveEmp);
        jrbRemoveEmp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRemoveEmp.setForeground(new java.awt.Color(204, 204, 204));
        jrbRemoveEmp.setText("Remove Employee");
        jrbRemoveEmp.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddEmp)
                    .addComponent(jrbViewEmp)
                    .addComponent(jrbEditEmp)
                    .addComponent(jrbRemoveEmp))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbRemoveEmp)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 160));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CASHIER OPTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        jrbRegCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbRegCash);
        jrbRegCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRegCash.setForeground(new java.awt.Color(204, 204, 204));
        jrbRegCash.setText("Register Cashier");
        jrbRegCash.setBorder(null);

        jrbRemoveCash.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbRemoveCash);
        jrbRemoveCash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRemoveCash.setForeground(new java.awt.Color(204, 204, 204));
        jrbRemoveCash.setText("Remove Cashier");
        jrbRemoveCash.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbRegCash)
                    .addComponent(jrbRemoveCash))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbRegCash)
                .addGap(18, 18, 18)
                .addComponent(jrbRemoveCash)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 280, 160));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "REPORT OPTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jrbViewOrder.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewOrder);
        jrbViewOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewOrder.setForeground(new java.awt.Color(204, 204, 204));
        jrbViewOrder.setText("View Orders");
        jrbViewOrder.setBorder(null);

        jrbViewDate.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewDate);
        jrbViewDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewDate.setForeground(new java.awt.Color(204, 204, 204));
        jrbViewDate.setText("View Datewise");
        jrbViewDate.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbViewOrder)
                    .addComponent(jrbViewDate))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbViewOrder)
                .addGap(18, 18, 18)
                .addComponent(jrbViewDate)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 280, 160));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CATEGORY OPTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jrbAddCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbAddCat);
        jrbAddCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAddCat.setForeground(new java.awt.Color(204, 204, 204));
        jrbAddCat.setText("Add Category");
        jrbAddCat.setBorder(null);

        jrbEditCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbEditCat);
        jrbEditCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditCat.setForeground(new java.awt.Color(204, 204, 204));
        jrbEditCat.setText("Edit Category");
        jrbEditCat.setBorder(null);

        jrbViewCat.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewCat);
        jrbViewCat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewCat.setForeground(new java.awt.Color(204, 204, 204));
        jrbViewCat.setText("View Category");
        jrbViewCat.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddCat)
                    .addComponent(jrbEditCat)
                    .addComponent(jrbViewCat))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbAddCat)
                .addGap(18, 18, 18)
                .addComponent(jrbEditCat)
                .addGap(18, 18, 18)
                .addComponent(jrbViewCat)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 270, 160));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRODUCT OPTIONS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 204, 204))); // NOI18N

        jrbAddPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbAddPrd);
        jrbAddPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbAddPrd.setForeground(new java.awt.Color(204, 204, 204));
        jrbAddPrd.setText("Add Product");
        jrbAddPrd.setBorder(null);

        jrbViewPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbViewPrd);
        jrbViewPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbViewPrd.setForeground(new java.awt.Color(204, 204, 204));
        jrbViewPrd.setText("view Product");
        jrbViewPrd.setBorder(null);

        jrbEditPrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbEditPrd);
        jrbEditPrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbEditPrd.setForeground(new java.awt.Color(204, 204, 204));
        jrbEditPrd.setText("Edit Product");
        jrbEditPrd.setBorder(null);
        jrbEditPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEditPrdActionPerformed(evt);
            }
        });

        jrbRemovePrd.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrbRemovePrd);
        jrbRemovePrd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrbRemovePrd.setForeground(new java.awt.Color(204, 204, 204));
        jrbRemovePrd.setText("Remove Product");
        jrbRemovePrd.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAddPrd)
                    .addComponent(jrbViewPrd)
                    .addComponent(jrbEditPrd)
                    .addComponent(jrbRemovePrd))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrbAddPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbViewPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbEditPrd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbRemovePrd)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 280, 160));

        btnDoTask.setBackground(new java.awt.Color(102, 102, 102));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("DO TASK");
        btnDoTask.setBorder(null);
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, 180, 30));

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(null);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 190, 30));

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 0));
        lblLogout.setText("logout");
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
        jPanel1.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbEditPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEditPrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEditPrdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        // TODO add your handling code here:
        lblLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        // TODO add your handling code here:
        lblLogout.setForeground(Color.YELLOW);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        // TODO add your handling code here:
        String task=getOption();
        if(task==null){
           JOptionPane.showMessageDialog(null,"Please Choose an Option","ERROR!",JOptionPane.ERROR_MESSAGE);
        return;
        }
        JFrame jf=null;
        if(task.equals("Add Product"))
            jf=new AddProductFrame();
        else if(task.equals("Edit Product"))
        {
            jf=new EditProductFrame();
        }
        else if(task.equals("Remove Product"))
        {
            jf=new RemoveProductFrame();
        }    
        else if(task.equals("view Product"))
        {
            jf=new ViewProductFrame();
        }
        else if(task.equals("Add Employee"))
        {
            jf=new AddEmpFrame();
        }
        else if(task.equals("View Employee"))
        {
            jf=new ViewEmpFrame();
        }
        else if(task.equals("Edit Employee"))
        {
            jf=new EditEmpFrame();
        }
        else if(task.equals("Remove Employee"))
        {
            jf=new RemoveEmpFrame();
        }
        else if(task.equals("Register Cashier"))
        {
            jf=new RegisterCashierFrame();
        }
        else if(task.equals("Remove Cashier"))
        {
            jf=new RemoveCashierFrame();
        }
        else if(task.equals("View Orders"))
        {
            jf=new ViewOrdersFrame();
        }
        else if(task.equals("View Datewise"))
        {
            jf=new ViewDatewiseFrame();
        }
        else if(task.equals("Add Category"))
        {
            jf=new AddCategoryFrame();
        }
        else if(task.equals("Edit Category"))
        {
            jf=new EditCategoryFrame();
        }
        else if(task.equals("View Category"))
        {
            jf=new ViewCategoryFrame();
        }
        jf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDoTaskActionPerformed

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDoTask;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbAddCat;
    private javax.swing.JRadioButton jrbAddEmp;
    private javax.swing.JRadioButton jrbAddPrd;
    private javax.swing.JRadioButton jrbEditCat;
    private javax.swing.JRadioButton jrbEditEmp;
    private javax.swing.JRadioButton jrbEditPrd;
    private javax.swing.JRadioButton jrbRegCash;
    private javax.swing.JRadioButton jrbRemoveCash;
    private javax.swing.JRadioButton jrbRemoveEmp;
    private javax.swing.JRadioButton jrbRemovePrd;
    private javax.swing.JRadioButton jrbViewCat;
    private javax.swing.JRadioButton jrbViewDate;
    private javax.swing.JRadioButton jrbViewEmp;
    private javax.swing.JRadioButton jrbViewOrder;
    private javax.swing.JRadioButton jrbViewPrd;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}