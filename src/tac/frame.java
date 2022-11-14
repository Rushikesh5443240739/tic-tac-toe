/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tac;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author rushi
 */
public class frame extends javax.swing.JFrame {

    /**
     * Creates new form frame
     */
    public frame() {
        initComponents();
    }
    private JFrame frame;
    private JTextField xCount;
    private JTextField oCount;
    private int xcount=0;
    private int ocount=0;
    private String startgame="X"; 
    
        private int b1=10;
        private int b2=10;
        private int b3=10;
        private int b4=10;
        private int b5=10;
        private int b6=10;
        private int b7=10;
        private int b8=10;
        private int b9=10;
        private  int ii=0;
    private void winning_game(){
        if((b1==1&&b2==1&&b3==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        
       else if((b4==1&&b5==1&&b6==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        else if((b7==1&&b8==1&&b9==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        } else if((b1==1&&b4==1&&b7==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }else if((b2==1&&b5==1&&b8==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        } else if((b1==1&&b5==1&&b9==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        } else if((b3==1&&b5==1&&b7==1)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        
        
        
        //p////
        
        
        else if((b1==0&&b2==0&&b3==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        
        else if((b4==0&&b5==0&&b6==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        else if((b7==0&&b8==0&&b9==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }else if((b1==0&&b4==0&&b7==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }else if((b2==0&&b5==0&&b8==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        } else if((b1==0&&b5==0&&b9==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }else if((b3==0&&b5==0&&b7==0)){
                JOptionPane.showMessageDialog(null, "Player X WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        } 
        else if((ii==9)){
                JOptionPane.showMessageDialog(null, "No Player WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xcount++;
                System.out.println(xcount);
               x_count.setText(String.valueOf(xcount));
        }
        
        
        
       
    }
private void chosePlayer(){
    if(startgame.equalsIgnoreCase("x")){
        startgame="O";
    }
    else{
        startgame="X";
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

        jPanel2 = new javax.swing.JPanel();
        a1 = new javax.swing.JPanel();
        aa1 = new javax.swing.JButton();
        a2 = new javax.swing.JPanel();
        aa2 = new javax.swing.JButton();
        a3 = new javax.swing.JPanel();
        aa3 = new javax.swing.JButton();
        a4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        a5 = new javax.swing.JPanel();
        x_count = new javax.swing.JTextField();
        a6 = new javax.swing.JPanel();
        aa4 = new javax.swing.JButton();
        a7 = new javax.swing.JPanel();
        aa5 = new javax.swing.JButton();
        a8 = new javax.swing.JPanel();
        aa6 = new javax.swing.JButton();
        a9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        a10 = new javax.swing.JPanel();
        o_count = new javax.swing.JTextField();
        a11 = new javax.swing.JPanel();
        aa7 = new javax.swing.JButton();
        a12 = new javax.swing.JPanel();
        aa8 = new javax.swing.JButton();
        a13 = new javax.swing.JPanel();
        aa9 = new javax.swing.JButton();
        a14 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        a15 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");
        setMinimumSize(new java.awt.Dimension(600, 400));
        setName("frame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(600, 400));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        a1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a1.setLayout(new java.awt.BorderLayout());

        aa1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa1ActionPerformed(evt);
            }
        });
        a1.add(aa1, java.awt.BorderLayout.CENTER);

        jPanel2.add(a1);

        a2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a2.setLayout(new java.awt.BorderLayout());

        aa2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa2ActionPerformed(evt);
            }
        });
        a2.add(aa2, java.awt.BorderLayout.CENTER);

        jPanel2.add(a2);

        a3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a3.setLayout(new java.awt.BorderLayout());

        aa3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa3ActionPerformed(evt);
            }
        });
        a3.add(aa3, java.awt.BorderLayout.CENTER);

        jPanel2.add(a3);

        a4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a4.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player X");
        a4.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(a4);

        a5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a5.setLayout(new java.awt.BorderLayout());

        x_count.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        x_count.setForeground(new java.awt.Color(255, 0, 51));
        x_count.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x_count.setText("0");
        x_count.setEnabled(false);
        x_count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x_countActionPerformed(evt);
            }
        });
        a5.add(x_count, java.awt.BorderLayout.CENTER);

        jPanel2.add(a5);

        a6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a6.setLayout(new java.awt.BorderLayout());

        aa4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa4ActionPerformed(evt);
            }
        });
        a6.add(aa4, java.awt.BorderLayout.CENTER);

        jPanel2.add(a6);

        a7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a7.setLayout(new java.awt.BorderLayout());

        aa5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa5ActionPerformed(evt);
            }
        });
        a7.add(aa5, java.awt.BorderLayout.CENTER);

        jPanel2.add(a7);

        a8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a8.setLayout(new java.awt.BorderLayout());

        aa6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa6ActionPerformed(evt);
            }
        });
        a8.add(aa6, java.awt.BorderLayout.CENTER);

        jPanel2.add(a8);

        a9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a9.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player O");
        a9.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(a9);

        a10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a10.setLayout(new java.awt.BorderLayout());

        o_count.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        o_count.setForeground(new java.awt.Color(255, 0, 51));
        o_count.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        o_count.setText("0");
        o_count.setEnabled(false);
        a10.add(o_count, java.awt.BorderLayout.CENTER);

        jPanel2.add(a10);

        a11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a11.setLayout(new java.awt.BorderLayout());

        aa7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa7ActionPerformed(evt);
            }
        });
        a11.add(aa7, java.awt.BorderLayout.CENTER);

        jPanel2.add(a11);

        a12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a12.setLayout(new java.awt.BorderLayout());

        aa8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa8ActionPerformed(evt);
            }
        });
        a12.add(aa8, java.awt.BorderLayout.CENTER);

        jPanel2.add(a12);

        a13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a13.setLayout(new java.awt.BorderLayout());

        aa9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        aa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aa9ActionPerformed(evt);
            }
        });
        a13.add(aa9, java.awt.BorderLayout.CENTER);

        jPanel2.add(a13);

        a14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a14.setLayout(new java.awt.BorderLayout());

        reset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        a14.add(reset, java.awt.BorderLayout.CENTER);

        jPanel2.add(a14);

        a15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        a15.setLayout(new java.awt.BorderLayout());

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        a15.add(exit, java.awt.BorderLayout.CENTER);

        jPanel2.add(a15);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa4ActionPerformed
        // TODO add your handling code here:
        aa4.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa4.setForeground(Color.red);
            b4=1;
            ii++;
        }
        else{
            aa4.setForeground(Color.blue);
            b4=0;
            ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa4ActionPerformed

    private void aa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa7ActionPerformed
        // TODO add your handling code here:
        aa7.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa7.setForeground(Color.red);
            b7=1;
            ii++;
        }
        else{
            aa7.setForeground(Color.blue);
            b7=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa7ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        aa1.setText(null);
        aa2.setText(null);
        aa3.setText(null);
        aa4.setText(null);
        aa5.setText(null);
        aa6.setText(null);
        aa7.setText(null);
        aa8.setText(null);
        aa9.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
         
       frame=new JFrame();
     if(JOptionPane.showConfirmDialog(null, " u want too close","jann",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
         System.exit(0);
       
     }
   
    }//GEN-LAST:event_exitActionPerformed

    private void aa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa1ActionPerformed
        // TODO add your handling code here:
        aa1.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa1.setForeground(Color.red);
            b1=1;ii++;
        }
        else{
            aa1.setForeground(Color.blue);
            b1=0;ii++;
        }
        chosePlayer();
        winning_game();
    }//GEN-LAST:event_aa1ActionPerformed

    private void aa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa2ActionPerformed
        aa2.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa2.setForeground(Color.red);
            b2=1;ii++;
        }
        else{
            aa2.setForeground(Color.blue);
            b2=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa2ActionPerformed

    private void aa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa3ActionPerformed
        // TODO add your handling code here:
        aa3.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa3.setForeground(Color.red);
            b3=1;ii++;
        }
        else{
            aa3.setForeground(Color.blue);
            b3=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa3ActionPerformed

    private void aa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa5ActionPerformed
        // TODO add your handling code here:
        aa5.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa5.setForeground(Color.red);
            b5=1;ii++;
        }
        else{
            aa5.setForeground(Color.blue);
            b5=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa5ActionPerformed

    private void aa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa6ActionPerformed
        // TODO add your handling code here:
        aa6.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa6.setForeground(Color.red);
            b6=1;ii++;
        }
        else{
            aa6.setForeground(Color.blue);
            b6=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa6ActionPerformed

    private void aa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa8ActionPerformed
        // TODO add your handling code here:
        aa8.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa8.setForeground(Color.red);
            b8=1;ii++;
        }
        else{
            aa8.setForeground(Color.blue);
            b8=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa8ActionPerformed

    private void aa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aa9ActionPerformed
        // TODO add your handling code here:
        aa9.setText(startgame);
        if(startgame.equalsIgnoreCase("x")){
            aa9.setForeground(Color.red);
            b9=1;ii++;
        }
        else{
            aa9.setForeground(Color.blue);
            b9=0;ii++;
        }
        chosePlayer();winning_game();
    }//GEN-LAST:event_aa9ActionPerformed

    private void x_countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x_countActionPerformed
      
        
    
  
       
      
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
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a1;
    private javax.swing.JPanel a10;
    private javax.swing.JPanel a11;
    private javax.swing.JPanel a12;
    private javax.swing.JPanel a13;
    private javax.swing.JPanel a14;
    private javax.swing.JPanel a15;
    private javax.swing.JPanel a2;
    private javax.swing.JPanel a3;
    private javax.swing.JPanel a4;
    private javax.swing.JPanel a5;
    private javax.swing.JPanel a6;
    private javax.swing.JPanel a7;
    private javax.swing.JPanel a8;
    private javax.swing.JPanel a9;
    private javax.swing.JButton aa1;
    private javax.swing.JButton aa2;
    private javax.swing.JButton aa3;
    private javax.swing.JButton aa4;
    private javax.swing.JButton aa5;
    private javax.swing.JButton aa6;
    private javax.swing.JButton aa7;
    private javax.swing.JButton aa8;
    private javax.swing.JButton aa9;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField o_count;
    private javax.swing.JButton reset;
    private javax.swing.JTextField x_count;
    // End of variables declaration//GEN-END:variables
}
