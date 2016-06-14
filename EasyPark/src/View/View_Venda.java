/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Ctrl_Autorizado;
import Controller.Ctrl_Cliente;
import Controller.Ctrl_Impressora;
import Controller.Ctrl_Msg;
import Controller.Ctrl_Pessoa;
import Controller.Ctrl_Vaga;
import Controller.Ctrl_Veiculo;
import Controller.Ctrl_Venda;
import Model.Model_Autorizado;
import Model.Model_Banco;
import Model.Model_Cliente;
import Model.Model_Pessoa;
import Model.Model_Vaga;
import Model.Model_Veiculo;
import Model.Model_Venda;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Jonathan
 */
public class View_Venda extends javax.swing.JFrame {
    
    private static Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
    private static Ctrl_Cliente Cliente = new Ctrl_Cliente();  
    private static List<Ctrl_Veiculo> ListaVeiculos;
    private static List<Ctrl_Autorizado> ListaAutorizados;
    private static List<Ctrl_Vaga> ListaVaga;    
    private static DefaultListModel listaAuxAutorizados = new DefaultListModel();
    private static DefaultListModel listaAuxCarros = new DefaultListModel();
    private static Ctrl_Venda Venda;
    private static String txtLocalizacao ="";
    private int indiceCombo =0;
   
    public View_Venda() {
      
       initComponents();
       Vagas();
       centarlizarTela();
       cbVagas.setVisible(false);
       
   
       
    }
    
    private void Vagas (){
       
       java.util.List<Ctrl_Vaga> V =  Model_Vaga.BuscarVagas();
      
       ListaVaga = V;

       Label vagas[] = new java.awt.Label [V.size()];
       

       int w = 25;
       int h = 25;
       int l = 0;
       
       for (int i = 0; i < V.size(); i++) {
           
            vagas[i] = new java.awt.Label();
            vagas[i].setBounds(w, h, 40, 40);
            vagas[i].setAlignment(java.awt.Label.CENTER);
            
            if (V.get(i).getStatus().equals("0")) {
                
                vagas[i].setBackground(new java.awt.Color(0, 153, 0));
                cbVagas.addItem(V.get(i).getLocalizacao());
                
                String loc = V.get(i).getLocalizacao();
                int x = cbVagas.getItemCount()-1;
                vagas[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                    setVaga(loc, x);
                    setLocalizacaoVaga(evt);
                }});
            }
            else{
                vagas[i].setBackground(new java.awt.Color(255, 0, 0));
                String loca = V.get(i).getLocalizacao();
                int y = i;
                vagas[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                    setVaga(loca, y);
                    VagaEmUso();
                }});
                
            }
            
            vagas[i].setText(V.get(i).getLocalizacao());   
            vagas[i].setForeground(new java.awt.Color(255, 255, 255));
            vagas[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            
            jPanel02.add(vagas[i]);
            
         
            
            if (w==1000) {
               w=25;
               h+=65;
               l++;
            }else{
               w += 65;            
            }

        }
       
        jPanel02.setPreferredSize(new java.awt.Dimension(1010, ((l*70)+60)));
        
    }
    
    private void setVaga (String vaga, int indice){
        txtLocalizacao = vaga;
        indiceCombo = indice;
        
        
    }
    
    private void centarlizarTela(){
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dw = getSize();
        setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane01 = new javax.swing.JScrollPane();
        jPanel01 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listResponsavel = new javax.swing.JList<>();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        txtResponsavel = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCarros = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JLabel();
        jScrollPane02 = new javax.swing.JScrollPane();
        jPanel02 = new javax.swing.JPanel();
        btnProximo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnConcluir = new javax.swing.JButton();
        btnPesqCod1 = new javax.swing.JButton();
        cbVagas = new javax.swing.JComboBox<>();
        btnLimpar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 420));
        setMinimumSize(new java.awt.Dimension(980, 420));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(980, 420));

        jScrollPane01.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane01.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane01.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane01.setMinimumSize(new java.awt.Dimension(1000, 7));
        jScrollPane01.setName(""); // NOI18N

        jPanel01.setMaximumSize(new java.awt.Dimension(1100, 214));
        jPanel01.setMinimumSize(new java.awt.Dimension(1100, 214));
        jPanel01.setPreferredSize(new java.awt.Dimension(1075, 214));

        listResponsavel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listResponsavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listResponsavelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listResponsavel);

        lblCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESPONSAVEL SELECIONADO ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtResponsavel.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtResponsavel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResponsavel.setText("Nome Responsavel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtResponsavel)
                .addGap(15, 15, 15))
        );

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtNome.setText("NOME DO TITULAR");

        listCarros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCarrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCarros);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PLACA SELECIONADA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtPlaca.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca.setText("Placa");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtPlaca)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF)))
                .addGap(18, 18, 18)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Responsavel Selecionado");
        jPanel1.getAccessibleContext().setAccessibleDescription("Responsavel Selecionado");

        jScrollPane01.setViewportView(jPanel01);

        jScrollPane02.setVisible(false);
        jScrollPane02.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane02.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane02.setToolTipText("Lista de vagas e suas situações");
        jScrollPane02.setMinimumSize(new java.awt.Dimension(1050, 7));
        jScrollPane02.setPreferredSize(new java.awt.Dimension(1050, 214));

        jPanel02.setBackground(new java.awt.Color(255, 255, 255));
        jPanel02.setMaximumSize(new java.awt.Dimension(1100, 214));
        jPanel02.setMinimumSize(new java.awt.Dimension(1100, 214));
        jPanel02.setPreferredSize(new java.awt.Dimension(1100, 214));

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jPanel02Layout.setVerticalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );

        jScrollPane02.setViewportView(jPanel02);

        btnProximo.setText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.setMaximumSize(new java.awt.Dimension(72, 25));
        btnVoltar.setMinimumSize(new java.awt.Dimension(72, 25));
        btnVoltar.setVisible(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        try {
            txtCod.setText(Model_Banco.BuscaCodigoNovo("VENDA"));
        } catch (Exception e) {
        }
        txtCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtCod.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        lblCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        lblCod.setText("Cód:");

        btnFechar.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar.setText("Fechar");
        btnFechar.setToolTipText("Clique aqui para fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnConcluir.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/alergia.png"))); // NOI18N
        btnConcluir.setText("Concluir");
        btnConcluir.setToolTipText("");
        btnConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });

        btnPesqCod1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easypesq.png"))); // NOI18N
        btnPesqCod1.setToolTipText("");
        btnPesqCod1.setBorderPainted(false
        );
        btnPesqCod1.setContentAreaFilled(false);
        btnPesqCod1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod1.setDefaultCapable(false);
        btnPesqCod1.setFocusPainted(false);
        btnPesqCod1.setFocusable(false);
        btnPesqCod1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod1.setMaximumSize(new java.awt.Dimension(38, 44));
        btnPesqCod1.setMinimumSize(null);
        btnPesqCod1.setPreferredSize(new java.awt.Dimension(38, 44));
        btnPesqCod1.setVerifyInputWhenFocusTarget(false);
        btnPesqCod1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesqCod1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesqCod1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesqCod1MouseExited(evt);
            }
        });
        btnPesqCod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCod1ActionPerformed(evt);
            }
        });

        btnLimpar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnLimpar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easylimpar.png"))); // NOI18N
        btnLimpar2.setText("Limpar");
        btnLimpar2.setToolTipText("Clique aqui para limpar os campos");
        btnLimpar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCod)
                                .addGap(6, 6, 6)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesqCod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane01, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane02, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(568, 568, 568)
                                .addComponent(btnLimpar2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPesqCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCod)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane01, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane02, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFechar)
                        .addComponent(btnLimpar2)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        jScrollPane02.setVisible(false);
        jScrollPane01.setVisible(true);
        btnVoltar.setVisible(false);
        btnProximo.setVisible(true);
        cbVagas.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        Pessoa.setId(null);
        Pessoa = Model_Pessoa.VerificarFiltro(txtCPF.getText(), "C");
        
        if (Pessoa.getId()!=null)
        {
            Cliente.setId(null);
            Cliente = Model_Cliente.BuscaCliente(Pessoa.getId());
            if(Cliente.getId()!=null){              
                Cliente.setNome(Pessoa.getNome());
                txtNome.setText(Cliente.getNome());
                Ctrl_Autorizado ProprioCliente = new Ctrl_Autorizado();
                ProprioCliente.setNome(txtNome.getText());
                ProprioCliente.setIdPessoa(Pessoa.getId());
                //add carros a lista infernal 
                ListaVeiculos = Model_Veiculo.Busca(Cliente.getId());
               
                for (int i = 0; i < ListaVeiculos.size(); i++) {
                    String x = ListaVeiculos.get(i).getPlaca().toLowerCase();
                    listaAuxCarros.addElement(x);
                }
                listCarros.setModel(listaAuxCarros);
                
                //add autorizados a lista infernal 
                ListaAutorizados = Model_Autorizado.Busca(Cliente.getId());

                ListaAutorizados.add(ProprioCliente);
                for (int i = 0; i < ListaAutorizados.size(); i++) {
                    String y =  ListaAutorizados.get(i).getNome();
                    listaAuxAutorizados.addElement(y);
                }
                listResponsavel.setModel(listaAuxAutorizados);
            }
            
        }
        else{
            Ctrl_Msg.Informa(Ctrl_Msg.MsgClienteInexistente);
            txtCPF.setText("");
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtCPFFocusLost
    private void AtribuirPessoaCliente(){
        
    }
    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
       
            jScrollPane02.setVisible(true);
            cbVagas.setVisible(true);
            jScrollPane01.setVisible(false);
            btnVoltar.setVisible(true);
            btnProximo.setVisible(false);
        

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed
        
        String x = cbVagas.getSelectedItem().toString();       
        boolean r = Ctrl_Msg.Questiona(Ctrl_Msg.MsgConcluirVenda +"\n" 
                +"Venda: " + txtCod.getText() +"\n"
                +"Localização: "  + x +"\n"
                +"Cliente: "  + txtResponsavel.getText() +"\n");
        
        if (r==true) 
        {
             try {
                Atribuir();
                r = false;
                r =  Model_Venda.Salvar(Venda);
                if (r==true) 
                {
                    Ctrl_Impressora.ImprimirTexto(Venda, txtResponsavel.getText());
                    Limpar();
                    Ctrl_Msg.Informa(Ctrl_Msg.MsgVendaConcluida);
                    
                }
             } 
            catch (SQLException ex)
             {
                
             }
        }
       
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnPesqCod1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod1MouseEntered

    private void btnPesqCod1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod1MouseExited

    private void btnPesqCod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod1ActionPerformed

    private void btnPesqCod1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod1MouseClicked
        View_ConCliente ConCliente = new View_ConCliente();
        ConCliente.setVisible(true);
    }//GEN-LAST:event_btnPesqCod1MouseClicked

    private void listResponsavelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listResponsavelMouseClicked
        int x = listResponsavel.getSelectedIndex();
        txtResponsavel.setText(ListaAutorizados.get(x).getNome());
    }//GEN-LAST:event_listResponsavelMouseClicked

    private void listCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCarrosMouseClicked
        int x = listCarros.getSelectedIndex();
        txtPlaca.setText(ListaVeiculos.get(x).getPlaca());
        
    }//GEN-LAST:event_listCarrosMouseClicked

    private void btnLimpar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar2ActionPerformed
        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQLimpar);
          if (r==true)
          {
            Limpar();
          }
    }//GEN-LAST:event_btnLimpar2ActionPerformed

    private void setLocalizacaoVaga(java.awt.event.MouseEvent evt) {   

        cbVagas.setSelectedIndex(indiceCombo);
    }
    
    private void VagaEmUso(){
        Ctrl_Msg.Informa(Ctrl_Msg.MsgVagaEmUso);
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
            java.util.logging.Logger.getLogger(View_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnPesqCod1;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbVagas;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel02;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane01;
    private javax.swing.JScrollPane jScrollPane02;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCod;
    private javax.swing.JList<String> listCarros;
    private javax.swing.JList<String> listResponsavel;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCod;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtPlaca;
    private javax.swing.JLabel txtResponsavel;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {

        ListaVeiculos.clear();
        ListaAutorizados.clear();
        ListaVaga.clear();  
        listaAuxAutorizados = new DefaultListModel();
        listaAuxCarros = new DefaultListModel();
        listResponsavel.setModel(listaAuxAutorizados);
        listCarros.setModel(listaAuxCarros);
        
        txtCPF.setText("");
        txtResponsavel.setText("");
        txtPlaca.setText("");
        
        Vagas();
        
        
    }
    private void Atribuir(){
        int x = listResponsavel.getSelectedIndex();
        Venda.setId_Motorista(ListaAutorizados.get(x).getIdPessoa());
        int y = listCarros.getSelectedIndex();
        Venda.setId_Veiculo(ListaVeiculos.get(y).getId());  
        Venda.setId_Vaga(GetVagaId());
        Venda.setDhora_Inicial(GetDataHora());
        Venda.setId(txtCod.getText());
    }
    
    private String GetVagaId(){
        for (int i = 0; i < ListaVaga.size(); i++) {
            String x = cbVagas.getSelectedItem().toString();
            if (x.equals(ListaVaga.get(i).getLocalizacao())) {
                return ListaVaga.get(i).getId();
            }
        }
        return "null";
    }
    
     private String GetDataHora(){
        String data = "yyyy-MM-dd";
        String hora = "h:mm";
        String data1, hora1;
        java.util.Date agora = new java.util.Date();;
        SimpleDateFormat formata = new SimpleDateFormat(data);
        data1 = formata.format(agora);
        formata = new SimpleDateFormat(hora);
        hora1 = formata.format(agora);
        return data1 +" "+ hora1;
    }
    
}
