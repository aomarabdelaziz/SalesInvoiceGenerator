
import com.salvesinvoice.model.InvoiceLine;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pumpkin
 */
public class InvoiceLineTableModel extends DefaultTableModel
{
 
      public ArrayList<InvoiceLine> myInvoiceLine;
      private static String[] columnNames = {"No" , "ItemName" , "ItemPrice" , "Count" , "Total"};


    public InvoiceLineTableModel(ArrayList<InvoiceLine> myInvoiceLine) {
        this.myInvoiceLine = myInvoiceLine;
    }
    
    @Override
    public int getRowCount() {
          int size;
      if (myInvoiceLine == null) {
         size = 0;
      }
      else {

         size = myInvoiceLine.size();

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
        if (columnIndex == 2 || columnIndex == 4)
        {
             return Double.class;
        }
        return String.class;
    }
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
       return true;
    }
    
        @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Object temp = null;
      if (columnIndex == 0) {
         temp = myInvoiceLine.get(rowIndex).getHeader().getInvoiceNumber();
      }
      else if (columnIndex == 1) {
            temp = myInvoiceLine.get(rowIndex).getItemName();
      }
      else if (columnIndex == 2) {
         temp = myInvoiceLine.get(rowIndex).getItemPrice();
      }
        else if (columnIndex == 3) {
         temp = myInvoiceLine.get(rowIndex).getItemCount();
      }
       else if (columnIndex == 4) {
         temp = myInvoiceLine.get(rowIndex).getLineTotal();
      }
      return temp;
        
    }
    
     @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

     
    
}
