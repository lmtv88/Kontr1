/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontr1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Kontr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String q = "r";

        Random random = new Random();
        while ("r".equals(q)) {
            System.out.println();
            System.out.println("\n");
            System.out.println("Новая Игра");
            System.out.println("Отгадай число от 0 до 10");
            System.out.println("\n");

            Integer randNumber = random.nextInt(10 - 0 + 1) + 0;
            System.out.println("Компьютер загадал число от 0 до 10, нужно отгадать");
            System.out.print("Установи кол-во попыток: ");
            Scanner scanner = new Scanner(System.in);
            Integer count = scanner.nextInt();
            System.out.println();
            System.out.print("Угадайте число: ");
            Integer userNumber = -1;

            Boolean f = false;
            Integer i = 0;

            int answer;

            do {
                count = count - 1;
                Scanner reader = new Scanner(System.in);
                //System.out.print("Попытка N1: ");
                answer = reader.nextInt();
                if (answer == randNumber) {
                    System.out.println("Вы угадали число");
                    break;
                } else {
                    System.out.println("Попробуйте еще раз");
                }

            } while (answer != randNumber);

                System.out.println("Нажмите r чтоб продолжить, q чтобы закончить игру");
                q = scanner.next();
                
                
            
        }

    }

            
}
