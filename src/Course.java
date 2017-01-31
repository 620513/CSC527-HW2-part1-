// Thelma Andrews,CSC526,Homework2(part1)
import java.util.Set;


public class Course {
    String coursename;
    int coursecredits;
    Set<Weekday> weekDays;
    Time starttime;
    int duration;
    public Course(String name, int credits, Set<Weekday> days, Time startTime, int duration){
        coursename=name;
        coursecredits=credits;
        weekDays=days;
        starttime=startTime;
        duration=duration;
    }
    public boolean conflictsWith(Course course){
        return false;
    }
    private boolean contains(Weekday day, Time startTime){
        return false;
    }
    public boolean equals(Object o){
        return (this==o);
    }
    public int getCredits(){
        return coursecredits;
    }
    public int getDuration(){
        return duration;
    }
    public String getName(){
        return coursename;
    }
    public Time getStartTime(){
        return starttime;
    }
    public Time getEndTime(){
        return starttime;
    }
    public String toString(){
        return coursename+","+coursecredits+","+starttime+","+weekDays+","+duration;
    }
}
