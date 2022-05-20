package p.day12;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {

            for(int j = i; j >=1; j--) {
                // codes
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
