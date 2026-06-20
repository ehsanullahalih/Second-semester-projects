

import java.util.Scanner;

/*
(Sort students) Write a program that prompts the user to enter the number of students,
the students’ names, and their scores and prints student names in decreasing
order of their scores. Assume the name is a string without spaces, use the Scanner’s
next() method to read a name.
*/

public class SortStudent {
    
   
    public static void main(String[]args){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of sttudents ");
        
        int n=input.nextInt();
        String [] names=new String[n];
        int[] scores=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.println("Enter student's name");
            names[i]=input.next();
            System.out.println("Enter "+names[i]+"'s score ");
            scores[i]=input.nextInt();
           
        }
        selectionSort(scores,names);
        for(int i=0;i<n;i++){
            System.out.println(names[i]+"___"+scores[i]);
        }
      
    }
    
     public static void selectionSort(int [] list,String [] names){
        for(int i=0;i<list.length-1;i++){
            
            String currentS=names[i];
            int currentMin=list[i];
            int currentMinIndex=i;
            
            
            for(int j=i;j<list.length;j++){
                if(currentMin<list[j]){
                    currentS=names[j];
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            
            
            if(currentMinIndex !=i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
                names[currentMinIndex]=names[i];
                names[i]=currentS;
            }
        }
    }
}
