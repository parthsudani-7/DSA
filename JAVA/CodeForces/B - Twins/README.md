<div align="center">

# <span style="color:#3B82F6;">🪙 B. Twins</span>

### <span style="color:#60A5FA;">Codeforces • Greedy • Sorting</span>

</div>

---

# <span style="color:#3B82F6;">📖 Problem Overview</span>

You and your twin are given **`n` coins**, each having a certain value. Your mother wanted both of you to split the coins equally, but you decide to keep some coins for yourself.

Your goal is to **take the minimum number of coins** such that:

* The **sum of your selected coins** is **strictly greater** than the sum of the remaining coins.
* Among all possible choices, you must choose the one with the **fewest coins**.

The task is to determine this **minimum number of coins**.

---

# <span style="color:#3B82F6;">📥 Input</span>

The input consists of:

* An integer **`n`** — the number of coins.
* A sequence of **`n`** integers representing the value of each coin.

### Constraints

* **1 ≤ n ≤ 100**
* **1 ≤ ai ≤ 100**

---

# <span style="color:#3B82F6;">📤 Output</span>

Print a single integer representing the **minimum number of coins** you need to take so that your total value is **strictly greater** than the value of the remaining coins.

---

# <span style="color:#3B82F6;">💡 Key Observation</span>

To maximize the value while minimizing the number of coins:

* Always choose the **largest-valued coins first**.
* This greedy choice ensures you reach the required sum using the fewest possible coins.

---

# <span style="color:#3B82F6;">🧠 Greedy Approach</span>

1. Read all coin values.

2. Calculate the total value of all coins.

3. Sort the coins in **ascending order**.

4. Traverse the array from the **largest coin to the smallest**.

5. Keep adding the selected coin values.

6. Count the number of selected coins.

7. Stop as soon as:

   **Selected Sum > Remaining Sum**

   Since

   **Remaining Sum = Total Sum − Selected Sum**

   the condition becomes:

   **Selected Sum > Total Sum / 2**

8. Print the count.

---

# <span style="color:#3B82F6;">📝 Algorithm</span>

1. Input `n`.
2. Store all coin values.
3. Compute the total sum.
4. Sort the array.
5. Start from the largest coin.
6. Add each coin to your sum.
7. Increase the selected coin count.
8. If your sum becomes greater than half of the total sum, stop.
9. Output the count.

---

# <span style="color:#3B82F6;">📊 Dry Run</span>

### Example 1

Input

```text
2
3 3
```

Sorted Coins

```text
3 3
```

| Selected Coins | Selected Sum | Remaining Sum |
| -------------- | ------------ | ------------- |
| 3              | 3            | 3             |
| 3, 3           | 6            | 0             |

Since **6 > 0**, answer is

```text
2
```

---

### Example 2

Input

```text
3
2 1 2
```

Sorted Coins

```text
1 2 2
```

| Selected Coins | Selected Sum | Remaining Sum |
| -------------- | ------------ | ------------- |
| 2              | 2            | 3             |
| 2, 2           | 4            | 1             |

Since **4 > 1**, answer is

```text
2
```

---

# <span style="color:#3B82F6;">⚡ Why Greedy Works?</span>

Choosing larger coins first increases your total as quickly as possible.

If you were to choose smaller coins first, you would likely need **more coins** to exceed the remaining sum.

Therefore, selecting the **largest available coin at every step** guarantees the minimum number of coins.

---

# <span style="color:#3B82F6;">⚡ Complexity Analysis</span>

| Complexity           | Value                                |
| -------------------- | ------------------------------------ |
| **Time Complexity**  | **O(n log n)**                       |
| **Space Complexity** | **O(1)** *(excluding sorting space)* |

**Reason:**

* Sorting the array takes **O(n log n)**.
* Traversing the sorted array takes **O(n)**.

Overall complexity remains **O(n log n)**.

---

# <span style="color:#3B82F6;">🎯 Why This Solution Works</span>

The algorithm always selects the highest-valued remaining coin.

Because every chosen coin contributes the maximum possible value, the required sum is reached with the **fewest selections**.

Once the selected sum becomes **strictly greater than half** of the total sum, it is automatically greater than the sum of the remaining coins, satisfying the problem condition.

---

# <span style="color:#3B82F6;">📚 Concepts Used</span>

* ✅ Greedy Algorithm
* ✅ Sorting
* ✅ Arrays
* ✅ Prefix Sum (Running Sum)
* ✅ Simulation

---

<div align="center">

### <span style="color:#60A5FA;">⭐ Accepted on Codeforces</span>

**Language:** Java 21 (64-bit)

</div>
