import java.util.ArrayList;

/**
 * Created by yassirhessane on 6/08/16.
 */
public class DessinTroisVehiculesLigne implements DessinCatalogue {

    @Override
    public void dessine(ArrayList<VueVehicule> contenu) {

        System.out.println("Dessine les véhicule avec trois véhicule par ligne");
        int compteur = 0;
        for(int i=0;i<contenu.size();i++)
        {
            contenu.get(i).dessine();
            compteur++;
            if (compteur == 3)
            {
                System.out.println();
                compteur = 0;
            }
            else
            {
                System.out.print(" ");
            }
        }
        if (compteur != 0)
        {
            System.out.println();

        }
        System.out.println();

    }
}
