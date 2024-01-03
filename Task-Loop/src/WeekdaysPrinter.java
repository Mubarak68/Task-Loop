public class WeekdaysPrinter {
    public static void main(String[] args) throws Exception {
        String[] Days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        for(int i = 0; i < Days.length; i++)
        {
            if (Days[i].equals("Saturday")||Days[i].equals("Friday")) {
                break;
            }
            // if (i >4) {
            //     break;
            // }
            System.out.println(Days[i]);
        }
    }
}
