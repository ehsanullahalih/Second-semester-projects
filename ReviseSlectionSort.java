import java.util.Scanner;

public class ReviseSlectionSort {

    public static void selectionSort(double[] list) {

        for (int i = list.length - 1; i > 0; i--) {

            // Find the largest number in current array
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {

                if (list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            // Swap the largest number with the last position
            if (currentMaxIndex != i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }


        selectionSort(numbers);


        System.out.println("Sorted numbers:");

        for (double num : numbers) {
            System.out.print(num + " ");
        }
    }
}