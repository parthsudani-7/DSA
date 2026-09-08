<h2><a href="https://codeforces.com/contest/2260/problem/B">2260B. Monocarp and Projects</a></h2><h3>Easy</h3><hr>

<p>Monocarp runs a company. Consider the work of his company over the next <code>k</code> months. In the first month, the company has <code>x</code> employees, not counting Monocarp himself, and <code>y</code> projects need to be completed. In each next month, both the number of employees and the number of projects increase by <code>1</code>.</p>

<p>In other words, in month <code>i</code> (<code>0 &lt;= i &lt; k</code>), the company has <code>x + i</code> employees and needs to complete <code>y + i</code> projects.</p>

<p>In each month, Monocarp distributes the projects among the employees. Each employee must receive the same number of projects, and each project can be assigned to at most one employee. Monocarp completes all unassigned projects himself. He always chooses a distribution that makes him complete as few projects as possible.</p>

<p>In particular, if in some month there are <code>a</code> employees and <code>b</code> projects, then Monocarp assigns exactly <code>floor(b/a)</code> projects to each employee, and he completes <code>b mod a</code> projects himself.</p>

<p>Find the total number of projects that Monocarp will complete himself over the next <code>k</code> months.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains an integer <code>t</code> — the number of test cases (<code>1 &lt;= t &lt;= 10^4</code>).</p>

<p>Each test case consists of one line containing three integers <code>x</code>, <code>y</code>, and <code>k</code> (<code>1 &lt;= x &lt;= y &lt;= 10^6</code>; <code>1 &lt;= k &lt;= 10^12</code>).</p>

<p><strong>Additional constraint on the input:</strong></p>

<ul>
	<li>The sum of <code>y</code> over all test cases does not exceed <code>10^6</code>.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output one integer — the total number of projects that Monocarp will complete himself over <code>k</code> months.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
7
1 1 1
3 10 2
3 8 6
7 20 1
10 25 100
8 36 17
1 999900 1000000000000
</pre>

<p><strong>Output:</strong></p>

<pre>
0
4
18
6
1425
110
999898177699820694
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, the only employee completes the only project, so Monocarp is left with no projects.</p>

<p>In the second test case, in the first month, <code>10</code> projects are distributed among <code>3</code> employees: each gets <code>3</code> projects, and Monocarp completes <code>1</code> project. In the second month, <code>11</code> projects are distributed among <code>4</code> employees: each gets <code>2</code> projects, and Monocarp completes <code>3</code> projects. The answer is <code>1 + 3 = 4</code>.</p>

<p>In the third test case, the number of projects completed by Monocarp in the six months is <code>2</code>, <code>1</code>, <code>0</code>, <code>5</code>, <code>5</code>, and <code>5</code>, respectively. Their sum is <code>2 + 1 + 0 + 5 + 5 + 5 = 18</code>.</p>
