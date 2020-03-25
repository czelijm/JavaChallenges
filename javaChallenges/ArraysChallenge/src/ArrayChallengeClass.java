import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayChallengeClass {

    int[] array;

    public int[] getIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length ");
        int numbers = scanner.nextInt();
        scanner.nextLine();

        int[] array = new int[numbers];

        IntStream.range(0, array.length).forEach(i -> {
            System.out.println("Enter array's  element nr " + i + " ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        });

        return array;
    }

    public void printArray(int[] array){
        IntStream.range(0, array.length).forEach(i -> {
            System.out.println("Array's element nr " + i + " is " + array[i]);
        });
    }

    public int[] sortIntegers(int[] array){
        Arrays.sort(array);
        return array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setInternalArray() {
        this.array = getIntegers();
    }
}
