/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvesinvoice.model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pumpkin
 */
public class InvoiceHeaderTableModel extends DefaultTableModel
{
    public static  ArrayList<InvoiceHeader> myHeaderList;
    private static String[] columnNames = {"ID" , "Date" , "Customer" , "Total"};


    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> list) {
        this.myHeaderList = list;
    }
    

    public static  ArrayList<InvoiceHeader> getInvoicesList()
    {
        
        return myHeaderList;
        
    }
    
    @Override
    public int getRowCount() {
         
      int size;
      if (myHeaderList == null) {
         size = 0;
      }
      else {
         size = myHeaderList.size();
      }
      return size;
    }
    
    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
        @Override
    public String getColumnName(int columnIndex) {
       return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
       if (columnIndex == 0 || columnIndex == 3)
        {
         return Integer.class;
        }
        return String.class;
    }
    
      @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 2)
        {
            return true;
        }
     return false;
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Object temp = null;
      if (columnIndex == 0) {
         temp = myHeaderList.get(rowIndex).getInvoiceNumber();
      }
      else if (columnIndex == 1) {
         temp = myHeaderList.get(rowIndex).getInvoiceDate();
      }
      else if (columnIndex == 2) {
         temp = myHeaderList.get(rowIndex).getCustomerName();
      }
        else if (columnIndex == 3) {
         temp = myHeaderList.get(rowIndex).getInvTotal();
      }
      
      return temp;
    }
    
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) 
    {
       
          if(columnIndex == 2)
          {
             myHeaderList.get(rowIndex).setCustomerName((String)aValue);
          }
           
    }
    
}
