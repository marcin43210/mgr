/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dell
 */
public class CategoryTableModel extends AbstractTableModel{
    
    public CategoryTableModel(){}
    
    private List<CategoryModel> kategorie = null;
    private final static Object[] columnNames = {"Id", "Nazwa"};

    @Override
    public int getRowCount() {
        if(kategorie == null) return 0;
        return kategorie.size();
    }

      @Override
    public String getColumnName(int column) {
        return columnNames[column].toString();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        CategoryModel kategoria = (CategoryModel) kategorie.get(rowIndex);
        switch(columnIndex){
            case 0:
                return kategoria.getId();
            case 1:
                return kategoria.getName();
            default:
        return kategoria;}
    }
    public CategoryModel getValueAt(int rowIndex)
    {
        return kategorie.get(rowIndex);
        
    }
 
    
    public void setModelData(List<CategoryModel> cat)
    {
        this.kategorie = cat;
    }
    
}
