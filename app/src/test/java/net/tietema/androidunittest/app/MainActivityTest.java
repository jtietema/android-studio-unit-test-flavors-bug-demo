package net.tietema.androidunittest.app;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
@Config(emulateSdk = 18, manifest = "src/main/AndroidManifest.xml")
public class MainActivityTest {

    @Test
    public void activityShowsHelloWorld() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().start().resume().visible().get();
        TextView rootView = (TextView) activity.findViewById(R.id.text_view);
        assertThat(rootView.getText().toString(), is("Hello world!"));
    }
}