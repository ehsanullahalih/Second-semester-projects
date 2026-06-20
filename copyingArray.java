public class copyingArray {
    public static void main(String[] args) {
        int [] arr1= {1,3,33,44,12};
        int [] arr2= new int[arr1.length];
        for(int i =0;i<arr1.length;i++){
            arr2[i]= arr1[i];
        }
        for(int num : arr2){
            System.out.println(num+" ");
        }
    }
}
