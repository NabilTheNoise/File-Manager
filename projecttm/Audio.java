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
public class Audio extends CommonData{
    
    long duration;
    Creator Artist = new Creator(null);

    public Audio(String s, String name, String description, int day, int month, int year, int day1, int month1, int year1, String address, long size, long duration, String Artist) {
        super(day, month, year);
        this.name = name;
        this.description = description;
        Date cDate = new Date(day, month, year);
        Date mDate = new Date(day1, month1, year1);
        this.cDate = cDate.toString();
        this.mDate = mDate.toString();
        this.address.setAddress(address);
        this.size = size;
        this.duration = duration;
        this.Artist.setCreatorName(Artist);
        
        if (DataFormats.valueOf(s).getDataType().equals("Audio"))
            try{
                this.format = DataFormats.valueOf(s);
            }
            catch(EnumConstantNotPresentException e){
                System.err.println(e);
            }
        
    }
   
}
