public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1234567890123456789");

        System.out.println(sb.capacity());
    }
}
