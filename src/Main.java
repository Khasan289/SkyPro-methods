import java.time.LocalDate;

public class Main {


    // Для задачи 1
    public static void checksYear(int auditedYear) {

        if (auditedYear % 4 == 0 && auditedYear % 100 != 0) {
            System.out.println(auditedYear + " год является високосным.");
        } else {
            System.out.println(auditedYear + " год не является високосным.");
        }
    }

    // Для задачи 2

    public static void checksOs(int typeOs, int yearOfRelease) {
        if (typeOs == 0 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (typeOs == 0 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }
        if (typeOs == 1 && yearOfRelease < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (typeOs == 1 && yearOfRelease >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    // Для задачи 3

    public static int returnAmountOfDays(int distance) {

        int days = 1;
        if (distance >= 0 && distance <= 20){
            days = 1;
        } else if (distance > 20 && distance <=60) {
            days = days + 1;
        } else if (distance > 60 && distance <= 100) {
            days = days + 2;
        }
        return days;
    }
    // Для задачи 3
    public static void printAmountOfDays(int numbers) {
        System.out.println("Потребуется дней: " + numbers);
    }


        public static void main (String[]args){
            task1();
            task2();
            task3();
        }

        public static void task1() {
            // Задача 1

            System.out.println("Задача 1");
            int year = 2021;
            checksYear(year);
        }

        public static void task2() {
            //Задача 2

            System.out.println("Задача 2");
            int clientOs = 0;
            int currentYear = LocalDate.now().getYear();
            checksOs(clientOs, currentYear);
        }

    public static void task3() {
        // Задача 3

        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int total = returnAmountOfDays(deliveryDistance);
        printAmountOfDays(total);


    }
    }








