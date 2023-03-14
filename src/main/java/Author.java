public class Author {

    private String firstName;
    private String lastName;

    private String fullName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        fullName = firstName+" "+lastName;
        return fullName;
    }

    public void setFullName(String firstName, String lastName) {
        fullName = firstName + lastName;
    }
}
