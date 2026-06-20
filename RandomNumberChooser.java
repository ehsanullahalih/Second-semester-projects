
package sevenexercis;

import java.util.Scanner;


public class RandomNumberChooser {
    
    public static void main(String [] args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of array ");
        int length=input.nextInt();
        int[] excludNumbers=new int[length];
        System.out.println("Enter the elements of array ");
        for(int i=0;i<length;i++){
            excludNumbers[i]=input.nextInt();
        }
        System.out.println(getRandom(1,100,excludNumbers));
        
    }
    
    public static int getRandom(int start,int end,int []excludNumbers){
        int ranNumber=0;
        int exclud=0;
        
        int length=excludNumbers.length;
        int[]arr=new int[100];
        
        for(int i=0;i<100;i++){
            
            arr[i]=i;
        }
        
        for(int i=0;i<100;i++){
            int randNum=(int)(start+Math.random()*end);
            boolean con=true;
           ranNumber= arr[randNum];
           for(int j=0;j<length;j++){
               if(excludNumbers[j]==ranNumber)
                   exclud++;
              
           }
            
            if(exclud==0)
                    break;
        }
        
       return ranNumber; 
    }
}
