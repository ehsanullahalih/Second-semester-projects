import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter lenght of array: ");
    int n = input.nextInt();
        double [] numbers= new double[n];
        double sum=0;
        System.out.println("Array numbers are:  ");
    for(int i = 0;i<numbers.length;i++){
        numbers [i] = rand.nextInt(100);
        sum+= numbers[i];
        System.out.print(numbers[i] +"\t");
    }

    double avg= sum/n;
    int count = 0;
    for(int i = 0; i < n ; i++){
        if (numbers[i]>avg)
            count++;
    }
double max = numbers[0];
    for(int i = 0; i<numbers.length;i++){
        if (numbers[i]>max) {
            max=numbers[i];
        }
    }
        System.out.println("Sum is: "+sum);
        System.out.println("average is : " +avg);
        System.out.println("numbers above Avg is : " +count);
        System.out.println(" max value is:" +max);
    }
}