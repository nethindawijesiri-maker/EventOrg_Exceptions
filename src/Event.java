import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public abstract class Event {

    private int eventID;
    private String title;
    private LocalDate date;
    private String venue;
    private int capacity;
    private List<Student> registeredStudents;

    public Event(int eventID, String title,int date,String venue,int capacity){
        this.eventID=eventID;
        this.title=title;
        this.date=date;
        this.venue=venue;
        this.capacity=capacity;
        this.registeredStudents=new ArrayList<>();
    }

    public int getEventID(){
        return eventID;
    }

    public String getTitle(){
        return title;
    }

    public int getDate(){
        return date;
    }

    public String getVenue(){
        return venue;
    }

    public int getCapacity(){
        return capacity;
    }

    public void registerStudent(Student student){

    }

    public int calculateRegistrationFee(){
        return 0;
    }

    public void displayEventDetails() {
        System.out.println("Event ID: " + eventID);
        System.out.println("Title: " + title);
        System.out.println("Date: " + date);
        System.out.println("Venue: " + venue);
        System.out.println("Capacity: " + capacity);
        System.out.println("Registered Students: "
                + registeredStudents.size());
        System.out.printf("Registration Fee: Rs. %.2f%n",
                calculateRegistrationFee());
    }

}
