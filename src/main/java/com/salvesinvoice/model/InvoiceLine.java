/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salvesinvoice.model;

/**
 *
 * @author Pumpkin
 */
public class InvoiceLine 
{
    private String ItemName;
    private double ItemPrice;
    private int ItemCount;
    private InvoiceHeader header;

    public InvoiceLine(String ItemName, double ItemPrice, int ItemCount, InvoiceHeader header) {
        this.ItemName = ItemName;
        this.ItemPrice = ItemPrice;
        this.ItemCount = ItemCount;
        this.header = header;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getItemPrice() {
        return ItemPrice;
    }

    public void setItemPrice(double ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int ItemCount) {
        this.ItemCount = ItemCount;
    }
    
    public double getLineTotal(){
        return ItemCount * ItemPrice;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvoiceLine{");
        sb.append("ItemName=").append(ItemName);
        sb.append(", ItemPrice=").append(ItemPrice);
        sb.append(", ItemCount=").append(ItemCount);
        sb.append(", header=").append(header);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
