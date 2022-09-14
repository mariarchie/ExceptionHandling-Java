import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 2, 24, 6, 6, 13, 2 };
        int[] array2 = new int[] { 8, 2, 1, 98, 14, 0, 1, 9 };

        System.out.println(difference(array1, array2));

    }

    public static String difference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] resultArr = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            resultArr[i] = array1[i] - array2[i];
        }
        return Arrays.toString(resultArr);

    }
}
