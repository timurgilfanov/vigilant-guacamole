package timur.gilfanov.guacamole

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.filters.SmallTest
import org.junit.Rule
import org.junit.Test

class MainActivityKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @SmallTest
    @Test
    fun counter_initialValueIsZero() {
        composeTestRule.setContent {
            TwoButtons(padding = PaddingValues())
        }

        composeTestRule.onNodeWithText("0").assertExists()
    }

    @SmallTest
    @Test
    fun counter_incrementsValue() {
        composeTestRule.setContent {
            TwoButtons(padding = PaddingValues())
        }

        composeTestRule.onNodeWithText("Increase").performClick()
        composeTestRule.onNodeWithText("1").assertExists()
    }

    @SmallTest
    @Test
    fun counter_decrementsValue() {
        composeTestRule.setContent {
            TwoButtons(padding = PaddingValues())
        }

        composeTestRule.onNodeWithText("Decrease").performClick()
        composeTestRule.onNodeWithText("-1").assertExists()
    }

    @SmallTest
    @Test
    fun counter_multipleOperations() {
        composeTestRule.setContent {
            TwoButtons(padding = PaddingValues())
        }

        composeTestRule.onNodeWithText("Increase").performClick()
        composeTestRule.onNodeWithText("Increase").performClick()
        composeTestRule.onNodeWithText("Decrease").performClick()
        composeTestRule.onNodeWithText("1").assertExists()
    }
}
