
public class Audit {
    public int[] how_much(StringBuffer s,int debug){
        int vowels=0,consonant=0,count=0;
        char[] a={'a','e','y','u','i','o'};
        char[] b={'q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m',};
        for (int i =0;i<s.length();i++){
            for (int j=0;j<a.length;j++){
                if (a[j]==s.charAt(i)){
                    vowels++;
                }


            }
            for (int f=0; f<b.length;f++){
                if (b[f]==s.charAt(i)){
                    consonant++;
                }
            }
        }
        int[] letters = {vowels,consonant};
        if (debug == 1) {
            for (int k = 0; k < a.length; k++) {
                System.out.print(a[k] + " ");
            }
            for (int k = 0; k < b.length; k++) {
                System.out.print(b[k] + " ");
            }
        }
        return letters;

    }
}
