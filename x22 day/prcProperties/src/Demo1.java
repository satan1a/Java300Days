import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Demo1{

    public static void main(String[] args) {
        String string = "Gandalf the GRAY";

        System.out.println(string.substring(3,14));
        System.out.println(string.substring(2));
        System.out.println("str1".replace("r", "ackerman"));
        toUpperCase(string);
    }
}