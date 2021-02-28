public class DataType {
    public static void main(String[] args) {
        int i = 1000_000;
        float f = 2.3f;
        float fe = 2.3e5f;

        String s1 = "abc";
        String s2 = "ef";

        String s3 = s1 + s2 + ';';

        System.out.printf("%f \n %f", f, fe);
    }
}
