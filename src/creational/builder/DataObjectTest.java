package creational.builder;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DataObjectTest {

    private static final String ADDRESS = "address";
    private static final int AGE = 2;
    private static final String CITIZENSHIP = "citizenship";
    private static final LocalDate DATE_OF_BIRTH = LocalDate.now();
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final List<String> PHONE_NUMBERS = Arrays.asList("phoneNumber1", "phoneNumber2");

    @Test
    void testBuilder() {
        List<String> phoneNumbers = new ArrayList<>(PHONE_NUMBERS);

        DataObject.Builder builder = DataObject.newBuilder()
                .setAddress(ADDRESS)
                .setAge(AGE)
                .setCitizenship(CITIZENSHIP)
                .setDateOfBirth(DATE_OF_BIRTH)
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setPhoneNumbers(phoneNumbers);

        DataObject dataObject = builder.build();

        assertEquals(ADDRESS, dataObject.getAddress());
        assertEquals(AGE, dataObject.getAge());
        assertEquals(CITIZENSHIP, dataObject.getCitizenship());
        assertEquals(DATE_OF_BIRTH, dataObject.getDateOfBirth());
        assertEquals(FIRST_NAME, dataObject.getFirstName());
        assertEquals(LAST_NAME, dataObject.getLastName());
        assertEquals(PHONE_NUMBERS, dataObject.getPhoneNumbers());

        phoneNumbers.add("3");

        assertEquals(PHONE_NUMBERS, dataObject.getPhoneNumbers());
    }

    @Test
    void test() {
        System.out.println(0.0 / 0.0);
        System.out.println(1 / 0.0);
    }

}