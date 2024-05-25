
package gitossz;


public class GitOssz {
    
    public static int[] szamok;

 
    public static void main(String[] args) {
        
        int[] tomb = feltoltes();
        osszegzes(tomb);
        megszamlalas(tomb);
        maximumKivalasztas(tomb);
        tombKiir(tomb);
    
    }

    private static int[] feltoltes() {
        szamok = new int[5];
        for (int i = 0; i < szamok.length; i++) {
            szamok[i] = (int)(Math.random()*6)+1;
        }
    return szamok;
    }
    private static void osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        System.out.println("szamok összege: " + osszeg);
    }
    private static void megszamlalas(int[] tomb) {
        int db = 0;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i] % 2 == 0){
                db++;
            }
        }
        System.out.println("párosak száma: " + db);
    }
    private static void maximumKivalasztas(int[] tomb) {
        int maxIndex = 0;
        for (int i = 1; i < tomb.length; i++) {

            if(tomb[i] > tomb[maxIndex]){
                maxIndex = i;
            }
        }
        System.out.println("A legnagyobb szám helye: " + maxIndex);
        System.out.println("A legnagyobb szám értéke: " + tomb[maxIndex]);
    
    }

    private static void tombKiir(int[] tomb) {
        for (int i = 0; i < tomb.length; i++) {
            System.out.printf("%d ",tomb[i]);
        }
        System.out.println("");
    }
  
}
