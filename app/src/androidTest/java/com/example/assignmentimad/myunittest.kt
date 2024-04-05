package com.example.assignmentimad

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class myunittest{

    private lateinit var scenario: ActivityScenario<MainActivity>

    @Before
    fun setUp() {
        // Launch the MainActivity
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun tearDown() {
        // Finish the MainActivity after each test
        scenario.close()
    }

    @Test
    fun testButtonClick_ShowResult() {
        // Type "26" in the etA EditText
        onView(withId(R.id.idEditText)).perform(typeText("26"))

        // Click the clickMeButton
        onView(withId(R.id.searchButton)).perform(click())

        // Check if TextView displays the correct result
        onView(withId(R.id.TextView)).check(matches(withText("Mac Miller was known as a Musician.")))
    }

    // Add more test cases as needed
}
