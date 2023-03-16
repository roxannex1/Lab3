import java.util.LinkedList;
import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            list.add(element);
        }

        System.out.println("Elements in direct order: " + list);
    }
}