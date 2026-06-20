import java.util.Arrays;
import java.util.Scanner;

public class sumof2DArray {
    public static void main(String[] args) {
        int [][] matrix = new int[2][2];
        Scanner input = new Scanner(System.in);
        System.out.println("enter :" + matrix.length  +"rows and "+ matrix[0].length  +"columns");
        for (int i =0 ; i<matrix.length;i++){
            for (int j = 0 ; j<matrix[i].length;j++)
                matrix[i][j]=input.nextInt();
        }

for (int i=0;i< matrix.length;i++){
    for (int j=0;j< matrix[i].length;j++)
        System.out.println(matrix[i][j] + "  ");
}
        System.out.println();

    int total=0;
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++)
            total+=matrix[i][j];

        }    System.out.println("total is:  "+ total );

        for (int i=0;i< matrix.length;i++) {
         int totalc=0;
            for (int j = 0; j < matrix[i].length; j++)
        totalc+=matrix[i][j];
            System.out.println("sum for column: " + i+"is :" + totalc);

        }


    }}
