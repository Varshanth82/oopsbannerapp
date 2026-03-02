import java.util.HashMap;
import java.util.Map;
public class oopsbannerapp {

    public static void main(String[] args) {

        // Centralized Character Pattern Storage
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        patternMap.put('S', new CharacterPattern(new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Efficient lookup using HashMap
        for (char ch : word.toCharArray()) {

            CharacterPattern pattern = patternMap.get(ch);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i]
                            .append(pattern.getPattern()[i])
                            .append("   ");
                }
            }
        }

        // Display final banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Encapsulates character banner pattern.
     */
    static class CharacterPattern {

        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}