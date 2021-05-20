public class TestCoordMath {
    public int xMath(int fullCoord) {
        return (int)fullCoord/10000;
    }

    public int yMath(int fullCoord) {
        return fullCoord%10000;
    }
}