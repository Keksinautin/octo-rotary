package com.johnev.octorotary

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.ext.junit.runners.AndroidJUnit4

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun greetingIsDisplayed() {
        composeTestRule.onNodeWithText("Hello Octo Rotary").assertIsDisplayed()
    }
}
