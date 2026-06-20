
public class countingSingalDigits {
  
    
    public static void main(String []args){
        
        int []arr=new int[101];
        int [] count=new int[10];
        for(int i=0;i<=100;i++){
            int rand=(int)(Math.random()*10);
            arr[i]=rand;
        }
        
        for(int i=0;i<10;i++){
            for(int j=0;j<=100;j++){
                if(i==arr[j])
                    count[i]++;
            }
        }
        for(int i=0;i<10;i++){
            System.out.println("The occurrence of "+i+" is "+count[i]);
        }
        
        
        
        
        
    }
    
}
