public class firstClassCreate  {

    public static void main(String[] args) {
    
        School sbhs = new School("Santa Barbara High School", 7.0, 2137, 332, true);
        School sm = new School("San Marcos", 1973, 289);
    
        System.out.println(sbhs.getStudents());
        sm.setStaff(295);
        System.out.println(sm.getStaff());
        sbhs.scheduleGame("football", "5:00 pm", "San Marcos");
    }
}