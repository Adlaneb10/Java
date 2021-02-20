public class Patient 
{
    //attributes
        private String firstName;
        private String lastName;
        private int age;
        private int patientID;
        private String gender;
        

    public Patient(String firstName, String lastName, int age)
    { // same name as class name
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Patient(String firstName, String lastName, int patientID, String gender )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patientID = patientID;
        this.gender = gender;
    }
}

