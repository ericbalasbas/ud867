package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import static org.junit.Assert.*;


public class EndpointsAsyncTaskTest {


    // run tests using :app connectedDebugAndroidTest

    @Test
    public void testNonEmptyString() throws Exception {

        // https://discussions.udacity.com/t/add-functional-test/229913/2
        EndpointsAsyncTask testTask = new EndpointsAsyncTask();
//        assert string not null
//        new EndpointsAsyncTask().execute(InstrumentationRegistry.getTargetContext());
        testTask.execute(InstrumentationRegistry.getTargetContext());
        String result = testTask.get();
        assertNotNull("result null", result);
        assertTrue("result not empty", result.length() > 0);
    }
}