
package Cadastro_Gerenciamento;

import java.awt.Color;
import java.util.LinkedList;
import modelProdutos.Produto;

public class TelaPrincipal extends javax.swing.JFrame {
    
    LinkedList<Produto> listaProdutos;
    
    public TelaPrincipal() {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));
        
        this.listaProdutos = new LinkedList<>();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBCadastro = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jBEstoque = new javax.swing.JButton();
        jBVisualizacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jBCadastro.setBackground(new java.awt.Color(255, 153, 0));
        jBCadastro.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jBCadastro.setText("Cadastro de Produtos");
        jBCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroActionPerformed(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLTitulo.setText("Cadastro e Gerenciamento de Estoque");

        jBEstoque.setBackground(new java.awt.Color(255, 153, 0));
        jBEstoque.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jBEstoque.setText("Entrada/Retirada Estoque");
        jBEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstoqueActionPerformed(evt);
            }
        });

        jBVisualizacao.setBackground(new java.awt.Color(255, 153, 0));
        jBVisualizacao.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jBVisualizacao.setText("Visualização de Produtos");
        jBVisualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jBVisualizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jBCadastro)
                .addGap(18, 18, 18)
                .addComponent(jBEstoque)
                .addGap(18, 18, 18)
                .addComponent(jBVisualizacao)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroActionPerformed
    TelaCadastro telaCadastro = new TelaCadastro(this.listaProdutos);
    telaCadastro.setVisible(true);
    }//GEN-LAST:event_jBCadastroActionPerformed

    private void jBEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstoqueActionPerformed
    TelaEstoque telaEstoque = new TelaEstoque(this.listaProdutos);
    telaEstoque.setVisible(true);
    }//GEN-LAST:event_jBEstoqueActionPerformed

    private void jBVisualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizacaoActionPerformed
    TelaVisualizacao telaVisualizacao = new TelaVisualizacao(this.listaProdutos);
    telaVisualizacao.setVisible(true);
    }//GEN-LAST:event_jBVisualizacaoActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastro;
    private javax.swing.JButton jBEstoque;
    private javax.swing.JButton jBVisualizacao;
    private javax.swing.JLabel jLTitulo;
    // End of variables declaration//GEN-END:variables
}
