public class Param {
    public void help(){
        System.out.println("**The program is written by Anastasia Grinishyn.");
        System.out.println("**Version 1.0");
        System.out.println("**What this program do:");
        System.out.println("**Enter text. Determine and display\n" +
                "  which letters (vowels or consonants)\n" +
                "  are more in each sentence of the text. \n" +
                "  Output as a table.");
        System.out.println("**Parameters: -help(-h), -debug(-d)");
        System.out.println("**Commands: \n" +
                           "            Enter data\n" +
                           "            View data\n" +
                           "            Calculate\n" +
                           "            See the result\n" +
                           "            exit");

    }
    public void menu(){
        System.out.println("Commands: \n" +
                " Enter data - a\n" +
                " View data - b\n" +
                " Calculate - c\n" +
                " See the result - d\n" +
                " exit - e");
    }
    public void debag(){
        System.out.println("");

    }
}