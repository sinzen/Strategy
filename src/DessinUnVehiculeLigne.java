import java.util.ArrayList;

/**
 * Created by yassirhessane on 6/08/16.
 */
public class DessinUnVehiculeLigne implements DessinCatalogue {


    @Override
    public void dessine(ArrayList<VueVehicule> contenu) {
        
        System.out.println("Dessine les véhicule avec un véhicule par ligne");

        for(int i=0;i<contenu.size();i++)
        {
            contenu.get(i).dessine();
            System.out.println();
        }

    }
}
