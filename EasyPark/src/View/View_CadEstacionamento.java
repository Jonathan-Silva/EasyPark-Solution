
package View;

import Controller.Ctrl_Endereco;
import Controller.Ctrl_Estacionamento;
import Controller.Ctrl_Msg;
import Model.Model_Banco;
import Model.Model_Estacionamento;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.MaskFormatter;


public class View_CadEstacionamento extends javax.swing.JFrame {
    private static boolean EstaEditando = false;
    private static Ctrl_Endereco Endereco = new Ctrl_Endereco();
    private static Ctrl_Estacionamento Estacionamento = new Ctrl_Estacionamento();
    public View_CadEstacionamento() {
        initComponents();
        CentralizarTela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        nmrNumero = new javax.swing.JSpinner();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        cbUF = new javax.swing.JComboBox<>();
        lblUF = new javax.swing.JLabel();
        lblRua1 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        pnlDadosComerciais = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lblCNPJ = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtFixo = new javax.swing.JFormattedTextField();
        txtCod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        btnPesqCod = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        pnlEndereco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNumero.setText("Nº:");

        /*nmrNumero.setEditor(new JSpinner.NumberEditor(nmrNumero, "0"));
        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrNumero.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);*/
        nmrNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        nmrNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        nmrNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nmrNumero.setInheritsPopupMenu(true);
        nmrNumero.setOpaque(false);
        /*nmrNumero.setModel(new SpinnerNumberModel(1, 1, 10000, 1));*/

        lblCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        cbCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        cbUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        lblUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblUF.setText("UF:");

        lblRua1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua1.setText("CEP:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("#####-###");
            maskData.install(txtCEP);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCEP.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCEPFocusLost(evt);
            }
        });

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua)
                    .addComponent(lblRua1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumero)
                        .addGap(4, 4, 4)
                        .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF)
                    .addComponent(lblRua1)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrNumero.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

        pnlDadosComerciais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Comerciais"));
        pnlDadosComerciais.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("##.###.###/####-##");
            maskData.install(txtCEP);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCNPJ.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCNPJ.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCNPJ.setText("CNPJ:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("(##)# ####-####");
            maskData.install(txtCelular);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCelular.setText("Celular:");

        lblTelefone.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTelefone.setText("Fixo:");

        try
        {
            MaskFormatter maskData = new MaskFormatter("(##)####-####");
            maskData.install(txtFixo);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtFixo.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlDadosComerciaisLayout = new javax.swing.GroupLayout(pnlDadosComerciais);
        pnlDadosComerciais.setLayout(pnlDadosComerciaisLayout);
        pnlDadosComerciaisLayout.setHorizontalGroup(
            pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosComerciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNome)
                    .addComponent(lblCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosComerciaisLayout.createSequentialGroup()
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome))
                .addGap(15, 15, 15))
        );
        pnlDadosComerciaisLayout.setVerticalGroup(
            pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosComerciaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCNPJ)
                        .addComponent(lblCelular)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosComerciaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        try {
            txtCod.setText(Model_Banco.BuscaCodigoNovo("ESTACIONAMENTO"));
        } catch (Exception e) {
        }
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

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

        btnEditar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyeditar.png"))); // NOI18N
        btnEditar2.setText("Editar");
        btnEditar2.setToolTipText("Clique aqui para editar os campos");
        btnEditar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditar2ActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCod)
                        .addGap(4, 4, 4)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosComerciais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar2)
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
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosComerciais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar2)
                    .addComponent(btnSalvar1)
                    .addComponent(btnDeletar1)
                    .addComponent(btnLimpar1)
                    .addComponent(btnFechar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered

    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited

    }//GEN-LAST:event_btnPesqCodMouseExited

    private void btnEditar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditar2ActionPerformed
        boolean r = Verifica();
        if (r==true)
        {
            r =false;
            r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQEditar);
            if (r==true)
            {
                Bloqueia(false);
                EstaEditando = true;
            }
        }
    }//GEN-LAST:event_btnEditar2ActionPerformed

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
                    String CodNew =  Model_Estacionamento.Salvar(Estacionamento);
                    txtCod.setText("01");
                    Bloqueia(true);
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

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
        BuscarEndereco();
    }//GEN-LAST:event_txtCEPFocusLost


    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(View_CadEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadEstacionamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadEstacionamento().setVisible(true);
            }
        });
    }

    public void centralizarComponente()
    {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblRua1;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JSpinner nmrNumero;
    private javax.swing.JPanel pnlDadosComerciais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCod;
    private javax.swing.JFormattedTextField txtFixo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    private void Bloqueia(boolean bloqueia) {
        if (bloqueia == true)
        {
           txtNome.setEnabled(false);
           txtCNPJ.setEnabled(false);
           txtFixo.setEnabled(false);
           txtCelular.setEnabled(false);
           txtCEP.setEnabled(false);
           nmrNumero.setEnabled(false);
           cbCidade.setEnabled(false);
           cbUF.setEnabled(false);
           txtRua.setEnabled(false);
        }
        else
        {
           txtNome.setEnabled(true);
           txtCNPJ.setEnabled(true);
           txtFixo.setEnabled(true);
           txtCelular.setEnabled(true);
           txtCEP.setEnabled(true);
           nmrNumero.setEnabled(true);
           cbCidade.setEnabled(true);
           cbUF.setEnabled(true);
           txtRua.setEnabled(true);
        }

    }

    private boolean Verifica() {

        String x[] = new String[6];

        x[0]=txtNome.getText();
        x[1]=txtCNPJ.getText();
        x[2]=txtFixo.getText();
        x[4]=txtCelular.getText();
        x[5]=txtCEP.getText();
        x[6]=String.valueOf(nmrNumero.getValue());


        for (int i = 0; i < 10; i++) {
        if(x[i].equals(""))
            {
                Ctrl_Msg.Informa(Ctrl_Msg.MsgICampos);
                return false;
            }
        }
        return true;
    }

    private void Atribuir(boolean Vai) {
        if (Vai==true)
        {
           Estacionamento.setNome(txtNome.getText());
           Estacionamento.setCnpj(txtCNPJ.getText());
           Estacionamento.setTelefone(txtFixo.getText());
           Estacionamento.setCelular( txtCelular.getText());
           Estacionamento.setCep(txtCEP.getText());
           Estacionamento.setNumero( String.valueOf(nmrNumero.getValue()));
        }
        else
        {
          txtNome.setText(Estacionamento.getNome());
          txtCNPJ.setText(Estacionamento.getCnpj());
          txtFixo.setText(Estacionamento.getTelefone());
          txtCelular.setText(Estacionamento.getCelular());
          txtCEP.setText(Estacionamento.getCep());
          nmrNumero.setValue(Integer.parseInt(Estacionamento.getNumero()));
        }
    }

    private void Limpar() {

        txtNome.setText("");
        txtCNPJ.setText("");
        txtFixo.setText("");
        txtCelular.setText("");
        txtCEP.setText("");
        nmrNumero.setValue(0);
    }

    private void BuscarEndereco() {

    }
    private void CentralizarTela() {
    
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    
    }
}
