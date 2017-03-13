/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amy
 */

//class Box demonstrates overloading a method buildBox 
//Box buildBox(int, int, int, int)
//Box buildBox(Point, Point)
//Box buildBox(Point, int, int)

import java.awt.Point;

  public class Box {
    
    
    int x1;
    int y1;
    int x2;
    int y2;
    
    //The default Box constructor sets all corners to 0;
    Box(){
       x1 = 0;
       y1 = 0;
       x2 = 0;
       y2 = 0;
    }
    
    Box(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }  
      
    Box(Point topLeft, Point bottomRight) {
            x1 = topLeft.x;
            y1 = topLeft.y;
            x2 = bottomRight.x;
            y2 = bottomRight.y;
        }
        
    Box(Point topLeft, int w, int h) {
            x1 = topLeft.x;
            y1 = topLeft.y;
            x2 = x1 + w;
            y2 = y1 + h;
        }
    
    
    
    
    
    Box buildBox(int x1, int y1, int x2, int y2)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        
        return this;
    }
    
    
    
    
    
    
    
    Box buildBox(Point topLeft, Point bottomRight)
    {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        
        return this;
    }
    
    Box buildBox(Point topLeft, int w, int h)
    {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = (x1 + w);
        y2 = (y1 + h);
        
        return this;
    }
    
    void printBox()
    {
        System.out.print("Box: <" + x1 + " , " +  y1 + " , " + x2 + " , "+ y2);
        
    }
    
    public static void main(String[] arguments)
    {
        Box rect = new Box();
        
        System.out.println("Calling buildBox with coordinates " + "(25,25) and (50,50) passing four int parameters");
        rect.buildBox(25,25,50,50);
        rect.printBox();
        
        System.out.println("\n Calling buildBox with points (10,10,and (20,20)");
        rect.buildBox(new Point (10,10), new Point(20,20));
        rect.printBox();
        
        System.out.println("\nCalling buildBox with 1 point (10,10), width 50, and height 50");
        rect.buildBox(new Point (10,10), 50, 50);
        rect.printBox();
        
        
        Box rect2;
            
                       
            System.out.println("Calling Box with coordinates (10,10) and (20,20) passing two Point parameters");
            rect2 = new Box(new Point(10,10),new Point(20,20));
            rect2.printBox();
            
            System.out.println("Calling Box with coordinates (10,10) and width 50 and height 50 passing a Point and two int parameters");
            rect2 = new Box(new Point(10,10),50,50);
            rect2.printBox();
        
               
    }
}
