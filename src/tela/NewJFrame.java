/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

/**
 *
 * @author hugo.wallace.araujo
 */
public class NewJFrame extends javax.swing.JFrame {

    static Double value1, value2;
    static String operation;
    
    public NewJFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btlOne = new javax.swing.JButton();
        btlTwo = new javax.swing.JButton();
        btlTree = new javax.swing.JButton();
        btlFour = new javax.swing.JButton();
        btlFive = new javax.swing.JButton();
        btlSix = new javax.swing.JButton();
        btlSeven = new javax.swing.JButton();
        btlEight = new javax.swing.JButton();
        btlNine = new javax.swing.JButton();
        btlClean = new javax.swing.JButton();
        btlMult = new javax.swing.JButton();
        btlDiv = new javax.swing.JButton();
        btlZero = new javax.swing.JButton();
        btlDot = new javax.swing.JButton();
        btlSom = new javax.swing.JButton();
        btlSub = new javax.swing.JButton();
        btlRes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtRes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALCULADORA");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 260, 60);

        btlOne.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlOne.setText("1");
        btlOne.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlOneActionPerformed(evt);
            }
        });
        jPanel1.add(btlOne);
        btlOne.setBounds(30, 280, 40, 40);

        btlTwo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlTwo.setText("2");
        btlTwo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlTwoActionPerformed(evt);
            }
        });
        jPanel1.add(btlTwo);
        btlTwo.setBounds(80, 280, 40, 40);

        btlTree.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlTree.setText("3");
        btlTree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlTreeActionPerformed(evt);
            }
        });
        jPanel1.add(btlTree);
        btlTree.setBounds(130, 280, 40, 40);

        btlFour.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlFour.setText("4");
        btlFour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlFourActionPerformed(evt);
            }
        });
        jPanel1.add(btlFour);
        btlFour.setBounds(30, 230, 40, 40);

        btlFive.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlFive.setText("5");
        btlFive.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlFiveActionPerformed(evt);
            }
        });
        jPanel1.add(btlFive);
        btlFive.setBounds(80, 230, 40, 40);

        btlSix.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlSix.setText("6");
        btlSix.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSixActionPerformed(evt);
            }
        });
        jPanel1.add(btlSix);
        btlSix.setBounds(130, 230, 40, 40);

        btlSeven.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlSeven.setText("7");
        btlSeven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSevenActionPerformed(evt);
            }
        });
        jPanel1.add(btlSeven);
        btlSeven.setBounds(30, 180, 40, 40);

        btlEight.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlEight.setText("8");
        btlEight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlEightActionPerformed(evt);
            }
        });
        jPanel1.add(btlEight);
        btlEight.setBounds(80, 180, 40, 40);

        btlNine.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlNine.setText("9");
        btlNine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlNineActionPerformed(evt);
            }
        });
        jPanel1.add(btlNine);
        btlNine.setBounds(130, 180, 40, 40);

        btlClean.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlClean.setText("C");
        btlClean.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btlClean);
        btlClean.setBounds(30, 330, 40, 40);

        btlMult.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btlMult.setText("*");
        btlMult.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlMultActionPerformed(evt);
            }
        });
        jPanel1.add(btlMult);
        btlMult.setBounds(30, 130, 40, 40);

        btlDiv.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btlDiv.setText("/");
        btlDiv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlDivActionPerformed(evt);
            }
        });
        jPanel1.add(btlDiv);
        btlDiv.setBounds(80, 130, 40, 40);

        btlZero.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlZero.setText("0");
        btlZero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlZeroActionPerformed(evt);
            }
        });
        jPanel1.add(btlZero);
        btlZero.setBounds(130, 330, 40, 40);

        btlDot.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btlDot.setText(".");
        btlDot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlDotActionPerformed(evt);
            }
        });
        jPanel1.add(btlDot);
        btlDot.setBounds(80, 330, 40, 40);

        btlSom.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btlSom.setText("+");
        btlSom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSomActionPerformed(evt);
            }
        });
        jPanel1.add(btlSom);
        btlSom.setBounds(180, 130, 40, 140);

        btlSub.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btlSub.setText("-");
        btlSub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSubActionPerformed(evt);
            }
        });
        jPanel1.add(btlSub);
        btlSub.setBounds(130, 130, 40, 40);

        btlRes.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btlRes.setText("=");
        btlRes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlResActionPerformed(evt);
            }
        });
        jPanel1.add(btlRes);
        btlRes.setBounds(180, 280, 40, 90);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        txtRes.setBackground(new java.awt.Color(0, 102, 102));
        txtRes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 60, 250, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btlSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSomActionPerformed
        value1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        operation = "soma";
    }//GEN-LAST:event_btlSomActionPerformed

    private void btlDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlDivActionPerformed
        value1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        operation = "div";
    }//GEN-LAST:event_btlDivActionPerformed

    private void btlResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlResActionPerformed
        value2 = Double.parseDouble(txtRes.getText());    
        if (operation == "soma"){
                Double res = value1+value2;
                txtRes.setText(String.valueOf(res));
            }
        else if (operation == "sub"){                
            Double res = value1-value2;
            txtRes.setText(String.valueOf(res));
        }
        else if (operation == "div"){                
            Double res = value1/value2;
            txtRes.setText(String.valueOf(res));
        }
        
        else if (operation == "mult"){                
            Double res = value1*value2;
            txtRes.setText(String.valueOf(res));
    }
        else {
            txtRes.setText("");
            value1 = null;
            value2 = null;
        }
    }//GEN-LAST:event_btlResActionPerformed

    private void btlOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlOneActionPerformed
        txtRes.setText(txtRes.getText()+"1");
    }//GEN-LAST:event_btlOneActionPerformed

    private void btlTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlTwoActionPerformed
        txtRes.setText(txtRes.getText()+"2");
    }//GEN-LAST:event_btlTwoActionPerformed

    private void btlTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlTreeActionPerformed
        txtRes.setText(txtRes.getText()+"3");
    }//GEN-LAST:event_btlTreeActionPerformed

    private void btlFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlFourActionPerformed
        txtRes.setText(txtRes.getText()+"4");
    }//GEN-LAST:event_btlFourActionPerformed

    private void btlFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlFiveActionPerformed
        txtRes.setText(txtRes.getText()+"5");
    }//GEN-LAST:event_btlFiveActionPerformed

    private void btlSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSixActionPerformed
        txtRes.setText(txtRes.getText()+"6");
    }//GEN-LAST:event_btlSixActionPerformed

    private void btlSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSevenActionPerformed
        txtRes.setText(txtRes.getText()+"7");
    }//GEN-LAST:event_btlSevenActionPerformed

    private void btlEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlEightActionPerformed
        txtRes.setText(txtRes.getText()+"8");
    }//GEN-LAST:event_btlEightActionPerformed

    private void btlNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlNineActionPerformed
        txtRes.setText(txtRes.getText()+"9");
    }//GEN-LAST:event_btlNineActionPerformed

    private void btlZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlZeroActionPerformed
        txtRes.setText(txtRes.getText()+"0");
    }//GEN-LAST:event_btlZeroActionPerformed

    private void btlDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlDotActionPerformed
        txtRes.setText(txtRes.getText()+".");
    }//GEN-LAST:event_btlDotActionPerformed

    private void btlCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlCleanActionPerformed
        txtRes.setText("");
    }//GEN-LAST:event_btlCleanActionPerformed

    private void btlMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlMultActionPerformed
        value1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        operation = "mult";
    }//GEN-LAST:event_btlMultActionPerformed

    private void btlSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSubActionPerformed
        value1 = Double.parseDouble(txtRes.getText());
        txtRes.setText("");
        operation = "sub";
    }//GEN-LAST:event_btlSubActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btlClean;
    private javax.swing.JButton btlDiv;
    private javax.swing.JButton btlDot;
    private javax.swing.JButton btlEight;
    private javax.swing.JButton btlFive;
    private javax.swing.JButton btlFour;
    private javax.swing.JButton btlMult;
    private javax.swing.JButton btlNine;
    private javax.swing.JButton btlOne;
    private javax.swing.JButton btlRes;
    private javax.swing.JButton btlSeven;
    private javax.swing.JButton btlSix;
    private javax.swing.JButton btlSom;
    private javax.swing.JButton btlSub;
    private javax.swing.JButton btlTree;
    private javax.swing.JButton btlTwo;
    private javax.swing.JButton btlZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtRes;
    // End of variables declaration//GEN-END:variables
}
