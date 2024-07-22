import java.util.Scanner;

public class Pangram {
    public static boolean checkIfPangram(String sentence) {
        boolean[] vis = new boolean[26];
        for (int i = 0; i < sentence.length(); ++i) {
            vis[sentence.charAt(i) - 'a'] = true;
        }
        for (boolean v : vis) {
            if (!v) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the string you want to check is a PANGRAM.");
        String sentence = scan.next();

        System.out.println("The given string is PANGRAM: "+checkIfPangram(sentence));
    }
}
