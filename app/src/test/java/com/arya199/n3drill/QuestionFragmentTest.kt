package com.arya199.n3drill

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.arya199.n3drill.drill.DrillActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class QuestionFragmentTest {

    @Test
    fun checkDisplayedQuestion() {
        launchActivity()

        onView(withId(R.id.question_list)).check(matches(isDisplayed()))
    }

    private fun launchActivity(): ActivityScenario<DrillActivity>? {
        val activityScenario = launch(DrillActivity::class.java)
        activityScenario.onActivity { activity ->
            (activity.findViewById(R.id.question_list) as RecyclerView).itemAnimator = null
        }
        return activityScenario
    }
}