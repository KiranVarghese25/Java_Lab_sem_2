/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;
import java.util.logging.Logger;
import java.util.logging.Level;
/**
 *
 * @author kiran
 */
public class Mavenproject4 {

    public static void main(String[] args) {
       try{
           Class.forName("com.mycompany.mavenproject4.kiran");
              
       }catch(ClassNotFoundException ex){
           Logger.getLogger(Mavenproject4.class.getName()).log(Level.SEVERE,null,ex);
       }
    }
}

class kiran{
    static{
        System.out.println("Static block");
    }
    {
        System.out.println("Instance Block");
    }
}