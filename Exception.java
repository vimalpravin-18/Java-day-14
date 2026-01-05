public class Exception {
        public static void main(String[] args) {
            try {
                int a = 10 / 1;
                System.out.println(a);
            }   catch (ArithmeticException e) {
                System.out.println("Cannot divide by Zero");
            }
        }
}
