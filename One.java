public class One {
    public static void devisionByZero(String[] args) {
        int n = 256 / 0;
        System.out.println(n);
    }

    public static void arrayIndex() {
        int[] array = new int[10];
        System.out.println(array[101]);
    }

    public static void nullString() {
        String str = null;
        System.out.println(str.length());
    }

}
