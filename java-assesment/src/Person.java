public class Person {
    private String firstName;
    private String lastName;

    public IllegalArgumentException person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getlastName(){
        return lastName;
    }

    public void setlastName(String last){
        this.lastName = last;
    }


}
