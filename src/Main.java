import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choiceUser=1;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало игры. 0 - выход.\n1 - камень, 2 - ножницы, 3 - бумага.");
        while (choiceUser != 0){
            choiceUser = scanner.nextInt();
            if (choiceUser == 0) break;
            int choiceComp = random.nextInt(1,4);
            System.out.println("комп: "+choiceComp+", игрок: "+choiceUser);
            if (choiceUser == choiceComp) {
                System.out.println("ничья");
            } else if (choiceUser == 2 && choiceComp == 1 || choiceUser == 3 && choiceComp == 2 || choiceUser == 1 && choiceComp == 3) {
                System.out.println("победа компьютера");
            } else System.out.println("победа игрока");
        }
    }
}