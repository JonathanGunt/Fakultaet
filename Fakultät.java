
public class Fakultät{
    
    public int fakultätIterativ(int n) {
            
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println("Berechne Iterativ: " + ergebnis +  " * " + i);
            ergebnis = ergebnis * i;
            System.out.println(" = " + ergebnis);
        }
        return ergebnis; 
    }

    public int fakultätRekursiv(int n){
        if(n <= 1)
            return 1;
        else
            return fakultätRekursiv(n - 1) * n;
            
    }

}