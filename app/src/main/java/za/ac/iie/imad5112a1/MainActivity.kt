// Reference list
// OpenAI. 2026. ChatGPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69c57007-b674-832b-b86f-59391c6457e4 (Accessed: 25/26 March 2026).

package za.ac.iie.imad5112a1

import android.os.Bundle

// Used for logging (manual testing)
import android.util.Log

import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Setting the UI layout for assignment
        setContentView(R.layout.activity_main)

        // Linking UI components by their name to variables
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val timeInput = findViewById<EditText>(R.id.timeInput)
        val suggestButton = findViewById<Button>(R.id.btnSuggest)
        val resultText = findViewById<TextView>(R.id.resultText)
        val resetButton = findViewById<Button>(R.id.btnReset)


// Button click listener for generating suggestions of user input
        suggestButton.setOnClickListener {

            // Getting user inputs
            val name = nameInput.text.toString()
            val time = timeInput.text.toString().lowercase()

            // Log inputs for testing purposes
            // reference (OpenAI,2026)
            Log.d("SocialSpark", "Name entered: $name")
            Log.d("SocialSpark", "Time entered: $time")


            val suggestion = when (time) {
                "morning" -> "Send a Good Morning message ☀️"
                "mid-morning" -> "Say thank you to a colleague 🙌"
                "afternoon" -> "Share a meme 😂"
                "snack time" -> "Send a thinking of you message 💭"
                "dinner" -> "Call a friend 📞"
                "night" -> "Comment on a friend's post 🌙"
                else -> "Invalid input! Please enter a valid time."
            }
            // Log output results for testing
            // reference (OpenAI,2026)
            Log.d("SocialSpark", "Suggestion shown: $suggestion")

            // Display personalized result if they chose to eneter with name or without
            resultText.text = "Hi $name 👋\n$suggestion"
        }

        // Reset button clears all inputs and output
        resetButton.setOnClickListener {

            // Clear input fields ready for new inpts
            nameInput.text.clear()
            timeInput.text.clear()

            // Reset text
            resultText.text = "Your suggestion will appear here"

            // Log reset action
            // reference (OpenAI,2026)
            Log.d("SocialSpark", "Inputs and results reset")
        }
    }
}