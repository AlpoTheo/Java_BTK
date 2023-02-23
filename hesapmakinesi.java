import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1,number2;
        System.out.println("İki tane sayi girin: ");
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        int islem;
        System.out.println("İslemi girin: ");
        System.out.println("Islemi girin(1: Toplama, 2: Cikarma, 3: Carpma, 4: Bolme");
        islem = scan.nextInt();
        int sonuc = 0;
        switch (islem) {
            case 1:
                sonuc = number1 + number2 ;
                break;
            case 2:
                sonuc = number1 - number2 ;
                break;
            case 3:
                sonuc = number1 * number2 ;
                break;
            case 4:
                sonuc = number1 / number2 ;
                break;
        }
        if(islem==1){
            sonuc = number1 + number2;
        }
        else if (islem == 2){
            sonuc = number1 - number2;
        }
        else if (islem == 3){
            sonuc = number1 * number2;
        }
        else if (islem == 4){
            sonuc= number1 / number2;
        }
        System.out.println("Sonuc: "+sonuc);
        scan.close();
    }
}
