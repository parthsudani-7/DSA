<div align="center">

# <span style="color:#3B82F6;">🌙 E. Burning Midnight Oil</span>

### <span style="color:#60A5FA;">Codeforces • Binary Search • Mathematics</span>

</div>

---

# <span style="color:#3B82F6;">📖 Problem Overview</span>

Vasya has been assigned an important programming task that consists of writing **`n` lines of code** in a single night.

Initially, he can write **`v` lines** before taking a tea break. After every break, his productivity decreases by a factor of **`k`**, meaning the number of lines he writes becomes:

* First session: **v**
* Second session: **⌊v / k⌋**
* Third session: **⌊v / k²⌋**
* Fourth session: **⌊v / k³⌋**
* ...

The process continues until the current value becomes **0**, at which point Vasya falls asleep.

Your task is to determine the **minimum initial value `v`** such that the total number of lines written is **at least `n`**.

---

# <span style="color:#3B82F6;">📥 Input</span>

The input consists of two integers:

* **`n`** — the required number of lines of code.
* **`k`** — the productivity reduction factor.

### Constraints

* **1 ≤ n ≤ 10⁹**
* **2 ≤ k ≤ 10**

---

# <span style="color:#3B82F6;">📤 Output</span>

Print the **minimum value of `v`** that allows Vasya to write **at least `n` lines** before falling asleep.

---

# <span style="color:#3B82F6;">💡 Key Observation</span>

For a fixed value of **`v`**, the total number of lines written is:

> **v + ⌊v/k⌋ + ⌊v/k²⌋ + ⌊v/k³⌋ + ...**

As **`v` increases**, the total number of lines written **also increases**.

This means the answer is **monotonic**, making the problem ideal for **Binary Search**.

---

# <span style="color:#3B82F6;">🧠 Approach</span>

1. Perform Binary Search on the answer `v`.
2. For every candidate value:

   * Compute the total lines written:

     * `v`
     * `⌊v/k⌋`
     * `⌊v/k²⌋`
     * ...
   * Stop when the current value becomes `0`.
3. If the total is **greater than or equal to `n`**, try a smaller value.
4. Otherwise, search for a larger value.
5. The first valid value found is the answer.

---

# <span style="color:#3B82F6;">📝 Algorithm</span>

1. Read `n` and `k`.
2. Initialize Binary Search:

   * Left = 1
   * Right = n
3. While Left < Right:

   * Find the middle value.
   * Calculate the total number of lines for that value.
   * If the total is enough:

     * Move to the left half.
   * Otherwise:

     * Move to the right half.
4. Print the final answer.

---

# <span style="color:#3B82F6;">📊 Dry Run</span>

### Example 1

Input

```text
7 2
```

Check **v = 4**

| Session | Lines Written |
| ------- | ------------: |
| 1       |             4 |
| 2       |             2 |
| 3       |             1 |
| 4       |      0 (Stop) |

Total

```text
4 + 2 + 1 = 7
```

Since **7 ≥ 7**, the answer is

```text
4
```

---

### Example 2

Input

```text
59 9
```

Check **v = 54**

| Session | Lines Written |
| ------- | ------------: |
| 1       |            54 |
| 2       |             6 |
| 3       |      0 (Stop) |

Total

```text
54 + 6 = 60
```

Since **60 ≥ 59**, the minimum valid value is

```text
54
```

---

# <span style="color:#3B82F6;">⚡ Why Binary Search?</span>

If a particular value of **`v`** is sufficient to complete the program, then **every larger value** will also be sufficient.

Similarly, if a value is not enough, then **every smaller value** will also fail.

This monotonic behavior allows Binary Search to efficiently find the minimum valid answer.

---

# <span style="color:#3B82F6;">⚡ Complexity Analysis</span>

| Complexity                  | Value                 |
| --------------------------- | --------------------- |
| **Binary Search**           | **O(log n)**          |
| **Checking One Value**      | **O(logₖ n)**         |
| **Overall Time Complexity** | **O(log n × logₖ n)** |
| **Space Complexity**        | **O(1)**              |

---

# <span style="color:#3B82F6;">🎯 Why This Solution Works</span>

The total number of lines written increases as the starting value **`v`** increases.

By repeatedly checking whether a candidate value can produce at least **`n`** lines and narrowing the search range using Binary Search, we efficiently find the **smallest possible starting value**.

This approach satisfies all constraints and runs comfortably within the given time limits.

---

# <span style="color:#3B82F6;">📚 Concepts Used</span>

* ✅ Binary Search on Answer
* ✅ Mathematics
* ✅ Integer Division
* ✅ Simulation
* ✅ Greedy Observation

---

<div align="center">

### <span style="color:#60A5FA;">⭐ Accepted on Codeforces</span>

**Language:** Java 21 (64-bit)

</div>
