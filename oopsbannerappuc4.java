public class oopsbannerappuc4 {

    public static void main(String[] args) {

        String[] banner = {

            String.join("", " *****   ", " *****   ", " *****    ", " **** "),
            String.join("", "*     * ", "*     * ", "*     *  ", "*    *"),
            String.join("", "*     * ", "*     * ", "*     *  ", "*     "),
            String.join("", "*     * ", "*     * ", "*     *   ", " **** "),
            String.join("", "*     * ", "*     * ", "*     *       ", "*"),
            String.join("", "*     * ", "*     * ", "*     *  ", "*    *"),
            String.join("", " *****   ", " *****   ", " *****    ", " **** ")
        };

        // Enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
