package lesson5;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class ScannerUtils {


    public static String[] inputVar = new String[]{"1", "2", "3", "4", "5", "круг", "квадрат",
            "треугольник", "овал", "трапеция"};

    public static void printFigurs() {
        out.println("Выберите фигуру:");
        for (int i = 0; i < inputVar.length / 2; i++) {
            out.println(inputVar[i] + " - " + inputVar[i + inputVar.length / 2]);
        }
    }

    public static String getInputFigure() {
        out.println("Введите фигуру:");
        Scanner scanner = new Scanner(in);
        String input = scanner.next();
        if (Arrays.asList(inputVar).contains(input.toLowerCase())) {
            return input;
        } else {
            out.println("Неверный ввод, повторите.");
            return getInputFigure();
        }
    }

    public static String getAction() {
        out.println("Площадь или периметр?");
        Scanner scanner = new Scanner(in);
        String input = scanner.next();
        if (input.equalsIgnoreCase("площадь") || input.equalsIgnoreCase("периметр")) {
            return input;
        } else {
            out.println("Неверный ввод, повторите.");
            return getAction();
        }
    }
}