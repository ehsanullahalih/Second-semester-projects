


import java.util.Scanner;

public class ReversTheNumbersEntered {

    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("Enter array length ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elments of array ");
        for(int i=0;i<n;i++){
           arr[i]=input.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(+arr[i] + " ");
            
        }
        
        
        
        
    }
    
}
