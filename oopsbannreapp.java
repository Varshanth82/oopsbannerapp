/**
 * UC6 - OOPS Banner App
 * Uses static helper methods to generate character patterns.
 * Follows DRY principle and improves modularity.
 *
 * @author Varshanth
 * @version 1.5
 */
public class oopsbannreapp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[] {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[] {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
    }
}