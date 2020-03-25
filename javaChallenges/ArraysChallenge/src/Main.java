

public class Main {

    public static void main(String[] args) {
        ArrayChallengeClass arrayChallenge = new ArrayChallengeClass();
        int[] array = arrayChallenge.getIntegers();
        arrayChallenge.printArray(array);

        System.out.println("\nSorting...");

        arrayChallenge.sortIntegers(array);
        arrayChallenge.printArray(array);
    }
}
