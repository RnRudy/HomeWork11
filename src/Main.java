import java.time.LocalDate;

public class Main {
    public static void defineLepYear(int year) {
        System.out.println("Задача 1");
        int remDiv = year % 4;
        int fourHundredYear = year % 400;
        int hundredYear = year % 100;
        boolean leapYr = (((remDiv == 0) && (hundredYear != 0)) || (fourHundredYear == 0));
        if (leapYr) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
    public static void recomendedInstallingVersion(byte clientDeviceOS, int clientDeviceYear){
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        boolean outdatedA =  (clientDeviceYear < currentYear && clientDeviceOS == 1);
        boolean outdatedIOS = (clientDeviceYear < currentYear && clientDeviceOS == 0);
        if (outdatedA) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (outdatedIOS) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        } else if (clientDeviceOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
    public static String calculateDeliveryDays (int deliveryDistance) {
        System.out.println("Задание 3");
        int day = 1;
        if (deliveryDistance <= 20) {return "Потребуется дней: " + day;} else if (deliveryDistance > 20 && deliveryDistance <= 60)
        { return "Потребуется дней: " + (day + 1);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return "Потребуется дней: " + (day + 2);
        } else {return "Доставка невозможна.";}
    }


    public static void main(String[] args) {
        int inYear = 2100;
        defineLepYear(inYear);
        byte inClientDeviceOS = 1;
        int inClientDeviceYear = 2024;
        recomendedInstallingVersion(inClientDeviceOS, inClientDeviceYear);
        int deliveryDistance = 95;
        String notification = calculateDeliveryDays(deliveryDistance);
        System.out.println(notification);

    }
}