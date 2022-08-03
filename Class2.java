package Giris;
import java.util.Scanner;
public class Class2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       double hizmet, kdv1 =0.18, kdv2 = 0.08;

       System.out.print("Hizmet Tutarını Giriniz:   ");
       hizmet = input.nextDouble();
       boolean kosul1 = hizmet >= 1000;
       double kdvTutar = kosul1 ? hizmet* kdv2 : hizmet* kdv1;

       System.out.print(kdvTutar);

    }
}