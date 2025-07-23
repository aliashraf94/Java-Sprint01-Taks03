# Sorted Restaurant Listing
## Task S1.03 Level 2.1

## Overview

This Java project demonstrates how to store and sort `Restaurant` objects based on:

1. **Name** (alphabetically A–Z)
2. **Score** (in descending order)

It also ensures that **duplicate restaurants** — those with the same **name and score** — are **not added multiple times**.

---

## ✅ Key Features

- Uses `TreeSet` to automatically sort `Restaurant` objects.
- Implements the `Comparable` interface in the `Restaurant` class.
- Prevents duplicates using custom `equals()` and `hashCode()` methods.
- Uses a traditional `Iterator` to print out the list.

--- 
## 🏗️ How It Works

- The `Restaurant` class:
    - Has two attributes: `name` (String) and `score` (int).
    - Implements `Comparable<Restaurant>` to define custom sorting.
    - Overrides `equals()` and `hashCode()` to prevent exact duplicates (same name and score).

- The `Main` class:
    - Adds multiple `Restaurant` instances to a `TreeSet`.
    - Uses an `Iterator` to print them in sorted order.

---

### 📋 Sorting Rules

- **First**: Sort by restaurant name (A–Z).
- **Second**: If names match, sort by score (high to low).

