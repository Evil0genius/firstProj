package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class HomeworkUtils {
    public static int evenNumbersInArray(int[][] array){
        int sumEvenNumbers = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt % 2 == 0) {
                    sumEvenNumbers ++;
                }
            }
        }
        return sumEvenNumbers;
    }

    public static void minNumber(int a, int b, int c, int d, int e){
        int[] numbers = {a, b, c, d, e};
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min)
                min = number;
        }
        System.out.println(min);
    }

    public static double[] randomNumbers(double[] emptyArray){
        for (int i = 0; i < emptyArray.length; i++) {
                                                         //не знаю как указать диапазон правильно
            double randNum = ThreadLocalRandom.current().nextDouble(-1000000, 1000000);
            emptyArray[i] = randNum;
        }
        return emptyArray;
    }

    public static String months(int numberOfMonth){
        String[] monthNames = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String choosedMonth = null;
        if(numberOfMonth >= 1 && numberOfMonth <= 12){
            choosedMonth = monthNames[numberOfMonth - 1];
        }return choosedMonth;
    }

    public static void realTriangle(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Этот треугольник существует");
        }else System.out.println("Этот треугольник не существует");
    }




}
