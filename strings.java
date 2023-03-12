import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your nick name :");
        String nick = sc.nextLine();
        // to know length
        System.out.println("the length of the name is :" + " " + name.length());
        // charAt
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        // compare
        if (name.compareTo(nick) == 0) {
            System.out.println("strings are equal");
        } else {
            System.out.println("string are not eqaul");
        }
    }
}
