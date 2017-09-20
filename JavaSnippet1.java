public class Voiture {
  private int puissance;
  private Couleur color;
  
  public void rouler() {
      Distance d = this.getDistanceTemporaire();
      d.incrementer(10);
  }
}
