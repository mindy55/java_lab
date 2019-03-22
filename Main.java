
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int debug=0;
        Param help = new Param();
        if (args.length>0) {
            if (args[0].equals("-h") || args[0].equals("-help") || args[1].equals("-h") || args[1].equals("-help")) {
                help.help();
            }
            if (args[0].equals("-d") || args[0].equals("-debug") || args[1].equals("-d") || args[1].equals("-debug")) {
                debug++;
            }
        }

        help.menu();
        int e =0;
        int count = 0;
        int[] letters = new int[2];
        String s = "empty";
        while (e==0) {
            System.out.print("Enter your comands: ");
            Scanner in = new Scanner(System.in);
            char c = in.nextLine().charAt(0);
            if (c=='a') {
                System.out.println("Enter date: ");
                s = in.nextLine();
                count=1;
                if (debug==1){
                    for(int k=0;k<s.length();k++)
                    System.out.print(s.charAt(k)+" ");
                }

            }
            StringBuffer br = new StringBuffer(s);
            if (c == 'b') {
                if (count == 0) {
                    System.out.println("Memory is empty");
                } else {
                    System.out.println(s);
                }
            }
            if (c == 'c') {
                if (count==0){
                    System.out.println("You don`t have date");
                }
                else {
                    Audit audit = new Audit();
                    letters = audit.how_much(br,debug);
                    count=2;
                }
            }
            if (c == 'd') {
                if (count==0){
                    System.out.println("You don`t have date");
                }
                else {
                    Table table = new Table();
                    table.make_table(letters);
                }
            }
            if (c == 'e') {
                e = 1;
            }
        }

    }
}
