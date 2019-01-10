/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import control.CameraCTR;
import control.FotoCTR;
import control.VisitaCTR;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.domain.ComplVisitante;
import model.domain.Visita;
import model.domain.Visitado;
import model.domain.Visitante;

/**
 *
 * @author anderson
 */
public class JIntFrameVisita extends javax.swing.JInternalFrame {

    private JFramePrincipal jFramePrincipal;

    private Visita visita;
    private VisitaCTR visitaCRT;
    private CameraCTR cameraCTR;
    private FotoCTR fotoCTR;

    private int captFoto;

    /**
     * Creates new form NewJIntFrameVisita
     */
    public JIntFrameVisita(JFramePrincipal jFramePrincipal) {
        initComponents();
        this.jFramePrincipal = jFramePrincipal;

        visitaCRT = new VisitaCTR();
        cameraCTR = new CameraCTR();
        fotoCTR = new FotoCTR();

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

        jButtonSalvarVisita = new javax.swing.JButton();
        jPanelCamera = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonPesqVisitante = new javax.swing.JButton();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEmpresa = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jTextFieldCelular = new javax.swing.JTextField();
        jLabelVeiculo = new javax.swing.JLabel();
        jTextFieldVeiculo = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        jTextFieldPlaca = new javax.swing.JTextField();
        jButtonPesqVisitado = new javax.swing.JButton();
        jLabelVisitado = new javax.swing.JLabel();
        jTextFieldVisitado = new javax.swing.JTextField();
        jLabelLocal = new javax.swing.JLabel();
        jTextFieldLocal = new javax.swing.JTextField();
        jButtonCapturar = new javax.swing.JButton();
        jButtonListVis = new javax.swing.JButton();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("ENTRADA DE VISITANTE");
        setPreferredSize(new java.awt.Dimension(800, 700));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButtonSalvarVisita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalvarVisita.setText("SALVAR VISITA");
        jButtonSalvarVisita.setEnabled(false);
        jButtonSalvarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVisitaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 10, 0);
        getContentPane().add(jButtonSalvarVisita, gridBagConstraints);

        jPanelCamera.setForeground(new java.awt.Color(240, 240, 240));
        jPanelCamera.setPreferredSize(new java.awt.Dimension(320, 240));
        jPanelCamera.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanelCamera.add(jLabelFoto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jPanelCamera, gridBagConstraints);

        jButtonPesqVisitante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPesqVisitante.setText("PESQUISAR VISITANTE");
        jButtonPesqVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqVisitanteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.ipady = 15;
        getContentPane().add(jButtonPesqVisitante, gridBagConstraints);

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCPF.setText("CPF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelCPF, gridBagConstraints);

        jLabelRG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRG.setText("RG");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelRG, gridBagConstraints);

        jTextFieldRG.setEditable(false);
        jTextFieldRG.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        getContentPane().add(jTextFieldRG, gridBagConstraints);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNome.setText("NOME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelNome, gridBagConstraints);

        jTextFieldNome.setEditable(false);
        jTextFieldNome.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldNome, gridBagConstraints);

        jLabelEmpresa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEmpresa.setText("EMPRESA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelEmpresa, gridBagConstraints);

        jTextFieldEmpresa.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldEmpresa, gridBagConstraints);

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTelefone.setText("TELEFONE FIXO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelTelefone, gridBagConstraints);

        jTextFieldTelefone.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jTextFieldTelefone, gridBagConstraints);

        jLabelCelular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCelular.setText("CELULAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelCelular, gridBagConstraints);

        jTextFieldCelular.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 100;
        getContentPane().add(jTextFieldCelular, gridBagConstraints);

        jLabelVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVeiculo.setText("MODELO DO VEÍCULO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelVeiculo, gridBagConstraints);

        jTextFieldVeiculo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldVeiculo, gridBagConstraints);

        jLabelPlaca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelPlaca.setText("Nº DA PLACA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelPlaca, gridBagConstraints);

        jTextFieldPlaca.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldPlaca, gridBagConstraints);

        jButtonPesqVisitado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonPesqVisitado.setText("PESQUISAR VISITADO");
        jButtonPesqVisitado.setEnabled(false);
        jButtonPesqVisitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesqVisitadoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(jButtonPesqVisitado, gridBagConstraints);

        jLabelVisitado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelVisitado.setText("FUNC. VISITADO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelVisitado, gridBagConstraints);

        jTextFieldVisitado.setEditable(false);
        jTextFieldVisitado.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldVisitado, gridBagConstraints);

        jLabelLocal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelLocal.setText("DPTO VISITADO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 2, 0);
        getContentPane().add(jLabelLocal, gridBagConstraints);

        jTextFieldLocal.setEditable(false);
        jTextFieldLocal.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jTextFieldLocal, gridBagConstraints);

        jButtonCapturar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCapturar.setText("CAPTURAR");
        jButtonCapturar.setEnabled(false);
        jButtonCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapturarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 20);
        getContentPane().add(jButtonCapturar, gridBagConstraints);

        jButtonListVis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonListVis.setText("VISITANTE NA EMPRESA");
        jButtonListVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListVisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 20);
        getContentPane().add(jButtonListVis, gridBagConstraints);

        jFormattedTextFieldCPF.setEditable(false);
        jFormattedTextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        getContentPane().add(jFormattedTextFieldCPF, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesqVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqVisitanteActionPerformed
        // TODO add your handling code here:

        JIntFrameVisitante jIntFrameVisitante = new JIntFrameVisitante(2);
        jIntFrameVisitante.setjIntFrameVisita(this);
        this.jFramePrincipal.getDesktopPane().add(jIntFrameVisitante);
        jIntFrameVisitante.setVisible(true);

    }//GEN-LAST:event_jButtonPesqVisitanteActionPerformed

    private void jButtonPesqVisitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesqVisitadoActionPerformed
        // TODO add your handling code here:

        JIntFrameVisitado jIntFrameVisitado = new JIntFrameVisitado(2);
        jIntFrameVisitado.setjIntFrameVisita(this);
        this.jFramePrincipal.getDesktopPane().add(jIntFrameVisitado);
        jIntFrameVisitado.setVisible(true);

    }//GEN-LAST:event_jButtonPesqVisitadoActionPerformed

    private void jButtonSalvarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVisitaActionPerformed
        // TODO add your handling code here:

        salvarVisita();

    }//GEN-LAST:event_jButtonSalvarVisitaActionPerformed

    private void jButtonCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapturarActionPerformed
        // TODO add your handling code here:

        if (captFoto == 1) {
            jButtonPesqVisitado.setEnabled(false);
            abrirCamera();
        } else if (captFoto == 2) {
            salvaFoto();
        }

    }//GEN-LAST:event_jButtonCapturarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:

        if (captFoto == 2) {
            cameraCTR.stopCamera();
        }

    }//GEN-LAST:event_formInternalFrameClosing

    private void jButtonListVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListVisActionPerformed
        // TODO add your handling code here:

        JIntFramePainelVisitante jIntFramePainelVisitante = new JIntFramePainelVisitante();
        this.jFramePrincipal.getDesktopPane().add(jIntFramePainelVisitante);
        jIntFramePainelVisitante.setVisible(true);

    }//GEN-LAST:event_jButtonListVisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapturar;
    private javax.swing.JButton jButtonListVis;
    private javax.swing.JButton jButtonPesqVisitado;
    private javax.swing.JButton jButtonPesqVisitante;
    private javax.swing.JButton jButtonSalvarVisita;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelVeiculo;
    private javax.swing.JLabel jLabelVisitado;
    private javax.swing.JPanel jPanelCamera;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldLocal;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldVeiculo;
    private javax.swing.JTextField jTextFieldVisitado;
    // End of variables declaration//GEN-END:variables

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JFormattedTextField getjFormattedTextFieldCPF() {
        return jFormattedTextFieldCPF;
    }

    public JTextField getjTextFieldRG() {
        return jTextFieldRG;
    }

    public JTextField getjTextFieldLocal() {
        return jTextFieldLocal;
    }

    public JTextField getjTextFieldVisitado() {
        return jTextFieldVisitado;
    }

    public void preencheCamposVisitante(Visitante visitante) {
        visita = new Visita();
        visita.setVisitante(visitante);
        jTextFieldRG.setText(visita.getVisitante().getRgVisitante());
        jFormattedTextFieldCPF.setText(visita.getVisitante().getCpfVisitante());
        jTextFieldNome.setText(visita.getVisitante().getNomeVisitante());
        buscaComplVisitante();
    }

    public void preencheCamposVisitado(Visitado visitado) {
        visita.setVisitado(visitado);
        jTextFieldVisitado.setText(visita.getVisitado().getNomeVisitado());
        jTextFieldLocal.setText(visita.getVisitado().getLocalVisitado());
        liberarCadVisita();
    }

    public void buscaComplVisitante() {
        visita.getVisitante().setComplVisitante(visitaCRT.getComplVisitante(visita.getVisitante().getIdVisitante()));
        jTextFieldEmpresa.setText(visita.getVisitante().getComplVisitante().getEmpresaVisitante());
        jTextFieldTelefone.setText(visita.getVisitante().getComplVisitante().getTelFixoVisitante());
        jTextFieldCelular.setText(visita.getVisitante().getComplVisitante().getCelularVisitante());
        jTextFieldVeiculo.setText(visita.getVisitante().getComplVisitante().getModeloVeicVisitante());
        jTextFieldPlaca.setText(visita.getVisitante().getComplVisitante().getPlacaVeicVisitante());
        jTextFieldEmpresa.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);
        jTextFieldCelular.setEnabled(true);
        jTextFieldVeiculo.setEnabled(true);
        jTextFieldPlaca.setEnabled(true);
        abrirFoto();
    }

    public void liberarCadVisita() {
        jButtonSalvarVisita.setEnabled(true);
    }

    public void salvarVisita() {
        visita.getVisitante().getComplVisitante().setEmpresaVisitante(jTextFieldEmpresa.getText());
        visita.getVisitante().getComplVisitante().setTelFixoVisitante(jTextFieldTelefone.getText());
        visita.getVisitante().getComplVisitante().setCelularVisitante(jTextFieldCelular.getText());
        visita.getVisitante().getComplVisitante().setModeloVeicVisitante(jTextFieldVeiculo.getText());
        visita.getVisitante().getComplVisitante().setPlacaVeicVisitante(jTextFieldPlaca.getText());
//        visita.setMatricRecep(jFramePrincipal.getFunc().getMatricFunc()); alterado teste
        if (visitaCRT.salvarVisita(visita)) {
            clear();
            JOptionPane.showMessageDialog(null, "O REGISTRO FOI ATUALIZADO COM SUCESSO!");
        } else {
            JOptionPane.showMessageDialog(null, "FALHA NA ATUALIZAÇÃO DO REGISTRO! POR FAVOR, TENTE NOVAMENTE.");
        }
    }

    public void abrirCamera() {

        jPanelCamera.remove(jLabelFoto);

        jPanelCamera.setForeground(new java.awt.Color(240, 240, 240));
        jPanelCamera.setPreferredSize(new java.awt.Dimension(320, 240));
        jPanelCamera.setLayout(new java.awt.GridBagLayout());
        cameraCTR.abrirCamera();
        java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 320;
        gridBagConstraints.ipady = 240;
        jPanelCamera.add(cameraCTR.getPanel(), gridBagConstraints);
        cameraCTR.startCamera();

        if (captFoto == 1) {
            captFoto = 2;
            jButtonCapturar.setText("CAPTURAR");
        } else if (captFoto == 2) {
            jButtonCapturar.setEnabled(true);
        }

    }

    public void salvaFoto() {
        try {
            fotoCTR.salvarFotoJPG(cameraCTR.getWebcam(), visita.getVisitante().getIdVisitante());
            cameraCTR.stopCamera();
            jPanelCamera.remove(cameraCTR.getPanel());
            abrirFoto();
        } catch (Exception ex) {
            Logger.getLogger(JIntFrameVisita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void abrirFoto() {
        try {

            if (fotoCTR.abrirFotoJPG(visita.getVisitante().getIdVisitante())) {
                jLabelFoto.setIcon(fotoCTR.getImageIcon());
                jButtonCapturar.setText("ALTERAR FOTO");
                jButtonCapturar.setEnabled(true);
                captFoto = 1;
                jButtonPesqVisitado.setEnabled(true);
            } else {
                captFoto = 2;
                abrirCamera();
            }
        } catch (Exception ex) {
            Logger.getLogger(JIntFrameVisita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clear() {
        jFormattedTextFieldCPF.setText("");
        jTextFieldCelular.setText("");
        jTextFieldEmpresa.setText("");
        jTextFieldLocal.setText("");
        jTextFieldNome.setText("");
        jTextFieldPlaca.setText("");
        jTextFieldRG.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldVeiculo.setText("");
        jTextFieldVisitado.setText("");
        jButtonCapturar.setEnabled(false);
        jButtonPesqVisitado.setEnabled(false);
    }

}
