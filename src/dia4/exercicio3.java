package dia4;

public class exercicio3 {
    public static void main(String[] args)
    {
        int i,j,k=1;
        int cont = 1;
        for (i=10; i>=cont; i--){
            for (j=1; j<=10-i; j++){
                System.out.print(" ");
            }
            for (j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(' ');
    }
}
