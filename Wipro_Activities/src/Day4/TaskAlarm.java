package Day4;

public class TaskAlarm {
    public static void main(String[] args) {
        String[] tasks = {
            "Drink Water",
            "Do Java Programs",
            "Complete Your Lunch",
            "Watch a Movie",
            "Practice Coding"
        };

        String[] times = {
            "11:00 AM",
            "12:00 PM",
            "01:00 PM",
            "02:00 PM",
            "03:00 PM"
        };

        System.out.println("------------ Daily Alarm Schedule ------------");
        System.out.println(" Time\t\t|\tTask");
        System.out.println("---------------------------------------------");

        for (int i = 0; i < tasks.length; i++) {
            System.out.println(" " + times[i] + "\t|\t" + tasks[i]);
        }

        System.out.println("---------------------------------------------");
    }
}
