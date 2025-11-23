public class Ex5 {
        public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Ex5 <entier>");
            return; 
        }
        int nombre;
        try {
            nombre = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Erreur: L'argument doit être un entier valide.");
            return;
        }
        if (nombre < 0) {
            System.out.println("La factorielle n'est pas définie pour les nombres négatifs.");
            return;
        }

        if (nombre == 0 || nombre == 1) {
            System.out.println("La factorielle de " + nombre + " est 1");
            return;
        }
        
        long factorielle = 1; 
        for (int i = 2; i <= nombre; i++) {
            factorielle = factorielle * i;
        }
        System.out.println("La factorielle de " + nombre + " est " + factorielle);
    }
}