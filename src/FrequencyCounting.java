public class FrequencyCounting {
    public static void main(String[] args) {
        String sentence = "mmmmikita";
        int[] frequency = new int[26]; // Array to store frequency of each letter

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') { // Ensure the character is a lowercase letter
                int index = c - 'a';
                frequency[index]++;
            }
        }

        // Print frequencies
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frequency[i]);
            }
        }
    }

}
