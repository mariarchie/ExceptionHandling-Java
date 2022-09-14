public class Two {
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

// Типы исключений:
// IndexOutOfBoundException: индекс вне границ массива;
// NumberFormatException: ошибка преобразования строки в базовый тип int со знаком;
