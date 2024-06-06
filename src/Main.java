public class Main {
    public static void main(String[] args) {
        for (int a=70087; a!=0; a /=10) {
            int b=a%10;
            System.out.print(b);
        }
    }
}