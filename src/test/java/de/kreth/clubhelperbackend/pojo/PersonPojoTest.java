package de.kreth.clubhelperbackend.pojo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonPojoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person person = new Person();
		person.setType(PersonType.ACTIVE.name());
		assertEquals(PersonType.ACTIVE, person.getPersonType());
	}

}
