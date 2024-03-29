package classscheduler;
import classscheduler.admincomponents.AddSchedule; 
import classscheduler.admincomponents.RemoveSchedule;

public class Admin extends javax.swing.JFrame {

    private javax.swing.JButton addSchedule;
    
    public Admin() {
         initComponents();
        // Initialize the addSchedule button
        addSchedule = new javax.swing.JButton();
        // Other initialization code for addSchedule if required
    }
    // Getter method for addSchedule button
    public javax.swing.JButton getAddScheduleButton() {
        return addSchedule;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addSchedule = new javax.swing.JButton();
        removeSchedule = new javax.swing.JButton();
        editSchedule = new javax.swing.JButton();
        viewSchedule = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Admin Control Pannel");

        addSchedule.setText("ADD SCHEDULE");
        addSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScheduleActionPerformed(evt);
            }
        });

        removeSchedule.setText("REMOVE SECHEDULE");
        removeSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeScheduleActionPerformed(evt);
            }
        });

        editSchedule.setText("EDIT SCHEDULE");

        viewSchedule.setText("VIEW SCHEDULE");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shutdown.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(addSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(addSchedule)
                .addGap(18, 18, 18)
                .addComponent(removeSchedule)
                .addGap(18, 18, 18)
                .addComponent(editSchedule)
                .addGap(18, 18, 18)
                .addComponent(viewSchedule)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScheduleActionPerformed
        addSchedule.setEnabled(false); // Disable the button when clicked
        AddSchedule addScheduleFrame = new AddSchedule(this); // Pass the Admin frame reference to AddSchedule frame
        addScheduleFrame.setVisible(true);
        this.setEnabled(true); // Disable Admin frame when AddSchedule is open
    }//GEN-LAST:event_addScheduleActionPerformed

    private void removeScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeScheduleActionPerformed
        RemoveSchedule removeScheduleFrame = new RemoveSchedule();
        removeScheduleFrame.setVisible(true);
    }//GEN-LAST:event_removeScheduleActionPerformed
    public void enableAdminFrame() {
    this.setEnabled(true);
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    //disable the button for the add sched
    // action listener

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editSchedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton removeSchedule;
    private javax.swing.JButton viewSchedule;
    // End of variables declaration//GEN-END:variables
}
