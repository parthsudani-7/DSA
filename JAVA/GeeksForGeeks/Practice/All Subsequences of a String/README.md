# All Subsequences of a String

## Problem Statement

Given a string `s`, generate all possible subsequences of the string (including the empty subsequence) and return them in **lexicographical order**.

A subsequence is formed by deleting zero or more characters from the original string without changing the relative order of the remaining characters.

---

## Examples

### Example 1

**Input:**

```txt
s = "abc"
```

**Output:**

```txt
["", "a", "ab", "abc", "ac", "b", "bc", "c"]
```

### Example 2

**Input:**

```txt
s = "aa"
```

**Output:**

```txt
["", "a", "a", "aa"]
```

---

## Approach (Recursion / Backtracking)

Each character in the string has **two choices**:

1. **Exclude** the current character from the subsequence
2. **Include** the current character in the subsequence

This naturally forms a recursion tree.

For a string of length `n`, each character contributes 2 choices, so total subsequences are:

```txt
2^n
```

---

## Recursive Strategy

We recursively process the string from left to right using an index.

At every index:

* First, move forward **without taking** the current character.
* Then, move forward **after taking** the current character.

### Base Case

When index reaches the end of the string:

* The currently formed subsequence is complete.
* Add it to the answer list.

---

## Dry Run

For:

```txt
s = "ab"
```

Recursion tree:

```txt
                ""
             /      \
          skip a    take a
           /  \       /  \
        ""   "b"    "a"  "ab"
```

Generated subsequences:

```txt
"", "b", "a", "ab"
```

After sorting lexicographically:

```txt
"", "a", "ab", "b"
```

---

## Why Sorting?

Recursive generation does **not guarantee lexicographical order**, so after generating all subsequences, sorting ensures the required output format.

---

## Time Complexity

Generating all subsequences:

```txt
O(n * 2^n)
```

Why?

* Total subsequences = `2^n`
* Each subsequence may take up to `O(n)` to build/store

Sorting also contributes, but overall expected complexity remains:

```txt
O(n * 2^n)
```

---

## Space Complexity

```txt
O(n * 2^n)
```

Reason:

* Storing all subsequences requires exponential space.
* Recursive stack depth is `O(n)`.

---

## Key Concepts Used

* Recursion
* Backtracking
* Lexicographical Sorting
* Subsequence Generation

---

## Takeaway

This problem is a classic example of **pick / not-pick recursion**.

Whenever a problem asks for:

* all subsets
* all subsequences
* all combinations

Think of the recursive pattern:

```txt
Take it / Leave it
```
