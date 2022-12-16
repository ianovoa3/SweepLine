/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweepline;

import java.util.ArrayList;

/**
 *
 * @author novoa
 */
public class SweepLine {
    
    
    
    public SweepLine(ArrayList Xs,ArrayList Ys){
        Xs = sort(Xs);
        System.out.println(Xs);    
        
    }
    
    public ArrayList sort(ArrayList toSort){
        
        long min = 0;       
        int index = 1; 
        for(int i=0;i<toSort.size()-1;i++){
            while(index < toSort.size()){
               if((long)toSort.get(i) > (long)toSort.get(index)){
                   min = (long)toSort.get(index); 
                   toSort.set(index,(long)toSort.get(i));
                   toSort.set(i,min);
                  
               }
               index++;
                  
            }
            index = i+1;
        }
        return toSort;
    }
}
