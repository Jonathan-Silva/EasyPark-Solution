/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Ctrl_Msg;
import Controller.Ctrl_Pessoa;
import Controller.Ctrl_Vaga;
import Model.Model_Banco;
import Model.Model_Pessoa;
import Model.Model_Vaga;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.text.MaskFormatter;


/**
 *
 * @author Jonathan
 */
public class View_Venda extends javax.swing.JFrame {
    
    private static Ctrl_Pessoa Pessoa = new Ctrl_Pessoa();
    private  String txtLocalizacao = "";
    private int indiceCombo =0;
    public View_Venda() {
       initComponents();
       Vagas();
       centarlizarTela();
       
   
       
    }
    
    private void Vagas (){
       
       java.util.List<Ctrl_Vaga> V =  Model_Vaga.BuscarVagas();
      

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

        jScrollPane02 = new javax.swing.JScrollPane();
        jPanel02 = new javax.swing.JPanel();
        jScrollPane01 = new javax.swing.JScrollPane();
        jPanel01 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listResponsavel = new javax.swing.JList<>();
        btnResponsavel = new javax.swing.JButton();
        txtResponsavel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtPlaca = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCarros = new javax.swing.JList<>();
        txtNome = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtCod = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        cbVagas = new javax.swing.JComboBox<>();
        btnFechar = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 420));
        setMinimumSize(new java.awt.Dimension(980, 420));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(980, 420));

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
        jScrollPane1.setViewportView(listResponsavel);

        btnResponsavel.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnResponsavel.setText("Selecionar Responsavel");
        btnResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponsavelActionPerformed(evt);
            }
        });

        txtResponsavel.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtResponsavel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResponsavel.setText("Nome Responsavel");

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        jButton1.setText("Selecionar Placa");

        txtPlaca.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlaca.setText("PLACA");
        txtPlaca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPlacaMouseClicked(evt);
            }
        });

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

        listCarros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listCarros);

        txtNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtNome.setText("NOME DO TITULAR");

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF)))
                .addGap(10, 10, 10)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel01Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel01Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel01Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome))
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel01Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlaca))
                            .addGroup(jPanel01Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(txtResponsavel))))
                    .addGroup(jPanel01Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane01.setViewportView(jPanel01);

        btnProximo.setText("Proximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
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
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane01, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane02, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCod)
                                    .addGap(12, 12, 12)
                                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(725, 725, 725)
                                    .addComponent(cbVagas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblCod))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane01, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane02, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnLimpar1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
         jScrollPane02.setVisible(false);
        jScrollPane01.setVisible(true);
        btnVoltar.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResponsavelActionPerformed

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        Pessoa.setId(null);
        Pessoa = Model_Pessoa.Verificar(txtCPF.getText());

        if (Pessoa.getId()!=null)
        {
            txtNome.setText(Pessoa.getNome());
            
        }
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed

    }//GEN-LAST:event_txtCodActionPerformed

    private void txtPlacaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlacaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaMouseClicked

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        jScrollPane02.setVisible(true);
        jScrollPane01.setVisible(false);
        btnVoltar.setVisible(true);

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQFechar);
        if (r==true)
        {
            this.dispose();

        }

    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed

        boolean r =  Ctrl_Msg.Questiona(Ctrl_Msg.MsgQLimpar);
        if (r==true)
        {
            Limpar();
        }

    }//GEN-LAST:event_btnLimpar1ActionPerformed

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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnResponsavel;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbVagas;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel02;
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
      
    }
}
