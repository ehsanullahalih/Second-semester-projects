
package slectionsort;

import java.util.Arrays;

public class SlectionSort {

    public static void main(String[] args) {
        double [] sd={22,23,25,31,56,43,65,56,5};
        selectionSort(sd);
        System.out.println("this is sd "+Arrays.toString(sd));
        
        
        
    }
    public static void selectionSort(double [] list){
        for(int i=0;i<list.length-1;i++){
            
            
            double currentMin=list[i];
            int currentMinIndex=i;
            
            
            for(int j=i+1;j<list.length;j++){
                if(currentMin>list[j]){
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            
            
            if(currentMinIndex !=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
    
}
