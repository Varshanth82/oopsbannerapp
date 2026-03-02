public class oopsbannerappuc7 {

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern oPattern = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        // Word to render
        String word = "OOPS";

        StringBuilder[] bannerLines = new StringBuilder[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Render horizontally
        for (char ch : word.toCharArray()) {

            CharacterPattern currentPattern = null;

            if (ch == 'O') currentPattern = oPattern;
            if (ch == 'P') currentPattern = pPattern;
            if (ch == 'S') currentPattern = sPattern;

            if (currentPattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i]
                            .append(currentPattern.getPattern()[i])
                            .append("   ");
                }
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Static Inner Class to encapsulate character pattern mapping.
     */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}
