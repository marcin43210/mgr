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
public class CategoryListModel extends AbstractListModel{
    
    public CategoryListModel(){}
    
    private List<CategoryModel> kategorie = null;

    @Override
    public int getSize() {
        return kategorie.size();
    }

    @Override
    public Object getElementAt(int index) {
        return kategorie.get(index).getName();
    }
    
      public void setModelData(List<CategoryModel> cat)
    {
        //kategorie.clear();
        this.kategorie = cat;
    }
    
    public CategoryModel getKategoriaObjectAt (int index)
    {
        
        return kategorie.get(index);
    }
    
}
