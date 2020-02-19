package creational.prototype;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DataObjectTest {

    private static final String ADDRESS = "address";
    private static final int AGE = 2;
    private static final String CITIZENSHIP = "citizenship";
    private static final LocalDate DATE_OF_BIRTH = LocalDate.now();
    private static final String FIRST_NAME = "firstName";
    private static final String LAST_NAME = "lastName";
    private static final List<String> PHONE_NUMBERS = Arrays.asList("phoneNumber1", "phoneNumber2");

    @Test
    void test() {
        DataObject originalDataObject = new DataObject(FIRST_NAME, LAST_NAME, AGE, ADDRESS, PHONE_NUMBERS, CITIZENSHIP, DATE_OF_BIRTH);

        DataObject dataObjectClone = originalDataObject.clone();

        originalDataObject.getPhoneNumbers().add("phoneNumber3");
        originalDataObject.setCitizenship("anotherCitizenship");

        assertNotEquals(originalDataObject.getPhoneNumbers(), dataObjectClone.getPhoneNumbers());
        assertNotEquals(originalDataObject.getCitizenship(), dataObjectClone.getCitizenship());
    }

}