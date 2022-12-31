import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String myName = "Alina";
        final int NUM = 18;
        String word = "Kim";
        String concatenation = NUM + " " + word;
        System.out.println(myName + " " + NUM + " " + word + " " + concatenation);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }
        else{
            System.out.println("Вы сохранили ноль");
        }

        System.out.print("Введите ваше имя: ");
//        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

    }
}