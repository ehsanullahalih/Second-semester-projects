
package assigngrades;

import java.util.Scanner;


public class AssignGrades {

   
    public static void main(String[] args) {
        int highScore=0;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length of array ");
        int n=input.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>highScore)
                highScore=arr[i];
        }
         for(int i=1;i<n;i++){
             if(arr[i]>=highScore-10)
                 System.out.println(i+" Student is in grad A");
             if(arr[i]>=highScore-20 && arr[i]<highScore-10)
                 System.out.println(i+" Student is in grad B");
             if(arr[i]>=highScore-30 && arr[i]<highScore-20)
                 System.out.println(i+" Student is in grad C");
             if(arr[i]>=highScore-40 && arr[i]<highScore-30)
                 System.out.println(i+" Student is in grad D");
             if(arr[i]<highScore-40)
                 System.out.println(i+" Student is in grad F");
         }        
        
    }
    
}
