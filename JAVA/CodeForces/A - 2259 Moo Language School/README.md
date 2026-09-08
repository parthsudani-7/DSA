<h2><a href="https://codeforces.com/problemset/problem/2259/A">2259A. Moo Language School</a></h2><h3>Easy</h3><hr>

<p>Farmer John is trying to increase literacy rates in the United Cows of Farmer John (UCFJ). The UCFJ consists of <code>n</code> fields and <code>n/k</code> farms (where <code>n</code> is a multiple of <code>k</code>), with each farm consisting of <code>k</code> consecutive fields.</p>

<p>In other words, the <code>i</code>-th field is in the <code>ceil(i/k)</code>-th farm: Fields <code>1,2,...,k</code> are in the first farm, fields <code>k+1,k+2,...,2k</code> are in the second farm, etc.</p>

<p>Farmer John wants to build schools such that each farm has at least one school. However, some fields are owned by Farmer Nhoj, who will charge Farmer John extra to build a school there.</p>

<p>Farmer John wants to know the minimum number of times that he would have to build a school on Farmer Nhoj's land in order to ensure that each farm has at least one school.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line of each input contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>) — the number of test cases.</p>

<p>The first line of each test case contains two integers <code>n</code> and <code>k</code> (<code>1 &lt;= k &lt;= n &lt;= 20</code>, <code>n</code> is a multiple of <code>k</code>) — the number of fields and size of each farm.</p>

<p>The second line of each test case contains a binary string <code>s</code> of length <code>n</code> — the fields owned by Farmer Nhoj.</p>

<ul>
	<li>If <code>si = 1</code>, the <code>i</code>-th field is owned by Farmer Nhoj.</li>
	<li>If <code>si = 0</code>, the <code>i</code>-th field is not owned by Farmer Nhoj.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output a single integer — the minimum number of times that Farmer John must build a school on Farmer Nhoj's land.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
6
8 2
10011100
5 1
11111
8 4
01111110
5 1
00101
4 4
1101
4 4
1111
</pre>

<p><strong>Output:</strong></p>

<pre>
1
5
0
2
0
1
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>For the first test case, we can build a school on the 2nd, 3rd, 5th, and 7th fields, and of those, only the 5th field is owned by Farmer Nhoj, meaning our answer is <code>1</code>. It can be shown that this is the best possible answer.</p>

<p>For the second test case, Farmer Nhoj owns every field, and since we have to build <code>5</code> schools, we must build on Farmer Nhoj's land <code>5</code> times.</p>
