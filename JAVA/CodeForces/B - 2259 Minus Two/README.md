<h2><a href="https://codeforces.com/problemset/problem/2259/B">2259B. Minus Two</a></h2><h3>Easy</h3><hr>

<p>You are given an array <code>a1, a2, ..., an</code>. You may perform the following operation:</p>

<ul>
	<li><strong>For all</strong> indices <code>i</code> (<code>1 &lt;= i &lt;= n</code>), set <code>ai = |ai - 2|</code>.</li>
</ul>

<p>Find the maximum possible frequency of any integer in <code>a</code> after performing the operation an arbitrary number (possibly zero) of times.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line of each input contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>) — the number of test cases.</p>

<p>The first line of each test case contains an integer <code>n</code> (<code>1 &lt;= n &lt;= 2 * 10^5</code>) — the length of <code>a</code>.</p>

<p>The second line of each test case contains <code>n</code> integers <code>a1, a2, ..., an</code> (<code>1 &lt;= ai &lt;= 10^9</code>) — the elements of the array <code>a</code>.</p>

<p>It is guaranteed that the sum of <code>n</code> over all test cases does not exceed <code>2 * 10^5</code>.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output a single integer denoting the maximum possible frequency of any integer in <code>a</code> after performing the operation an arbitrary number of times.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
5
2
1 3
4
1 1 1 2
3
6 7 8
4
2 2 2 2
5
1 10 100 1000 100000
</pre>

<p><strong>Output:</strong></p>

<pre>
2
3
1
4
3
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, we can perform the operation once to have <code>a = [|1 - 2|, |3 - 2|] = [1,1]</code>, which means the maximum possible frequency of any integer in <code>a</code> is <code>2</code>.</p>

<p>In the second test case, the maximum frequency of an integer in <code>a</code> is <code>3</code>. It can be shown that, no matter how many operations we perform, the maximum possible frequency of an integer in <code>a</code> will never exceed <code>3</code>.</p>
