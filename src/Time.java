// Thelma Andrews,CSC526,Homework2 (Part1)
import java.util.Comparator;

public class Time implements Comparable<Time>{
    int hours;
    int minutes;
    boolean pmamcheck;
    public Time(int hour,int minute,boolean pm){
        if(hour<0 || minute<0){
            throw new IllegalArgumentException("Invalid hour/minutes values");
        }else {
            hours = hour;
            minutes = minute;
            pmamcheck = pm;
        }
    }
    public static Time fromString(String str){
        Time createTime=null;
        String[] timeslices=str.split(":");
        String[] subslices=timeslices[1].split(" ");
        if((timeslices[0]!=null && Integer.parseInt(timeslices[0])<0) || (subslices[0]!=null && Integer.parseInt(subslices[0])<0)){
            throw new IllegalArgumentException("Invalid hour/minutes values");
        }else {
            if (timeslices[0]!=null && subslices[0]!=null && subslices[1].equalsIgnoreCase("AM")) {
                createTime = new Time(Integer.parseInt(timeslices[0]), Integer.parseInt(subslices[0]), false);
            } else {
                createTime = new Time(Integer.parseInt(timeslices[0]), Integer.parseInt(subslices[0]), true);
            }
        }
        return createTime;
    }
    public Object clone() throws CloneNotSupportedException{
        return this;
    }
    public int compareTo(Time time){
        return this.toString().compareTo(time.toString());
    }
    public boolean equals(Object o){
        return this==o;
    }
    public int getHour(){
        return hours;
    }
    public int getMinute(){
        return minutes;
    }
    public boolean isPM(){
        return  pmamcheck;
    }
    public void shift(int minute) throws IllegalArgumentException{
        if(minutes<0){
            throw new IllegalArgumentException("Invalid minutes values in Time change");
        }else {
            minutes= minutes+minute;
        }
    }
    public String toString(){
        String timepattern=hours + ":" + minutes;
        if(pmamcheck==true) {
            timepattern+=" PM";
        }
        if(pmamcheck==false) {
            timepattern+=" AM";
        }
        return timepattern;
    }
}
