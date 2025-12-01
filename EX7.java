public class EX7 {
    public static void main(String[] args) {
            if (args.length != 1) {
            System.out.println("ERREUR");
            return;
        }
        int n;
        try {
             n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur: L'argument doit être un entier valide.");
            return;
        }
        if (n < 2) {
            System.out.println(n + " n'est pas un nombre premier.");
            return;
        }
        boolean estPremier = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                estPremier = false;
                break;             }
        }
        if (estPremier) {
            System.out.println(n + " est un nombre premier.");
        } else {
            System.out.println(n + " n'est pas un nombre premier.");
        }
    }
}