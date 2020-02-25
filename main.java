/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        int n = 5;
        int iterativ = new Fakultät().fakultätIterativ(n);
        int rekursiv = new Fakultät().fakultätRekursiv(n);

        System.out.println("----- Itereativ ----");
        System.out.println(iterativ);
        System.out.println("----- Rekursiv -----");
        System.out.println(rekursiv);
    }
}