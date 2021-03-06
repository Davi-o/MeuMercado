package view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;
import services.ProdutoServices;
import services.ServicesFactory;

/** 
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class Estoque extends javax.swing.JInternalFrame {

    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Id", "Nome", "Tipo", "Valor", "Estoque"});

    /**
     * Creates new form playerView
     */
    public Estoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduto = new javax.swing.JTable();
        jbUpdate = new javax.swing.JButton();
        jbChange = new javax.swing.JButton();
        jlSearch = new javax.swing.JLabel();
        jtSearch = new javax.swing.JTextField();
        jcFilter = new javax.swing.JComboBox();
        jbDelete = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtableProduto);

        jbUpdate.setText("Atualizar");
        jbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbUpdateActionPerformed(evt);
            }
        });
        jbUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbUpdateKeyPressed(evt);
            }
        });

        jbChange.setText("Alterar");
        jbChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbChangeActionPerformed(evt);
            }
        });
        jbChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbChangeKeyPressed(evt);
            }
        });

        jlSearch.setText("Pesquisar");

        jtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtSearchKeyReleased(evt);
            }
        });

        jcFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nome", "Tipo", "Qtd", "Valor" }));

        jbDelete.setText("Deletar");
        jbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeleteActionPerformed(evt);
            }
        });
        jbDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbDeleteKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jlSearch)
                        .addGap(18, 18, 18)
                        .addComponent(jtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jbUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSearch)
                    .addComponent(jtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbUpdate)
                    .addComponent(jbChange)
                    .addComponent(jbDelete))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbUpdate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbChange, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtSearch, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcFilter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbDelete, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filter() {
        try {
            String search = jtSearch.getText();
            String filter = jcFilter.getSelectedItem().toString();
            ProdutoServices ps = ServicesFactory.getProdutosServices();
            if (search.isEmpty()) {

            } else {
                ArrayList<Produto> player = new ArrayList<>();
                player = ps.filtrarProdutos(search, filter);

                for (int i = 0; i < player.size(); i++) {
                    dtm.addRow(new String[]{
                        String.valueOf(player.get(i).getProdutoId()),
                        String.valueOf(player.get(i).getNomeProduto()),
                        String.valueOf(player.get(i).getTipoProduto()),
                        String.valueOf(player.get(i).getValor()),
                        String.valueOf(player.get(i).getQtdEstoque())
                    });
                }//fecha for

                jtableProduto.setModel(dtm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro!" + e.getMessage());
        }//fecha catch
    }

    private void alterarProduto() {
        try {
            int selectedRow = jtableProduto.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Escolha uma linha para alterar");
                return;
            }
            String id = jtableProduto.getValueAt(selectedRow, 0).toString();
            String nome = jtableProduto.getValueAt(selectedRow, 1).toString();
            String tipo = jtableProduto.getValueAt(selectedRow, 2).toString();
            String estoque = jtableProduto.getValueAt(selectedRow, 4).toString();
            String valor = jtableProduto.getValueAt(selectedRow, 3).toString();

            Produto p = new Produto();
            p.setProdutoId(Integer.parseInt(id));
            p.setNomeProduto(nome);
            p.setQtdEstoque(Integer.parseInt(estoque));
            p.setTipoProduto(tipo);
            p.setValor(Double.parseDouble(valor));
            
            ProdutoServices ps = ServicesFactory.getProdutosServices();
            ps.alterarProduto(p);

            JOptionPane.showMessageDialog(this, "Produto alterado com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro!" + e.getMessage());
        }//close catch
    }// close method

    private void delete() {
        try {
            int selectedRow = jtableProduto.getSelectedRow();
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Selecione um produto para excluir!");
                return;
            }
            ProdutoServices cs = ServicesFactory.getProdutosServices();
            String id = jtableProduto.getValueAt(selectedRow, 0).toString();
            cs.deletarProduto(Integer.parseInt(id));
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro!" + e.getMessage());
        }// close catch
    }// close method

    private void clean() {
        dtm.setNumRows(0);
    }// close method

    private void fulfillTable() {
        try {
            ProdutoServices ps = ServicesFactory.getProdutosServices();
            ArrayList<Produto> player = new ArrayList<>();
            player = ps.procurarProdutos();
            // test //  
            System.out.println("TESTE: " + player.toString());
            for (int i = 0; i < player.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(player.get(i).getProdutoId()),
                    String.valueOf(player.get(i).getNomeProduto()),
                    String.valueOf(player.get(i).getTipoProduto()),
                    String.valueOf(player.get(i).getValor()),
                    String.valueOf(player.get(i).getQtdEstoque())
                });
            }// close for
            jtableProduto.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro! " + e.getMessage());
        }// close catch
    }//close method

    private void jtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtSearchKeyReleased
        clean();
        filter();
    }//GEN-LAST:event_jtSearchKeyReleased

    private void jbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbUpdateActionPerformed
        clean();
        fulfillTable();
    }//GEN-LAST:event_jbUpdateActionPerformed

    private void jbUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbUpdateKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {            
            clean();
            fulfillTable();
        }
    }//GEN-LAST:event_jbUpdateKeyPressed

    private void jbChangeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbChangeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            alterarProduto();
            clean();
            fulfillTable();
        }
    }//GEN-LAST:event_jbChangeKeyPressed

    private void jbChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbChangeActionPerformed
            alterarProduto();
            clean();
            fulfillTable();
    }//GEN-LAST:event_jbChangeActionPerformed

    private void jbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeleteActionPerformed
        delete();
        clean();
        fulfillTable();
    }//GEN-LAST:event_jbDeleteActionPerformed

    private void jbDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbDeleteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            delete();
            clean();
            fulfillTable();
        }
    }//GEN-LAST:event_jbDeleteKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbChange;
    private javax.swing.JButton jbDelete;
    private javax.swing.JButton jbUpdate;
    private javax.swing.JComboBox jcFilter;
    private javax.swing.JLabel jlSearch;
    private javax.swing.JTextField jtSearch;
    private javax.swing.JTable jtableProduto;
    // End of variables declaration//GEN-END:variables
}
