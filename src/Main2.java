public class Main2 {
    public static void main(String[] args) {
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
    }
}