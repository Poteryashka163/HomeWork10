import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task1(scanner);
        task2(scanner);
        task3();
    }

    public static void task1 (Scanner scanner) {
        System.out.println("Задача 1");
        System.out.println("Введите Имя- ");
        String firstName = scanner.next();
        System.out.println("Введите Фамилмю- ");
        String lastName = scanner.next();
        System.out.println("Введите Отчество- ");
        String middleName = scanner.next();
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - "+fullName);

    }

    public static void task2 (Scanner scanner) {
        System.out.println("Задача 2");
        System.out.println("Введите Имя- ");
        String firstName = scanner.next();
        System.out.println("Введите Фамилмю- ");
        String lastName = scanner.next();
        System.out.println("Введите Отчество- ");
        String middleName = scanner.next();
        String fullName = lastName + " " + firstName + " " + middleName;
        // String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+(fullName.toUpperCase()));
        
    }
    public static void task3 () {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String newfullName =  fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника —"+newfullName);



    }
}