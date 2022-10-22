package moj;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      //Ovdje pokazujem polimorfizam u JAVI

      Scanner ulaz = new Scanner(System.in);
      System.out.print("Unesite ime studenta: ");
      String ime = ulaz.nextLine();
      System.out.print("Unesite prezime studenta: ");
      String prezime = ulaz.nextLine();
      System.out.print("Unesite fakultet koji pohadja student: ");
      String fax = ulaz.nextLine();
      System.out.print("Unesite datum rodjenja studenta dd mm yy: ");
      int dan = ulaz.nextInt(); int mjesec = ulaz.nextInt(); int godina = ulaz.nextInt();
      System.out.print("Unesite godinu diplomiranja: ");
      int god_dip = ulaz.nextInt();
      Student MojStudent = new DiplomiraniStudent(ime, prezime, fax, dan, mjesec, godina, god_dip);

      MojStudent.WriteStudent();

      System.out.print("Unesite ime studenta: ");
      ime = ulaz.nextLine();
      System.out.print("Unesite prezime studenta: ");
      prezime = ulaz.nextLine();
      System.out.print("Unesite fakultet koji pohadja student: ");
      fax = ulaz.nextLine();
      System.out.print("Unesite datum rodjenja studenta dd mm yy: ");
      dan = ulaz.nextInt(); mjesec = ulaz.nextInt(); godina = ulaz.nextInt();
      MojStudent = new Student(ime, prezime, fax, dan, mjesec, godina);

      MojStudent.WriteStudent();
      //Izmjena
    }
}