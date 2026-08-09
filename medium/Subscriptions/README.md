# 🧩 Subscriptions

## 🔗 Problem Link
https://www.codechef.com/practice/logical-problems


## 📝 Problem Summary
A group of **N friends** wants to buy Chef-TV subscriptions.

- One subscription can be shared by **6 people**
- Cost of one subscription is **X**

👉 Find the **minimum total cost** so that all friends can use Chef-TV.


## 💡 Approach

We need to calculate how many subscriptions are required.

Since:
- 1 subscription = 6 people

We use **ceiling division**:

subscriptions = (N + 5) / 6
then
total_cost = subscriptions × X
