package test;

import junit.framework.TestCase;

public class MatrixTestCase extends TestCase {

    public void testDeterminantTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest2() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest3() {

        double[][] forMatrix = {{1, 2, 3, 16, 21}, {4, 5, 6, 17, 22}, {7, 8, 9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest4() {

        double[][] forMatrix = {{23, 0, 4, 0}, {0, 54, 0, -4343}, {9, 0, 0, 0}, {0, -54, 67, 454}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 7560216.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest5() {

        double[][] forMatrix = {{1.1, 2.2, 3.3, 0}, {4.4, 5.5, 6.6, 0}, {7.7, 8.8, 9.9, 0},{0,0,0,0}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultFact, resultWant);
    }

    public void testDeterminantTest6() {

        double[][] forMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -1.1}};
        Matrix matrix = new Matrix(forMatrix);
        double resultFact = matrix.determinant();
        double resultWant = -31.944000000000017;
        assertEquals(resultFact, resultWant);
    }
    public void testDeterminantTest7() {

        double[][] forMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        Matrix matrix = new Matrix(forMatrix);
        double delta = 0.000001;
        double resultFact = matrix.determinant();
        double resultWant = 0.0;
        assertEquals(resultWant, resultFact, delta);
    }


    public void testTransposeTest1() {

        double[][] forMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        double[][] forMatrixResult = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testTransposeTest2() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        double[][] forMatrixResult = {{-1, -4, -7}, {-2, -5, -8}, {-3, -6, -9}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testTransposeTest3() {

        double[][] forMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] forMatrixResult = {{1.1, 4.4, 7.7}, {2.2, 5.5, 8.8}, {3.3, 6.6, 9.9}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testTransposeTest4() {

        double[][] forMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        double[][] forMatrixResult = {{-1.1, -4.4, -7.7}, {-2.2, -5.5, -8.8}, {-3.3, -6.6, -9.9}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testTransposeTest5() {

        double[][] forMatrix = {{1, 2, 3, 16, 21}, {4, 5, 6, 17, 22}, {7, 8, 9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] forMatrixResult = {{1, 4, 7, 10, 13}, {2, 5, 8, 11, 14}, {3, 6, 9, 12, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testTransposeTest6() {

        double[][] forMatrix = {{-1, -2, -3, -16, -21}, {-4, -5, -6, -17, -22}, {-7, -8, -9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] forMatrixResult = {{-1, -4, -7, 10, 13}, {-2, -5, -8, 11, 14}, {-3, -6, -9, 12, 15}, {-16, -17, 18, 19, 20}, {-21, -22, 23, 24, 25}};
        Matrix matrix = new Matrix(forMatrix);
        IMatrix resultFact = matrix.transpose();
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testIsNullTest1() {
        double[][] forMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isNullMatrix());
    }

    public void testIsNullTest2() {
        double[][] forMatrix = {{-1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isNullMatrix());
    }

    public void testIsNullTest3() {
        double[][] forMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertTrue(matrix.isNullMatrix());
    }

    public void testIsNullTest4() {
        double[][] forMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertTrue(matrix.isNullMatrix());
    }

    public void testIsIdentityTest1() {              //нашел баг в isIdentityMatrix, пришлось немного переписать  штоб заработало
        double[][] forMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isIdentityMatrix());
    }

    public void testIsIdentityTest2() {
        double[][] forMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isIdentityMatrix());
    }

    public void testIsIdentityTest3() {
        double[][] forMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isIdentityMatrix());
    }

    public void testIsIdentityTest4() {
        double[][] forMatrix = {{5, 0, 0}, {0, -1, 0}, {0, 0, 100}, {0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        assertFalse(matrix.isIdentityMatrix());
    }

    public void testIsIdentityTest5() {
        double[][] forMatrix = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        Matrix matrix = new Matrix(forMatrix);
        assertTrue(matrix.isIdentityMatrix());
    }

    public void testAddTest1() {

        double[][] forMatrix = {{-1, -2, -3, -16, -21}, {-4, -5, -6, -17, -22}, {-7, -8, -9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{-1, -4, -7, 10, 13}, {-2, -5, -8, 11, 14}, {-3, -6, -9, 12, 15}, {-16, -17, 18, 19, 20}, {-21, -22, 23, 24, 25}};
        double[][] forMatrixResult = {{-2, -6, -10, -6, -8}, {-6, -10, -14, -6, -8}, {-10, -14, -18, 30, 38}, {-6, -6, 30, 38, 44}, {-8, -8, 38, 44, 50}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.add(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testAddTest2() {

        double[][] forMatrix = {{1, 2, 3, 16, 21}, {4, 5, 6, 17, 22}, {7, 8, 9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{1, 4, 7, 10, 13}, {2, 5, 8, 11, 14}, {3, 6, 9, 18, 23}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        double[][] forMatrixResult = {{2, 6, 10, 26, 34}, {6, 10, 14, 28, 36}, {10, 14, 18, 36, 46}, {26, 28, 30, 38, 44}, {34, 36, 38, 44, 50}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.add(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testAddTest3() {

        double[][] forMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] otherForMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        double[][] forMatrixResult = {{0, 0, 0,}, {0, 0, 0,}, {0, 0, 0,}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.add(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testAddTest4() {

        double[][] forMatrix = {{1.1, 2.2, 3.3, 4.4}, {4.4, 5.5, 6.6, 7.7}, {7.7, 8.8, 9.9, 8.8}};
        double[][] otherForMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        assertNull(matrix.add(otherMatrix));
    }

    public void testSubTest1() {

        double[][] forMatrix = {{-1, -2, -3, -16, -21}, {-4, -5, -6, -17, -22}, {-7, -8, -9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{-1, -4, -7, 10, 13}, {-2, -5, -8, 11, 14}, {-3, -6, -9, 12, 15}, {-16, -17, 18, 19, 20}, {-21, -22, 23, 24, 25}};
        double[][] forMatrixResult = {{0, 2, 4, -26, -34}, {-2, 0, 2, -28, -36}, {-4, -2, 0, 6, 8}, {26, 28, -6, 0, 4}, {34, 36, -8, -4, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.sub(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testSubTest2() {

        double[][] forMatrix = {{1, 2, 3, 16, 21}, {4, 5, 6, 17, 22}, {7, 8, 9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{1, 4, 7, 10, 13}, {2, 5, 8, 11, 14}, {3, 6, 9, 12, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        double[][] forMatrixResult = {{0, -2, -4, 6, 8}, {2, 0, -2, 6, 8}, {4, 2, 0, 6, 8}, {-6, -6, -6, 0, 4}, {-8, -8, -8, -4, 0}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.sub(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testSubTest3() {

        double[][] forMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] otherForMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] forMatrixResult = {{0, 0, 0,}, {0, 0, 0,}, {0, 0, 0,}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.sub(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testSubTest4() {

        double[][] forMatrix = {{1.1, 2.2, 3.3, 4.4}, {4.4, 5.5, 6.6, 7.7}, {7.7, 8.8, 9.9, 8.8}};
        double[][] otherForMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        assertNull(matrix.sub(otherMatrix));
    }

    public void testMulTest1() {

        double[][] forMatrix = {{-1, -2, -3, -16, -21}, {-4, -5, -6, -17, -22}, {-7, -8, -9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{-1, -4, -7, 10, 13}, {-2, -5, -8, 11, 14}, {-3, -6, -9, 12, 15}, {-16, -17, 18, 19, 20}, {-21, -22, 23, 24, 25}};
        double[][] forMatrixResult = {{711, 766, -721, -876, -931}, {766, 850, -690, -1018, -1102}, {-721, -690, 1047, 628, 597}, {-876, -1018, 628, 1302, 1444}, {-931, -1102, 597, 1444, 1615}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.mul(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testMulTest2() {

        double[][] forMatrix = {{1, 2, 3, 16, 21}, {4, 5, 6, 17, 22}, {7, 8, 9, 18, 23}, {10, 11, 12, 19, 24}, {13, 14, 15, 20, 25}};
        double[][] otherForMatrix = {{1, 4, 7, 10, 13}, {2, 5, 8, 11, 14}, {3, 6, 9, 12, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        double[][] forMatrixResult = {{711, 766, 821, 876, 931}, {766, 850, 934, 1018, 1102}, {821, 934, 1047, 1160, 1273}, {876, 1018, 1160, 1302, 1444}, {931, 1102, 1273, 1444, 1615}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.mul(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testMulTest3() {

        double[][] forMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] otherForMatrix = {{1.1, 2.2, 3.3}, {4.4, 5.5, 6.6}, {7.7, 8.8, 9.9}};
        double[][] forMatrixResult = {{36.300000000000004, 43.56, 50.82}, {79.86, 98.00999999999999, 116.16}, {123.42000000000002, 152.46, 181.5}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        Matrix resultWant = new Matrix(forMatrixResult);
        IMatrix resultFact = matrix.mul(otherMatrix);
        assertEquals(resultWant, resultFact);
    }

    public void testMulTest4() {

        double[][] forMatrix = {{1.1, 2.2, 3.3, 4.4}, {4.4, 5.5, 6.6, 7.7}, {7.7, 8.8, 9.9, 8.8}};
        double[][] otherForMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        Matrix matrix = new Matrix(forMatrix);
        Matrix otherMatrix = new Matrix(otherForMatrix);
        assertNull(matrix.mul(otherMatrix));
    }

    public void testMulValueTest1() {

        double[][] forMatrix = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        double[][] forMatrixResult = {{-2, -4, -6}, {-8, -10, -12}, {-14, -16, -18}};
        Matrix matrix = new Matrix(forMatrix);
        double value = 2;
        IMatrix resultFact = matrix.mul(value);
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);

    }

    public void testMulValueTest2() {

        double[][] forMatrix = {{-1.1, -2.2, -3.3}, {-4.4, -5.5, -6.6}, {-7.7, -8.8, -9.9}};
        double[][] forMatrixResult = {{-2.2, -4.4, -6.6}, {-8.8, -11, -13.2}, {-15.4, -17.6, -19.8}};
        Matrix matrix = new Matrix(forMatrix);
        double value = 2;
        IMatrix resultFact = matrix.mul(value);
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

    public void testMulValueTest3() {

        double[][] forMatrix = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        double[][] forMatrixResult = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(forMatrix);
        double value = -1.25;
        IMatrix resultFact = matrix.mul(value);
        Matrix resultWant = new Matrix(forMatrixResult);
        assertEquals(resultWant, resultFact);
    }

}
