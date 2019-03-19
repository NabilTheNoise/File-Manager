/*






@@@Created by: N.H & M.masoomi@@@



<<<<<<<<<<<<<<<<<<<<<<<<<<<<      !!!         Attention      !!!        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
||>   for having somthin in the datebase, manually i added 2 files, a photo and an audio.
||>  this is for the first time. so after one run of the project, please comment these lines:
||>
||>
||>    @Line 56 (class : main) >>   Photo photo1 = new Photo("_jpg","bname","des", 7, 11, 2017,7, 11, 2017, "C:\\Users\\", 260, 258, 258);
||>    @Line 57 (class : main) >>   Audio audio1 = new Audio("_flac", "aname", "des", 7, 11, 2017, 7, 11, 2017, "C:\\", 2602, 1500, "Nabil");
||>    @Line 62 (class : main) >>   Filer.Write(photo1.format.toString(), photo1.name, photo1.description, photo1.cDate, photo1.mDate, photo1.size, photo1.dimention.toString(), photo1.address.getAddress(),"","");
||>    @Line 63 (class : main) >>   Filer.Write(audio1.format.toString(), audio1.name, audio1.description, audio1.cDate, audio1.mDate, audio1.size, String.format("%d",audio1.duration), audio1.Artist.getCreatorName(), audio1.address.getAddress(),"");
||>
<<<<<<<<<<<<<<<<<<<<<<<<<<<<      !!!        Thanks        !!!        >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

*/



package projecttm;

import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Formatter;
import javax.swing.JOptionPane;


public class ProjectTM {

    
    public static void main(String[] args) {
       
        String DB = "";
        try{
            Filer.Open();
            while(Filer.writer.hasNext()){
                DB+= Filer.writer.nextLine();
            }
        }
        catch(NullPointerException e){
            
            JOptionPane.showMessageDialog(null, "Database Created Successfully", "Database", 1);
        }
        
        Filer.New();
        Formatter formatK = Filer.myfile.format(DB);
       
        Photo photo1 = new Photo("_jpg","bname","des", 7, 11, 2017,7, 11, 2017, "C:\\Users\\", 260, 258, 258);
        Audio audio1 = new Audio("_flac", "aname", "des", 7, 11, 2017, 7, 11, 2017, "C:\\", 2602, 1500, "Nabil");
        
        
        NewJFrame FileManager = new NewJFrame();
        FileManager.setVisible(true);
        Filer.Write(photo1.format.toString(), photo1.name, photo1.description, photo1.cDate, photo1.mDate, photo1.size, photo1.dimention.toString(), photo1.address.getAddress(),"","");
        Filer.Write(audio1.format.toString(), audio1.name, audio1.description, audio1.cDate, audio1.mDate, audio1.size, String.format("%d",audio1.duration), audio1.Artist.getCreatorName(), audio1.address.getAddress(),"");
        Filer.Close();
        
    
    
    
    }
    
}
