import java.util.Scanner;import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random npc = new Random();
        System.out.println("PLEASE VALUE A NUMBER BETWEEN 1-10");
        int tahmin = keyboard.nextInt();
        int sonuc = npc.nextInt(11);
        while(sonuc != tahmin){
            if(tahmin<0 || tahmin>10){
                System.out.println("PLEASE ENTER A VALUE BETWEEN 1-10");
                tahmin = keyboard.nextInt();
            }else if(tahmin<sonuc){
                System.out.println("PLEASE ENTER A LARGER VALUE");
                tahmin = keyboard.nextInt();
            }else{
                System.out.println("PLEASE ENTER SMALLER VALUE");
                tahmin = keyboard.nextInt();}
        }
        System.out.println("CONGRATULATIONS, YOU WIN!!!");

    }
}

