<h2><a href="https://codeforces.com/contest/2260/problem/A">2260A. Monocarp's Contest</a></h2><h3>Easy</h3><hr>

<p>Monocarp is preparing a team programming contest. The contest has <code>n</code> problems, each of which is either easy or hard. The problems are numbered from <code>1</code> to <code>n</code>.</p>

<p>Monocarp wants the first and the last problems of the contest to be easy. In one operation, he can choose any two problems and swap them.</p>

<p>Determine the minimum number of operations required to make the first and the last problems easy, or report that it is impossible.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^3</code>) — the number of test cases.</p>

<p>Each test case consists of two lines:</p>

<ul>
	<li>The first line contains one integer <code>n</code> (<code>2 &lt;= n &lt;= 50</code>) — the number of problems in the contest.</li>
	<li>The second line contains <code>n</code> integers <code>a1, a2, ..., an</code> (<code>0 &lt;= ai &lt;= 1</code>).</li>
</ul>

<p>If <code>ai = 0</code>, then the problem with number <code>i</code> is easy; if <code>ai = 1</code>, then it is hard.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, print the minimum number of operations required to make the first and the last problems easy.</p>

<p>If it is impossible to satisfy the requirement, print <code>-1</code>.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4
2
0 0
2
0 1
6
1 0 0 1 0 0
5
1 0 0 1 1
</pre>

<p><strong>Output:</strong></p>

<pre>
0
-1
1
2
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, the first and the last problems are already easy, so no operations are needed.</p>

<p>In the second test case, there is only one easy problem, so it is impossible to make both the first and the last problems easy.</p>

<p>In the third test case, one can swap the first and the second problems.</p>

<p>In the fourth test case, one can first swap the first and the second problems, and then — the third and the fifth problems.</p>
