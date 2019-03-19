/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttm;

/**
 *
 * @author Dragon
 */
public class Ebook extends CommonData{
    
    public short Pages;
    public Creator AuthorName;
    public String domain;
    
    public Ebook(String s, String name, String description, int day, int month, int year, int day1, int month1, int year1, String address, long size, short pages, Creator AuthorName, String domain) {
        super(day, month, year);
        this.name = name;
        this.description = description;
        Date cDate = new Date(day, month, year);
        Date mDate = new Date(day1, month1, year1);
        this.mDate = mDate.toString();
        this.cDate = cDate.toString();
        this.address.setAddress(address);
        this.size = size;
        this.Pages = pages;
        this.AuthorName = AuthorName;
        this.domain = domain;
        if (DataFormats.valueOf(s).getDataType().equals("Image"))
            try{
                this.format = DataFormats.valueOf(s);
            }
            catch(EnumConstantNotPresentException e){
                System.err.println(e);
                return;
            }
    }
}
