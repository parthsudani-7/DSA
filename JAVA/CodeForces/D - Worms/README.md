<div align="center">

# <span style="color:#3B82F6;">🪱 D. Worms</span>

### <span style="color:#60A5FA;">Codeforces • Binary Search • Prefix Sum</span>

</div>

---

# <span style="color:#3B82F6;">📖 Problem Overview</span>

Marmot has arranged **`n` piles of worms**.

Each pile contains a certain number of worms, and **every worm is assigned a unique label** starting from **1**.

For example, if the pile sizes are:

```text
2 7 3
```

Then the worm labels become:

| Pile | Worm Labels |
| ---- | ----------- |
| 1    | 1 – 2       |
| 2    | 3 – 9       |
| 3    | 10 – 12     |

Marmot gives Mole the label of a worm, and Mole has to determine **which pile contains that worm**.

Since there can be up to **100,000 queries**, checking every pile one by one would be too slow.

---

# <span style="color:#3B82F6;">📥 Input</span>

The input consists of:

* An integer **`n`** — number of worm piles.
* An array containing the size of every pile.
* An integer **`m`** — number of queries.
* `m` worm labels.

### Constraints

* **1 ≤ n ≤ 100000**
* **1 ≤ ai ≤ 1000**
* **1 ≤ m ≤ 100000**
* **Total worms ≤ 10⁶**

---

# <span style="color:#3B82F6;">📤 Output</span>

For every query, print the **1-based index of the pile** containing that worm.

---

# <span style="color:#3B82F6;">💡 Key Observation</span>

Instead of storing every worm individually, we store the **ending label of each pile**.

This is done using a **Prefix Sum Array**.

Example:

Pile Sizes

```text
2 7 3 4 9
```

Prefix Sum

| Pile | Last Worm Label |
| ---- | --------------- |
| 1    | 2               |
| 2    | 9               |
| 3    | 12              |
| 4    | 16              |
| 5    | 25              |

Now every query simply asks:

> Find the **first prefix sum that is greater than or equal to the worm label**.

Since the prefix array is sorted, we can use **Binary Search**.

---

# <span style="color:#3B82F6;">🧠 Approach</span>

1. Read all pile sizes.
2. Build the prefix sum array.
3. For every query:

   * Perform Binary Search on the prefix array.
   * Find the first value **≥ query**.
   * Output its position (**1-based indexing**).

---

# <span style="color:#3B82F6;">📝 Algorithm</span>

1. Input `n`.
2. Build a prefix sum array.
3. Read `m`.
4. For each worm label:

   * Apply Binary Search.
   * Find the first prefix sum greater than or equal to the label.
   * Print the pile number.

---

# <span style="color:#3B82F6;">📊 Dry Run</span>

### Input

```text
5
2 7 3 4 9
```

Prefix Sum Array

| Pile | Prefix Sum |
| ---- | ---------- |
| 1    | 2          |
| 2    | 9          |
| 3    | 12         |
| 4    | 16         |
| 5    | 25         |

---

### Query = 1

Binary Search finds the first prefix ≥ 1

```
2
```

Answer

```text
1
```

---

### Query = 11

Binary Search

```
2 9 12 16 25
      ↑
```

Answer

```text
3
```

---

### Query = 25

Binary Search

```
2 9 12 16 25
           ↑
```

Answer

```text
5
```

---

# <span style="color:#3B82F6;">⚡ Why Prefix Sum?</span>

Without a prefix array, we would have to count worms pile by pile for every query.

That would take **O(n)** time per query.

By storing cumulative worm counts, every query becomes a Binary Search problem.

---

# <span style="color:#3B82F6;">⚡ Why Binary Search?</span>

The prefix sum array is **always sorted in increasing order**.

Binary Search efficiently finds the **first prefix sum that is greater than or equal to the queried worm label**, directly giving the correct pile.

---

# <span style="color:#3B82F6;">⚡ Complexity Analysis</span>

| Complexity              | Value              |
| ----------------------- | ------------------ |
| **Building Prefix Sum** | **O(n)**           |
| **Each Query**          | **O(log n)**       |
| **Total Complexity**    | **O(n + m log n)** |
| **Space Complexity**    | **O(n)**           |

---

# <span style="color:#3B82F6;">🎯 Why This Solution Works</span>

Each prefix sum represents the **last worm label** in a pile.

Finding the first prefix sum that is **greater than or equal to** the requested worm label immediately tells us which pile contains that worm.

Using **Prefix Sum + Binary Search** makes the solution efficient enough for the given constraints.

---

# <span style="color:#3B82F6;">📚 Concepts Used</span>

* ✅ Prefix Sum
* ✅ Binary Search
* ✅ Arrays
* ✅ Searching
* ✅ Implementation

---

<div align="center">

### <span style="color:#60A5FA;">⭐ Accepted on Codeforces</span>

**Language:** Java 21 (64-bit)

</div>
