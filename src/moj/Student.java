package moj;

public class Student {
    //Attributes
    private String name, last_name, school;
    protected Datum datum;
    //Methods
    public Student(String name, String last_name, String school, int dan, int mjesec, int godina){
        this.name = name; this.last_name = last_name; this.school = school;
        datum = new Datum(dan, mjesec, godina);
    }
    //Getters
    public String GetName() {return this.name;}
    public String GetLastName() {return this.last_name;}
    public String GetSchool() {return this.school;}
    public Datum GetYear() {return datum;}
    public void WriteStudent() {System.out.println("Student " + this.last_name + " " + this.name + " rodjen " + datum.Ispisi() + " jos nije diplomirao");}
    //Setters
}
