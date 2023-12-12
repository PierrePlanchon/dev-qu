public class Main{

    public static void main(String[] args){
        MarketPlace mkplace = new MarketPlace();
        MarketPlaceController controller = new MarketPlaceController(mkplace);
        controller.demarrer();
    }
}