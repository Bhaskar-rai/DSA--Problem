import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack Example");
        System.out.println("Operations: ");
        System.out.println("1. Push (Add an element)");
        System.out.println("2. Pop (Remove the top element)");
        System.out.println("3. Peek (Get the top element)");
        System.out.println("4. Check if the stack is empty");
        System.out.println("5. Size of the stack");
        System.out.println("6. Exit");

        while (true) {
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    int item = getUserInput("Enter the number to push: ");
                    stack.push(item);
                    System.out.println(item + " pushed to the stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop() + " popped from the stack.");
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Size of the stack: " + stack.size());
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getUserChoice() {
        System.out.print("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getUserInput(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
