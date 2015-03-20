package com.mrconst.testing;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.text.StringContains.containsString;

public class SampleTests extends ActivityInstrumentationTestCase2<MainActivity> {

    public SampleTests() {
        super(MainActivity.class);
    }

    /**
     * Test to make sure that spinner values are persisted across activity restarts.
     *
     * <p>Launches the main activity, sets a spinner value, closes the activity, then relaunches
     * that activity. Checks to make sure that the spinner values match what we set them to.
     */
    public void testSpinnerValuePersistedBetweenLaunches() {

        final String TEST_SPINNER_POSITION_1 = MainActivity.SPINNER_VALUES[MainActivity.WEATHER_PARTLY_CLOUDY];

        // Launch the activity
        Activity activity = getActivity();

        // Set spinner to test position 1
        onView(withId(R.id.spinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(TEST_SPINNER_POSITION_1)))
                .perform(click());

        // Close the activity
        activity.finish();
        setActivity(null);  // Required to force creation of a new activity

        activity = this.getActivity();

        // Verify that the spinner was saved at position 1
        onView(withId(R.id.spinner))
                .check(matches(withSpinnerText(containsString(TEST_SPINNER_POSITION_1))));

        // Since this is a stateful test, we need to make sure that the activity isn't simply
        // echoing a previously-stored value that (coincidently) matches position 1
        final String TEST_SPINNER_POSITION_2 = MainActivity.SPINNER_VALUES[MainActivity.WEATHER_SNOW];

        // Set spinner to test position 2
        onView(withId(R.id.spinner)).perform(click());
        onData(allOf(is(instanceOf(String.class)), is(TEST_SPINNER_POSITION_2)))
                .perform(click());

        // Close the activity
        activity.finish();
        setActivity(null);

        // Relaunch the activity
        this.getActivity();

        // Verify that the spinner was saved at position 2
        onView(withId(R.id.spinner)).check(matches(withSpinnerText(containsString(TEST_SPINNER_POSITION_2))));
    }
}
