import net.datafaker.Faker;
import org.beta.curs15.homework.exceptions.ValidationException;
import org.beta.curs15.homework.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class PersonTest {
    private Faker faker = new Faker();

    @Test
    void testInitClass() {
        Person person = new Person(UUID.randomUUID().toString(), faker.name().name(), 44);
    }

    @Test
    void testCreatePersonWithNullName() {
        Assertions.assertThrows(ValidationException.class, () -> new Person(UUID.randomUUID().toString(), null, 44));
    }

    @Test
    void testCreatePersonWithNullAge() {
        Assertions.assertThrows(ValidationException.class, () -> new Person(UUID.randomUUID().toString(), faker.name().name(), null));
    }

    @Test
    void testCreatePersonWithNullId() {
        Person person = new Person(null, faker.name().name(), 44);
        org.assertj.core.api.Assertions.assertThat(person.id()).isNotNull();
    }
}
