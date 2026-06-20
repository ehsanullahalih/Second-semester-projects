
package sevenexercis;


public class BubleSort {
    
    public static void main(String[]args){
        
        double[]numbers={1.2,3.4,2.4,2.6,3.2,6.4,5.4};
        bubbleSort(numbers);
        System.out.println("Sorted array: ");
        for(double num:numbers){
            System.out.println(num+" ");
        }
       
    }
    
    public static void bubbleSort(double [] arry){
        int n=arry.length;
        boolean swapped;
        for(int i=0;i<n-1;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
              if(arry[j]>arry[j+1]){
                  
                  double temp=arry[j];
                  arry[j]=arry[j+1];
                  arry[j+1]=temp;
                  
                  swapped=true;
              }  
            }
            if(!swapped)break;
        }
      
    }
}
