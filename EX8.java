public class EX8 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("ERRUER");
            return;
        }
        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("NON VALIDE ");
            return;
        }
        if (N <= 0) {
            System.out.println("La taille doit être un entier positif.");
            return;
        }
        for (int k = 1; k <= N; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            System.out.println();
        }
    }
}