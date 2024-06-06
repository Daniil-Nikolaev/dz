public class Main3 {
    public static void main(String[] args) {
        boolean flag = true;
        int a=192345678;
        int b=a%10;
        for (;a>0;) {
            a/=10;
            if(b == a % 10){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}