# MealSuggestionApplication
# ProgrammaticLayoutApp

This is a simple Android app built using Kotlin that demonstrates **programmatic UI layout** without XML. The app displays a greeting, accepts input for a time of day, and suggests meals based on that input. It also includes reset functionality and input validation.

---

##  Features

- Programmatically created `LinearLayout`
- Dynamic `TextView`, `EditText`, and `Buttons`
- Meal suggestions based on the time of day
- User input validation with friendly feedback
- Reset button to clear input and reset state

---

##  Tech Stack

- **Language**: Kotlin  
- **Framework**: Android SDK  
- **UI Layout**: Programmatically with `LinearLayout`

---

##  Usage

1. **Run the app** on an emulator or Android device.
2. Enter a time of day (examples below) into the text field.
3. Tap **"Suggest Meal"** to get a recommendation.
4. Tap **"Reset"** to clear everything and start over.

### Valid Inputs

- `morning`
- `mid-morning`
- `afternoon`
- `afternoon snack`
- `dinner`
- `after dinner`

---

##  Example Meal Suggestions

| Time of Day         | Meal Suggestion                            |
|---------------------|--------------------------------------------|
| Morning             | Eggs, Sandwich, Avocado & Juice            |
| Mid-morning         | Banana, Apple, Nuts                        |
| Afternoon           | Sandwich, Pap, Rice                        |
| Afternoon Snack     | Quick bites                                |
| Dinner              | Pasta, Rice                                |
| After Dinner        | Ice Cream                                  |

---

##  Input Error Handling

- If the user enters an unrecognized time, the app will suggest valid options.
- If the input is empty, the app prompts the user to enter something.

---

##  How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/ProgrammaticLayoutApp.git

