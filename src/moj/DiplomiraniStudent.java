package moj;

public class DiplomiraniStudent extends  Student{
  private int godina_diplomiranja;
  public DiplomiraniStudent(String name, String last_name, String school, int dan, int mjesec, int godina, int godina_diplomiranja) {
    super(name, last_name, school, dan, mjesec, godina); //Super poziva konstruktor bazne klase
    this.godina_diplomiranja = godina_diplomiranja;
  }
  @Override
  public void WriteStudent() {System.out.println("Student " + this.GetName() + " " + this.GetLastName() + " rodjen " + this.datum.Ispisi() + " je diplomirao "+ godina_diplomiranja+".god");}
}
