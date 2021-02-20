package com.ex2;

public class Person
{
    private String name;
    private String address;
    private String dateOfBirth;

    // sample methods

    public Person(String name, String address, String dateOfBirth)
    {
        // use setter methods here instead in case they have validation
        // we have no time for it yet
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;

    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAge()
    {
        String output;
        output = null;
        // some calc to get age from DOB APi
        return output;
    }
    /*
    ----------------- Student.java ----------
    New file to do sub class
    class Student extends Person
    {
        private String studentNum;
        private String programmeID;
        private String yearOfStudy;

        public Student( // all variables in here 6 attributes in total)
        {
            super(name, address, dob);
            this.studentNumber = studentNumber;
            this.programmeID = programmeID;
            this.yearofstudy = yearofstudy;

        }

        // methods

        public void changeYear(String newYear)
        {
            this.yearOfStudy = newYear;
         }
         public void changeProgramme(String newProg)
         {
            this.programmeID = newProg;
         }

        public Class Control
        {
            public static void main(String[] args)
            {
                Person p1 = new Person("John Smoth", "19 harbour", "02.08.2000")
                p1.setName(Juan smytth);

                // use student class
                student s1 = new Student("Matty man", "12 infa", " D188912", "tu857", "2"
                s1.changeYear("Tu858");
                s1.setName("Adam smith");
     */



}
