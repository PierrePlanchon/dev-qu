import java.util.Scanner;
public class MarketPlaceController{

    private MarketPlace marketPlace;
    private Scanner scanner;

    public MarketPlaceController(MarketPlace marketPlace) {
        this.marketPlace = marketPlace;
        this.scanner = new Scanner(System.in);
    }

    public void demarrer(){
        while (true) {
            Affichage.afficherMenu();
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    ajouterMembre();
                    break;
                case 2:
                    ajouterProduit();
                    break;
                case 3:
                    acheter();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

    private void ajouterMembre() {
        System.out.println("Entrez le nom du membre : ");
        String nom = scanner.next();

        System.out.println("Entrez l'argent du membre : ");
        int argent = scanner.nextInt();

        Membre membre = new Membre(nom, argent);
        marketPlace.ajouterMembre(membre);
    }

    private void ajouterProduit() {
        System.out.println("Entrez le nom du produit : ");
        String nom = scanner.next();

        System.out.println("Entrez le prix du produit : ");
        int prix = scanner.nextInt();

        System.out.println("Entrez le nom du vendeur : ");
        String vendeurNom = scanner.next();

        //vérifier que le vendeur est bien déjà enregistré dans la liste de membres
        Membre vendeur = new Membre(vendeurNom, 50);

        Produits produit = new Produits(nom, prix, vendeur);
        marketPlace.ajouterProduit(produit);
    }

    private void acheter(){
        System.out.println("flemme de coder sah y est 23h54 mais t'as capté faut demander quel membre et quel produit il veut acheter pour ensuite appeler marketPlace.acheter(membre, produit) bref");

    }
}