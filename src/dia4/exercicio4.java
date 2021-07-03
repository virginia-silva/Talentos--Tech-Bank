package dia4;

public class exercicio4 {
    public static void main(String[] args) {
        int num = 1;
//i is how many numbers per row
        for(int i = 1; i < 5; i++){
//prints i numbers because j increases from 0 to i, incrementing num each time
            for(int j = 0; j < i; j++){
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}
