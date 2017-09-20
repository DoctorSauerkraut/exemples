public class Voiture {
  private int puissance;
  private Couleur color;
  private KilometrageMoteur kmMot;
  
  public void rouler() {
      Distance d = kmMot.getDistanceTemporaire().getValeur();
      d.incrementer(10);
  }
}
