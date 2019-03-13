package com.infogain.petclinic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
@Tags(value= {@Tag("Model"),@Tag("Controller")})
public class AssumptionsTest {
	 @Test
	    void testAssumptionTrue() {

	        assumeTrue("Rudhra".equalsIgnoreCase(System.getenv("Rudhra_RUNTIME")));
	    }

	    @Test
	    void testAssumptionTrueAssumptionIsTrue() {

	        assumeTrue("Rudhra".equalsIgnoreCase("Rudhra"));
	    }
	    
	    @Test
	    void justAnotherAlwaysPassingTestmethod() {

	        assertEquals(1, 1);
	    }
	    @Test
	    void justAnotherAlwaysFailingTestmethod() {

	        assertEquals(1, 2);
	    }
}
