package com.mrconst.testing.model;

import android.app.Activity;
import android.widget.TextView;

import com.mrconst.testing.CustomRobolectricRunner;
import com.mrconst.testing.MainActivity;
import com.mrconst.testing.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Ensures correct run of robolectric tests
 */
@RunWith(CustomRobolectricRunner.class)
@Config(emulateSdk = 21)
public class RobolectricTest {
    @Test
    public void testRobolectricExists() {
        assertThat(RuntimeEnvironment.application).isNotNull();
    }

    @Test
    public void testActivityControlMocking() {
        Activity activity =
                Robolectric.setupActivity(MainActivity.class);

        TextView results =
                (TextView) activity.findViewById(R.id.instructions);
        String resultsText = results.getText().toString();

        assertThat(resultsText).startsWith("The value of the spinner");
    }
}
