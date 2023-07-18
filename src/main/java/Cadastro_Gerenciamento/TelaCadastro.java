package Cadastro_Gerenciamento;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelProdutos.Bebida;
import modelProdutos.Comestivel;
import modelProdutos.Produto;

public class TelaCadastro extends javax.swing.JFrame {

    LinkedList<Produto> listaProdutos;

    public TelaCadastro(LinkedList<Produto> listaProdutos) {
        initComponents();
        getContentPane().setBackground(Color.decode("#f9d760"));

        this.listaProdutos = listaProdutos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLProduto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLQuantidade = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jLPreco = new javax.swing.JLabel();
        jTFPreco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBTipoProduto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCBTipoBebida = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTFEmbalagem = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jCBTipoComestivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLProduto.setForeground(new java.awt.Color(0, 0, 0));
        jLProduto.setText("Produto");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bebida");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Comestível");

        jBSalvar.setBackground(new java.awt.Color(255, 153, 0));
        jBSalvar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jBSalvar.setText("Salvar");
        jBSalvar.setToolTipText("");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(255, 153, 0));
        jBCancelar.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLNome.setForeground(new java.awt.Color(0, 0, 0));
        jLNome.setText("Nome");

        jLQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        jLQuantidade.setText("Quantidade");

        jLPreco.setForeground(new java.awt.Color(0, 0, 0));
        jLPreco.setText("Preço");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo Produto");

        jCBTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", "Bebida", "Comestível" }));
        jCBTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCBTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPreco)
                            .addComponent(jLQuantidade))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFPreco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidade)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo");
        jLabel3.setToolTipText("");

        jCBTipoBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", "Agua", "Suco", "Refrigerante", "Outro" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Embalagem");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCBTipoBebida, 0, 225, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo");

        jCBTipoComestivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", "Prato", "Lanche", "Diversos" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(70, 70, 70)
                .addComponent(jCBTipoComestivel, 0, 225, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jCBTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 172, Short.MAX_VALUE)
                .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLProduto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelar)
                    .addComponent(jBSalvar))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        limpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed

        if (!jTFNome.getText().equals("")) {
            if (!jTFQuantidade.getText().equals("")) {
                if (!jTFPreco.getText().equals("")) {
                    if (jCBTipoProduto.getSelectedIndex() != 0) {

                        String nome = jTFNome.getText();
                        int quantidade = Integer.parseInt(jTFQuantidade.getText());
                        float preco = Float.parseFloat(jTFPreco.getText());

                        if (jCBTipoProduto.getSelectedIndex() == 1) { //bebida
                            if (jCBTipoBebida.getSelectedIndex() != 0) {
                                int bebida = 0;
                                if (!jTFEmbalagem.getText().equals("")) {
                                    String embalagem = jTFEmbalagem.getText();

                                    if (jCBTipoBebida.getSelectedIndex() == 1) { // 1 – Água
                                        bebida = 1;
                                    } else if (jCBTipoBebida.getSelectedIndex() == 2) {// 2 – Suco
                                        bebida = 2;
                                    } else if (jCBTipoBebida.getSelectedIndex() == 3) {// 3 – Refrigerante
                                        bebida = 3;
                                    } else if (jCBTipoBebida.getSelectedIndex() == 4) {// 4 – Outro
                                        bebida = 4;
                                    }

                                    Bebida minhaBebida = new Bebida(bebida, embalagem, nome, quantidade, preco);
                                    this.listaProdutos.add(minhaBebida);
                                    JOptionPane.showMessageDialog(rootPane, "Bebida Cadastrada com sucesso!");
                                    limpaCampos();

                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Erro: selecione a embalagem!");
                                }

                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: selecione o tipo da bebida!");
                            }
                        } else if (jCBTipoProduto.getSelectedIndex() == 2) { //comestivel
                            //1 – Prato, 2 – Lanche, 3 – Diversos
                            if (jCBTipoComestivel.getSelectedIndex() != 0) {
                                int comestivel = 0;

                                if (jCBTipoComestivel.getSelectedIndex() == 1) {
                                    comestivel = 1; // 1 – Prato
                                } else if (jCBTipoComestivel.getSelectedIndex() == 2) {
                                    comestivel = 2; // 2 – Lanche
                                } else if (jCBTipoComestivel.getSelectedIndex() == 3) {
                                    comestivel = 3; // 3 – Diversos
                                }

                                Comestivel meuComestivel = new Comestivel(comestivel, nome, quantidade, preco);
                                this.listaProdutos.add(meuComestivel);
                                JOptionPane.showMessageDialog(rootPane, "Comestivel Cadastrada com sucesso!");
                                limpaCampos();

                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Erro: selecione o comestivel!");
                            }

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Erro: selecione o tipo do produto!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro: Digite o preço!");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro: Digite a quantidade!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro: Digite o nome!");
            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jCBTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoProdutoActionPerformed
        if (jCBTipoProduto.getSelectedIndex() == 0) {
            jTFEmbalagem.setEnabled(false);
            jCBTipoBebida.setEnabled(false);
            jCBTipoComestivel.setEnabled(false);
        } else if (jCBTipoProduto.getSelectedIndex() == 1) {
            jTFEmbalagem.setEnabled(true);
            jCBTipoBebida.setEnabled(true);
            jCBTipoComestivel.setEnabled(false);
        } else if (jCBTipoProduto.getSelectedIndex() == 2) {
            jTFEmbalagem.setEnabled(false);
            jCBTipoBebida.setEnabled(false);
            jCBTipoComestivel.setEnabled(true);
        }
    }//GEN-LAST:event_jCBTipoProdutoActionPerformed

    public void limpaCampos() {
        jTFNome.setText("");
        jTFPreco.setText("");
        jTFQuantidade.setText("");
        jTFEmbalagem.setText("");
        jCBTipoBebida.setSelectedIndex(0);
        jCBTipoComestivel.setSelectedIndex(0);
        jCBTipoProduto.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBTipoBebida;
    private javax.swing.JComboBox<String> jCBTipoComestivel;
    private javax.swing.JComboBox<String> jCBTipoProduto;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFEmbalagem;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPreco;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
