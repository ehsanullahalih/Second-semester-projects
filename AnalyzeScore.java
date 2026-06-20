

import java.util.Arrays;
import java.util.Scanner;


public class AnalyzeScore {

   
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       double [] scores=new double[100];
       int count=0;
       
        System.out.println("enter scres(nagative number to stop):");
       
       
       
        while(true){
           double num=input.nextDouble();
           if(num<0)
               break;
          scores[count]=num;
          count++;
          
            }   
        double sum=0;
        for(int i=0;i<count;i++){
            sum+=scores[i];
        }
        double average=sum/count;
       int aboveOrEqual=0;
       int below=0;
       for(int i=0;i<count;i++){
           if(scores[i]>=average)
               aboveOrEqual++;
           else
               below++;
       }
        System.out.println("Average is : "+average);
        System.out.println("above or equal to average"+aboveOrEqual);
        System.out.println("Below than average "+below);
     
    }
    
    
}
