public class Main {
    public static void main(String[] args) {
        CustomStringBuilder stringBuilder = new CustomStringBuilder("Hello");
        stringBuilder.append("hi");
        stringBuilder.append("hiiii");
        System.out.println(stringBuilder);
        stringBuilder.undo();
        System.out.println(stringBuilder);
    }

}