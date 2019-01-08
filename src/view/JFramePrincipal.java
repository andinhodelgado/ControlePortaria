/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JDesktopPane;
import javax.swing.JMenu;
import model.domain.Func;

/**
 *
 * @author anderson
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private Func func;
    
    /**
     * Creates new form TelaPrincipal
     */
    public JFramePrincipal() {
        initComponents();

        setTitle("CONTROLE DE PORTARIA");
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
        
        JIntFrameCrachaRecep jIntFrameCrachaRecep = new JIntFrameCrachaRecep(this);
        this.desktopPane.add(jIntFrameCrachaRecep);
        jIntFrameCrachaRecep.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jSubMenuVisitante = new javax.swing.JMenuItem();
        jSubMenuVisitado = new javax.swing.JMenuItem();
        jMenuMovimentacao = new javax.swing.JMenu();
        jSubMenuEntrada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuBar.setName(""); // NOI18N

        jMenuCadastro.setText("CADASTRO");
        jMenuCadastro.setEnabled(false);
        jMenuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroActionPerformed(evt);
            }
        });

        jSubMenuVisitante.setText("VISITANTE");
        jSubMenuVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuVisitanteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jSubMenuVisitante);

        jSubMenuVisitado.setText("VISITADO");
        jSubMenuVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuVisitadoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jSubMenuVisitado);

        menuBar.add(jMenuCadastro);

        jMenuMovimentacao.setText("MOVIMENTAÇÃO");
        jMenuMovimentacao.setEnabled(false);

        jSubMenuEntrada.setText("ENTRADA DE VISITANTE");
        jSubMenuEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubMenuEntradaActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jSubMenuEntrada);

        menuBar.add(jMenuMovimentacao);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSubMenuVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuVisitanteActionPerformed
        // TODO add your handling code here:

        JIntFrameVisitante jIntFrameVisitante = new JIntFrameVisitante(1);
        this.desktopPane.add(jIntFrameVisitante);
        jIntFrameVisitante.setVisible(true);

    }//GEN-LAST:event_jSubMenuVisitanteActionPerformed

    private void jMenuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuCadastroActionPerformed

    private void jSubMenuVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuVisitadoActionPerformed
        // TODO add your handling code here:

        JIntFrameVisitado jIntFrameVisitado = new JIntFrameVisitado(1);
        this.desktopPane.add(jIntFrameVisitado);
        jIntFrameVisitado.setVisible(true);

    }//GEN-LAST:event_jSubMenuVisitadoActionPerformed

    private void jSubMenuEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubMenuEntradaActionPerformed
        // TODO add your handling code here:

        JIntFrameVisita jIntFrameVisita = new JIntFrameVisita(this);
        this.desktopPane.add(jIntFrameVisita);
        jIntFrameVisita.setVisible(true);

    }//GEN-LAST:event_jSubMenuEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuMovimentacao;
    private javax.swing.JMenuItem jSubMenuEntrada;
    private javax.swing.JMenuItem jSubMenuVisitado;
    private javax.swing.JMenuItem jSubMenuVisitante;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

    public JDesktopPane getDesktopPane() {
        return desktopPane;
    }

    public JMenu getjMenuCadastro() {
        return jMenuCadastro;
    }

    public JMenu getjMenuMovimentacao() {
        return jMenuMovimentacao;
    }

    public Func getFunc() {
        return func;
    }

    public void setFunc(Func func) {
        this.func = func;
    }
    
}
