import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input_str;
        boolean restart = true;
        while (restart) {
            //ask user which action to perform
            System.out.println("Please input operation (encode/decode/exit):");
            String action = scanner.nextLine();

            if (action.equals("encode")) {
                System.out.println("Input string:");
                input_str = scanner.nextLine();
                ChuckNorrisEncoder cne = new ChuckNorrisEncoder(input_str);
                System.out.println("Encoded string:");
                System.out.println(cne.result);
            } else if (action.equals("decode")) {
                System.out.println("Input encoded string:");
                input_str = scanner.nextLine();
                ChuckNorrisDecoder cnd = new ChuckNorrisDecoder(input_str);
                if (!cnd.isValid()) {
                    System.out.println("Encoded string is not valid.");
                    System.out.println();
                    continue;

                } else {
                    System.out.println("Decoded string:");
                    System.out.println(cnd.result);
                }
            } else if (action.equals("exit")) {
                restart = false;
                System.out.println("Bye!");
                break;
            } else {
                System.out.println(String.format("There is no '%s' operation",action));
            }
            System.out.println();
        }
    }
}
