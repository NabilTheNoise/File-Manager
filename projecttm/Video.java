/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttm;
import projecttm.Genre;
/**
 *
 * @author Dragon
 */
public class Video extends CommonData {
    
    public long duration;
    public Genre genre;
    public int fRate;
    

    public Video(String s, String name, String description, int day, int month, int year, int day1, int month1, int year1,String address, long size, long duration, String genre, int fRate) {
        super(day, month, year);
        this.name = name;
        this.description = description;
        Date cDate = new Date(day, month, year);
        Date mDate = new Date(day1, month1, year1);
        this.mDate = mDate.toString();
        this.cDate = cDate.toString();
        this.address.setAddress(address);
        this.size = size;
        this.duration = duration;
        this.fRate = fRate;
        
        try{
            this.genre = Genre.valueOf(genre);
        }
        catch(EnumConstantNotPresentException e){
            System.err.println(e);
            return;
        }
                
        if (DataFormats.valueOf(s).getDataType().equals("Video"))
            try{
                this.format = DataFormats.valueOf(s);
            }
            catch(EnumConstantNotPresentException e){
                System.err.println(e);
            }
        
        
    }
   
}
