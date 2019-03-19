
package projecttm;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        //this.day = day;
        this.month = month;
        //this.year = year;
        setDay(day);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day>=1)
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day<=31)
                    this.day = day;
                else
                    System.err.println("Invalid number! (must be between 1 and 31)");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day<=30)
                    this.day = day;
                else
                    System.err.println("Invalid number! (must be between 1 and 30)");
                break;
            case 2:
                if (day<=28)
                    this.day = day;
                else
                    System.err.println("Invalid number! (must be between 1 and 28)");
                break;
            default:
                System.err.println("Invalid number for month! (must be between 1 and 12)");
                break;
                
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12)
            this.month = month;
        else
            System.err.println("invalid number! must be between 1 and 12");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    @Override
    public String toString(){
        return (String.format("%d/%d/%d", getDay(), getMonth(), getYear())); 
    }
    
}
