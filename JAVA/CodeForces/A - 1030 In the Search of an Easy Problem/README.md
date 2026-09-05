<h2><a href="https://codeforces.com/problemset/problem/1030/A">1030A. In Search of an Easy Problem</a></h2><h3>Easy</h3><hr>

<p>When preparing a tournament, Codeforces coordinators try their best to make the first problem as easy as possible. This time the coordinator had chosen some problem and asked <code>n</code> people about their opinions. Each person answered whether this problem is easy or hard.</p>

<p>If at least one of these <code>n</code> people has answered that the problem is hard, the coordinator decides to change the problem. For the given responses, check if the problem is easy enough.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains a single integer <code>n</code> (<code>1 &lt;= n &lt;= 100</code>) — the number of people who were asked to give their opinions.</p>

<p>The second line contains <code>n</code> integers, each integer is either <code>0</code> or <code>1</code>.</p>

<ul>
	<li>If the <code>i</code>-th integer is <code>0</code>, then the <code>i</code>-th person thinks that the problem is easy.</li>
	<li>If the <code>i</code>-th integer is <code>1</code>, then the <code>i</code>-th person thinks that the problem is hard.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print one word:</p>

<ul>
	<li><code>EASY</code> if the problem is easy according to all responses.</li>
	<li><code>HARD</code> if there is at least one person who thinks that the problem is hard.</li>
</ul>

<p>You may print every letter in any register: <code>EASY</code>, <code>easy</code>, <code>EaSY</code> and <code>eAsY</code> all will be processed correctly.</p>

<p>&nbsp;</p>

<h3>Examples</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
3
0 0 1
</pre>

<p><strong>Output:</strong></p>

<pre>
HARD
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
1
0
</pre>

<p><strong>Output:</strong></p>

<pre>
EASY
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first example the third person says it's a hard problem, so it should be replaced.</p>

<p>In the second example the problem is easy for the only person, so it doesn't have to be replaced.</p>
