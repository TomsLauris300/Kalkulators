
    import java.lang.Math;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Ievadi pirmo skaitli");
            int x = scan.nextInt();
            System.out.println("Ievadi otro skaitli");
            int y = scan.nextInt();
            System.out.println("Izvelies darbibu");

            String mathOp = scan.next();

            switch (mathOp) {
                case "+" -> System.out.println("Rezultāts ir " + sum(x, y));
                case "-" -> System.out.println("Rezultāts ir " + min(x, y));
                case "*" -> System.out.println("Rezultāts ir " + reiz(x, y));
                case "/" -> System.out.println("Rezultāts ir " + dal(x, y));
                default -> System.out.println("Kautkas nav kartiba");
            }
        }
        public static int sum(int x, int y) {
            return x + y;
        }
        public static int min(int x, int y) {
            return x - y;
        }
        public static int reiz(int x, int y) {
            return x * y;
        }
        public static int dal(int x, int y) {
            return x / y;
        }

    }

