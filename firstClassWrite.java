public class School {
    private String schoolName;
    private int studentAmount;
    private int staffAmount;
    private boolean inSession;
    private double hours;
    
    public School(String sn, double h, int stua, int staa, boolean is) {
        schoolName = sn;
        hours = h;
        studentAmount = stua;
        staffAmount = staa;
        inSession = is;
    }
    
    public School(String sn, int stua, int staa) {
        schoolName = sn;
        studentAmount = stua;
        staffAmount = staa;
    }
    
    public String getSchoolName() {
        return schoolName;
    }
    
    public String getHours() {
        return hours;
    }
    
    public String getStudents() {
        return studentAmount;
    }
    
    public String getStaff() {
        return staffAmount;
    }
    
    public String getInSession() {
        return inSession;
    }
    
    public void setStudents(int newStudents) {
        studentAmount = newStudents;
    }
    
    public void setStaff(int newStaff) {
        staffAmount = newStaff;
    }
    
    public void setInSession(int newInSession) {
        inSession = newInSession;
    }
    
    public void scheduleGame(String sport, String time, String otherSchool) {
        System.out.print(schoolName + " has a " + sport + " game against " + otherSchool + " at " + time);
    }
}