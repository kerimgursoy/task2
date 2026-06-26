import java.util.InputMismatchException;
import java.util.Scanner;

public class RandGame extends Thread{
    int num;

    @Override
    public void run() {
        num = (int) (Math.random()*101);
        TTimer timer = new TTimer();
        timer.start();
        int n;

        do {
            System.out.println("Sayı gir: ");
            Scanner scan = new Scanner(System.in);
            try{
                n = scan.nextInt();
            }
            catch (InputMismatchException f){
                System.out.println("Geçersiz değer girildi, değer -1 kabul edildi.");
                n = -1;
                scan.next();
            }
        } while (!guess(n));
        timer.stat = 1;
    }

    public boolean guess(int n){
        if(n < num){
            System.out.println("Çok küçük");
            return false;
        }
        else if(n > num){
            System.out.println("Çok büyük");
            return false;
        }
        else {
            System.out.println("Doğru bildiniz");
            return true;
        }
    }


}
