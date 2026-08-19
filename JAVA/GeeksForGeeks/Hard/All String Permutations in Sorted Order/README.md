<h2><a href="https://www.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1">All String Permutations in Sorted Order</a></h2><h3>Hard</h3><hr><p>Given a string <code>s</code>. Find all permutations of a given string. Return the permutations in <strong>lexicographically non-decreasing order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s = "AA"
<strong>Output:</strong> ["AA", "AA"]
<strong>Explanation:</strong> There are total 2 permutations, as given in the output.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s = "ABC"
<strong>Output:</strong> ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
<strong>Explanation:</strong> There are total 6 permutations, as given in the output.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.size() &lt;= 5</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> <code>O(n! * n)</code></li>
	<li><strong>Auxiliary Space:</strong> <code>O(n!)</code></li>
</ul>
