enum day{
    monday,
    tuesday,
    wednesday,
    thursday,
    friday,
    saturday,
    sunday
}

public class EnumExample {

    public static void main(String[] args) {
        day today = day.wednesday;
        System.out.println("today is :" + today); 

        switch (today){
            case monday:
                System.out.println("work day");
                break;
            case tuesday:
                System.out.println("second work day");
                break;
            case wednesday:
                System.out.println("today");
                break;
            case thursday:
                System.out.println("meed working day");
                break;
            case friday:
                System.out.println("last working day");
                break;
            case saturday:
                System.out.println("week end");
                break;
            case sunday:
                System.out.println("week end");
                break;
        }
    }
    
}
