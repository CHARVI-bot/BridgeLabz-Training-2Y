public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;

        input = input.toLowerCase();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String test = "Hello, CHARVI! Java is powerful.";
        countVowelsAndConsonants(test);
    }
}