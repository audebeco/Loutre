package domaine;

public class Loutre {
    private int pointsDeVie = 10;
    private int vitesse = 20;
    private int position = 0;

    public Loutre(){};

    public Loutre(int pointsDeVie, int vitesse, int position) {
        this.pointsDeVie = pointsDeVie;
        this.vitesse = vitesse;
        this.position = position;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getPosition() {
        return position;
    }

}
