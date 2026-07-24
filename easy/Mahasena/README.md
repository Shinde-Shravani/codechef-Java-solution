# ⚔️ Mahasena

A Java solution for the **CodeChef** problem **"Mahasena"**.

## 📌 Problem Statement

Kattapa believes that a soldier is:

- **Lucky** if they hold an **even** number of weapons.
- **Unlucky** if they hold an **odd** number of weapons.

The army is considered **READY FOR BATTLE** if the number of lucky soldiers is **strictly greater** than the number of unlucky soldiers. Otherwise, it is **NOT READY**.

Your task is to determine whether the army is ready for battle.


## 💻 Language Used

- Java

## 🚀 Approach

1. Read the number of soldiers `N`.
2. Traverse the array containing the number of weapons held by each soldier.
3. Count:
   - Soldiers with an **even** number of weapons.
   - Soldiers with an **odd** number of weapons.
4. If the count of even-numbered soldiers is greater than the count of odd-numbered soldiers, print:
   ```
   READY FOR BATTLE
   ```
   Otherwise, print:
   ```
   NOT READY
   ```
