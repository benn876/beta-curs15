import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.beta.curs15.homework.PersonService;
import org.beta.curs15.homework.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PersonServiceTest {
    @Test
    void testInitClass() {
        PersonService personService = new PersonService(List.of());
    }

    @Test
    void testSendNullAsParameter() {
        PersonService personService = new PersonService(null);
    }

    @Test
    void testAddPersonMethod(){
        PersonService personService = new PersonService();
        Person addedPerson = personService.addPerson(new Person(null, "Mihai", 44));

        Assertions.assertThat(addedPerson.id()).isNotNull();
        Assertions.assertThat(personService.getPersons()).hasSize(1);
    }

    @Test
    void testAddMultiplePersons(){
        PersonService personService = new PersonService();
        personService.addPerson(new Person(null,"Mihai",44));
        personService.addPerson(new Person(null,"George",33));

        Assertions.assertThat(personService.getPersons()).hasSize(2)
                .extracting("name","age")
                .containsExactlyInAnyOrder(new Tuple("Mihai",44), new Tuple("George",33));
    }
}
