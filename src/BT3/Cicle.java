/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Administrator
 */
public class Cicle extends Shape{
    private static Cicle cicle;
    public Cicle() {
    }
     
    @Override
    public String draw() {
        
    }
     public  static Cicle createInstance()
    {
        if(cicle==null)
           cicle=new Cicle();
        return cicle;
    }

   
}
