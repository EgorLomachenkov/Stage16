package by.itstep.lomachenkov.stage16.task6.model;

import by.itstep.lomachenkov.stage16.util.MatrixGenerator;

public class VectorLogic {
    //O(N + M)
    public static int[] getNewVector(int[] firstVector, int[] secVector) {
        int[] vector = MatrixGenerator.createVector(firstVector, secVector);

        int i = 0, j = 0, k = 0;

        while (i < firstVector.length && j < secVector.length) {
            vector[k++] = firstVector[i] < secVector[j]
                    ? firstVector[i++] : secVector[j++];
        }

        for (; j < secVector.length; j++) {
            vector[k++] = secVector[j];
        }

        for (; i < firstVector.length; i++) {
            vector[k++] = firstVector[i];
        }

        return vector;
    }

    public static boolean isIncreaseTest(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < vector[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
