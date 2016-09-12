import java.util.ArrayList;

/**
 * Created by yassirhessane on 6/08/16.
 */
public class VueCatalogue {

    protected ArrayList<VueVehicule> contenu;
    protected DessinCatalogue dessin;

    public VueCatalogue(DessinCatalogue dessin)
    {
        this.contenu = new ArrayList<>();
        this.contenu.add(
                (new VueVehicule("Véhicule bon marché"))
        );this.contenu.add(
            (new VueVehicule("Véhicule spacieux")
        ));this.contenu.add(
            (new VueVehicule("Véhicule rapide")
        ));this.contenu.add(
            (new VueVehicule("Véhicule confortable")
        ));this.contenu.add(
            (new VueVehicule("Véhicule sportif")
        ));

        this.dessin = dessin;

    }

    public void dessine()
    {
        this.dessin.dessine(this.contenu);
    }
}
