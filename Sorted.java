
package sevenexercis;

import java.util.Arrays;
import java.util.Scanner;
/*
(Sorted?) Write the following method that returns true if the list is already sorted
in nondecreasing order:
public static boolean isSorted(int[] list)
Write a test program that prompts the user to enter a list and displays whether the
list is sorted or not. Here is a sample run. Note that the program first prompts the
user to enter the size of the list.
*/

public class Sorted {
    public static void main(String [] args){
   
    Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of array ");
    int n=input.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=input.nextInt();
    }
    int count=0;
    for(int i=0;i<n-1;i++){
        if(i==n-1){
            count++;
            break;
        }
        if(arr[i]<=arr[i+1])
            count++;
        
                
    }
        
    if(count==(n-1))
            System.out.println("The list has "+n+" integers"+Arrays.toString(arr)+" is sorted ");
    if(count!=(n-1))
         System.out.println("The list has "+n+" integers"+Arrays.toString(arr)+" is not sorted ");
    
    
    } 
    
}
