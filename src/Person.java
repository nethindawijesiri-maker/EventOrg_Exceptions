public class Person {

    private int personID;
    private String name;
    private String email;

    public Person(int personID , String name, String email){

        this.personID=personID;
        this.name=name;
        this.email=email;
    }

    public int getPersonID(){
        return personID;
    }

    public String getEmail(){
        return email;
    }

    public String getName(String name){
        return name;
    }

    public void displayDetails(){
        System.out.println("Person ID: "+this.personID+"  "+"Person Name :"+this.name+"  "+"Person email: "+this.email);

    }


}
