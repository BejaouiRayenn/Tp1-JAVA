public class Ex5 {

    /**
     * Calcule et affiche la factorielle de l'entier passé en argument.
     * Le programme attend un seul argument entier en ligne de commande.
     */
    public static void main(String[] args) {
        // 1. Vérification des arguments
        if (args.length != 1) {
            System.out.println("Usage: java Ex5 <entier>");
            return; // Arrêter le programme si l'argument est manquant
        }

        // 2. Conversion de l'argument en entier
        int nombre;
        try {
            nombre = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur: L'argument doit être un entier valide.");
            return;
        }

        // 3. Calcul de la factorielle
        
        // La factorielle n'est définie que pour les nombres entiers non négatifs (n >= 0).
        if (nombre < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
            return;
        }

        // Cas de base : 0! = 1 et 1! = 1
        if (nombre == 0 || nombre == 1) {
            System.out.println("La factorielle de " + nombre + " est 1");
            return;
        }
        
        // Initialiser le résultat à 1 (neutre pour la multiplication)
        long factorielle = 1; 

        // Calculer n! = 1 * 2 * 3 * ... * n
        for (int i = 2; i <= nombre; i++) {
            factorielle = factorielle * i;
        }

        // 4. Affichage du résultat
        System.out.println("La factorielle de " + nombre + " est " + factorielle);
    }
}