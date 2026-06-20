
package sevenexercis;

import java.lang.reflect.Array;


public class ReverseAnArray {
    
    public static void main(String[]args){
    int []arr={2,544,34,23,75,24,23,75,44,56};
    
    
    for(int i=0;i<10;i++){
            System.out.println(revers(arr)[i]);
    }
    }
    public static int[] revers(int []array){
        
        int j=0;
        int[] revArray=new int[10];
        for(int i=9;i>=0;i--){
            
            revArray[j]=array[i];
            j++;
        }
        return revArray;
    }
    
}
