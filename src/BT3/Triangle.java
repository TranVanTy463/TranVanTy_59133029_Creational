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
public class Triangle extends Shape{
    private static Triangle triangle;
    protected Triangle() {
    }

    @Override
    public String draw() {
        
    }
    public  static Triangle createInstance()
    {
        if(triangle==null)
            triangle=new Triangle();
        return triangle;
    }
    
}
