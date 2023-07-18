package Cadastro_Gerenciamento;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelProdutos.Produto;

public class TelaEstoque extends javax.swing.JFrame {

    LinkedList<Produto> listaProdutos;

    public TelaEstoque(LinkedList<Produto> listaProdutos) {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));

        this.listaProdutos = listaProdutos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRBEntrada = new javax.swing.JRadioButton();
        jRBRetirada = new javax.swing.JRadioButton();
        jLProduto = new javax.swing.JLabel();
        jCBProduto = new javax.swing.JComboBox<>();
        jLQuantidade = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Movimentação");

        buttonGroup1.add(jRBEntrada);
        jRBEntrada.setText("Entrada");

        buttonGroup1.add(jRBRetirada);
        jRBRetirada.setText("Retirada");

        jLProduto.setText("Produto");

        jCBProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>" }));

        jLQuantidade.setText("Quantidade");

        jBSalvar.setBackground(new java.awt.Color(255, 153, 0));
        jBSalvar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(255, 153, 0));
        jBCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jRBEntrada)
                        .addGap(32, 32, 32)
                        .addComponent(jRBRetirada))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLQuantidade)
                            .addComponent(jLProduto))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFQuantidade)
                            .addComponent(jCBProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jRBEntrada)
                    .addComponent(jRBRetirada))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidade)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        if (jRBEntrada.isSelected() || jRBRetirada.isSelected()) {
            if (jCBProduto.getSelectedIndex() != 0) {
                if (jTFQuantidade.getText().equals("")) {
                    int quantidade = Integer.parseInt(jTFQuantidade.getText());

                    int posicao = jCBProduto.getSelectedIndex() - 1;

                    Produto meuProduto = this.listaProdutos.get(posicao);

                    if (jRBEntrada.isSelected()) {
                        boolean resultado = meuProduto.entradaEstoque(quantidade);

                        if (resultado = true) {
                            JOptionPane.showMessageDialog(rootPane, "A entrada do produto foi efetuada com sucesso!");
                            limpaCampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: Não foi possivel efetuar a entrada!");
                        }

                    } else if (jRBRetirada.isSelected()) {
                        boolean resultado = meuProduto.retiradaEstoque(quantidade);

                        if (resultado = true) {
                            JOptionPane.showMessageDialog(rootPane, "A retirada foi efetuada com sucesso!");
                            limpaCampos();
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: Não foi possivel efetuar a retirada!");
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: Selecione o produto desejado!");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro: selecione o procedimento!");
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    public void limpaCampos() {
        buttonGroup1.clearSelection();
        jCBProduto.setSelectedIndex(0);
        jTFQuantidade.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBProduto;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBEntrada;
    private javax.swing.JRadioButton jRBRetirada;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
