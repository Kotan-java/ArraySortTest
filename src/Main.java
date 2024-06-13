import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scNumber = new Scanner(System.in);
        System.out.println("Введіть кількість елементів масиву");
        int number = scNumber.nextInt();

        int[] ElementsArr = new int[number];

        for (int i = 1; i < (number + 1); i++){
            System.out.println("Введіть " + i + " елемент");
            Scanner scElement = new Scanner(System.in);
            ElementsArr[i-1] = scElement.nextInt();
        }

        System.out.println("Масив після сортування");

        for (int i = 0; i < ElementsArr.length; i++){
            for (int j = 0; j < ElementsArr.length; j++){
                if (ElementsArr[i] < ElementsArr[j]) {
                    int nmb = ElementsArr[i];

                    ElementsArr[i] = ElementsArr[j];
                    ElementsArr[j] = nmb;
                }
            }
        }
        for (int k = 0; k < ElementsArr.length; k++){
            System.out.println((k + 1) + "-й елемент: " + ElementsArr[k]);
        }
    }
}
