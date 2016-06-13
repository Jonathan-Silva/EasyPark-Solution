package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.text.MaskFormatter;
import Controller.Ctrl_Msg;
import Controller.Ctrl_Cliente;
import Controller.Ctrl_Pessoa;
import Model.Model_Banco;
import Model.Model_Cliente;
import Model.Model_Pessoa;
import Controller.Ctrl_Endereco;
import Controller.Ctrl_Util;
import Model.Model_Endereco;
import javax.swing.JSpinner;
import javax.swing.text.DefaultFormatter;



public class View_CadCliente extends javax.swing.JFrame {

    private static Ctrl_Endereco Endereco = new Ctrl_Endereco();
    private static Ctrl_Cliente Cliente = new Ctrl_Cliente();
    private static boolean EstaEditando = false;
    private static boolean JaEstaSalvo = false;
    private static Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
    public View_CadCliente() {
        
        initComponents();
        CentralizarTela();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        pnlDadosPessoais = new javax.swing.JPanel();
        lblCPF = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblCNH = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCNH = new javax.swing.JFormattedTextField();
        txtFixo = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnLimpar = new javax.swing.JButton();
        pnlEndereco = new javax.swing.JPanel();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        nmrNumero = new javax.swing.JSpinner();
        lblCEP = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        cbCidade = new javax.swing.JComboBox<>();
        txtCEP = new javax.swing.JFormattedTextField();
        cbUF = new javax.swing.JComboBox<>();
        lblUF = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnAddVeiculos = new javax.swing.JButton();
        btnAddAutorizados = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnPesqCod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        pnlDadosPessoais.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblTelefone.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblTelefone.setText("Fixo:");

        lblCelular.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCelular.setText("Celular:");

        lblCNH.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCNH.setText("CNH:");

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
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });

        try
        {
            MaskFormatter maskData = new MaskFormatter("###########");
            maskData.install(txtCNH);
        }

        catch (Exception erroGenerico)
        {
            String mensagem = "";
            erroGenerico.printStackTrace();
            mensagem = erroGenerico.getMessage();
        }
        txtCNH.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

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

        lblNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCPF)
                        .addComponent(lblNome))
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblCNH)
                        .addGap(11, 11, 11)
                        .addComponent(txtCNH, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFixo))
                    .addComponent(txtNome)
                    .addComponent(txtEmail))
                .addContainerGap())
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(txtCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNH)
                    .addComponent(lblTelefone)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnLimpar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easylimpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        pnlEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        pnlEndereco.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        lblNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblNumero.setText("Nº:");

        nmrNumero.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        nmrNumero.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));
        nmrNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nmrNumero.setInheritsPopupMenu(true);
        nmrNumero.setOpaque(false);

        lblCEP.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCEP.setText("CEP:");

        lblCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        cbCidade.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

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

        cbUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

        lblUF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblUF.setText("UF:");

        javax.swing.GroupLayout pnlEnderecoLayout = new javax.swing.GroupLayout(pnlEndereco);
        pnlEndereco.setLayout(pnlEnderecoLayout);
        pnlEnderecoLayout.setHorizontalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCEP)
                    .addComponent(lblRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtRua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEnderecoLayout.createSequentialGroup()
                        .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        pnlEnderecoLayout.setVerticalGroup(
            pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(cbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(nmrNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        JSpinner.NumberEditor jsEditor = (javax.swing.JSpinner.NumberEditor)nmrNumero.getEditor();
        DefaultFormatter formatter = (DefaultFormatter) jsEditor.getTextField().getFormatter();
        formatter.setAllowsInvalid(false);

        btnSalvar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easysave.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Clique aqui para salvar os campos");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyexcluir.png"))); // NOI18N
        btnDeletar.setText("Excluir");
        btnDeletar.setToolTipText("Clique aqui para excluir o registro");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        try {
            txtCod.setText(Model_Banco.BuscaCodigoNovo("CLIENTE"));
        } catch (Exception e) {
        }
        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setEnabled(false);
        txtCod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodFocusLost(evt);
            }
        });
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyeditar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Clique aqui para editar os campos");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAddVeiculos.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAddVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/car.png"))); // NOI18N
        btnAddVeiculos.setText("Veiculos");
        btnAddVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVeiculosActionPerformed(evt);
            }
        });

        btnAddAutorizados.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnAddAutorizados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/autorizado.png"))); // NOI18N
        btnAddAutorizados.setText("Autorizados");
        btnAddAutorizados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAutorizadosActionPerformed(evt);
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
        btnPesqCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblCod)
                        .addGap(12, 12, 12)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnAddVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddAutorizados, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(btnEditar)))
                        .addGap(5, 5, 5)
                        .addComponent(btnSalvar)
                        .addGap(5, 5, 5)
                        .addComponent(btnDeletar)
                        .addGap(5, 5, 5)
                        .addComponent(btnLimpar)
                        .addGap(5, 5, 5)
                        .addComponent(btnFechar)))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblCod))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(pnlDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAutorizados, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnDeletar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        btnAddVeiculos.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddAutorizadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAutorizadosActionPerformed
        if (JaEstaSalvo==false) {
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
                    String CodNew =  Model_Cliente.Salvar(Cliente);
                    Bloqueia(true);
                    Ctrl_Msg.Informa(Ctrl_Msg.MsgISalvo);
                    JaEstaSalvo=true;
                } 
                catch (Exception e) 
                {
                    Ctrl_Msg.Informa(Ctrl_Msg.MsgErro);
                }
            }
          
          } 
        }
        if (JaEstaSalvo==true) {
            Ctrl_Util.IdCliente = txtCod.getText();
            View_CadAutorizados frmCadAutorizados = new View_CadAutorizados();
            frmCadAutorizados.setVisible(true);
        }
        else{
            Ctrl_Msg.Informa(Ctrl_Msg.MsgSelecioneCliente);
        }
    }//GEN-LAST:event_btnAddAutorizadosActionPerformed

    private void btnAddVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVeiculosActionPerformed
        if (JaEstaSalvo==false) {
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
                        String CodNew =  Model_Cliente.Salvar(Cliente);
                        Bloqueia(true);
                        Ctrl_Msg.Informa(Ctrl_Msg.MsgISalvo);
                        JaEstaSalvo=true;
                    } 
                    catch (Exception e) 
                    {
                        Ctrl_Msg.Informa(Ctrl_Msg.MsgErro);
                    }
                }

              } 
        }
        if (JaEstaSalvo==true) {
            Ctrl_Util.IdCliente = txtCod.getText();
            View_CadVeiculo frmCadVeiculo = new View_CadVeiculo();
            frmCadVeiculo.setVisible(true);
        }else{
            Ctrl_Msg.Informa(Ctrl_Msg.MsgSelecioneCliente);
        }
    }//GEN-LAST:event_btnAddVeiculosActionPerformed

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

          
           boolean  r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQEditar);
           if (r==true) 
           {
               Bloqueia(false);
               EstaEditando=true;
               btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/atualizar.png")));
           }
         
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
  
        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true) 
        {
          this.dispose();
          
           
        }
       
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
      
        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQLimpar);
          if (r==true)
          {
            Limpar();
          }
       
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
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
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
         
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
                    String CodNew =  Model_Cliente.Salvar(Cliente);
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
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered
   
        
    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited
      
    }//GEN-LAST:event_btnPesqCodMouseExited

    private void txtCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCEPFocusLost
       BuscarEndereco();
    }//GEN-LAST:event_txtCEPFocusLost

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        Pessoa.setId(null);
        Pessoa = Model_Pessoa.Verificar(txtCPF.getText());

        if (Pessoa.getId()!=null)
        {
            txtCPF.setText(Pessoa.getCpf());
            txtNome.setText(Pessoa.getNome());
            txtFixo.setText(Pessoa.getFixo());
            txtCelular.setText(Pessoa.getCelular());
            txtEmail.setText(Pessoa.getEmail());
            nmrNumero.setValue(Integer.parseInt(Pessoa.getNumero()));
            txtCEP.setText(Pessoa.getCep());
            
            Ctrl_Cliente IdCnh = Model.Model_Cliente.BuscaCnh(Pessoa.getId());
            if (!IdCnh.getId().equals("false")) {          
             txtCNH.setText(IdCnh.getCnh());
             txtCod.setText(IdCnh.getId());
             Ctrl_Msg.Informa(Ctrl_Msg.MsgJaExiste);
             Bloqueia(true);
             JaEstaSalvo=true;
            }
            
            BuscarEndereco();
        }
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodFocusLost

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
        View_ConCliente frmConCliente = new View_ConCliente();
        frmConCliente.setVisible(true);
    }//GEN-LAST:event_btnPesqCodActionPerformed

  
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               javax.swing.UIManager.setLookAndFeel("Metal");
                    break;
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_CadCliente().setVisible(true);
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
    private javax.swing.JButton btnAddAutorizados;
    private javax.swing.JButton btnAddVeiculos;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbCidade;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNH;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JSpinner nmrNumero;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JPanel pnlEndereco;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNH;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFixo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    //Jonathan trabalhando...
    
    private void Limpar(){
        txtCod.setText("");
        txtCNH.setText("");
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
            txtCNH.setEnabled(false);
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
            txtCNH.setEnabled(true);
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
            Cliente.setId(txtCod.getText());
            Cliente.setCnh(txtCNH.getText());
            Cliente.setCpf(txtCPF.getText());
            Cliente.setCelular(txtCelular.getText());
            Cliente.setFixo(txtFixo.getText());
            Cliente.setNome(txtNome.getText());
            Cliente.setEmail(txtEmail.getText());
            Cliente.setCep(txtCEP.getText());
            Cliente.setNumero(String.valueOf(nmrNumero.getValue()));
            Cliente.setTipo("C");
        }
        else
        {
            txtCod.setText(Cliente.getId());
            txtCNH.setText(Cliente.getCnh());
            txtCPF.setText(Cliente.getCpf());
            txtCelular.setText(Cliente.getCelular());
            txtFixo.setText(Cliente.getFixo());
            txtNome.setText(Cliente.getNome());
            txtEmail.setText(Cliente.getEmail());
            txtCEP.setText(Cliente.getCep());
            nmrNumero.setValue(Integer.parseInt(Cliente.getNumero()));    
        }

    }
    
    private  boolean Verifica()
    {
        String x[] = new String[10];
        x[0] = txtCod.getText();
        x [1] = txtCNH.getText();
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
                nmrNumero.requestFocus(true);
                nmrNumero.requestFocus();
            }
            
       
        } 
        catch (Exception e) 
        {

        }
        
    }

    private void CentralizarTela() {
    
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    
    }

}


