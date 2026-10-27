public class SocialEvent extends Event{

    private String eventType;
    private Boolean includesRefreshments;

    public SocialEvent(int eventID, String title,int date,String venue,int capacity,String eventType,Boolean includesRefreshments){
        super(eventID,title,date,venue,capacity);
        this.eventType=eventType;
        this.includesRefreshments=includesRefreshments;
    }

    @Override
    public int calculateRegistrationFee() {
         if(includesRefreshments==true){
            return 1300;
        }else return 800;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("\n--- Social Event Details ---");
        super.displayEventDetails();
        System.out.println("Event Type: " + eventType);
        System.out.println("Includes Refreshments: "
                + this.calculateRegistrationFee());
    }
}
