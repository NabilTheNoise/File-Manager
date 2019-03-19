
package projecttm;

public class Time {
        private int hour;
        private int min;
        private int second;

    public Time(int hour, int min, int second) {
        this.hour = hour;
        this.min = min;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    @Override
   public String toString(){
       return (String.format(" %d:%d:%d ", getHour(),getMin(),getSecond()));
   }
           
}
