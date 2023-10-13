package lesson5;

import static lesson5.MathUtils.getChoose;

public class Main {
    public static void main(String[] args) {
        ScannerUtils.printFigurs();
        String figure = ScannerUtils.getInputFigure();
        String action = ScannerUtils.getAction();
        System.out.println(getChoose(figure, action));
    }
}
