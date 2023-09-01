import lesson.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){
        Person Omotola = new Person();
        assertEquals("Hello World", Omotola.helloWorld());
    }

    @Test
    public void shouldReturnHelloTola(){
        Person person = new Person();
        assertEquals("Hello Tola", person.hello("Tola"));
    }

}
