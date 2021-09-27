public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    public Name(String firstName,String middleName,String lastName)
    {
        setName(firstName,middleName,lastName);
    }
    public Name(String firstName,String lastName)
    {
        setName(firstName,null,lastName);
    }
    public void setName(String firstName,String middleName,String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getMiddleName()
    {
        return middleName;
    }
    public String getLastName()
    {
        return lastName;
    }
    @Override
    public String toString()
    {
        if(middleName!=null)
            return firstName+" "+middleName+" "+lastName;
        else
            return firstName+" "+lastName;
    }
}
