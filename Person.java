public class Person{

    private String firstName;
    private String lastName;
    private int birthYear;
    private int birthMonth;
    private int birthDay;

    public Person(String _firstName,String _lastName, int _birthYear, int _birthMonth,int _birthDay ) {
        
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.birthYear = _birthDay;
        this.birthMonth = _birthMonth;
        this.birthDay = _birthDay;
        

    }

    public String getfirstName() {
        return firstName;
      }
    
      public void setfirstName(String newfirstName) {
        this.firstName = newfirstName;
      }
    public String getlastName() {
        return lastName;
      }
    
      public void setlastName(String newlastName) {
        this.lastName = newlastName;
      }
    public int getbirthYear() {
        return birthYear;
      }
    
      public void setbirthYear(int newbirthYear) {
        this.birthYear = newbirthYear;
      }
    public int getbirthMonth() {
        return birthMonth;
      }
    
      public void setbirthMonth(int newbirthMonth) {
        this.birthMonth = newbirthMonth;
      }
    public int getbirthDay() {
        return birthDay;
      }
    
      public void setbirthDay(int newbirthDay) {
        this.birthDay = newbirthDay;
      }


      public void printPerson(){
        System.out.println("Vezetéknév : " + getfirstName()+
                            "\nUtónév : " + getlastName()+
                            "\nSzületési idő : "+getbirthYear()+"."+getbirthMonth()+"."+getbirthDay());
      }
}