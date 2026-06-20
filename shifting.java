public class shifting {
    public static void main(String[] args) {
        int [] arr = {1,22,22,12,123,132};
        int first = arr[0];
        for(int i = 0 ;i>arr.length;i++) {
            arr[i] = arr[i + 1];
        }
            arr[arr.length-1]=first;
        for(int num:arr){
            System.out.print(+num +" ");
        }


    }
}
