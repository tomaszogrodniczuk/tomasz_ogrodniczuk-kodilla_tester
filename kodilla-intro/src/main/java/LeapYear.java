public class LeapYear {
    int year;
    boolean leapYear;

    public LeapYear(int year)
    {
        this.year = year;
    }


    public boolean getLeapYear(){

        if(year%4>0)
        {
            this.leapYear = false;
        }else if(year%100>0)
        {
            this.leapYear = true;
        }else if(year%400>0)
        {
            this.leapYear = false;
        }else
        {
            this.leapYear = true;
        }

        return leapYear;
    }
}
