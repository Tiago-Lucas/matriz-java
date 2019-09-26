import java.util.Scanner;
import java.util.Locale;

public class AprendendoMatriz {
    public static void main(String[] args) {
        
        Scanner Leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite o valor:");
        int n = Leia.nextInt();
        int[][] mat = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = Leia.nextInt();
            }
        }
        int contar = 0;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             if(mat[i][j] < 0){
                contar++;
                 System.out.print("numero negativo:" + contar);
             }
            }
    }
}
}

