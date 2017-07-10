/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import App.MainDb;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import static javax.swing.SwingUtilities.isLeftMouseButton;
import model.CategoryListModel;
import model.CategoryModel;
import model.CategoryTableModel;
import presenter.Presenter;


/**
 *
 * @author Pan
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
   MainDb db = new MainDb();
   private ArrayList<CategoryModel> kategorieMap = new ArrayList<CategoryModel>();
  private CategoryListModel model = new CategoryListModel();
     public void setKategorieList()
     {
         try{
            ResultSet result = db.query("SELECT * FROM category order by id;");
            while(result.next())
             {
                 CategoryModel kategoria = new CategoryModel();
                 kategoria.setId(result.getLong("id"));
                 kategoria.setName(result.getString("name"));
                 kategorieMap.add(kategoria);
             }
         }catch(SQLException e){e.printStackTrace();}
     }
    
    public MainWindow() {
        
        initComponents();
        setKategorieList();       
        model.setModelData(kategorieMap);
        kategorieList.setModel(model);    

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        test = new javax.swing.JPanel();
        sprawdzanie = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        kategorieLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        trescTf = new javax.swing.JTextField();
        odpowiedz1Label = new javax.swing.JLabel();
        odpowiedz1Tf = new javax.swing.JTextField();
        odpowiedz2Label = new javax.swing.JLabel();
        odpowiedz2Tf = new javax.swing.JTextField();
        odpowiedz3Label = new javax.swing.JLabel();
        odpowiedz3Tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        odpowiedz4Tf = new javax.swing.JTextField();
        kategoriaCB = new javax.swing.JComboBox<>();
        saveKategoria = new javax.swing.JButton();
        editKategoriaTf = new javax.swing.JTextField();
        deleteKategoria = new javax.swing.JButton();
        saveQuestion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kategorieList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout testLayout = new javax.swing.GroupLayout(test);
        test.setLayout(testLayout);
        testLayout.setHorizontalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        testLayout.setVerticalGroup(
            testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        GenerujTest test = new GenerujTest();

        jTabbedPane1.addTab("Generuj test", test);

        javax.swing.GroupLayout sprawdzanieLayout = new javax.swing.GroupLayout(sprawdzanie);
        sprawdzanie.setLayout(sprawdzanieLayout);
        sprawdzanieLayout.setHorizontalGroup(
            sprawdzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 784, Short.MAX_VALUE)
        );
        sprawdzanieLayout.setVerticalGroup(
            sprawdzanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        Sprawdzanie sprawdzanie = new Sprawdzanie();

        jTabbedPane1.addTab("Sprawdź testy", sprawdzanie);

        kategorieLabel.setText("Kategorie");

        jLabel1.setText("Pytania");

        jLabel2.setText("Treść pytania:");

        odpowiedz1Label.setText("Odpowiedź 1 (poprawna)");

        odpowiedz1Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odpowiedz1TfActionPerformed(evt);
            }
        });

        odpowiedz2Label.setText("Odpowiedź 2");

        odpowiedz3Label.setText("Odpowiedź 3");

        jLabel3.setText("Odpowiedź 4");

        odpowiedz4Tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odpowiedz4TfActionPerformed(evt);
            }
        });

        saveKategoria.setText("Zapisz kategorie");
        saveKategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKategoriaActionPerformed(evt);
            }
        });

        editKategoriaTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editKategoriaTfActionPerformed(evt);
            }
        });

        deleteKategoria.setText("Usuń kategorię");
        deleteKategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteKategoriaActionPerformed(evt);
            }
        });

        saveQuestion.setText("Zapisz pytanie");

        kategorieList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategorieListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kategorieList);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kategorieLabel)
                .addGap(161, 161, 161))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(odpowiedz3Label)
                                .addComponent(odpowiedz2Label)
                                .addComponent(odpowiedz1Label)
                                .addComponent(trescTf, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(odpowiedz1Tf)
                                .addComponent(odpowiedz2Tf)
                                .addComponent(odpowiedz3Tf)
                                .addComponent(odpowiedz4Tf))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kategoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editKategoriaTf)
                            .addComponent(deleteKategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveKategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kategorieLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trescTf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odpowiedz1Label)
                        .addGap(11, 11, 11)
                        .addComponent(odpowiedz1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(odpowiedz2Label))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(odpowiedz2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(odpowiedz3Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odpowiedz3Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(editKategoriaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(deleteKategoria)
                        .addGap(18, 18, 18)
                        .addComponent(saveKategoria))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odpowiedz4Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kategoriaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(saveQuestion)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pytania i kategorie", jPanel4);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odpowiedz1TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odpowiedz1TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odpowiedz1TfActionPerformed

    private void odpowiedz4TfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odpowiedz4TfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_odpowiedz4TfActionPerformed

    private void editKategoriaTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editKategoriaTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editKategoriaTfActionPerformed

    private void kategorieListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategorieListMouseClicked
        // TODO add your handling code here:
        if(isLeftMouseButton(evt))
        editKategoriaTf.setText(kategorieMap.get(kategorieList.getSelectedIndex()).getName());
        else
            kategorieList.clearSelection();
        
    }//GEN-LAST:event_kategorieListMouseClicked

    private void saveKategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKategoriaActionPerformed
        // TODO add your handling code here:
        
        String newName = editKategoriaTf.getText();     
        if(kategorieList.getSelectedIndex() != -1)
        {
            long catId = kategorieMap.get(kategorieList.getSelectedIndex()).getId();
            db.updateQuery("UPDATE category SET name = '" + newName + "'WHERE id = " + catId +";");
        }else
            db.updateQuery("INSERT INTO category(id, name) VALUES (default, '" + newName + "');");
        
        refreshCategoryList();
        
  
    }//GEN-LAST:event_saveKategoriaActionPerformed

    private void deleteKategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteKategoriaActionPerformed
        // TODO add your handling code here:
        
        long catId = kategorieMap.get(kategorieList.getSelectedIndex()).getId();
        db.updateQuery("DELETE FROM category WHERE id = " + catId +";");
        refreshCategoryList();         
    }//GEN-LAST:event_deleteKategoriaActionPerformed

    private void refreshCategoryList()
    {
    kategorieMap.removeAll(kategorieMap);
        setKategorieList();
         model.setModelData(kategorieMap);
        kategorieList.setModel(model);
        kategorieList.updateUI();
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteKategoria;
    private javax.swing.JTextField editKategoriaTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> kategoriaCB;
    private javax.swing.JLabel kategorieLabel;
    private javax.swing.JList<String> kategorieList;
    private javax.swing.JLabel odpowiedz1Label;
    private javax.swing.JTextField odpowiedz1Tf;
    private javax.swing.JLabel odpowiedz2Label;
    private javax.swing.JTextField odpowiedz2Tf;
    private javax.swing.JLabel odpowiedz3Label;
    private javax.swing.JTextField odpowiedz3Tf;
    private javax.swing.JTextField odpowiedz4Tf;
    private javax.swing.JButton saveKategoria;
    private javax.swing.JButton saveQuestion;
    private javax.swing.JPanel sprawdzanie;
    private javax.swing.JPanel test;
    private javax.swing.JTextField trescTf;
    // End of variables declaration//GEN-END:variables
}
