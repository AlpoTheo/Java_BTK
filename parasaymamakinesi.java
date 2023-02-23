import java.util.Scanner;

public class parasaymamakinesi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int number = keyboard.nextInt();
        int birkurus,bes,on,yirmibes,elli;

        elli = number / 50;
        number = number % 50;

        yirmibes = number / 25;
        number = number % 25;

        on = number / 10;
        number = number % 10;

        bes = number / 5;
        number = number % 5;

        birkurus = number / 1;
        number = number % 1;

        System.out.println("Elli Kurus Sayisi"+ elli);
        System.out.println("Yirmibes Kurus Sayisi"+yirmibes);
        System.out.println("On Kurus Sayisi"+on);
        System.out.println("Bes Kurus Sayisi"+bes);
        System.out.println("Birkurus Kurus Sayisi"+birkurus);
        keyboard.close();


    }
}
