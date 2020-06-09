package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job_test;
    Job job_testTwo;
    Job jobOne;
    Job jobTwo;
    @Before
    public void createJobObjects(){
        job_test = new Job();

        job_testTwo = new Job();

        jobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        jobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId() {
        assertEquals(job_test.getId(), job_testTwo.getId(), 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job_fields_test =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(job_fields_test instanceof Job);
    }

    @Test
    public void testJobsForEquality() {

        assertFalse(jobOne.equals(jobTwo));
    }

    @Test
    public void testToStringBlankLinesBeforeAndAfterInfo(){


        assertEquals(jobOne.toString().charAt(0), '\n');
        assertEquals(jobOne.toString().charAt(jobOne.toString().length()-1), '\n');



    }







}
