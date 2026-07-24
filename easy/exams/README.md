# 🧩 Exams

## 🔗 Problem Link
https://www.codechef.com/practice/logical-problems

## 📝 Problem Summary

There are:
- **X schools**
- Each school has **Y students**

👉 Total students = **X × Y**

Out of these, **Z students passed**.

👉 Determine whether the number of students who passed is **strictly greater than 50%** of total students.

## 💡 Approach

We need to check:
Z > 50% of (X × Y)

Instead of using percentage, simplify:
Z > (X × Y) / 2

👉 Multiply both sides by 2 (to avoid floating point):
2 × Z > X × Y
