package com.habitrpg.android.habitica.ui.activities;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.habitrpg.android.habitica.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Test1Habitica {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest2() {
        ViewInteraction skipBtn = onView(allOf(withId(R.id.skipButton), withText("Skip"),isDisplayed()));
        skipBtn.perform(click());

        ViewInteraction loginBtn = onView(allOf(withId(R.id.show_login_button), withText("Login"),isDisplayed()));
        loginBtn.perform(click());

        ViewInteraction usernameTxt = onView(withId(R.id.username));
        usernameTxt.perform(scrollTo(), replaceText("shiomarsa2@gmail.com"), closeSoftKeyboard());

        ViewInteraction pwdTxt = onView(withId(R.id.password));
        pwdTxt.perform(scrollTo(), replaceText("RiPuF#FAqv78g9i"), closeSoftKeyboard());

        ViewInteraction confirmLoginBtn = onView(allOf(withId(R.id.login_btn), withText("Login")));
        confirmLoginBtn.perform(scrollTo(), click());
    }
}