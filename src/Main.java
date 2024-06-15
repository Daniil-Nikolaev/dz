public class Main {
    public static void main(String[] args) {
        //1.
        for (int a=70087; a!=0; a /=10) {
            System.out.print(a%10);

        }
        System.out.println();
        //2.
        int max=0;
        int min=9;
        for(int a=2378;a>0;a/=10){
            if(a%10>max){
                max=a%10;
            }
            if(a%10<min){
                min=a%10;
            }
        }
        System.out.println("Максимальное число "+max);
        System.out.println("Минимальное число "+min);
        //3.
        boolean flag = true;
        int a=192345678;
        int b=a%10;
        while (a>0) {
            a/=10;
            if (b == a % 10) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
}