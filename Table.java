public class Table {
    public void make_table(int[] letters){
        int r,y;
        int[] x;
        if (letters[0]>letters[1]){
            r=letters[0];
        }
        else {
            r=letters[1];
        }
        System.out.print("+-----------+--");
        x=ture(r,letters);
        System.out.println();
        System.out.print("| vowels    | ");
        if (x[0]>x[1]){
            System.out.print(letters[0]+" |");
        }
        else {
            y=x[1];
            System.out.print(letters[0]);
            while (y > x[0]) {
                System.out.print(" ");
                y--;
            }
            System.out.print(" |");
        }
        System.out.println();
        System.out.print("+-----------+--");
        ture(r,letters);
        System.out.println();
        System.out.print("| consonant | ");
        if (x[1]>x[0]){
            System.out.print(letters[0]+" |");
        }
        else {
            y=x[0];
            System.out.print(letters[1]);
            while (y > x[1]) {
                System.out.print(" ");
                y--;
            }
            System.out.print(" |");
        }
        System.out.println();
        System.out.print("+-----------+--");
        ture(r,letters);
        System.out.println();
    }
    private int[] ture(int r,int[] letters){
        int[] x=new int[2];
        int z=letters[0];
        int q=letters[1];
        while (r>9){
            System.out.print("-");
            r=r/10;
        }
        while (z>9){
            z=z/10;
            x[0]++;
        }
        while (q>9){
            q=q/10;
            x[1]++;
        }

        System.out.print("-+");
        return x;
    }
}
