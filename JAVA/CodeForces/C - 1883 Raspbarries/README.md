
<h2><a href="https://codeforces.com/problemset/problem/1883/C">1883C. Raspberries</a></h2><h3>Easy</h3><hr>

<p>You are given an array of integers <code>a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub></code> and a number <code>k</code> (<code>2≤k≤5</code>). In one operation, you can do the following:</p>

<ul>
<li>Choose an index <code>1≤i≤n</code>,</li>
<li>Set <code>a<sub>i</sub>=a<sub>i</sub>+1</code>.</li>
</ul>

<p>Find the minimum number of operations needed to make the product of all the numbers in the array <code>a<sub>1</sub>⋅a<sub>2</sub>⋅…⋅a<sub>n</sub></code> divisible by <code>k</code>.</p>

<h3>Input</h3>

<p>Each test consists of multiple test cases. The first line contains a single integer <code>t</code> (<code>1≤t≤10<sup>4</sup></code>) — the number of test cases. Then follows the description of the test cases.</p>

<p>The first line of each test case contains two integers <code>n</code> and <code>k</code> (<code>2≤n≤10<sup>5</sup></code>, <code>2≤k≤5</code>) — the size of the array <code>a</code>.</p>

<p>The second line of each test case contains <code>n</code> integers <code>a<sub>1</sub>,a<sub>2</sub>,…,a<sub>n</sub></code> (<code>1≤a<sub>i</sub>≤10</code>).</p>

<p>It is guaranteed that the sum of <code>n</code> over all test cases does not exceed <code>2⋅10<sup>5</code>.</p>

<h3>Output</h3>

<p>For each test case, output the minimum number of operations needed to make the product of all the numbers in the array divisible by <code>k</code>.</p>

<h3>Examples</h3>

<div class="example-block">
<pre>
15

2 5
7 3

3 3
7 4 1

5 2
9 7 7 3 9

5 5
5 4 1 2 3

7 4
9 5 1 5 9 5 1

3 4
6 3 6

3 4
6 1 5

3 4
1 5 9

4 4
1 4 1 1

3 4
3 5 3

4 5
8 9 9 3

2 5
1 6

2 5
10 10

4 5
1 6 1 1

2 5
7 7 </pre>

</div>

<div class="example-block">
<pre>
2
2
1
0
2
0
1
2
0
1
1
4
0
4
3
</pre>
</div>

<h3>Note</h3>

<p>In the first test case, we need to choose the index <code>i=2</code> twice. After that, the array will be <code>a=[7,5]</code>. The product of all the numbers in the array is <code>35</code>.</p>

<p>In the fourth test case, the product of the numbers in the array is <code>120</code>, which is already divisible by <code>5</code>, so no operations are needed.</p>

<p>In the eighth test case, we can perform two operations by choosing <code>i=2</code> and <code>i=3</code> in any order. After that, the array will be <code>a=[1,6,10]</code>. The product of the numbers in the array is <code>60</code>.</p>
