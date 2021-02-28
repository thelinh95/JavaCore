/**
 * @author linh.truongthe
 *
 * refer doc: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 */

public class ShadowTest {
    public int x = 0;

    class FistClass {
        public int x = 1;

        public void methodInFirstClass(int x){
            System.out.println("x: " + x);
            System.out.println("this.x: " + this.x);
            System.out.println("outer.x: " + ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest t = new ShadowTest();

        FistClass fistClass = t.new FistClass();
        fistClass.methodInFirstClass(23);
    }

}
