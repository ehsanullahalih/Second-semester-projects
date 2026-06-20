
public class FindTheSmallestElement {
    
    
    public static void main(String [] args){
        
        int[] arr={23,42,23,54,23,65,34,23,1,2};
        double smal=min(arr);
        System.out.println(smal);
        
        
    }
    public static double min(int[]array){
        
        int smal=array[0];
        for(int i=0;i<10;i++){
           if(smal>array[i]){
               smal=array[i];
               
           }
           
        }
        return smal;
    }
}
