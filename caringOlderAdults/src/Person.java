public class Person {
    private String name;
    private int age;
    private String identityDocument;
    private String maritalStatus;
    private int stratum;
    private char isPension;
    private char sex;

    //Class constructor
    public Person(String name, int age, String identityDocument, String maritalStatus, int stratum, char isPension, char sex) {
        this.name = name;
        this.age = age;
        this.identityDocument = identityDocument;
        this.maritalStatus = maritalStatus;
        this.stratum = stratum;
        this.isPension = isPension;
        this.sex = sex;
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getStratum() {
        return stratum;
    }

    public void setStratum(int stratum) {
        this.stratum = stratum;
    }

    public char getIsPension() {
        return isPension;
    }

    public void setIsPension(char isPension) {
        this.isPension = isPension;
    }


}
