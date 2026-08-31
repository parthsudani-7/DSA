<h2><a href="https://codeforces.com/problemset/problem/1343/B">1343B. Balanced Array</a></h2><h3>Easy</h3><hr>

<p>You are given a positive integer <code>n</code>, it is guaranteed that <code>n</code> is even. You need to construct an array <code>a</code> of length <code>n</code> such that:</p>

<ul>
	<li>The first <code>n/2</code> elements are even.</li>
	<li>The second <code>n/2</code> elements are odd.</li>
	<li>All elements are distinct and positive.</li>
	<li>The sum of the first half equals the sum of the second half.</li>
</ul>

<p>If a valid array cannot be constructed, print <code>NO</code>. Otherwise, print <code>YES</code> followed by any valid array.</p>

<p>&nbsp;</p>

<h3>Approach</h3>

<p>Let <code>m = n / 2</code>.</p>

<p>A solution is possible only when <code>m</code> is even, which means <code>n % 4 == 0</code>.</p>

<p>For a valid <code>n</code>, construct:</p>

<ul>
	<li>First half: the first <code>m</code> positive even numbers:
		<code>2, 4, 6, ..., 2m</code>
	</li>
	<li>Second half: the first <code>m - 1</code> positive odd numbers:
		<code>1, 3, 5, ..., 2m - 3</code>
	</li>
	<li>The last odd number is chosen as <code>3m - 1</code> to make both sums equal.</li>
</ul>

<p>For example, when <code>n = 8</code>:</p>

<pre>
2 4 6 8 | 1 3 5 11
</pre>

<p>The sums are:</p>

<pre>
2 + 4 + 6 + 8 = 20
1 + 3 + 5 + 11 = 20
</pre>

<p>Therefore, the array is valid.</p>

<h3>Why <code>n % 4 == 0</code>?</h3>

<p>There must be the same number of even and odd elements. If <code>n/2</code> is odd, the sum of the required distinct odd numbers cannot match the sum of the even numbers because of parity. Therefore, a solution exists only when <code>n</code> is divisible by <code>4</code>.</p>

<h3>Complexity</h3>

<ul>
	<li><strong>Time:</strong> <code>O(n)</code> per test case</li>
	<li><strong>Space:</strong> <code>O(1)</code> extra space</li>
</ul>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>) — the number of test cases.</p>

<p>Each test case contains a single even integer <code>n</code> (<code>2 &lt;= n &lt;= 2 * 10^5</code>).</p>

<p>It is guaranteed that the sum of <code>n</code> over all test cases does not exceed <code>2 * 10^5</code>.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case:</p>

<ul>
	<li>Print <code>NO</code> if no suitable array exists.</li>
	<li>Otherwise, print <code>YES</code> and a valid array.</li>
</ul>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
5
2
4
6
8
10
</pre>

<p><strong>Output:</strong></p>

<pre>
NO
YES
2 4 1 5
NO
YES
2 4 6 8 1 3 5 11
NO
</pre>

</div>

<p>&nbsp;</p>
