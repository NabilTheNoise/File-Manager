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
public enum Genre {
    Action("Action"), Comedy("Comedy"), Musical("Musical");
    
    private final String name;

    private Genre(String name) {
        this.name = name;
    }
    
//    public String getDataType(){
//        return name;
//    }
    @Override
     public String toString(){
         return name;
     }
    
}
