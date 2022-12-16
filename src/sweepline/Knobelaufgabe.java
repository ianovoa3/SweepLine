/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweepline;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author novoa
 */
public class Knobelaufgabe {

    /**
     * @param args the command line arguments
     */
    ArrayList distance = new ArrayList();
    
    static Point points       = new Point(); 
    long x = 290797;
    long y = 0;
    ArrayList tempx = new ArrayList();
    ArrayList tempy = new ArrayList();
    
    static ArrayList<Point> P = new ArrayList();
    
    
    public Knobelaufgabe(){
        Punkterzeugen();
    }
    
   
    
    public void Punkterzeugen(){
        
        SweepLine linesweep;
        for (int i=0;i<10;i++){  
            
            tempx.add(x);
            
            y = (x*x) % (50515093);                         
            x = (y*y) % (50515093);
            tempy.add(y);
            if (i>0){
                abstandfeststellen(tempx,tempy,i);
            }
        }
        linesweep = new SweepLine(tempx,tempy);
        
        
       
        
        
    }
    public void abstandfeststellen(ArrayList p1,ArrayList p2,int index){
        
        double c;
        long number1,number2;
        
            number1 = ((long)p1.get(index) - (long)p1.get(index-1));
            number2 = ((long)p2.get(index) - (long)p2.get(index-1));
            //System.out.println(number1);
            //System.out.println(number2);
            
            
            c = Math.pow(number1,2) + Math.pow(number2,2) ;            
            c = Math.sqrt(c);
            distance.add(c);
    
    }
    
}
