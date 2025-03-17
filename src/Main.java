public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 ");
        int age = 7;
        if (age >= 18) {
            System.out.println("Если возраст человека равен" + age + " то он совершеннолетний! ");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать! ");
        }
        System.out.println("Задание 2 ");
        int temperature = 2;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        System.out.println("Задание 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф ");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " ,то можно есдить спокойно ");
        }
        System.out.println("Задание 4");
        int year = 21;
        if (year >= 2 && year <= 6) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в детский сад");
        }
        if (year >= 7 && year <= 17) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в школу");
        }
        if (year >= 18 && year <= 24) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить в университет");
        }
        if (year > 24) {
            System.out.println("Если возраст человека равен " + year + " , то ему нужно ходить на работу");
        }
        System.out.println("Задание 5");
        int yearsOld = 6;
        boolean adult = false;
        if (yearsOld <= 5) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему нельзя кататься на атракционе");
        }
        if (yearsOld > 5 && yearsOld <= 14) {
            if (adult) {
                System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему ему можно кататься в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему ему нельзя кататься без сопровождения взрослого");
            }
        }
        if (yearsOld > 14) {
            System.out.println("Если возраст ребенка равен " + yearsOld + " ,то ему ему можно кататься без сопровождения");
        }
        System.out.println("Задание 6");
        int place = 30;
        if (place > 0 && place <= 60) {
            System.out.println("Сидячее место №" + place);
        } else if (place > 60 && place <= 102) {
            System.out.println("Стоячее место №" + place);
        } else {
            System.out.println("Мест нет");
        }
        System.out.println("Задание 7");
        int one = 46;
        int two = 23;
        int three = 22;
        if (one > two && one > three) {
            System.out.println("Первое число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("Второе число " + two + " самое большое");
        } else {
            System.out.println("Третье число " + three + " cамое большое");
        }
        System.out.println("Домашняя работа завершена");
    }
}

