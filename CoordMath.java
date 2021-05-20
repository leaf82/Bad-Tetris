public class CoordMath {
    public static int xMath(int fullCoord) {
        return (int)fullCoord/10000;
    }

    public static int yMath(int fullCoord) {
        return fullCoord%10000;
    }
}