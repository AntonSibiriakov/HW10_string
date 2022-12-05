public class Main {
    public static void main(String[] args) {

        System.out.println("\n=====Task1=====");

        String firstNme = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstNme + " " + middleName;

        System.out.println(fullName);



        System.out.println("\n=====Task2=====");

        String fullNameUp= fullName.toUpperCase();

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);



        System.out.println("\n=====Task3=====");

        String fullName3 ="Иванов Семён Семёнович";

        fullName3 = fullName3.replace('ё','е');

        System.out.println(fullName3);
    }
}


