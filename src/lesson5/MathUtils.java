package lesson5;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static lesson5.ScannerUtils.inputVar;


public class MathUtils {

    public static String getChoose(String figure, String action) {

        if (figure.equals(inputVar[0]) || figure.equalsIgnoreCase("круг")) {
            out.println("Введите радиус:");
            if (action.equalsIgnoreCase("площадь")) {
                return ("Площадь круга: " + sircleSquare());   //radius*3.14
            } else return ("Периметр круга: " + sirclePerimeter());

        } else if (figure.equals(inputVar[1]) || figure.equalsIgnoreCase("квадрат")) {
            out.println("Введите сторону:");
            if (action.equalsIgnoreCase("площадь")) {
                return ("Площадь квадрата: " + squareSquare());
            } else return ("Периметр квадрата: " + squarePerimeter());

        } else if (figure.equals(inputVar[2]) || figure.equalsIgnoreCase("треугольник")) {
            if (action.equalsIgnoreCase("площадь")) {
                return ("Площадь треугольника: " + triangleSquare());
            } else return "Периметр треугольника: " + trianglePerimeter();

        } else if (figure.equals(inputVar[3]) || figure.equalsIgnoreCase("овал")) {
            if (action.equalsIgnoreCase("площадь")) {
                return ("Площадь овала: " + ellipseSquare());
            } else return ("Периметр овала: " + ellipsePerimeter());

        } else if (figure.equals(inputVar[4]) || figure.equalsIgnoreCase("трапеция")) {
            if (action.equalsIgnoreCase("площадь")) {
                return ("Площадь трапеции: " + trapezoidSquare());
            } else {
                out.println("Введите сторону С:");
                return ("Периметр трапеции: " + trapezoidPerimeter());
            }
        } else return null;
    }

    private static double sircleSquare (){
        double radius = getParameter();
        return radius * Math.PI;}
    private static double sirclePerimeter(){
        double radius = getParameter();
        return radius * Math.PI * 2;}
    private static double squareSquare(){
        double side = getParameter();
        return side * 2;}
    private static double squarePerimeter(){
        double side = getParameter();
        return side * 4;}

    private static double triangleSquare (){
        out.println("Введите сторону А:");
        double a = getParameter();
        out.println("Введите сторону B:");
        double b = getParameter();
        out.println("Введите сторону С:");
        double c = getParameter();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));}

    private static double trianglePerimeter(){
        out.println("Введите сторону А:");
        double a = getParameter();
        out.println("Введите сторону B:");
        double b = getParameter();
        out.println("Введите сторону С:");
        double c = getParameter();
        return a + b + c;}

    private static double ellipseSquare(){
        out.println("Введите малую полуось:");
        double a = getParameter();
        out.println("Введите большую полуось:");
        double b = getParameter();
        return a * b * Math.PI;}

    private static double ellipsePerimeter(){
        out.println("Введите малую полуось:");
        double a = getParameter();
        out.println("Введите большую полуось:");
        double b = getParameter();
        return 4 * (Math.PI * a * b + (a - b) * (a - b)) / (a + b);}

    private static double trapezoidSquare(){
        out.println("Введите сторону А:");
        double a = getParameter();
        out.println("Введите сторону B:");
        double b = getParameter();
        out.println("Введите высоту:");
        double h = getParameter();
        return (a + b) * h / 2;}
    private static double trapezoidPerimeter(){
        out.println("Введите сторону А:");
        double a = getParameter();
        out.println("Введите сторону B:");
        double b = getParameter();
        out.println("Введите сторону С:");
        double c = getParameter();
        out.println("Введите сторону D:");
        double d = getParameter();
        return (a + b + c + d);}





    private static double getParameter() {

        Scanner scanner = new Scanner(in);
        String inputCheck = scanner.next();
        if (isNumeric(inputCheck)) {
            double inputDouble = Double.parseDouble(inputCheck);
            if (inputDouble > 0) {
                return inputDouble;
            } else {
                out.println("Отрицательное число или ноль");
                return getParameter();
            }
        } else {
            out.println("Вы ввели не число");
            return getParameter();
        }
    }

    private static boolean isNumeric(String inputCheck) {
        try {
            Double.parseDouble(inputCheck);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
