
package View;

import Controller.Ctrl_Email;
import Controller.Ctrl_Impressora;
import Controller.Ctrl_Msg;
import Controller.Ctrl_Venda;
import Model.Model_Banco;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.GregorianCalendar;



public class View_Menu extends javax.swing.JFrame {
  
    public View_Menu() {
         Model_Banco.Open();
         this.setExtendedState(MAXIMIZED_BOTH);   
         URL caminho = null;
         Image ico = null;
         caminho = View_Menu.class.getResource("/View/img/system.png");
         ico = Toolkit.getDefaultToolkit().getImage(caminho);  
         this.setIconImage(ico);
         initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        btnPesqCod = new javax.swing.JButton();
        btnPesqCod1 = new javax.swing.JButton();
        btnPesqCod2 = new javax.swing.JButton();
        mbMenu = new javax.swing.JMenuBar();
        mnCadastros = new javax.swing.JMenu();
        mniCadCliente = new javax.swing.JMenuItem();
        mniCadEstacionamento = new javax.swing.JMenuItem();
        mniCadFuncionario = new javax.swing.JMenuItem();
        mniCadTipoVaga = new javax.swing.JMenuItem();
        mniCadVaga = new javax.swing.JMenuItem();
        mnConsultas = new javax.swing.JMenu();
        mniConFuncionario = new javax.swing.JMenuItem();
        mniConVaga = new javax.swing.JMenuItem();
        mniConCliente = new javax.swing.JMenuItem();
        mnControle = new javax.swing.JMenu();
        mniVenda = new javax.swing.JMenuItem();
        mniCancelamento = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnRelatorios1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu EasyPark");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 0));

        btnPesqCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/btnCadCli.png"))); // NOI18N
        btnPesqCod.setToolTipText("Clique aqui para cadastrar um cliente");
        btnPesqCod.setBorderPainted(false
        );
        btnPesqCod.setContentAreaFilled(false);
        btnPesqCod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod.setDefaultCapable(false);
        btnPesqCod.setFocusPainted(false);
        btnPesqCod.setFocusable(false);
        btnPesqCod.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod.setMaximumSize(new java.awt.Dimension(38, 44));
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

        btnPesqCod1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/btnVenda.png"))); // NOI18N
        btnPesqCod1.setToolTipText("Clique aqui para iniciar uma venda");
        btnPesqCod1.setBorderPainted(false
        );
        btnPesqCod1.setContentAreaFilled(false);
        btnPesqCod1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod1.setDefaultCapable(false);
        btnPesqCod1.setFocusPainted(false);
        btnPesqCod1.setFocusable(false);
        btnPesqCod1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod1.setMaximumSize(new java.awt.Dimension(38, 44));
        btnPesqCod1.setPreferredSize(new java.awt.Dimension(38, 44));
        btnPesqCod1.setVerifyInputWhenFocusTarget(false);
        btnPesqCod1.addMouseListener(new java.awt.event.MouseAdapter() {
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

        btnPesqCod2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnPesqCod2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/btnFinVenda.png"))); // NOI18N
        btnPesqCod2.setToolTipText("Clique aqui para encerrar uma venda");
        btnPesqCod2.setBorderPainted(false
        );
        btnPesqCod2.setContentAreaFilled(false);
        btnPesqCod2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesqCod2.setDefaultCapable(false);
        btnPesqCod2.setFocusPainted(false);
        btnPesqCod2.setFocusable(false);
        btnPesqCod2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesqCod2.setMaximumSize(new java.awt.Dimension(38, 44));
        btnPesqCod2.setPreferredSize(new java.awt.Dimension(38, 44));
        btnPesqCod2.setVerifyInputWhenFocusTarget(false);
        btnPesqCod2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesqCod2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesqCod2MouseExited(evt);
            }
        });
        btnPesqCod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqCod2ActionPerformed(evt);
            }
        });

        mbMenu.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        mnCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easycad.png"))); // NOI18N
        mnCadastros.setMnemonic('c');
        mnCadastros.setText("Cadastros");
        mnCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnCadastros.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        mniCadCliente.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyCliente.png"))); // NOI18N
        mniCadCliente.setMnemonic('c');
        mniCadCliente.setText("Cliente");
        mniCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadClienteActionPerformed(evt);
            }
        });
        mnCadastros.add(mniCadCliente);

        mniCadEstacionamento.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCadEstacionamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyEstacionamento.png"))); // NOI18N
        mniCadEstacionamento.setMnemonic('e');
        mniCadEstacionamento.setText("Estacionamento");
        mniCadEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadEstacionamentoActionPerformed(evt);
            }
        });
        mnCadastros.add(mniCadEstacionamento);

        mniCadFuncionario.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCadFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyFuncionario.png"))); // NOI18N
        mniCadFuncionario.setMnemonic('f');
        mniCadFuncionario.setText("Funcionário");
        mniCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadFuncionarioActionPerformed(evt);
            }
        });
        mnCadastros.add(mniCadFuncionario);

        mniCadTipoVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCadTipoVaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyTipoVaga.png"))); // NOI18N
        mniCadTipoVaga.setMnemonic('t');
        mniCadTipoVaga.setText("Tipo Vaga");
        mniCadTipoVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadTipoVagaActionPerformed(evt);
            }
        });
        mnCadastros.add(mniCadTipoVaga);

        mniCadVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCadVaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyVaga.png"))); // NOI18N
        mniCadVaga.setMnemonic('v');
        mniCadVaga.setText("Vaga");
        mniCadVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadVagaActionPerformed(evt);
            }
        });
        mnCadastros.add(mniCadVaga);

        mbMenu.add(mnCadastros);

        mnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyConsulta.png"))); // NOI18N
        mnConsultas.setMnemonic('o');
        mnConsultas.setText("Consultas");
        mnConsultas.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        mniConFuncionario.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniConFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyFuncionario.png"))); // NOI18N
        mniConFuncionario.setMnemonic('f');
        mniConFuncionario.setText("Funcionários");
        mniConFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConFuncionarioActionPerformed(evt);
            }
        });
        mnConsultas.add(mniConFuncionario);

        mniConVaga.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniConVaga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyVaga.png"))); // NOI18N
        mniConVaga.setMnemonic('v');
        mniConVaga.setText("Vagas");
        mniConVaga.setToolTipText("");
        mniConVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConVagaActionPerformed(evt);
            }
        });
        mnConsultas.add(mniConVaga);

        mniConCliente.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniConCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyCliente.png"))); // NOI18N
        mniConCliente.setMnemonic('c');
        mniConCliente.setText("Clientes");
        mniConCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniConClienteActionPerformed(evt);
            }
        });
        mnConsultas.add(mniConCliente);

        mbMenu.add(mnConsultas);

        mnControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasyControle.png"))); // NOI18N
        mnControle.setMnemonic('n');
        mnControle.setText("Controle");
        mnControle.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        mniVenda.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/addwd1.png"))); // NOI18N
        mniVenda.setMnemonic('v');
        mniVenda.setText("Venda - Entrada");
        mniVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVendaActionPerformed(evt);
            }
        });
        mnControle.add(mniVenda);

        mniCancelamento.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mniCancelamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/222.png"))); // NOI18N
        mniCancelamento.setMnemonic('c');
        mniCancelamento.setText("Venda - Saida");
        mniCancelamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCancelamentoActionPerformed(evt);
            }
        });
        mnControle.add(mniCancelamento);

        mbMenu.add(mnControle);

        mnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/ordem2.png"))); // NOI18N
        mnRelatorios.setMnemonic('r');
        mnRelatorios.setText("Relatórios");
        mnRelatorios.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/ordem2.png"))); // NOI18N
        jMenuItem1.setText("Venda");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnRelatorios.add(jMenuItem1);

        mbMenu.add(mnRelatorios);
        mnRelatorios.getAccessibleContext().setAccessibleName("Relatorios");

        mnRelatorios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Status-mail-unread-new-icon1.png"))); // NOI18N
        mnRelatorios1.setMnemonic('r');
        mnRelatorios1.setText("Email");
        mnRelatorios1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Status-mail-unread-new-icon1.png"))); // NOI18N
        jMenuItem2.setText("Email");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnRelatorios1.add(jMenuItem2);

        mbMenu.add(mnRelatorios1);

        mnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasySair.png"))); // NOI18N
        mnSair.setMnemonic('s');
        mnSair.setText("Sair");
        mnSair.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        mniSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/EasySair.png"))); // NOI18N
        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnSair.add(mniSair);

        mbMenu.add(mnSair);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(736, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnPesqCod, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnPesqCod1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnPesqCod2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCadEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadEstacionamentoActionPerformed
        View_CadEstacionamento frmCadEstacionamento = new View_CadEstacionamento();
        frmCadEstacionamento.setVisible(true);
        
    }//GEN-LAST:event_mniCadEstacionamentoActionPerformed

    private void mniCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadFuncionarioActionPerformed
        View_CadFuncionario frmCadFuncionario = new View_CadFuncionario();
        frmCadFuncionario.setVisible(true);
    }//GEN-LAST:event_mniCadFuncionarioActionPerformed

    private void mniCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadClienteActionPerformed
        View_CadCliente frmCadCliente = new View_CadCliente();
        frmCadCliente.setVisible(true);
    }//GEN-LAST:event_mniCadClienteActionPerformed

    private void mniCadVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadVagaActionPerformed
        View_CadVaga frmCadVaga = new View_CadVaga();
        frmCadVaga.setVisible(true);
    }//GEN-LAST:event_mniCadVagaActionPerformed

    private void mniConVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConVagaActionPerformed
        View_ConVaga frmConVaga = new View_ConVaga();
        frmConVaga.setVisible(true);
    }//GEN-LAST:event_mniConVagaActionPerformed

    private void mniConFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConFuncionarioActionPerformed
        View_ConFuncionario frmConFuncionario = new View_ConFuncionario();
        frmConFuncionario.setVisible(true);
    }//GEN-LAST:event_mniConFuncionarioActionPerformed

    private void mniConClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniConClienteActionPerformed
        View_ConCliente frmConCliente = new View_ConCliente();
        frmConCliente.setVisible(true);
    }//GEN-LAST:event_mniConClienteActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        
    }//GEN-LAST:event_mnSairActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
      boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFecharS);
        if (r==true) 
        {
          this.dispose();
        }
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniCadTipoVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCadTipoVagaActionPerformed
        View_CadTipoVaga frmCadTipoVaga = new View_CadTipoVaga();
        frmCadTipoVaga.setVisible(true);
    }//GEN-LAST:event_mniCadTipoVagaActionPerformed

    private void mniVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVendaActionPerformed
        View_Venda frmVenda = new View_Venda();
        frmVenda.setVisible(true);
    }//GEN-LAST:event_mniVendaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        View_Relatorio frmRelatorio = new View_Relatorio();
        frmRelatorio.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniCancelamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCancelamentoActionPerformed
        View_VendaFinalizar VendaFinalizar = new View_VendaFinalizar();
        VendaFinalizar.setVisible(true);
    }//GEN-LAST:event_mniCancelamentoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        View_EnvioEmail Email = new View_EnvioEmail();
        Email.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnPesqCodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseEntered

    }//GEN-LAST:event_btnPesqCodMouseEntered

    private void btnPesqCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCodMouseExited

    }//GEN-LAST:event_btnPesqCodMouseExited

    private void btnPesqCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCodActionPerformed
         View_CadCliente frmCadCliente = new View_CadCliente();
        frmCadCliente.setVisible(true);
    }//GEN-LAST:event_btnPesqCodActionPerformed

    private void btnPesqCod1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod1MouseEntered

    private void btnPesqCod1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod1MouseExited

    private void btnPesqCod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCod1ActionPerformed
        View_Venda frmVenda = new View_Venda();
        frmVenda.setVisible(true);
    }//GEN-LAST:event_btnPesqCod1ActionPerformed

    private void btnPesqCod2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod2MouseEntered

    private void btnPesqCod2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqCod2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesqCod2MouseExited

    private void btnPesqCod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqCod2ActionPerformed
        View_VendaFinalizar VendaFinalizar = new View_VendaFinalizar();
        VendaFinalizar.setVisible(true);
    }//GEN-LAST:event_btnPesqCod2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(View_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesqCod;
    private javax.swing.JButton btnPesqCod1;
    private javax.swing.JButton btnPesqCod2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JMenu mnCadastros;
    private javax.swing.JMenu mnConsultas;
    private javax.swing.JMenu mnControle;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnRelatorios1;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenuItem mniCadCliente;
    private javax.swing.JMenuItem mniCadEstacionamento;
    private javax.swing.JMenuItem mniCadFuncionario;
    private javax.swing.JMenuItem mniCadTipoVaga;
    private javax.swing.JMenuItem mniCadVaga;
    private javax.swing.JMenuItem mniCancelamento;
    private javax.swing.JMenuItem mniConCliente;
    private javax.swing.JMenuItem mniConFuncionario;
    private javax.swing.JMenuItem mniConVaga;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniVenda;
    // End of variables declaration//GEN-END:variables
}
