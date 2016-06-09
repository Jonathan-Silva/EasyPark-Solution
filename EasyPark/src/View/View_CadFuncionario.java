package View;

import Controller.Ctrl_Endereco;
import Controller.Ctrl_Funcionario;
import Controller.Ctrl_Msg;
import Controller.Ctrl_Pessoa;
import Controller.Ctrl_Util;
import Model.Model_Banco;
import Model.Model_Endereco;
import Model.Model_Funcionario;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JSpinner;
import javax.swing.text.DefaultFormatter;
import javax.swing.text.MaskFormatter;

public class View_CadFuncionario extends javax.swing.JFrame {

    private static boolean EstaEditando = false;
    private static Ctrl_Endereco Endereco = new Ctrl_Endereco();
    private static Ctrl_Funcionario Funcionario = new Ctrl_Funcionario();
    private static Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
    public View_CadFuncionario() {
        initComponents();
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar1 = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        btnDeletar1 = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnFechar1 = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        txtFixo = new javax.swing.JFormattedTextField();
        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        lblUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        txtCEP = new javax.swing.JFormattedTextField();
        lblCEP = new javax.swing.JLabel();
        nmrNumero = new javax.swing.JSpinner();
        lblNumero = new javax.swing.JLabel();
        btnPesqCod = new javax.swing.JButton();
        btnEditar2 = new javax.swing.JButton();
        btnSalvar2 = new javax.swing.JButton();
        btnDeletar2 = new javax.swing.JButton();
        btnLimpar2 = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        btnEditar1.setText("Editar");
        btnEditar1.setToolTipText("Clique aqui para editar os campos");

        btnSalvar1.setText("Salvar");
        btnSalvar1.setToolTipText("Clique aqui para salvar os campos");

        btnDeletar1.setText("Deletar");
        btnDeletar1.setToolTipText("Clique aqui para deletar os campos");

        btnLimpar1.setText("Limpar");
        btnLimpar1.setToolTipText("Clique aqui para limpar os campos");

        btnFechar1.setText("Fechar");
        btnFechar1.setToolTipText("Clique aqui para fechar os campos");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setResizable(false);

        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        try {
            txtCod.setText(Model_Banco.BuscaCodigoNovo("FUNCIONARIO"));
        } catch (Exception e) {
        }
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        pnlDadosPessoais.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblLogin.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblLogin.setText("Login:");

        txtLogin.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        try
        {
            MaskFormatter maskData = new MaskFormatter("###.###.###-##");
            maskData.install(txtCPF);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCelular.setText("Celular:");

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

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(lblLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(lblCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome))))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefone)
                        .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCelular)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        pnlEndereco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        cbCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        lblUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblUF.setText("UF:");

        cbUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

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

        lblCEP.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCEP.setText("CEP:");

        nmrNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        nmrNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        nmrNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nmrNumero.setInheritsPopupMenu(true);
        nmrNumero.setOpaque(false);

        lblNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNumero.setText("Nº:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblCEP))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRua)))
                .addGap(43, 43, 43)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCEP)
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCidade)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUF)))
                .addGap(11, 11, 11)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRua))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrNumero.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

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

        btnSalvar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSalvar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easysave.png"))); // NOI18N
        btnSalvar2.setText("Salvar");
        btnSalvar2.setToolTipText("Clique aqui para salvar os campos");
        btnSalvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar2ActionPerformed(evt);
            }
        });

        btnDeletar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnDeletar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyexcluir.png"))); // NOI18N
        btnDeletar2.setText("Excluir");
        btnDeletar2.setToolTipText("Clique aqui para excluir o registro");
        btnDeletar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletar2ActionPerformed(evt);
            }
        });

        btnLimpar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easylimpar.png"))); // NOI18N
        btnLimpar2.setText("Limpar");
        btnLimpar2.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar2ActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(lblCod)
                                .addGap(4, 4, 4)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditar2)
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar2)
                        .addGap(5, 5, 5)
                        .addComponent(btnDeletar2)
                        .addGap(5, 5, 5)
                        .addComponent(btnLimpar2)
                        .addGap(5, 5, 5)
                        .addComponent(btnFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblCod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar2)
                    .addComponent(btnSalvar2)
                    .addComponent(btnDeletar2)
                    .addComponent(btnLimpar2)
                    .addComponent(btnFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                EstaEditando=true;
            }
        }
    }//GEN-LAST:event_btnEditar2ActionPerformed

    private void btnSalvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar2ActionPerformed

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
                    String CodNew =  Model_Funcionario.Salvar(Funcionario);
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
    }//GEN-LAST:event_btnSalvar2ActionPerformed

    private void btnDeletar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletar2ActionPerformed
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
    }//GEN-LAST:event_btnDeletar2ActionPerformed

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQLimpar);
        if (r==true)
        {
            Limpar();
        }

    }//GEN-LAST:event_btnLimpar2ActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true)
        {
            this.dispose();

        }

    }//GEN-LAST:event_btnFecharActionPerformed

  
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadFuncionario().setVisible(true);
            }
        });
    }
    public void centralizarComponente() 
    {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar1;
    private javax.swing.JButton btnDeletar2;
    private javax.swing.JButton btnEditar1;
    private javax.swing.JButton btnEditar2;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JButton btnSalvar2;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JSpinner nmrNumero;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFixo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
  private void Limpar(){
        txtCod.setText("");
        txtLogin.setText("");
        txtCPF.setText("");
        txtCelular.setText("");
        txtFixo.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtCEP.setText("");
        //cbUF."");
        //cbCidade.("");
        txtRua.setText("");
        nmrNumero.setValue(0);
    }
    
    private void Bloqueia (boolean Bloqueiar)
    {
        if (Bloqueiar == true) 
        {
            txtLogin.setEnabled(false);
            txtCPF.setEnabled(false);
            txtCelular.setEnabled(false);
            txtFixo.setEnabled(false);
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtCEP.setEnabled(false);
            cbUF.setEnabled(false);
            cbCidade.setEnabled(false);
            txtRua.setEnabled(false);
            nmrNumero.setEnabled(false);
        }
        else
        {
            txtLogin.setEnabled(true);
            txtCPF.setEnabled(true);
            txtCelular.setEnabled(true);
            txtFixo.setEnabled(true);
            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtCEP.setEnabled(true);
            cbUF.setEnabled(true);
            cbCidade.setEnabled(true);
            txtRua.setEnabled(true);
            nmrNumero.setEnabled(true);
        }
          
    }

    
    private void Atribuir(boolean Vai)
    {
        if (Vai==true) {
            Funcionario.setId(txtCod.getText());
            Funcionario.setLogin(txtLogin.getText());
            Funcionario.setCpf(txtCPF.getText());
            Funcionario.setCelular(txtCelular.getText());
            Funcionario.setFixo(txtFixo.getText());
            Funcionario.setNome(txtNome.getText());
            Funcionario.setEmail(txtEmail.getText());
            Funcionario.setCep(txtCEP.getText());
            Funcionario.setNumero(String.valueOf(nmrNumero.getValue()));
            Funcionario.setTipo("F");
        }
        else
        {
            txtCod.setText(Funcionario.getId());
            txtLogin.setText(Funcionario.getLogin());
            txtCPF.setText(Funcionario.getCpf());
            txtCelular.setText(Funcionario.getCelular());
            txtFixo.setText(Funcionario.getFixo());
            txtNome.setText(Funcionario.getNome());
            txtEmail.setText(Funcionario.getEmail());
            txtCEP.setText(Funcionario.getCep());
            nmrNumero.setValue(Integer.parseInt(Funcionario.getNumero()));    
        }

    }
    
    private  boolean Verifica()
    {
        String x[] = new String[10];
        x[0] = txtCod.getText();
        x [1] = txtLogin.getText();
        x [2] = txtCPF.getText();
        x [3] = txtCelular.getText();
        x [4] = txtFixo.getText();
        x [5] = txtNome.getText();
        x [6] = txtEmail.getText();
        x [7] = txtCEP.getText();
        x [8] = txtRua.getText();
        x [9] =String.valueOf(nmrNumero.getValue());
        
        for (int i = 0; i < 10; i++) {
            if(x[i].equals(""))
            {
                Ctrl_Msg.Informa(Ctrl_Msg.MsgICampos);
                return false; 
            }
        }
        return true;
    }
    
    private void BuscarEndereco()
    {
        try 
        {
            Endereco.setLogradouro(null);
            Endereco = Model_Endereco.BuscarEndereco(txtCEP.getText().replace("-", ""));
            if (Endereco.getLogradouro()!=null)
            {
                txtCEP.setText(Endereco.getCep());
                txtRua.setText(Endereco.getLogradouro());
                cbCidade.addItem(Endereco.getCidade());
                cbUF.addItem(Endereco.getUf());
            }
            
       
        } 
        catch (Exception e) 
        {

        }
        
    }

}



