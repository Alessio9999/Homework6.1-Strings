public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }

    private static void Task1() {
        System.out.println("\nЗадача 1:");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
    }

    private static void Task2() {
        System.out.println("\nЗадача 2:");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUpperCased = fullName.toUpperCase();
        System.out.println(fullNameUpperCased);
    }

    private static void Task3() {
        System.out.println("\nЗадача 3:");
        String fullName = "Иванов Семён Семёнович";
        String fullNameChanged = fullName.replace('ё','е');
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameChanged);
    }

}