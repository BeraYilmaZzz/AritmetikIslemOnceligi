import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b,c,işlem;
        System.out.print("İlk değeri giriniz = ");
        a = inp.nextInt();
        System.out.print("İkinci değeri giriniz = ");
        b = inp.nextInt();
        System.out.print("Üçüncü değeri giriniz = ");
        c = inp.nextInt();
        işlem = (a+b)*(c-b) ;
        System.out.print("İşlem sonucunuz : " + işlem);
    }
}