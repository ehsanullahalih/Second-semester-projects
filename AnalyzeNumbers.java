
package analyzenumbers;


public class AnalyzeNumbers {

  
    public static void main(String[] args) {
                

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println(" Enter the number of items : ");
        int n=input.nextInt();
        double[] numbers=new double[n];
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
        double evrage=sum/n;
        int count=0;
        for(int i=1;i<numbers.length;i++)
            if(numbers[i]>evrage)
                count++;
            
        System.out.println(" Average is "+evrage);
        System.out.println(" Number of elements above the average is "+count);
        
        
    }
    
}
