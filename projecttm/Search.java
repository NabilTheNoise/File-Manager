/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttm;

import java.util.Vector;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Dragon
 */
public class Search {
    public static Vector<String> ByName(String name1){
        Vector<String> Details = new Vector<>();
        
        Filer.Open();
        
        String Search1;
        while(Filer.writer.hasNext()){
            String format;
            format = Filer.writer.next(); 
            
            
            if (DataFormats.valueOf(format).getDataType().equals("Image")){
                    String name = Filer.writer.next();
                    String discription = Filer.writer.next();
                    String cDate = Filer.writer.next();
                    String mDate = Filer.writer.next();
                    String size = Filer.writer.next();
                    String dimention = Filer.writer.next();
                    String address = Filer.writer.next();
                    

                    Search1 = String.format("Format:%s Name:%s Des.:%s cDate:%s mDate:%s Size:%sBytes Dimentions:%s Address:%s",format,name,discription,cDate,mDate,size,dimention, address);
                    Details.add(Search1);
                    
                    
                    
                }
            if (DataFormats.valueOf(format).getDataType().equals("Audio")){
                
                    String name = Filer.writer.next();
                    String discription = Filer.writer.next();
                    String cDate = Filer.writer.next();
                    String mDate = Filer.writer.next();
                    String size = Filer.writer.next();
                    String duration = Filer.writer.next();
                    String artist = Filer.writer.next();
                    String address = Filer.writer.next();
                    

                    Search1 = String.format("Format:%s Name:%s Des.:%s cDate:%s mDate:%s Size:%s Duration:%ssec Artist:%s Address%s",format,name,discription,cDate,mDate,size,duration, artist, address);
                    Details.add(Search1);
                }
            if (DataFormats.valueOf(format).getDataType().equals("Ebook")){
                    String name = Filer.writer.next();
                    String discription = Filer.writer.next();
                    String cDate = Filer.writer.next();
                    String mDate = Filer.writer.next();
                    String size = Filer.writer.next();
                    String Pages = Filer.writer.next();
                    String Author = Filer.writer.next();
                    String Domain = Filer.writer.next();
                    String address = Filer.writer.next();

                    Search1 = String.format("Format:%s Name:%s Des.:%s cDate:%s mDate:%s Size:%sByte Pages:%s Author%s Domain:%s Address:%s",format,name,discription,cDate,mDate,size, Pages, Author, Domain, address);
                    Details.add(Search1);
                }
            else if (DataFormats.valueOf(format).getDataType().equals("Video")){
                    String name = Filer.writer.next();
                    String discription = Filer.writer.next();
                    String cDate = Filer.writer.next();
                    String mDate = Filer.writer.next();
                    String size = Filer.writer.next();
                    String duration = Filer.writer.next();
                    String genre = Filer.writer.next();
                    String fRate = Filer.writer.next();
                    String address = Filer.writer.next();

                    Search1 = String.format("%s %s %s %s %s Genre:%s fRate:%s Address:%s",format,name,discription,cDate,mDate,size,duration, genre, fRate, address);
                    Details.add(Search1);
                }
            
        }
        
        
        
        
       Filer.CloseW();
       return Details;    
    }
}
