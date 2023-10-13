package lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static void checkValidMail(String email){
        /**
         * 1 пррверяем наличие собаки
         * 2 количество собак
         * 3 собака должна стоять не в начале и не в конце
         * 4 наличие точки после собаки хотя бы одной
         * 5 точка после собаки не в начале и не в конце
         * 6 добавить проверки на емейл!!!
         *
         */

        if (!email.contains("@")){
            System.out.println("Нет собачки");
            return;
        }

        String[] partsOfEmail = email.split("@");
        if(partsOfEmail.length>2){
            System.out.println("собачек больше одной");
            return;
        }

        if(email.startsWith("@") || email.endsWith("@")){
            System.out.println("не может начинаться или заканчиваться с собаки");
            return;
        }

        String lastPart = partsOfEmail[1];
        if(!lastPart.contains(".")){
            System.out.println("нет точки во второй части после собаки");
            return;
        }

        if (partsOfEmail[0].length() >= 64) {
            System.out.println("количество символов локальной части больше разрешенного");
            return;
        }

        if(partsOfEmail[1].length() >= 256){
            System.out.println("общее количество символов доменной части части больше разрешенного");
            return;
        }

        String[] domenPart = partsOfEmail[1].split("\\.");
            for(String i : domenPart){
                if(i.length() >= 64){
                    System.out.println("Метка DNS превышает предел символов");
                    return;
                }
                if(i.startsWith("-") || i.endsWith("-")){
                    System.out.println("Метка DNS не может начинаться или заканчиваться знаком -");
                    return;
                }
            }

        if(domenPart[domenPart.length-1].matches("[0-9]+")){
            System.out.println("Метка DNS корневого уровня не может состоять из одних цифр");
            return;
        }

        if(partsOfEmail[0].startsWith(".") || partsOfEmail[0].endsWith(".")){
            System.out.println("Локальная часть не может начинаться или заканчиваться точкой");
            return;
        }

        if(domenPart[domenPart.length-1].length() < 2){
            System.out.println("Метка DNS корневого уровня не может состоять из одного символа");
            return;
        }

        Pattern pattern = Pattern.compile("^.+@.+\\..+$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            System.out.println("Адрес не соответствует базовым требованиям");
            return;
        }






        System.out.println("емейл подходит");






    }
}
