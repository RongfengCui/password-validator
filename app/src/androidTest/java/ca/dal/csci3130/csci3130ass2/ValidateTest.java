package ca.dal.csci3130.csci3130ass2;

import org.junit.Test;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ValidateTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void validate(){
        //test the password is "Pass123!" and shows "strong"
        //type the password "Pass123!"
        onView(withId(R.id.editText)).perform(typeText("Pass123!"));
        //close the keyboard
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        //click the button
        onView(withId(R.id.button)).perform(click());
        //find whether match with textView
        onView(withId(R.id.textView)).check(matches(withText("strong")));

        //test the password is "123456!" and shows "not strong"
        onView(withId(R.id.editText)).perform(clearText(), typeText("123456!"));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("not strong")));

        onView(withId(R.id.editText)).perform(clearText(), typeText("apple321"));
        onView(withId(R.id.editText)).perform(closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("not strong")));
    }


}