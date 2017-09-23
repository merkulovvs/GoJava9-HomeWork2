/**
 * Created by merkulovvs on 9/24/2017.
 */
import java.awt.peer.DialogPeer;
import java.util.Scanner;

public class Program {

    public static void DisplayResult(String str1, String str2){
        System.out.println(str1 + " " + str2);
    }

    public static void DisplayResult(String str1, int age){
        System.out.println(str1 + " " + age);
    }

    public static void DisplayResult(String str1, String str2, int age, String str3){
        System.out.printf("Человек по имени %s живёт в городе %s " +
                "Этому человеку %d лет и любит он заниматься %s.", str1, str2, age, str3);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name, city, hobby;

        int age;

        System.out.print("Please, enter your name: ");
        name = in.nextLine();

        System.out.print("What city do you live in?: ");
        city = in.nextLine();

        System.out.print("Please, enter your age: ");
        age = in.nextInt();
        in.nextLine();

        System.out.print("Please, enter your hobby: ");
        hobby = in.nextLine();

        System.out.println("-----------------------------");
        System.out.println("Вариант 1 (табличный)");
        DisplayResult("Имя:", name);
        DisplayResult("Город:", city);
        DisplayResult("Возраст:", age);
        DisplayResult("Хобби:", hobby);

        System.out.println("-----------------------------");
        System.out.println("Вариант 2 (текстовый)");
        DisplayResult(name, city, age, hobby);



    }
}
