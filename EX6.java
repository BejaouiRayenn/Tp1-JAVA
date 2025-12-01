public class EX6 {
    public static void main(String[] args) {
         final int NOMBRE_ATTENDU = 6;
        if (args.length != NOMBRE_ATTENDU) {
            System.out.println("ERREUR:");
            return;
        }
        int max = 0;
        int nbCourant;
        try {
            max = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) {
                nbCourant = Integer.parseInt(args[i]);
                if (nbCourant > max) {
                    max = nbCourant;
                }
            }
            System.out.println("Le maximum est = " + max);

        } catch (NumberFormatException e) {
            System.out.println(" Tous les arguments doivent être des entiers valides.");
        }
    }
}