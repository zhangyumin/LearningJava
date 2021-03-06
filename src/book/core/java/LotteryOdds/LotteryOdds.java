package book.core.java.LotteryOdds;

import java.util.Scanner;

/**
 * //
 * //   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * // ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * // ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * // ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * // ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * //  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * Created by zym on 16-3-3.
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers in total?");
        int n = scanner.nextInt();

        System.out.println("How many numbers do you have to choose?");
        int k = scanner.nextInt();

        int bottom =1, top = 1;
        for(int i = 1; i <= k ; i++){
            bottom *= (n - i + 1);
            if(i <= k){
                top *= (i);
            }
        }
        double rate = top * 1.0 / bottom;
        System.out.printf("Your odds are "+rate);
    }
}
