import java.util.ArrayList;
import java.util.List;

public class Event {

    private int eventID;
    private String title;
    private int date;
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

}
