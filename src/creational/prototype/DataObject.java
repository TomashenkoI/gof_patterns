package creational.prototype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataObject implements Cloneable {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;
    private List<String> phoneNumbers;
    private String citizenship;
    private LocalDate dateOfBirth;

    public DataObject(String firstName, String lastName, Integer age, String address, List<String> phoneNumbers, String citizenship, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
        this.citizenship = citizenship;
        this.dateOfBirth = dateOfBirth;
    }

    public DataObject(DataObject dataObject) {
        this.firstName = dataObject.getFirstName();
        this.lastName = dataObject.getLastName();
        this.age = dataObject.getAge();
        this.address = dataObject.getAddress();
        this.phoneNumbers = new ArrayList<>(dataObject.getPhoneNumbers());
        this.citizenship = dataObject.getCitizenship();
        this.dateOfBirth = dataObject.getDateOfBirth();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    protected DataObject clone() {
        return new DataObject(this);
    }
}
