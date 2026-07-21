<div align="center">

# <span style="color:#3B82F6;">📝 A. Word</span>

### <span style="color:#60A5FA;">Codeforces • Implementation • Strings</span>

</div>

---

# <span style="color:#3B82F6;">📖 Problem Overview</span>

Vasya noticed that many people write words using a mixture of **uppercase** and **lowercase** letters, making them inconsistent and difficult to read.

To solve this, he wants to convert the entire word into **one uniform letter case** while changing the **minimum number of characters**.

The word should become either:

* **Completely lowercase**, or
* **Completely UPPERCASE**

The decision depends on which type of letters appears more frequently in the original word.

---

# <span style="color:#3B82F6;">📥 Input</span>

The input consists of a single word **`s`**.

### Constraints

* **1 ≤ |s| ≤ 100**
* The word contains only **English alphabet letters (A-Z, a-z)**.

---

# <span style="color:#3B82F6;">📤 Output</span>

Print the corrected version of the word according to the following rules:

* If the number of **uppercase** letters is **greater** than the number of lowercase letters, print the word in **UPPERCASE**.
* Otherwise (including when both counts are equal), print the word in **lowercase**.

---

# <span style="color:#3B82F6;">💡 Key Observation</span>

The objective is to **change as few letters as possible**.

This means:

* If most letters are already uppercase, converting everything to uppercase changes fewer letters.
* If most letters are lowercase, converting everything to lowercase changes fewer letters.
* If both counts are equal, the problem specifically asks us to choose **lowercase**.

---

# <span style="color:#3B82F6;">🧠 Approach</span>

1. Read the input word.

2. Traverse every character.

3. Count how many characters are **lowercase**.

4. Calculate the number of uppercase letters using:

   **Uppercase = Total Length − Lowercase**

5. Compare both counts.

   * **Uppercase > Lowercase**

     * Convert the whole word to uppercase.
   * **Otherwise**

     * Convert the whole word to lowercase.

---

# <span style="color:#3B82F6;">📝 Algorithm</span>

1. Input the string.
2. Initialize a lowercase counter.
3. Iterate through every character.
4. If the character lies between **'a'** and **'z'**, increase the lowercase counter.
5. Compute uppercase count.
6. Compare both counts.
7. Print the word in the required case.

---

# <span style="color:#3B82F6;">📊 Dry Run</span>

### Example 1

Input

```text
HoUse
```

| Character | H     | o     | U     | s     | e     |
| --------- | ----- | ----- | ----- | ----- | ----- |
| Case      | Upper | Lower | Upper | Lower | Lower |

* Lowercase = **3**
* Uppercase = **2**

Since lowercase letters are more,

Output

```text
house
```

---

### Example 2

Input

```text
ViP
```

| Character | V     | i     | P     |
| --------- | ----- | ----- | ----- |
| Case      | Upper | Lower | Upper |

* Lowercase = **1**
* Uppercase = **2**

Since uppercase letters are more,

Output

```text
VIP
```

---

### Example 3

Input

```text
maTRIx
```

| Character | m     | a     | T     | R     | I     | x     |
| --------- | ----- | ----- | ----- | ----- | ----- | ----- |
| Case      | Lower | Lower | Upper | Upper | Upper | Lower |

* Lowercase = **3**
* Uppercase = **3**

Both are equal.

According to the problem statement, choose **lowercase**.

Output

```text
matrix
```

---

# <span style="color:#3B82F6;">⚡ Complexity Analysis</span>

| Complexity           | Value    |
| -------------------- | -------- |
| **Time Complexity**  | **O(n)** |
| **Space Complexity** | **O(1)** |

where **n** is the length of the word.

---

# <span style="color:#3B82F6;">🎯 Why This Works</span>

The algorithm counts how many letters belong to each case.

Instead of converting characters one by one while deciding, it simply determines **which case already appears more frequently**.

Converting the entire word to that case guarantees that the **minimum number of letters** needs to be changed.

The tie case is handled exactly as specified in the problem statement by converting everything to **lowercase**.

---

# <span style="color:#3B82F6;">📚 Concepts Used</span>

* ✅ Strings
* ✅ Character Traversal
* ✅ Character Counting
* ✅ Conditional Statements
* ✅ Built-in String Functions (`toUpperCase()` & `toLowerCase()`)
* ✅ Greedy Observation

---

<div align="center">

### <span style="color:#60A5FA;">⭐ Accepted on Codeforces</span>

**Language:** Java 21 (64-bit)

</div>
