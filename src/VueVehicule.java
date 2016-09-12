/**
 * Created by yassirhessane on 6/08/16.
 */
public class VueVehicule {

    protected String description;

    public VueVehicule(String description) {
        this.description = description;
    }

    public void dessine()
    {
        System.out.print(this.description);
    }
}
