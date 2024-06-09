public class Main4 {
    public static void main(String[] args) {
        for (int a=12345;a>0;) {
            int b=a%10;
            a/=10;
            int c=a%10;
            if (b==c+1){
               System.out.print(c+' '+b);
            }

        }
    }
}