package com.example.yangfan.password_validator;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class passwordValidatorTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void ClickButton()throws Exception {
        String string = "12345678.daL";
        onView(withId(R.id.editText)).perform(typeText(string));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        //closeSoftKeyboard();
        //Thread.sleep(1000);
        onView(withId(R.id.textView)).check(matches(withText("Strong")));

        //Thread.sleep(1000);
        onView(withId(R.id.editText)).perform(clearText());

        Thread.sleep(1000);

        String string3 = "12345678da";
        onView(withId(R.id.editText)).perform(typeText(string3));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        //closeSoftKeyboard();
        //Thread.sleep(1000);
       // Thread.sleep(1000);
        onView(withId(R.id.textView)).check(matches(withText("not Strong")));

        onView(withId(R.id.editText)).perform(clearText());

        Thread.sleep(1000);

        String string2 = "";
        onView(withId(R.id.editText)).perform(typeText(string2));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
    }
}
