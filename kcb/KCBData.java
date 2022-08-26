package kcb;

import javax.swing.event.TableModelListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class KCBData implements TableModel {
    private String[] title = {
        "Mon","Tues","Wed","Thurs","Fri","Satur","Sun"

    };

    private String[][] data  = new String[8][7];
    public KCBData() {
        for( int i=0; i<data.length; i++){
            for( int j=0; j<data[i].length; j++){
                data[i][j] = "";
            }
        }
    }


    public void addTableModelListener(TableModelListener arg0){

    }

    public Class<?> getColumnClass(int arg0) {
        return String.class;
    }

    public int getColumnCount(){
        return 7;
    }

    public String getColumnName(int arg0){
        return title[arg0];
    }

    public int getRowCount() {
        return 8;
    }

    public Object getValueAt(int arg0, int arg1){
        return data[arg0][arg1];
    }

    public boolean isCellEditable(int arg0,int arg1){
        return true;
    }

    public void removeTableModelListener(TableModelListener arg0){

    }

    public void setValueAt(Object arg0, int arg1, int arg2){
        data[arg1][arg2] = (String)arg0;
    }
}