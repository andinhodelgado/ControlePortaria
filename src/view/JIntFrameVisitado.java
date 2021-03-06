/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.VisitadoCTR;
import control.VisitanteCTR;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;
import model.domain.Visitado;

/**
 *
 * @author anderson
 */
public class JIntFrameVisitado extends javax.swing.JInternalFrame {

    private VisitadoCTR visitadoCTR;
    private Boolean status; //true = inserir; false = salvar;
    private DefaultTableModel modelTable;
    private int pontoAcessoTela; //1 - Acesso pelo SubMenu Visitado; 2 - Acesso pela Tela de Cadastro de Visita;
    private JIntFrameVisita jIntFrameVisita;

    /**
     * Creates new form JIntFrameVisitado
     */
    public JIntFrameVisitado(int pontoAcessoTela) {

        initComponents();
        this.pontoAcessoTela = pontoAcessoTela;
        modelTable = (DefaultTableModel) jTableVisitado.getModel();
        status = false;
        visitadoCTR = new VisitadoCTR();
        exibirInicialTela();
        DocumentFilter filter = new UppercaseDocumentFilter();
        ((AbstractDocument) jTextFieldPesq.getDocument()).setDocumentFilter(filter);
        ((AbstractDocument) jTextFieldNome.getDocument()).setDocumentFilter(filter);
        ((AbstractDocument) jTextFieldLocal.getDocument()).setDocumentFilter(filter);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabelPesq = new javax.swing.JLabel();
        jTextFieldPesq = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisitado = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();

        setClosable(true);
        setTitle("CADASTRO DE VISITADO");
        setPreferredSize(new java.awt.Dimension(600, 550));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabelPesq.setText("PESQUISA:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 25);
        getContentPane().add(jLabelPesq, gridBagConstraints);

        jTextFieldPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesqKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        getContentPane().add(jTextFieldPesq, gridBagConstraints);

        jTableVisitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "LOCAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableVisitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVisitadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableVisitado);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 460;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.gif"))); // NOI18N
        jButtonNovo.setText("NOVO");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonNovo, gridBagConstraints);

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.gif"))); // NOI18N
        jButtonSalvar.setText("SALVAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonSalvar, gridBagConstraints);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletar.gif"))); // NOI18N
        jButtonExcluir.setText("EXCLUIR");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonExcluir, gridBagConstraints);

        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sair.gif"))); // NOI18N
        jButtonFechar.setText("FECHAR");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButtonFechar, gridBagConstraints);

        jLabelCod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCod.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelCod.setText("CODIGO:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        getContentPane().add(jLabelCod, gridBagConstraints);

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldNome, gridBagConstraints);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setText("NOME:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        getContentPane().add(jLabelNome, gridBagConstraints);

        jLabelLocal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLocal.setText("LOCAL:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        getContentPane().add(jLabelLocal, gridBagConstraints);

        jTextFieldLocal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldLocal, gridBagConstraints);

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE_LEADING;
        getContentPane().add(jLabelCodigo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableVisitadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVisitadoMouseClicked
        // TODO add your handling code here:

        preencheCampo(visitadoCTR.getPesqVisitado((Integer) jTableVisitado.getValueAt(jTableVisitado.getSelectedRow(), jTableVisitado.convertColumnIndexToView(0))));

        if (this.pontoAcessoTela == 2) {
            if (evt.getClickCount() == 2) {
                Visitado v = visitadoCTR.getPesqVisitado((Integer) jTableVisitado.getValueAt(jTableVisitado.getSelectedRow(), jTableVisitado.convertColumnIndexToView(0)));
                jIntFrameVisita.preencheCamposVisitado(v);
                dispose();
            }
        }

    }//GEN-LAST:event_jTableVisitadoMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here:

        novoReg();

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:

        if ((jTextFieldNome.getText().trim().length() == 0)) {
            JOptionPane.showMessageDialog(null, "O REGISTRO NÃO SALVO! POR FAVOR, PREENCHA O CAMPO NOME DO VISITANTE.");
        } else {
            Visitado visitado = new Visitado();
            visitado.setIdVisitado(Integer.parseInt(jLabelCodigo.getText()));
            visitado.setNomeVisitado(jTextFieldNome.getText());
            visitado.setLocalVisitado(jTextFieldLocal.getText());
            if (status) {
                if (visitadoCTR.inserirReg(visitado)) {
                    atualizarTabela(0);
                    status = false;
                    jButtonNovo.setEnabled(true);
                    jButtonExcluir.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "O REGISTRO SALVO COM SUCESSO!");
                } else {
                    status = true;
                    JOptionPane.showMessageDialog(null, "FALHA NA INSERÇÃO DO REGISTRO! POR FAVOR, TENTE NOVAMENTE.");
                }
            } else {
                if (visitadoCTR.atualizarReg(visitado)) {
                    atualizarTabela(jTableVisitado.convertRowIndexToModel(jTableVisitado.getSelectedRow()));
                    JOptionPane.showMessageDialog(null, "O REGISTRO FOI ATUALIZADO COM SUCESSO!");
                } else {
                    JOptionPane.showMessageDialog(null, "FALHA NA ATUALIZAÇÃO DO REGISTRO! POR FAVOR, TENTE NOVAMENTE.");
                }
            }
            exibirPesquisa("");
            jTextFieldPesq.setText("");
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:

        Visitado visitante = new Visitado();
        visitante.setIdVisitado(Integer.parseInt(jLabelCodigo.getText()));
        if (visitadoCTR.excluirReg(visitante)) {
            removeTabela(jTableVisitado.convertRowIndexToModel(jTableVisitado.getSelectedRow()));
            JOptionPane.showMessageDialog(null, "O REGISTRO EXLUÍDO COM SUCESSO!");
        } else {
            JOptionPane.showMessageDialog(null, "FALHA NA EXCLUSÃO DO REGISTRO! POR FAVOR, TENTE NOVAMENTE.");
        }

        exibirPesquisa("");
        jTextFieldPesq.setText("");

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:

        dispose();

    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextFieldPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesqKeyReleased
        // TODO add your handling code here:

        exibirPesquisa(jTextFieldPesq.getText());

    }//GEN-LAST:event_jTextFieldPesqKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVisitado;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesq;
    // End of variables declaration//GEN-END:variables

    public void exibirInicialTela() {

        jTableVisitado.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableVisitado.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableVisitado.getColumnModel().getColumn(2).setPreferredWidth(100);

        modelTable.setNumRows(0);

        visitadoCTR.getVisitadoList().forEach((v) -> {
            modelTable.addRow(new Object[]{
                v.getIdVisitado(),
                v.getNomeVisitado(),
                v.getLocalVisitado()});
        });

        jTableVisitado.addRowSelectionInterval(0, 0);
        preencheCampo(visitadoCTR.getVisitadoList().get(0));

    }

    public void preencheCampo(Visitado v) {
        jLabelCodigo.setText(String.valueOf(v.getIdVisitado()));
        jTextFieldNome.setText(v.getNomeVisitado() == null ? "" : v.getNomeVisitado());
        jTextFieldLocal.setText(v.getLocalVisitado() == null ? "" : v.getLocalVisitado());
    }

    public void exibirPesquisa(String valor) {

        TableRowSorter<DefaultTableModel> tr;
        tr = new TableRowSorter<DefaultTableModel>(modelTable);
        jTableVisitado.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(valor));

        if (tr.getViewRowCount() > 0) {
            jTableVisitado.addRowSelectionInterval(0, 0);
            preencheCampo(visitadoCTR.getPesqVisitado((Integer) jTableVisitado.getValueAt(jTableVisitado.getSelectedRow(), jTableVisitado.convertColumnIndexToView(0))));
        } else {
            jLabelCodigo.setText("");
            jTextFieldNome.setText("");
            jTextFieldLocal.setText("");
        }

    }

    public void novoReg() {

        status = true;
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);

        modelTable.insertRow(0, new Object[]{
            visitadoCTR.ultimoReg().getIdVisitado() + 1,
            "",
            "",
            ""});
        jTableVisitado.clearSelection();
        jTableVisitado.addRowSelectionInterval(0, 0);

        jLabelCodigo.setText(String.valueOf(visitadoCTR.ultimoReg().getIdVisitado() + 1));
        jTextFieldNome.setText("");
        jTextFieldLocal.setText("");

    }

    public void atualizarTabela(int pos) {
        modelTable.setValueAt(jTextFieldNome.getText(), pos, 1);
        modelTable.setValueAt(jTextFieldLocal.getText(), pos, 2);
    }

    public void removeTabela(int i) {
        modelTable.removeRow(i);
    }

    public void setjIntFrameVisita(JIntFrameVisita jIntFrameVisita) {
        this.jIntFrameVisita = jIntFrameVisita;
    }

}
