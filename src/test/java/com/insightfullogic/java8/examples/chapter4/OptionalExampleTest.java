package com.insightfullogic.java8.examples.chapter4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class OptionalExampleTest {

	@Test
	public void examples() {
		// BEGIN value_creation
		Optional<String> a = Optional.of("a");
		assertEquals("a", a.get());
		// END value_creation

		// BEGIN is_present
		Optional<String> emptyOptional = Optional.empty();
		@SuppressWarnings("unused")
		Optional<Object> s = Optional.ofNullable(null);

		assertFalse(emptyOptional.isPresent());

		// a is defined above
		assertTrue(a.isPresent());
		// END is_present

		// BEGIN orElse
		assertEquals("b", emptyOptional.orElse("b"));
		assertEquals("c", emptyOptional.orElseGet(() -> "c"));
		// END orElse
	}

}
