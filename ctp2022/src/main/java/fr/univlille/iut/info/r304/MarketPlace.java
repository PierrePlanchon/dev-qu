import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MarketPlace {
    private ArrayList<Membre> membres;
    private Map<Produits, Membre> bourse;

    public MarketPlace(){
        this.membres = new ArrayList<>();
        this.bourse = new HashMap<>();
    }

    public void ajouterMembre(Membre membre){
        this.membres.add(membre);
    }   

    public void ajouterProduit(Produits produit){
        this.bourse.put(produit, null);
    }

    public void acheter(Membre acheteur, Produits produit){
        if(acheteur.getArgent() >= produit.getPrix()){
            acheteur.setArgent(acheteur.getArgent() - produit.getPrix());
            produit.getVendeur().setArgent(produit.getVendeur().getArgent() + produit.getPrix());
            bourse.put(produit, acheteur);
        }            
    }
}
