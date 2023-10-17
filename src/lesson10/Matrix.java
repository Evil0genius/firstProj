package lesson10;

public class Matrix implements IMatrix {
    private double[][] nums;

    public Matrix(double[][] nums) {
        this.nums = nums;
    }

    public Matrix(int row, int col) {
        if (row < 0 || row > 10 || col < 0 || col > 10) {
            nums = new double[1][1];
        } else nums = new double[row][col];
    }

    @Override
    public int getRows() {
        return nums.length;
    }

    @Override
    public int getColumns() {
        return nums[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return -1;
        }
        return nums[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < 0 || rowIndex > getRows() || colIndex < 0 || colIndex >= getColumns()) {
            return;
        }
        nums[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Not equal");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows() || this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Not equal");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Not equal");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                double productOfNumbers = 0;
                for (int k = 0; k < this.getColumns(); k++) {
                    productOfNumbers += this.getValueAt(i, k) * otherMatrix.getValueAt(k, j);
                }
                result.setValueAt(i, j, productOfNumbers);
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix transposeResult = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < transposeResult.getColumns(); i++) {
            for (int j = 0; j < transposeResult.getRows(); j++) {
                transposeResult.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return transposeResult;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }
    }

    @Override
    public double determinant() {                  //решение только для для матриц 3х3)
        double x, y, z, determinant = 0;
        x = (this.getValueAt(1, 1) * this.getValueAt(2, 2)) - (this.getValueAt(2, 1) * this.getValueAt(1, 2));
        y = (this.getValueAt(1, 0) * this.getValueAt(2, 2)) - (this.getValueAt(2, 0) * this.getValueAt(1, 2));
        z = (this.getValueAt(1, 0) * this.getValueAt(2, 1)) - (this.getValueAt(2, 0) * this.getValueAt(1, 1));

        determinant = (this.getValueAt(0, 0) * x) - (this.getValueAt(0, 1) * y) + (this.getValueAt(0, 2) * z);

        return determinant;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j && this.getValueAt(i, j) != 1) {
                    return false;
                } else if (i != j && this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return this.getRows() == this.getColumns();
    }

    @Override
    public void printToConsole() {             //входящих параметров нет поэтому может только напечатать массив
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.println(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
