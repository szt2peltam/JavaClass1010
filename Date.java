public class Date {
    


public static void main(String[] args) {
    Date date = new Date(2024, 2, 29);

    System.out.println(date.IsCorrectDate());
}

    private int _year;
    private int _month;
    private int day;
    public Date(int _year, int _month, int day) {
        this._year = _year;
        this._month = _month;
        this.day = day;
    }
    public int get_year() {
        return _year;
    }
    public void set_year(int _year) {
        this._year = _year;
    }
    public int get_month() {
        return _month;
    }
    public void set_month(int _month) {
        this._month = _month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
 // 31 : 1,3,5,7,8,10,12 ---- 30 : 4,6,9,11 28/29 = 2

    public Boolean IsCorrectDate(){
        if(getDay() < 1 || getDay() > 31) return false;
        if (get_month() < 1 || get_month() > 12) return false;
        switch (get_month()) {
            case 1:
                if(getDay() != 31) return false;
                break;
            case 3:
                if(getDay() != 31) return false;
                break;
            case 5:
                if(getDay() != 31) return false;
                break;
            case 7:
                if(getDay() != 31) return false;
                break;
            case 8:
                if(getDay() != 31) return false;
                break;
            case 10:
                if(getDay() != 31) return false;
                break;
            case 12:
                if(getDay() != 31) return false;
                break;
            case 4:
                if(getDay() != 30) return false;
                break;
            case 6:
                if(getDay() != 30) return false;
                break;
            case 9:
                if(getDay() != 30) return false;
                break;
            case 11:
                if(getDay() != 30) return false;
                break;
            case 2:
                if(get_year() % 4 == 0){

                    if(get_year() % 400 == 0){
                        if(getDay() != 29) return false;
                    }else{
                        if(get_year() % 100 == 0)return false;
                        else{
                            if(getDay() != 29) return false;
                        }
                    }

                }else{
                    if(getDay() != 28) return false;
                }
                break;
        
        }


        return true;
    }

    public void printDate(){
        System.out.println(get_year()+"."+get_month()+"."+getDay());
    }

}
