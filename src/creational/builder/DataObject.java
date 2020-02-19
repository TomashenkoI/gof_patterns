package creational.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class DataObject {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String address;
    private final List<String> phoneNumbers;
    private final String citizenship;
    private final LocalDate dateOfBirth;

    public DataObject(String firstName, String lastName, Integer age, String address, List<String> phoneNumbers, String citizenship, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumbers = new ArrayList<>(phoneNumbers);
        this.citizenship = citizenship;
        this.dateOfBirth = dateOfBirth;
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

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Integer age; //optional
        private String address;
        private List<String> phoneNumbers;
        private String citizenship;
        private LocalDate dateOfBirth;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder setCitizenship(String citizenship) {
            this.citizenship = citizenship;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public DataObject build() {
            return new DataObject(this.firstName,
                    this.lastName,
                    this.age,
                    this.address,
                    this.phoneNumbers,
                    this.citizenship,
                    this.dateOfBirth
            );
        }
    }
}
