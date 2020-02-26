
public class Fakultät{
    
    public int fakultätIterativ(int n) {    
        int ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis = ergebnis * i;
        }
        return ergebnis; 
    }

    public int fakultätRekursiv(int n){
        if(n == 1)
            return 1;
        else
            System.out.println(fakultätIterativ(n-1) * n);
            return fakultätRekursiv(n - 1) * n;
    }
}