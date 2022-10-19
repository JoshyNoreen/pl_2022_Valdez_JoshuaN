import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

    public class Main {
    public static void main(String[] args) {

        System.out.println("Enter number of Strings to enter :");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        ArrayList<String> listOfStrings = new ArrayList<>();
        for (int i = 0; i < range; i++) {

            listOfStrings.add(scanner.next());
        }

        for (String string : listOfStrings) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < string.length(); i++) {

                stack.push((string.charAt(i)));
            }

            StringBuilder reverse = new StringBuilder();
            while (!stack.isEmpty()) {

                reverse.append(stack.pop());
            }

            if(string.equals(reverse.toString())) {

                System.out.println("It is a Palindrome");
            }
            else
            {
                System.out.println("NOT a Palindrome");
            }
        }

        scanner.close();
    }
}


