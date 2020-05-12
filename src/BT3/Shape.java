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
public abstract class Shape {
    String bush, paper, frame;
    public abstract String draw();

    public Shape() {
    }
    
    
    public Shape(String bush, String paper, String frame) {
        this.bush = bush;
        this.paper = paper;
        this.frame = frame;
    }
   
}
