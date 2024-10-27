import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        int numberOne = 0;
        System.out.println(numbers[numberOne]);
        numbers[1] = 2;
        int numberTwo = 1;
        System.out.println(numbers[numberTwo]);
        numbers[2] = 3;
        int numberThree = 2;
        System.out.println(numbers[numberThree]);

        double[] nor = {1.57, 7.654, 9.986};
        System.out.println(nor[0]);
        System.out.println(nor[1]);
        System.out.println(nor[2]);

        int[] cat = {7, 8, 9};
        System.out.println(cat[0]);
        System.out.println(cat[1]);
        System.out.println(cat[2]);

        //задача 2
        int[] number1 = {1, 2, 3};
        double[] number2 = {1.57, 7.654, 9.986};
        int[] cat1 = {7, 8, 9};
        for (int i = 0; i < number1.length; i++) {
            System.out.print(number1[i]);
            if (i < number1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i < number2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < cat1.length; i++) {
            System.out.print(cat1[i]);
            if (i < cat1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
// задача 3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = nor.length - 1; i >= 0; i--) {
            System.out.print(nor[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = cat.length - 1; i >= 0; i--) {
            System.out.print(cat[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // задача 4
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arr));
                    }
                }







