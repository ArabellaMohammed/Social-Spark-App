Name: Social Spark App ✨

Description
The Social Spark App is an Android application developed using Kotlin in Android Studio.
It allows users to enter a time of day and receive a suggested social activity. The app is designed to encourage positive social interaction throughout the day.

How the App Works
The app uses user input and conditional logic to generate suggestions.
1.	The user enters their name
2.	The user enters a time of day (morning, afternoon, night etc)
3.	When the “Get Suggestion” button is pressed the app processes the input,a suggestion is generated using a when statement and a personalized message is displayed

Features

(Note my components are coded as i had trouble with them being visible after dragging them onto the form thus i used my knowledge learny by watching youtube videos which are referenced)

1. Name Input
-Allows the user to enter their name(optional)
-The app displays a personalized greeting,example: “Hi Bella👋”

2. Time Input
-User enters a time of day
-Input is converted to lowercase to ensure accurate matching

3. Suggestion Generator
-Uses a when conditional structure
-Matches input to predefined suggestions
-Displays the result in the TextView

4. Error Handling
If the user enters an invalid time,the app displays: “Invalid input! Please enter a valid time.”

5. Reset Button
-Clears name input,time input and result text
-Resets the app to its initial state

 How the Code Runs
-The app starts in MainActivity.kt
-onCreate() initializes the layout using setContentView(R.layout.activity_main)
-UI components are linked using findViewById
-Button click listeners are used to trigger actions
-Logic is handled using a when statement based on user input

Extra Features Implemented
-Personalized greeting using user name
-Divider and title of app for improved design
-Input normalization using .lowercase()

Logging (Manual Testing)
Logging was implemented using Log.d("SocialSpark", "message")
Logs were used to:
-Track user input (name and time)
-Display generated suggestions
-Confirm reset functionality

Images of the app:

<img width="447" height="856" alt="IMAD5112 SS 1" src="https://github.com/user-attachments/assets/cd664e5b-45bb-446b-81ef-f7610b20da38" />

Example of correct input:

<img width="474" height="823" alt="IMAD5112 SS 2" src="https://github.com/user-attachments/assets/9bcc39a0-9e9d-472e-81a6-466e55a3273f" />

Example of incorrect input:

<img width="411" height="819" alt="IMAD5112 SS 3" src="https://github.com/user-attachments/assets/16e87027-1c4e-4ba9-a46f-f1bd5178609c" />



GitHub Actions 
GitHub Actions was implemented to automate the build process.
-A workflow file (build.yml) was created
-The workflow runs on every push to the repository
It checks out the code,sets up Java,builds the project using Gradle

Errors Encountered and Solutions
1. Build Errors (Gradle / Directory Issues)
Problem: “Unable to delete directory”
Cause: files were locked or project stored in restricted locations (OneDrive / Program Files)
Solution: Moved project to a local directory (C:\AndroidProjects)

2.GitHub Actions Not Running
Problem: No workflow runs appearing
Cause: Workflow only triggers on push
Solution: Made a new commit to trigger the workflow

Conclusion
The Social Spark App successfully demonstrates:
-User input handling
-Conditional logic
-UI design in Android
-Error handling
-Logging for testing
-GitHub integration and automation
The app is functional, user-friendly and meets all assignment requirements.

Video link 
https://youtu.be/BTijKyaUzw4

Thank you!!

Referencing

GitHub (2026) GitHub Actions build workflow (IMAD5112 repository). Available at: https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml (Accessed: 26 March 2026).

OpenAI. 2026. ChatGPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69c57007-b674-832b-b86f-59391c6457e4 (Accessed: 25/26 March 2026).

ProgrammingKnowledge, 2019. Android Studio Tutorial for Beginners. [video online] Available at: https://youtu.be/h-NcxT697Nk?si=kQuJ9zftIXQh1YvR [Accessed 24/25/26 March 2026].

WsCube Tech, 2021. Layouts in Android Studio (XML) | Android UI Design Explained. [video online] Available at: https://youtu.be/PeCOKgAua7A?si=eZabCbsr5ij1t9Lp
[Accessed 24/25/26/30 March 2026].

Annexure: Disclosure of AI Usage in my Assessment
Sections where AI was used
-	UI design (activity_main.xml)
-	Kotlin functionality (MainActivity.kt)
-	Error resolution
AI Tool Used
-ChatGPT (OpenAI)
Purpose of AI Usage
The AI tool was used for the following purposes:
-	Assisting with understanding Android Studio concepts
-	Generating and explaining Kotlin code
-	Runtime errors
Dates of Usage
25 March 2026
26 March 2026
Evidence of AI Usage
Screenshots of the interaction with ChatGPT have been included as evidence. These screenshots show:
-	Code generation and explanations
-	UI design guidance
-	Debugging assistance

Here is some screenshots of help from OpenAi for debugging assistance 
<img width="771" height="630" alt="image" src="https://github.com/user-attachments/assets/bd01db20-293f-4baa-949a-e34da139198c" />
<img width="730" height="518" alt="image" src="https://github.com/user-attachments/assets/f93a420e-37f8-4581-8e1b-04967848da73" />
<img width="739" height="563" alt="image" src="https://github.com/user-attachments/assets/04d603b4-d0a6-459a-b5f9-ba0908e3e8c8" />
<img width="652" height="494" alt="image" src="https://github.com/user-attachments/assets/bd642c6b-7eff-4972-91c5-e070c163ccb4" />
<img width="699" height="573" alt="image" src="https://github.com/user-attachments/assets/40a94f8f-6df4-49e2-8c57-336692a30878" />



