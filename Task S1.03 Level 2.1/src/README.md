# Restaurant HashSet Example
## Task S1.03 level 2.2

## Overview

This Java project demonstrates how to use a `HashSet` to store `Restaurant` objects and prevent duplicates based on both the restaurant's **name** and **score**.

- Restaurants with the **same name but different scores** are allowed.
- Restaurants with the **same name and score** are considered duplicates and are not added multiple times to the set.

## Features

- Custom `equals()` and `hashCode()` methods to ensure correct duplicate detection.
- Uses a `HashSet` to automatically handle uniqueness.
- Demonstrates iteration over the set using an `Iterator`.

## How It Works

1. The `Restaurant` class defines two attributes: `name` (String) and `score` (int).
2. The `equals()` method compares both `name` and `score` to decide if two `Restaurant` objects are equal.
3. The `hashCode()` method generates a consistent hash based on the same fields.
4. A `HashSet<Restaurant>` is used in the main program to store unique restaurants.
5. When adding a restaurant that already exists (same name and score), the set ignores the duplicate.
6. Iteration over the set is done using a traditional `Iterator`.
