
import java.util.Scanner;


public class PrintDistinctNum {
    
     public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         int count=0;
         int [] numbers=new int[10];
         int [] distinct=new int[10];
         System.out.println("enter ten elements of array");
           for(int i=0;i<10;i++){
               numbers[i]=input.nextInt();
           
           boolean isNew=true;
           for(int j=0;j<count;j++){
               if(numbers[i]==distinct[j]){
                   isNew=false;
                   break;
               }
           }
           if(isNew){
               distinct[count]=numbers[i];
               count++;
           }
            
           }
           
               System.out.println("The number of distinct numbers are : "+count);
               System.out.println("Thr distinct numbers are : ");
               for(int i=0;i<count;i++){
                   System.out.println(distinct[i]+" ");
               }
         
     }
   
}
