public class EX9 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Entree invalide ");
            return;
        }
        int X; 
        int n;         
        try {
            X = Integer.parseInt(args[0]);
            n = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur: Les deux arguments doivent être des entiers valides.");
            return;
        }
        if (X < 0 || n < 0) {
            System.out.println("Erreur: X et n doivent être des entiers positifs ou nuls.");
            return;
        }
        long res = 1; 
        if (n == 0) {
            // X^0 = 1 pour tout X non nul. (Bien que 0^0 soit indéfini, on le traite comme 1 ici)
            res = 1;
        } 
        else {
            for (int i = 0; i < n; i++) {
                res *= X; 
            }
        }
        System.out.println(X + "^" + n + " = " + res);
    }
}