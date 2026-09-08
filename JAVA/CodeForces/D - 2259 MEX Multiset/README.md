<h2><a href="https://codeforces.com/problemset/problem/2259/D">2259D. MEX Multiset</a></h2><h3>Easy</h3><hr>

<p>You are given an array <code>a1, a2, ..., an</code>. There exist <code>3</code> initially empty multisets <code>A</code>, <code>B</code>, <code>C</code>, and for each index <code>i</code> (<code>1 &lt;= i &lt;= n</code>), you may put <code>ai</code> into <strong>exactly one</strong> of <code>A</code>, <code>B</code>, or <code>C</code>.</p>

<p>Determine whether it is possible to put the elements into the multisets such that:</p>

<pre>
MEX(A) + MEX(B) + MEX(C) &gt;= 2 * max(MEX(A), MEX(B), MEX(C))
</pre>

<p>If so, output a construction that achieves this.</p>

<p><strong>MEX(D)</strong> is defined as the smallest non-negative integer that is not present in the set <code>D</code>.</p>

<p>For example:</p>

<ul>
	<li><code>MEX([1,2,0,5]) = 3</code></li>
	<li><code>MEX([1,2,4,9]) = 0</code></li>
	<li>The MEX of an empty set is <code>0</code>.</li>
</ul>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line of each input contains <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>) — the number of test cases.</p>

<p>The first line of each test case contains <code>n</code> (<code>3 &lt;= n &lt;= 2 * 10^5</code>) — the length of <code>a</code>.</p>

<p>The second line of each test case contains <code>a1, a2, ..., an</code> (<code>0 &lt;= ai &lt;= 10^9</code>) — the elements of the array.</p>

<p>It is guaranteed that the sum of <code>n</code> over all test cases does not exceed <code>2 * 10^5</code>.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>If a valid distribution of elements into the multisets exists, output <code>YES</code>. Otherwise, output <code>NO</code>.</p>

<p>If the answer is <code>YES</code>, output a string <code>s</code> of length <code>n</code> on a new line, such that:</p>

<ul>
	<li><code>si = A</code> if the <code>i</code>-th element was put into the multiset <code>A</code>.</li>
	<li><code>si = B</code> if the <code>i</code>-th element was put into the multiset <code>B</code>.</li>
	<li><code>si = C</code> if the <code>i</code>-th element was put into the multiset <code>C</code>.</li>
</ul>

<p>You can output the answer in any case (upper or lower).</p>

<p>If there are multiple possible outputs, output any.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
5
6
1 0 0 1 2 1
4
0 0 0 0
3
0 2 2
4
6 7 6 7
5
0 0 0 1 2
</pre>

<p><strong>Output:</strong></p>

<pre>
YES
ABABCA
YES
ABAC
NO
YES
AAAB
YES
ABCAB
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, we can have <code>A = {0,1,1}</code>, <code>B = {0,1}</code>, <code>C = {2}</code>, meaning:</p>

<pre>
MEX(A) + MEX(B) + MEX(C) = 4
</pre>

<p>and:</p>

<pre>
2 * max(MEX(A), MEX(B), MEX(C)) = 2 * max(2,2,0) = 4
</pre>

<p>In the third test case, it can be shown that there are no valid distributions.</p>
