package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class View_ConAutorizado extends javax.swing.JFrame {
   
    public View_ConAutorizado() {
        initComponents();
        centralizarComponente();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupConAutorizado = new javax.swing.ButtonGroup();
        rdbNome = new javax.swing.JRadioButton();
        rdbCPF = new javax.swing.JRadioButton();
        txtFiltro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dtgConAutorizado = new javax.swing.JTable();
        rdbCod = new javax.swing.JRadioButton();
        btnFechar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Autorizados");
        setResizable(false);

        groupConAutorizado.add(rdbNome);
        rdbNome.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rdbNome.setText("Nome");

        groupConAutorizado.add(rdbCPF);
        rdbCPF.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rdbCPF.setText("CPF");

        txtFiltro.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });

        dtgConAutorizado.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        dtgConAutorizado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cód", "Nome", "CPF"
            }
        ));
        jScrollPane1.setViewportView(dtgConAutorizado);
        if (dtgConAutorizado.getColumnModel().getColumnCount() > 0) {
            dtgConAutorizado.getColumnModel().getColumn(1).setMinWidth(150);
        }

        groupConAutorizado.add(rdbCod);
        rdbCod.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        rdbCod.setText("Cód");

        btnFechar2.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        btnFechar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/img/Easyfechar.png"))); // NOI18N
        btnFechar2.setText("Fechar");
        btnFechar2.setToolTipText("Clique aqui para fechar");
        btnFechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdbCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdbNome)
                        .addGap(132, 132, 132)
                        .addComponent(rdbCPF))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFechar2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbNome)
                    .addComponent(rdbCPF)
                    .addComponent(rdbCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void btnFechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar2ActionPerformed
        Object[] botoes = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(
            null,
            "Deseja realmente sair?”.",
            "Confirmação",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            botoes,
            botoes[0]
        );

        if (resp == 0)
        {
            this.dispose();
        }
    }//GEN-LAST:event_btnFechar2ActionPerformed

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
            java.util.logging.Logger.getLogger(View_ConAutorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_ConAutorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_ConAutorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_ConAutorizado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_ConAutorizado().setVisible(true);
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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar2;
    private javax.swing.JTable dtgConAutorizado;
    private javax.swing.ButtonGroup groupConAutorizado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbCPF;
    private javax.swing.JRadioButton rdbCod;
    private javax.swing.JRadioButton rdbNome;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
