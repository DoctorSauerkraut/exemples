public class Voiture {
  private int puissance;
  private Couleur color;
  private Distance kilometresParcourus;
  
  public void rouler() {
      Distance d = this.getDistance();
      d.incrementer(10);
  }

}
