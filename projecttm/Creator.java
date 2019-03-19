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
public class Creator {
    
    private String CreatorName;

    public Creator(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    public String getCreatorName() {
        return CreatorName;
    }

    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }
    
    @Override
    public String toString(){
        return String.format("%s",CreatorName);
    }
    
}
