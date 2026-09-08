<h2><a href="https://codeforces.com/contest/2260/problem/C">2260C. Maximize XOR, Minimize Operations</a></h2><h3>Easy</h3><hr>

<p>You are given two non-negative integers <code>x</code> and <code>y</code>. In one operation, you can decrease <code>x</code> by <code>1</code> and simultaneously increase <code>y</code> by <code>1</code>. The operation cannot be performed if <code>x = 0</code>.</p>

<p>For each initial pair, perform some number of operations, possibly zero, so that the value of <code>x ⊕ y</code>, where <code>⊕</code> denotes the bitwise exclusive OR (XOR) operation, becomes as large as possible. Among all ways to obtain the maximum value, choose the one with the minimum number of operations.</p>

<p>Output the maximum value of <code>x ⊕ y</code> and the minimum required number of operations.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains an integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>).</p>

<p>Each of the next <code>t</code> lines contains two integers <code>x</code> and <code>y</code> (<code>0 &lt;= x,y &lt; 2^29</code>) — the initial values of the numbers in the corresponding test case.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, output two integers — the maximum possible value of <code>x ⊕ y</code> and the minimum number of operations required to obtain it.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
3
3 1
0 5
6 4
</pre>

<p><strong>Output:</strong></p>

<pre>
4 3
5 0
10 4
</pre>
</div>
