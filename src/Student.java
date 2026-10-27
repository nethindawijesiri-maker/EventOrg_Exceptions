public class Student extends Person{

    public String degreeProgram;
    private int academicYear;

    public Student(int personID ,String name , String email , String degreeProgram , int academicYear){
        super(personID,name,email);

        setacademicYear(academicYear);
        this.degreeProgram=degreeProgram;
    }

    public void setacademicYear(int academicYear){
        if(academicYear>=1 && academicYear<=4){
            this.academicYear=academicYear;
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Degree Program: "+this.degreeProgram +"  "+"Academic Year: "+this.academicYear);
    }
}


