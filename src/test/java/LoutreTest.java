import domaine.Loutre;
import org.junit.Assert;
import org.junit.Test;

public class LoutreTest {
    private static int pointsDeVie = 10;
    private static int vitesse = 20;
    private static int position = 0;

    @Test
    public void devraitRecupererUnNombreDePointDeVieEgalA10(){
        Loutre loutre = new Loutre();
        Assert.assertEquals(pointsDeVie,loutre.getPointsDeVie());
    }

    @Test
    public void devraitRecupererUneVitesseEgalA20(){
        Loutre loutre = new Loutre();
        Assert.assertEquals(vitesse,loutre.getVitesse());
    }

    @Test
    public void devraitRecupererUnePositionEgalA0(){
        Loutre loutre = new Loutre();
        Assert.assertEquals(position,loutre.getPosition());
    }

    @Test
    public void devraitRetournerLesBonnesValeursDeLaLoutre(){
        Loutre loutre = new Loutre(100,50,25);
        Assert.assertEquals(100,loutre.getPointsDeVie());
        Assert.assertEquals(50,loutre.getVitesse());
        Assert.assertEquals(25,loutre.getPosition());

    }
}
