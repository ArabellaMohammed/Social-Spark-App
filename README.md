## Name: Social Spark App ✨

## Description
The Social Spark App is an Android application developed using Kotlin in Android Studio. It allows users to enter a time of day and receive a suggested social activity. The app is designed to encourage positive social interaction throughout the day.

## How the App Works
The app uses user input and conditional logic to generate suggestions.
1.	The user enters their name
2.	The user enters a time of day (morning, afternoon, night etc)
3.	When the “Get Suggestion” button is pressed the app processes the input,a suggestion is generated using a when statement and a personalized message is displayed

## Features
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

## How the Code Runs
-The app starts in MainActivity.kt
-onCreate() initializes the layout using setContentView(R.layout.activity_main)
-UI components are linked using findViewById
-Button click listeners are used to trigger actions
-Logic is handled using a when statement based on user input

## Logging (Manual Testing)
Logging was implemented using Log.d("SocialSpark", "message")
Logs were used to:
-Track user input (name and time)
-Display generated suggestions
-Confirm reset functionality

## Images of the app:

<img width="447" height="856" alt="IMAD5112 SS 1" src="https://github.com/user-attachments/assets/cd664e5b-45bb-446b-81ef-f7610b20da38" />

Example of correct input:

<img width="474" height="823" alt="IMAD5112 SS 2" src="https://github.com/user-attachments/assets/9bcc39a0-9e9d-472e-81a6-466e55a3273f" />

Example of incorrect input:

<img width="411" height="819" alt="IMAD5112 SS 3" src="https://github.com/user-attachments/assets/16e87027-1c4e-4ba9-a46f-f1bd5178609c" />

## GitHub Actions 
GitHub Actions was implemented to automate the build process.
-A workflow file (build.yml) was created
-The workflow runs on every push to the repository
It checks out the code,sets up Java,builds the project using Gradle

## Video link 
https://youtu.be/BTijKyaUzw4

## Referencing

GitHub (2026) GitHub Actions build workflow (IMAD5112 repository). Available at: https://github.com/IMAD5112/Github-actions/blob/main/.github/workflows/build.yml (Accessed: 26 March 2026).

OpenAI. 2026. ChatGPT (GPT-5.3). [Large language model]. Available at: https://chatgpt.com/share/69c57007-b674-832b-b86f-59391c6457e4 (Accessed: 25/26 March 2026).

ProgrammingKnowledge, 2019. Android Studio Tutorial for Beginners. [video online] Available at: https://youtu.be/h-NcxT697Nk?si=kQuJ9zftIXQh1YvR [Accessed 24/25/26 March 2026].

WsCube Tech, 2021. Layouts in Android Studio (XML) | Android UI Design Explained. [video online] Available at: https://youtu.be/PeCOKgAua7A?si=eZabCbsr5ij1t9Lp
[Accessed 24/25/26/30 March 2026].
