<div align="center">

# <span style="color:#3B82F6;">🗑️ C. Remove Smallest</span>

### <span style="color:#60A5FA;">Codeforces • Greedy • Sorting</span>

</div>

---

# <span style="color:#3B82F6;">📖 Problem Overview</span>

You are given an array of **positive integers**.

In one move, you may choose **any two elements** whose absolute difference is **at most 1** (`|ai - aj| ≤ 1`) and **remove the smaller element**.

If both elements are equal, you may remove either one of them.

Your task is to determine whether it is possible to keep performing these operations until **only one element remains**.

Since there are multiple test cases, you must answer each one independently.

---

# <span style="color:#3B82F6;">📥 Input</span>

The first line contains an integer **`t`** — the number of test cases.

For each test case:

* An integer **`n`** — the number of elements.
* An array of **`n`** positive integers.

### Constraints

* **1 ≤ t ≤ 1000**
* **1 ≤ n ≤ 50**
* **1 ≤ ai ≤ 100**

---

# <span style="color:#3B82F6;">📤 Output</span>

For every test case print:

* **YES** — if it is possible to reduce the array to exactly one element.
* **NO** — otherwise.

---

# <span style="color:#3B82F6;">💡 Key Observation</span>

The operation is only possible when two numbers differ by **0 or 1**.

After sorting the array:

* Every adjacent pair must differ by **at most 1**.
* If **any adjacent difference is greater than 1**, then those numbers can never interact, making it impossible to remove all elements.

Thus, after sorting, we only need to check the difference between every pair of adjacent elements.

---

# <span style="color:#3B82F6;">🧠 Greedy Approach</span>

1. Read the array.
2. If there is only one element, the answer is immediately **YES**.
3. Sort the array.
4. Traverse the sorted array.
5. Check the difference between every adjacent pair.
6. If any difference is greater than **1**, print **NO**.
7. Otherwise, print **YES**.

---

# <span style="color:#3B82F6;">📝 Algorithm</span>

1. Read the number of test cases.
2. For each test case:

   * Read `n`.
   * Read the array.
   * If `n == 1`, print **YES**.
   * Sort the array.
   * Compare every adjacent pair.
   * If any difference exceeds **1**, print **NO**.
   * Otherwise, print **YES**.

---

# <span style="color:#3B82F6;">📊 Dry Run</span>

### Example 1

Input

```text
1 2 2
```

Sorted Array

```text
1 2 2
```

Adjacent Differences

| Pair  | Difference |
| ----- | ---------- |
| 1 → 2 | 1          |
| 2 → 2 | 0          |

All differences are **≤ 1**.

Output

```text
YES
```

---

### Example 2

Input

```text
1 2 4
```

Sorted Array

```text
1 2 4
```

Adjacent Differences

| Pair  | Difference |
| ----- | ---------- |
| 1 → 2 | 1          |
| 2 → 4 | 2 ❌        |

Since one difference is greater than **1**, the array cannot be reduced to one element.

Output

```text
NO
```

---

### Example 3

Input

```text
5 5 5 5
```

Sorted Array

```text
5 5 5 5
```

Every adjacent difference is **0**.

Output

```text
YES
```

---

# <span style="color:#3B82F6;">⚡ Why This Works?</span>

After sorting, every removable operation can only happen between elements whose values differ by **0 or 1**.

If there exists a gap greater than **1**, that gap can never disappear because no operation can bridge it.

Therefore:

* **No gap larger than 1 → YES**
* **Any gap larger than 1 → NO**

This simple observation makes a greedy check sufficient.

---

# <span style="color:#3B82F6;">⚡ Complexity Analysis</span>

| Complexity           | Value                                |
| -------------------- | ------------------------------------ |
| **Time Complexity**  | **O(n log n)**                       |
| **Space Complexity** | **O(1)** *(excluding sorting space)* |

**Reason:**

* Sorting takes **O(n log n)**.
* Checking adjacent differences takes **O(n)**.

Overall complexity remains **O(n log n)**.

---

# <span style="color:#3B82F6;">🎯 Why This Solution Works</span>

Sorting places all similar values together.

If every neighboring pair differs by at most **1**, each smaller element can eventually be removed through valid operations until only one element remains.

However, if a difference larger than **1** exists, those two groups can never interact, making it impossible to eliminate all elements.

Thus, checking adjacent differences after sorting is both **necessary and sufficient**.

---

# <span style="color:#3B82F6;">📚 Concepts Used</span>

* ✅ Greedy Algorithm
* ✅ Sorting
* ✅ Arrays
* ✅ Adjacent Difference Check
* ✅ Simulation

---

<div align="center">

### <span style="color:#60A5FA;">⭐ Accepted on Codeforces</span>

**Language:** Java 21 (64-bit)

</div>
