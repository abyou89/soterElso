
package gitossz;


public class GitOssz {
    
    public static int[] szamok;

 
    public static void main(String[] args) {
        
        int[] tomb = feltoltes();
        tombKiir(tomb);
    
    }

    private static int[] feltoltes() {
        szamok = new int[5];
        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = (int)(Math.random()*6)+1;
        }
    return szamok;
    }

    private static void tombKiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("%d", tomb[i]);
        }
    }
    
}
