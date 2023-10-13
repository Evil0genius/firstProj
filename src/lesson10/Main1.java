package lesson10;

public class Main1 {
    public static void main(String[] args) {

        double[][] forA = {{2,4,7,8},{1,2,3,4,},{5,6,7,8}};
        double[][] forB = {{9,8,6,3},{2,3,6,8,},{1,7,2,5}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forB);
        double value = 0;

        IMatrix resultAdd = a.add(b);
        resultAdd.printToConsole();
        IMatrix resultSub = a.sub(b);
        resultSub.printToConsole();
        IMatrix resultMul = a.mul(b);
        resultMul.printToConsole();
        IMatrix resultMulToValue = a.mul(value);
        resultMulToValue.printToConsole();
        IMatrix transposeResult = a.transpose();
        transposeResult.printToConsole();

        boolean isNullMatrix = a.isNullMatrix();

    }
}
