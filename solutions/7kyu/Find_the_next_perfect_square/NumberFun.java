public class NumberFun {
    public static long findNextSquare(long sq) {
        if (sq % Math.sqrt(sq) !=0) return -1;

        return (long) Math.pow(sq / Math.sqrt(sq) + 1, 2);
    }
}