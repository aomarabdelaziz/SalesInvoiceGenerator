/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvesinvoice.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Pumpkin
 */
public class InvoiceHeader 
{
    
    private  int InvoiceNumber;
    private  Date InvoiceDate;
    private  String CustomerName;
    private  ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int InvoiceNumber, Date InvoiceDate, String CustomerName) {
        this.InvoiceNumber = InvoiceNumber;
        this.InvoiceDate = InvoiceDate;
        this.CustomerName = CustomerName;
        
       
    }

    public String getCustomerName() {
        return CustomerName;
    }

   
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public int getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(int InvoiceNumber) {
        this.InvoiceNumber = InvoiceNumber;
    }

    public Date getInvoiceDate() {
        return InvoiceDate;
    }

    public void setInvoiceDate(Date InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }
    
    
    public ArrayList<InvoiceLine> getLines() {
        if(lines == null){
              this.lines = new ArrayList<>();
         }
         return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
        public double getInvTotal() {
        
        double total = 0.0f;
        for(InvoiceLine line : getLines()){
            total += line.getLineTotal();
        }
        return total;
    
    }
        
    public void addInvLine(InvoiceLine line){
        getLines().add(line);
    }
    
    
     @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceHeader{");
        sb.append("InvoiceNumber=").append(InvoiceNumber);
        sb.append(", InvoiceDate=").append(InvoiceDate);
        sb.append(", CustomerName=").append(CustomerName);
        sb.append('}');
        return sb.toString();
    }
    
}
