
package projecttm;
import java.util.Collections;
import java.util.Vector;

public class Sort {
    
    public static Vector<String> ShowAll(){
        
        Vector<String> Details = new Vector<>();
        
        Filer.Open();
        String unSort1;
        while(Filer.writer.hasNext()){


            String format;
            format = Filer.writer.next(); 
            //System.out.println(format);
            
            if (DataFormats.valueOf(format).getDataType().equals("Image")){
                    String name = Filer.writer.next();
                    String discription = Filer.writer.next();
                    String cDate = Filer.writer.next();
                    String mDate = Filer.writer.next();
                    String size = Filer.writer.next();
                    String dimention = Filer.writer.next();
                    String address = Filer.writer.next();
                    

                    unSort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Dimentions:%s Address:%s%s.%s",name,discription,cDate,mDate,size,dimention, address, name, format);
                    Details.add(unSort1);
                    
                    
                    
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
                    

                    unSort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Duration:%ssec Artist:%s Address%s%s.%s",name,discription,cDate,mDate,size,duration, artist, address, name, format);
                    Details.add(unSort1);
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

                    unSort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Pages:%s Author:%s Domain:%s Address:%s%s.%s",name,discription,cDate,mDate,size, Pages, Author, Domain, address, name, format);
                    Details.add(unSort1);
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

                    unSort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Duration:%s Genre:%s fRate:%s Address:%s%s.%s",name,discription,cDate,mDate,size,duration, genre, fRate, address, name, format);
                    Details.add(unSort1);
                }  
        }
       Filer.CloseW();
       return Details;   
    }
   
    public static Vector<String> ByName(){
        Vector<String> Sorted = new Vector<>();
        Vector<String> Details = new Vector<>();
        
        Filer.Open();
        String Sort1;
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
                    

                    Sort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Dimentions:%s Address:%s%s.%s",name,discription,cDate,mDate,size,dimention, address, name, format);
                    Details.add(Sort1);
                    
                    
                    
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
                    

                    Sort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Duration:%ssec Artist:%s Address%s%s.%s",name,discription,cDate,mDate,size,duration, artist, address, name, format);
                    Details.add(Sort1);
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

                    Sort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Pages:%s Author:%s Domain:%s Address:%s%s.%s",name,discription,cDate,mDate,size, Pages, Author, Domain, address, name, format);
                    Details.add(Sort1);
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

                    Sort1 = String.format("%s Des.:%s cDate:%s mDate:%s Size:%sBytes Duration:%s Genre:%s fRate:%s Address:%s%s.%s",name,discription,cDate,mDate,size,duration, genre, fRate, address, name, format);
                    Details.add(Sort1);
                }
            
        }
        
        
        Collections.sort(Details);
        
        
        for(int j = 0; j<Details.size(); j++){
            String Sort = String.format("%s\n", Details.get(j));
            Sorted.add(Sort);
            
        }
        
        
       Filer.CloseW();
       return Sorted;   
    }    
}
