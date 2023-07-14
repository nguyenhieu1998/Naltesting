import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int countVietnameseCharacters(String input, List<String> result) {
        int count = 0;
        int length = input.length();

        for (int i = 0; i < length; i++) {
            String vietnameseChar = "";
            char c = input.charAt(i);
            if (c == 'a' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'w') {
                    vietnameseChar = "aw";
                    count++;
                    i++;
                } else if (nextChar == 'a') {
                    vietnameseChar = "aa";
                    count++;
                    i++;
                }

            } else if (c == 'd' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'd') {
                    vietnameseChar = "dd";
                    count++;
                    i++;

                }
            } else if (c == 'e' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'e') {
                    vietnameseChar = "ee";
                    count++;
                    i++;

                }
            } else if (c == 'o' && i < length - 1) {
                char nextChar = input.charAt(i + 1);
                if (nextChar == 'o' || nextChar == 'w' ) {
                    if (nextChar == 'o') {
                        vietnameseChar = "oo";
                    } else {
                        vietnameseChar = "ow";
                    }
                    count++;
                    i++;
                }
            } else if (c == 'w' && i < length - 1) {
                vietnameseChar = "w";
                count++;
                    i++;
            }
            if (!vietnameseChar.equals("")) {
                result.add(vietnameseChar);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        List<String> result = new ArrayList<>();
        int count = countVietnameseCharacters(input, result);
        String output = String.join(", ", result);

        System.out.println("Output: " + count + " (" + output + ")");

    }
}