public class Main {

    public static void main(String[] args) {

        VueCatalogue vueCatalogue1 = new VueCatalogue(new DessinUnVehiculeLigne());
        vueCatalogue1.dessine();

        System.out.println("------------------Next-------------------------");

        VueCatalogue vueCatalogue2 = new VueCatalogue(new DessinTroisVehiculesLigne());
        vueCatalogue2.dessine();
    }
}
