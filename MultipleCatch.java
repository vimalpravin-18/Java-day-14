public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 1;
        } catch(ArithmeticException e) {
            System.out.println("Math Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error");
        }
    }
}
