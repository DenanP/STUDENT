package moj;

public class Datum {
  //Attributes
  private int dan, mjesec, godina;
  //Methods
  public Datum(int dan, int mjesec, int godina) {this.dan = dan; this.mjesec = mjesec; this.godina = godina;}
  public String Ispisi() {return dan + "." + mjesec + "." + godina + ".god";}
}
