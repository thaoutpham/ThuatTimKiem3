import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        int[] array = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            array[ascii] += 1;
        }
        int max = 0;
        char a = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (array[j] > max) {
                max = array[j];
                a = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + a + "' with a frequency of " + max + " times");
    }
}
