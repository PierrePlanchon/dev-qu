
public class Membre{

    private String nom;
    private int argent;

    public Membre(String nom, int argent){
        this.nom = nom;
        this.argent = argent;
    }

    public String getNom(){
        return this.nom;
    }

    public int getArgent(){
        return this.argent;
    }

    public void setArgent(int newArgent){
        this.argent = newArgent;
    }

    public boolean equals(Membre membre){
        if (this.nom.equals(membre.nom) && this.argent == membre.argent) return true;
        return false;
    }
}