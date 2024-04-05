package com.example.assignmentimad

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Before
    fun setUp() {
        // Start the MainActivity before each test
        ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
        // Finish the MainActivity after each test
        ActivityScenario.finishAll()
    }

    @Test
    fun testButtonClick_ShowResult() {
        // Type "26" in the etA EditText
        Espresso.onView(ViewMatchers.withId(R.id.idEditText))
            .perform(ViewActions.typeText("26"), ViewActions.closeSoftKeyboard())

        // Click the clickMeButton
        Espresso.onView(ViewMatchers.withId(R.id.searchButton))
            .perform(ViewActions.click())

        // Check if TextView displays the correct result
        Espresso.onView(ViewMatchers.withId(R.id.TextView))
            .check(ViewAssertions.matches(ViewMatchers.withText("Mac Miller was known as a Musician.")))
    }

    // Add more test cases as needed
}
