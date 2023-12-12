
public class Produits {
    private String nom;
    private int prix;
    private Membre vendeur;

    public Produits(String nom, int prix, Membre vendeur) {
        this.nom = nom;
        this.prix = prix;
        this.vendeur = vendeur;
    }

    public String toString(){
        return this.vendeur.getNom()+" vend "+this.nom+" pour "+this.prix+"€.";
    }

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public Membre getVendeur() {
        return vendeur;
    }

    public boolean equals(Produits produit){
        if (this.nom.equals(produit.nom) && this.prix == produit.prix && this.vendeur.equals(produit.vendeur)) return true;
        return false;
    }
}
