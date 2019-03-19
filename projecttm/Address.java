/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttm;

import com.sun.corba.se.impl.protocol.AddressingDispositionException;

/**
 *
 * @author Dragon
 */
public class Address {
    private String address;
    
    public Address(String address){
        try{
            this.address = address;
        }
        catch(AddressingDispositionException e){
            System.out.println(e);
            System.out.println("Address does not exists.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        try{
        this.address = address;
        }
        catch(AddressingDispositionException e){
            System.out.println(e);
            System.out.println("Address does not exists.");
        }
    }
    
    
    
}
