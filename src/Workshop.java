public class Workshop extends Event {

    private String instructorName;
    private int durationHours;

    public Workshop(int eventID, String title,int date,String venue,int capacity,String instructorName, int durationHours){
        super(eventID,title,date,venue,capacity);
        this.instructorName=instructorName;
        this.durationHours=durationHours;
    }

    @Override
    public int calculateRegistrationFee() {
        return 1500;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("\n--- Workshop Details ---");
        super.displayEventDetails();
        System.out.println("Instructor: " + instructorName);
        System.out.println("Duration: " + durationHours + " hours");
    }

}
