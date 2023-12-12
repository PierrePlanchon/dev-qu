package fr.univlille.iut.info.r304;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MarketPlaceTest {

    @Test
    public void produits(){
        MarketPlace mkplace = new MarketPlace();
        Membre pierre = new Membre("Pierre", 50);
        Membre pouce = new Membre("Pouce", 50);
        Produits actions = new Produits("actions", 20, pierre);
        mkplace.ajouterMembre(pierre);
        mkplace.ajouterProduit(actions);
        assertEquals(null, mkplace.bourse.get(actions));
        mkplace.acheter(pouce, actions);
        assertEquals(pouce  , mkplace.bourse.get(actions));
        assertEquals(actions.toString(), "Pierre vend actions pour 20€.");
        assertEquals(70, pierre.getArgent());
        assertEquals(30, pouce.getArgent());
    }
}