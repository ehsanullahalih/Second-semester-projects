
package countoccurrenceofnumber;


import java.util.Scanner;

public class CountOccurrenceOfNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
 
       int [] count=new int[101];
        System.out.println("Enter number beetwen 1 and 100(0 to stop): ");
        int num;
        while(true){
            num=input.nextInt();
            if(num==0){
                break;
            }
        
        if(num>=1 && num<=100){
            count[num]++;
        }
    }
        for(int i=0;i<=100;i++){
            if(count[i]>0){
                if(count[i]==1){
                    System.out.println(i+" occurs "+count[i]+" time");
                }
                else{
                    System.out.println(i+" occurs "+count[i]+" times");
                }
            }
        }
       
       
       
       
       
       
        
    
    }
}
