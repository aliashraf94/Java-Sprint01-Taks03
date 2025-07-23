
# Country Capitals Quiz Game

## Task S1.03 level 1.3 - Description

This Java program is a simple quiz game that tests the user’s knowledge of country capitals. The program:

- Loads a list of countries and their capitals from a text file.
- Asks the user for their name.
- Randomly shows 10 countries, one at a time.
- Prompts the user to enter the capital of each displayed country.
- Awards points for each correct answer.
- At the end, saves the user’s name and score in a file called `classificacio.txt`.

---

## Features

- Uses a `HashMap` to store country-capital pairs for fast lookup.
- Reads the country data from `countries.txt`
- Uses random selection to present countries to the user.
- Ask User their name and by the end of the game gives score.
- Saves user scores to a text file.
---

## Additional Information

- The list of countries includes a mix of famous countries from Europe, Latin America, South Asia, and Africa.
- The program uses Java’s `Scanner` and `HashMap` classes to read files and manage data.
- The program uses a `Random` object to select countries randomly.
- When you are running program locally give absolute path of the `countries.txt`
