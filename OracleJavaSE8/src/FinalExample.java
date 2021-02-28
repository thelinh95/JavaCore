/**
 * @author linh.truongthe
 */

public class FinalExample {
    private final int field;
    public static final int staticField = 1000_000;

    public FinalExample() {
        this.field = 1;
    }

    public void changeValue(final int param) {
//        param = 2; compile-time error
        final int localVar;
        localVar = 42;
//        localVar = 43; complie-time error
    }
}
