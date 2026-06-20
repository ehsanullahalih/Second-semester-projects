public class randomShuffling {
    public static void main(String[] args) {
        double [] arr = {1,22,22,12,123,132};
        for (int i =0;i< arr.length;i++){
            int j = (int)(Math.random()*arr.length);
            double temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(double num :arr){
            System.out.println(num+ " ");
        }

    }





}
