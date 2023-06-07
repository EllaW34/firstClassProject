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
    
    public double getHours() {
        return hours;
    }
    
    public int getStudents() {
        return studentAmount;
    }
    
    public int getStaff() {
        return staffAmount;
    }
    
    public boolean getInSession() {
        return inSession;
    }
    
    public void setStudents(int newStudents) {
        studentAmount = newStudents;
    }
    
    public void setStaff(int newStaff) {
        staffAmount = newStaff;
    }
    
    public void setInSession(boolean newInSession) {
        inSession = newInSession;
    }
    
    public void scheduleGame(String sport, String time, String otherSchool) {
        System.out.println(schoolName + " has a " + sport + " game against " + otherSchool + " at " + time);
    }
}