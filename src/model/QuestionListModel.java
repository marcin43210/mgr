/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author Pan
 */
public class QuestionListModel extends AbstractListModel{
    
    
    public QuestionListModel(){}
    
    private List<QuestionModel> pyt = null;

    @Override
    public int getSize() {
        return pyt.size();
    }

    @Override
    public Object getElementAt(int index) {
        return pyt.get(index).getContent();
    }
    
      public void setModelData(List<QuestionModel> pytania)
    {
        
        this.pyt = pytania;
    }
    
    public QuestionModel getPytanieObjectAt (int index)
    {
        
        return pyt.get(index);
    }
    
}
    

