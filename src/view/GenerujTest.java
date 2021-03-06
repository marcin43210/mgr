/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import App.MainDb;
import static com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler.BUFFER_SIZE;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.SwingUtilities.isLeftMouseButton;
import model.CategoryListModel;
import model.CategoryModel;
import model.QuestionListModel;
import model.QuestionModel;
import org.apache.commons.net.ftp.FTPClient;



/**
 *
 * @author Pan
 */
public class GenerujTest extends javax.swing.JPanel {
    MainDb db = new MainDb();
     private ArrayList<CategoryModel> kategorieMap = new ArrayList<CategoryModel>();
     private List<QuestionModel> questionsList = new ArrayList<QuestionModel>();
     private List<QuestionModel> wybranepytania = new ArrayList<QuestionModel>();
    /**
     * Creates new form GenerujTest
     */
    public GenerujTest() {
        initComponents();
        setKategorieList();       
        model.setModelData(kategorieMap);
        kategorieList.setModel(model);
    }
    
    
  private CategoryListModel model = new CategoryListModel();
  private QuestionListModel questionModel = new QuestionListModel();
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
     
     public void setQuestionList(long idCategory)
     {
         questionsList.clear();
          try{
              String query = "SELECT * from question q "
                      + "JOIN question2category q2c ON q2c.id_question = q.id "
                      + "WHERE q2c.id_category = " + idCategory;

            ResultSet result = db.query(query);
            while(result.next())
             {
                 QuestionModel question = new QuestionModel();
                 question.setId(result.getLong("id"));
                 question.setContent(result.getString("content"));
                 question.setOdp1(result.getString("odpowiedz_1"));
                 question.setOdp2(result.getString("odpowiedz_2"));
                 question.setOdp3(result.getString("odpowiedz_3"));
                 question.setOdp4(result.getString("odpowiedz_4"));
                 questionsList.add(question);
             }
         }catch(SQLException e){e.printStackTrace();}
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setQuetions = new javax.swing.JButton();
        generateTest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        kategorieList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        questionList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setMinimumSize(new java.awt.Dimension(500, 100));
        setPreferredSize(new java.awt.Dimension(500, 397));

        setQuetions.setText("Wybierz pytania");
        setQuetions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setQuetionsActionPerformed(evt);
            }
        });

        generateTest.setText("Generuj testy");
        generateTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTestActionPerformed(evt);
            }
        });

        kategorieList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategorieListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(kategorieList);

        jScrollPane2.setViewportView(questionList);

        jScrollPane3.setViewportView(jList2);

        jButton1.setText("Wyczyść pytania");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(generateTest)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(setQuetions)
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateTest)
                    .addComponent(setQuetions)
                    .addComponent(jButton1))
                .addGap(396, 396, 396))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void kategorieListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategorieListMouseClicked
        // TODO add your handling code here:
       if(isLeftMouseButton(evt)){
        setQuestionList(kategorieMap.get(kategorieList.getSelectedIndex()).getId());       
        questionModel.setModelData(questionsList);
        questionList.setModel(questionModel);
        questionList.updateUI();
       }
           
    }//GEN-LAST:event_kategorieListMouseClicked
QuestionListModel wybranePytaniaModel = new QuestionListModel();
    private void setQuetionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setQuetionsActionPerformed
        // TODO add your handling code here:
        
        int tab[] = questionList.getSelectedIndices();
        for(int i = 0; i<tab.length; i++)
        {
            wybranepytania.add(questionsList.get(tab[i]));
        }
        wybranePytaniaModel.setModelData(wybranepytania);
        jList2.setModel(wybranePytaniaModel);
        jList2.updateUI();
       
        
    }//GEN-LAST:event_setQuetionsActionPerformed

    private void generateTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTestActionPerformed
        // TODO add your handling code here:
        generuj();

    }//GEN-LAST:event_generateTestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        wybranepytania.clear();
                wybranePytaniaModel.setModelData(wybranepytania);
        jList2.setModel(wybranePytaniaModel);
        jList2.updateUI();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generuj()
    {
        String html = "<html>\n" +
            "<head>\n" +
            "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n" +
            "<title>Test wiedzy</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<center>\n" +
            "\n" +
            "<table><tr><td width=\"800\">\n" +
            
            "<fieldset><legend>Zaznacz tylko jedną odpowiedź do każdego pytania - jest to test jednokrotnego wyboru.</legend>\n"; 
            
         for(int i = 0; i < wybranepytania.size(); i ++)
         {
             
            html+= "<form target=\"_blank\" action=\"karta_2.php\" method=\"post\">\n";
            html += "<p><b>" + wybranepytania.get(i).getContent() + "</b></p><input type=\"hidden\" name=\"id_pytania\" value=\""+ wybranepytania.get(i).getId() + "\" />";
            List <String> odpowiedzi = new ArrayList<String>();
            odpowiedzi.add(wybranepytania.get(i).getOdp1());
            odpowiedzi.add(wybranepytania.get(i).getOdp2());
            odpowiedzi.add(wybranepytania.get(i).getOdp3());
            odpowiedzi.add(wybranepytania.get(i).getOdp4());
            Random generator = new Random();
            List list = Arrays.asList(odpowiedzi);
            //for(int y = 0; i<odpowiedzi.size(); y++)
            System.out.println("przed shufle ");
                 for(Object str: (list)){
            System.out.println(str.toString());
        }
            Collections.shuffle(list);
            System.out.println("po shufle ");
            for(Object str: list){
            System.out.println(str.toString());
        }
                
            for(int x=0; x<odpowiedzi.size(); x++){
            html += "<input type=\"checkbox\" name=\"odp[]\" value=\"" + list.get(x).toString() +"\"/>" + wybranepytania.get(i).getOdp1() + "<br>";
            //html += "<input type=\"checkbox\" name=\"odp[]\" value=\"" + wybranepytania.get(i).getOdp2() +"\"/>" + wybranepytania.get(i).getOdp2() + "<br>";
            //html += "<input type=\"checkbox\" name=\"odp[]\" value=\"" + wybranepytania.get(i).getOdp3() +"\"/>" + wybranepytania.get(i).getOdp3() + "<br>";
            //html += "<input type=\"checkbox\" name=\"odp[]\" value=\"" + wybranepytania.get(i).getOdp4() +"\"/>" + wybranepytania.get(i).getOdp4() + "<br>";
            html += "<input type=\"submit\" name=\"submit\" value=\"Sprawdź odpowiedź\"/></form>";
            }
         }
         html+= "</div>\n" +
            
            "\n" +
            "</td></tr></table>\n" +
            "</center>\n" +
            "</body>\n" +
            "</html>";
         
        FileWriter fWriter = null;
        BufferedWriter writer = null;
            try {
            fWriter = new FileWriter("index.html");
            writer = new BufferedWriter(fWriter);
            
            writer.write(html);
            
            writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
            writer.close(); //make sure you close the writer object 
        } catch (Exception e) {
          e.printStackTrace();
        }
           // sendfile();
           
            
            
    }
    
    
    private void sendfile()
    {
          
       FTPClient client = new FTPClient();
        FileInputStream fis = null;

        try {
            client.connect("ftp.serwer1749827.home.pl");
            client.login("serwer", "serwer123456");

            //
            // Create an InputStream of the file to be uploaded
            //
            client.removeDirectory("index.html");
            String filename = "index.html";
            fis = new FileInputStream(filename);

            //
            // Store file to server
            //
            client.storeFile(filename, fis);
            client.logout();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                client.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateTest;
    private javax.swing.JButton jButton1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> kategorieList;
    private javax.swing.JList<String> questionList;
    private javax.swing.JButton setQuetions;
    // End of variables declaration//GEN-END:variables
}
