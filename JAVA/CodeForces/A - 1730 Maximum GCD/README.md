<h2><a href="https://codeforces.com/problemset/problem/1370/A">1370A. Maximum GCD</a></h2><h3>Easy</h3><hr>

<p>Let's consider all integers in the range from <code>1</code> to <code>n</code> (inclusive).</p>

<p>Among all pairs of <strong>distinct</strong> integers in this range, find the maximum possible greatest common divisor of integers in pair.</p>

<p>Formally, find the maximum value of <code>gcd(a,b)</code>, where <code>1 &lt;= a &lt; b &lt;= n</code>.</p>

<p>The greatest common divisor, <code>gcd(a,b)</code>, of two positive integers <code>a</code> and <code>b</code> is the biggest integer that is a divisor of both <code>a</code> and <code>b</code>.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains a single integer <code>t</code> (<code>1 &lt;= t &lt;= 100</code>) — the number of test cases. The description of the test cases follows.</p>

<p>The only line of each test case contains a single integer <code>n</code> (<code>2 &lt;= n &lt;= 10^6</code>).</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output the maximum value of <code>gcd(a,b)</code> among all <code>1 &lt;= a &lt; b &lt;= n</code>.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
2
3
5
</pre>

<p><strong>Output:</strong></p>

<pre>
1
2
</pre>

</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, <code>gcd(1,2) = gcd(2,3) = gcd(1,3) = 1</code>.</p>

<p>In the second test case, <code>2</code> is the maximum possible value, corresponding to <code>gcd(2,4)</code>.</p>
