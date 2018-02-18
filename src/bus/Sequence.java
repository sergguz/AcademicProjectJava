package bus;

public class Sequence {
    private static int index = 1;

    public static int getIndex() {
        return Sequence.index++;
    }
}
