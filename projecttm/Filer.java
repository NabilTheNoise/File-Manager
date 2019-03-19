/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttm;
//import java.nio.*;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Dragon
 */
public class Filer {
    public static Formatter myfile;
    public static Scanner writer;
    
    
    
    
    public static void New(){
        try{
            myfile = new Formatter("C:\\Users\\Public\\Documents\\DB.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("you got an error!");
        }   
    }
    
    
    public static void Write(String type, String name, String discription, String cDate, String mDate, long size, String a, String b, String c, String d){
        if (DataFormats.valueOf(type).getDataType().equals("Image")){
            String format = DataFormats.valueOf(type).toString();
            myfile.format("%s %s %s %s %s %d %s %s \n", format, name, discription, cDate, mDate, size, a, b );
        
        }
            
        if (DataFormats.valueOf(type).getDataType().equals("Audio")){
            String format = DataFormats.valueOf(type).toString();
            myfile.format("%s %s %s %s %s %d %s %s %s \n", format, name, discription, cDate, mDate, size, a, b, c);
            
        }
            
        if (DataFormats.valueOf(type).getDataType().equals("Document")){
            String format = DataFormats.valueOf(type).toString();
            myfile.format("%s %s %s %s %s %d %s %s %s %s \n", format, name, discription, cDate, mDate, size, a, b, c, d);
            
        }
        
        if (DataFormats.valueOf(type).getDataType().equals("Video")){
            String format = DataFormats.valueOf(type).toString();
            myfile.format("%s %s %s %s %s %d %s %s %s %s \n", format, name, discription, cDate, mDate, size, a, b, c, d);
            
        }
            
    }
    
    
    public static void Close(){
        myfile.close();    
    }
    
    
    public static void Open(){
        try{
            writer = new Scanner(new File("C:\\Users\\Public\\Documents\\DB.txt"));
            //myfile = new Formatter("C:\\Users\\Public\\Documents\\DB.txt");
        }
        catch(Exception e){
            System.out.println("Creating Database");
            //New();
        }
    }
    
    
    public static Vector<String> Read(){
        Vector<String> ReadFile = new Vector<>();
        while(writer.hasNext()){
            String format;
            format = writer.next();
            //System.out.println(format);
            
            if (DataFormats.valueOf(format).getDataType().equals("Image")){
                    String name = writer.next();
                    String discription = writer.next();
                    String cDate = writer.next();
                    String mDate = writer.next();
                    String size = writer.next();
                    String dimention = writer.next();
                    String address = writer.next();
                    //writer.next();
                    
                    

                    String Read = String.format("%s %s %s %s %s %s %s %s %n",format,name,discription,cDate,mDate,size,dimention, address);
                    ReadFile.add(Read);
                }
            if (DataFormats.valueOf(format).getDataType().equals("Audio")){
                //System.out.println("ok");
                    String name = writer.next();
                    String discription = writer.next();
                    String cDate = writer.next();
                    String mDate = writer.next();
                    String size = writer.next();
                    String duration = writer.next();
                    String artist = writer.next();
                    String address = writer.next();
                    //writer.next();

                   String Read = String.format("%s %s %s %s %s %s %s %s %s %n",format,name,discription,cDate,mDate,size,duration, artist, address);
                   ReadFile.add(Read);
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

                    String Read = String.format("%s %s %s %s %s %s %s %s %s %s",format, name,discription,cDate,mDate,size, Pages, Author, Domain, address);
                    ReadFile.add(Read);
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

                    String Read = String.format("%s %s %s %s %s %s %s %s %s %s",format, name,discription,cDate,mDate,size,duration, genre, fRate, address);
                    ReadFile.add(Read);
                }  
            
                
            
        }
        
        return ReadFile;
        
    }
    
    
    public static void CloseW(){
        writer.close();
    }
}
