<h2><a href="https://codeforces.com/contest/2260/problem/D">2260D. Signs of Prefix Sums</a></h2><h3>Easy</h3><hr>

<p>For an array <code>a1, a2, ..., an</code> of integers, in which no element is equal to <code>0</code>, define the prefix sums as an array <code>p1, p2, ..., pn</code>, where <code>pi</code> is equal to the sum of the first <code>i</code> elements of the array <code>a</code>.</p>

<p>From the prefix sums array, a string <code>s</code> of length <code>n</code> is constructed: its <code>i</code>-th character is <code>+</code> if <code>pi &gt; 0</code>, <code>-</code> if <code>pi &lt; 0</code>, and <code>0</code> if <code>pi = 0</code>.</p>

<p>For example, for the array <code>a = [2, -1, -1, -2, 2]</code>, the prefix sums are <code>p = [2, 1, 0, -2, 0]</code>. Therefore, the corresponding string is <code>++0-0</code>.</p>

<p>The cost of the array <code>a</code> is defined as:</p>

<pre>
max(1 &lt;= i &lt;= n) |ai|
</pre>

<p>You are given a string <code>s</code>. Find the minimum possible cost of an integer array <code>a</code> from which this string could have been obtained.</p>

<p>All elements of the array <code>a</code> must be non-zero. If no such array exists, output <code>-1</code>.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>).</p>

<p>Each test case consists of two lines:</p>

<ul>
	<li>The first line contains an integer <code>n</code> (<code>1 &lt;= n &lt;= 3 * 10^5</code>) — the length of the string <code>s</code>.</li>
	<li>The second line contains a sequence <code>s</code> of length <code>n</code> consisting of the characters <code>0</code>, <code>+</code>, and/or <code>-</code>.</li>
</ul>

<p><strong>Additional constraints on the input data:</strong></p>

<ul>
	<li>The sum of <code>n</code> over all test cases does not exceed <code>3 * 10^5</code>.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output one integer — the minimum possible cost of the array <code>a</code>, or <code>-1</code> if there is no suitable array.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
6
1
+
1
0
3
++0
4
+--+
5
+---+
5
+0++-
</pre>

<p><strong>Output:</strong></p>

<pre>
1
-1
2
3
2
2
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>Optimal arrays <code>a</code> in the test cases of the example:</p>

<ol>
	<li><code>[1]</code>;</li>
	<li>no suitable array;</li>
	<li><code>[2, -1, -1]</code>;</li>
	<li><code>[1, -3, 1, 2]</code>;</li>
	<li><code>[1, -2, -1, 1, 2]</code>;</li>
	<li><code>[2, -2, 2, -1, -2]</code>.</li>
</ol>
