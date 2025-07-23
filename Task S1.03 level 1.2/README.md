# Java List Reverse Exercise

## Task S1.03 level 1.2 - Description

This Java program demonstrates how to:

- Create and populate a list of integers
- Use a `ListIterator` to reverse the order of elements
- Store reversed elements in a new list
- Print both original and reversed lists
- Organize code into separate files for clarity

---

## 📁 Files

- `Main.java`: Contains the `main()` method. It calls helper methods to create, reverse, and print the list.
- `ListHelper.java`: Contains three helper methods:
    - `createOriginalList()` – creates and returns a list of integers
    - `reverseList(List<Integer>)` – reverses a list using a `ListIterator`
    - `printList(List<Integer>)` – prints each element of a list on a new line

---

## ⚙️ How It Works

1. A list `[1, 2, 3, 4, 5]` is created.
2. A `ListIterator` is used to traverse the list **backwards**.
3. Elements are added to a second list in reverse order: `[5, 4, 3, 2, 1]`.
4. Both lists are printed using a custom `printList()` method.

