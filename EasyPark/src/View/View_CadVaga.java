/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Ctrl_Endereco;
import Controller.Ctrl_Msg;
import Controller.Ctrl_Vaga;
import Model.Model_Banco;
import Model.Model_Vaga;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.text.DefaultFormatter;


public class View_CadVaga extends javax.swing.JFrame {

   private static boolean EstaEditando = false;
    private static Ctrl_Endereco Endereco = new Ctrl_Endereco();
    private static Ctrl_Vaga Vaga = new Ctrl_Vaga();

    public View_CadVaga() {
        initComponents();
        CentralizarTela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        lblTipoVaga = new javax.swing.JLabel();
        cbTipoVaga = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        btnPesqCod = new javax.swing.JButton();
        nmrPreco = new javax.swing.JSpinner();
        txtLocalizacao = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        btnEditar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        try {
            txtCod.setText(Model_Banco.BuscaCodigoNovo("VAGA"));
        } catch (Exception e) {
        }
        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblPreco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblPreco.setText("Preço:");

        lblTipoVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTipoVaga.setText("Tipo Vaga:");

        cbTipoVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbTipoVaga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"MOTO", "CARRO"}));

        lblDescricao.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblDescricao.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        btnPesqCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easypesq.png"))); // NOI18N
        btnPesqCod.setToolTipText("");
        btnPesqCod.setBorderPainted(false
        );
        btnPesqCod.setContentAreaFilled(false);
        btnPesqCod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod.setDefaultCapable(false);
        btnPesqCod.setFocusPainted(false);
        btnPesqCod.setFocusable(false);
        btnPesqCod.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod.setMaximumSize(new java.awt.Dimension(38, 44));
        btnPesqCod.setMinimumSize(null);
        btnPesqCod.setPreferredSize(new java.awt.Dimension(38, 44));
        btnPesqCod.setVerifyInputWhenFocusTarget(false);
        btnPesqCod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesqCodMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesqCodMouseExited(evt);
            }
        });

        /*nmrPreco.setEditor(new JSpinner.NumberEditor(nmrPreco, "0"));
        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrPreco.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);*/
        nmrPreco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        nmrPreco.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        nmrPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nmrPreco.setInheritsPopupMenu(true);
        nmrPreco.setOpaque(false);
        /*nmrPreco.setModel(new SpinnerNumberModel(1, 1, 10000, 1));*/

        txtLocalizacao.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua.setText("Localização");

        btnEditar1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyeditar.png"))); // NOI18N
        btnEditar1.setText("Editar");
        btnEditar1.setToolTipText("Clique aqui para editar os campos");
        btnEditar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar1ActionPerformed(evt);
            }
        });

        btnSalvar1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easysave.png"))); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.setToolTipText("Clique aqui para salvar os campos");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        btnDeletar1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnDeletar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyexcluir.png"))); // NOI18N
        btnDeletar1.setText("Excluir");
        btnDeletar1.setToolTipText("Clique aqui para excluir o registro");
        btnDeletar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar1ActionPerformed(evt);
            }
        });

        btnLimpar1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnLimpar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easylimpar.png"))); // NOI18N
        btnLimpar1.setText("Limpar");
        btnLimpar1.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        btnFechar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setToolTipText("Clique aqui para fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nmrPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lblTipoVaga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar1)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar1)
                        .addGap(5, 5, 5)
                        .addComponent(btnDeletar1)
                        .addGap(5, 5, 5)
                        .addComponent(btnLimpar1)
                        .addGap(5, 5, 5)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTipoVaga)
                                .addComponent(txtLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbTipoVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRua)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCod)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmrPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPreco)
                    .addComponent(lblDescricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar1)
                    .addComponent(btnSalvar1)
                    .addComponent(btnDeletar1)
                    .addComponent(btnLimpar1)
                    .addComponent(btnFechar))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrPreco.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered

    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited

    }//GEN-LAST:event_btnPesqCodMouseExited

    private void btnEditar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar1ActionPerformed
        boolean r = Verifica();
        if (r==true)
        {
            r =false;
            r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQEditar);
            if (r==true)
            {
                Bloqueia(false);
                EstaEditando=true;
            }
        }
    }//GEN-LAST:event_btnEditar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed

        boolean r =  Verifica();
        if (r==true)
        {
            r = false;
            r = Ctrl_Msg.Questiona(Ctrl_Msg.MsgQSalvar);
            if (r==true)
            {

                try
                {
                    Atribuir(true);
                    String CodNew =  Model_Vaga.Salvar(Vaga,"VAGA");
                    Limpar();
                    txtCod.setText(CodNew);
                    Ctrl_Msg.Informa(Ctrl_Msg.MsgISalvo);
                }
                catch (Exception e)
                {
                    
                    Ctrl_Msg.Informa(Ctrl_Msg.MsgErro);
                }
            }

        }
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnDeletar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar1ActionPerformed
        if (EstaEditando==true)
        {
            boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQDeletar);
            if (r==true) {
                //metodo de excluir
            }
        }
        else
        {
            Ctrl_Msg.Informa(Ctrl_Msg.MsgIEdicao);
        }
    }//GEN-LAST:event_btnDeletar1ActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQLimpar);
        if (r==true)
        {
            Limpar();
        }

    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true)
        {
            this.dispose();

        }

    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadVaga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbTipoVaga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTipoVaga;
    private javax.swing.JSpinner nmrPreco;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtLocalizacao;
    // End of variables declaration//GEN-END:variables
  private void Limpar(){
        txtCod.setText("");
        txtLocalizacao.setText("");
        //cbTipoVaga.setText("");
        nmrPreco.setValue(0);
        txaDescricao.setText("");
  }
    
    private void Bloqueia (boolean Bloqueiar)
    {
        if (Bloqueiar == true) 
        {
            txtCod.setEnabled(false);
            txtLocalizacao.setEnabled(false);
            cbTipoVaga.setEnabled(false);
            nmrPreco.setEnabled(false);

        }
        else
        {
            txtCod.setEnabled(true);
            txtLocalizacao.setEnabled(true);
            cbTipoVaga.setEnabled(true);
            nmrPreco.setEnabled(true);
        }
          
    }

    
    private void Atribuir(boolean Vai)
    {
        if (Vai==true) {
            Vaga.setId(txtCod.getText());
            Vaga.setLocalizacao(txtLocalizacao.getText());
            Vaga.setIdTipo(String.valueOf(cbTipoVaga.getSelectedItem()));
            Vaga.setPreco(String.valueOf(nmrPreco.getValue()));
            Vaga.setDescricao(txaDescricao.getText());
        }
        else
        {
            txtCod.setText(Vaga.getId());
            txtLocalizacao.setText(Vaga.getLocalizacao());
            if (Vaga.getIdTipo().equals("MOTO")) cbTipoVaga.setSelectedIndex(1);
            else cbTipoVaga.setSelectedIndex(0);
            nmrPreco.setValue(Integer.parseInt(Vaga.getPreco())); 
            txaDescricao.setText(Vaga.getDescricao());
        }

    }
    
    private  boolean Verifica()
    {
        String x[] = new String[10];
        x[0] = txtCod.getText();
        x [1] = txtLocalizacao.getText();
        x [2] = String.valueOf(cbTipoVaga.getSelectedItem());
        x [3] = String.valueOf(nmrPreco.getValue());
        x [4] = txaDescricao.getText();
        
        for (int i = 0; i < 5; i++) {
            if(x[i].equals(""))
            {
                Ctrl_Msg.Informa(Ctrl_Msg.MsgICampos);
                return false; 
            }
        }
        return true;
    }

    private void CentralizarTela() {
    
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    
    }
    
   

}



