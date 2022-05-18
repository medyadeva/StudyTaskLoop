public class StringMethods03 {

    public static void main(String[] args) {
    String message=new String("hello world");
     message="hello world  "+ "!...";
    boolean isMessageStartsWithHello=message.startsWith("hello");
    message.toUpperCase();
        System.out.println(isMessageStartsWithHello);

    System.out.println( message.toUpperCase());

    System.out.println(message);

    }
}
