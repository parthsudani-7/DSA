<h2><a href="https://codeforces.com/problemset/problem/1851/B">1851B. Olya and Game with Arrays</a></h2><h3>Easy</h3><hr>

<p>Artem suggested a game to the girl Olya. There is a list of arrays, where the <code>i</code>-th array contains <code>n<sub>i</sub></code> positive integers <code>a<sub>i,1</sub>, a<sub>i,2</sub>, ..., a<sub>i,n<sub>i</sub></sub></code>.</p>

<p>Olya can move <strong>at most one</strong> (possibly <strong>zero</strong>) integer from <strong>each</strong> array to another array. Note that integers can be moved from one array only once, but integers can be added to one array <strong>multiple times</strong>, and all the movements are done <strong>at the same time</strong>.</p>

<p>The <i>beauty</i> of the list of arrays is defined as the sum of the minimum values of all arrays. In other words, for each array, we find the minimum value in it and then sum up these values.</p>

<p>The goal of the game is to maximize the beauty of the list of arrays. Help Olya win this challenging game!</p>

<h3>Input</h3>

<p>Each test consists of multiple test cases. The first line contains a single integer <code>t</code> (<code>1≤t≤10<sup>4</sup></code>) — the number of test cases. The description of test cases follows.</p>

<p>The first line of each test case contains a single integer <code>n</code> (<code>1≤n≤2⋅10<sup>5</sup></code>) — the number of arrays in the list.</p>

<p>This is followed by descriptions of the arrays. Each array description consists of two lines.</p>

<p>The first line contains a single integer <code>n<sub>i</sub></code> (<code>1≤n<sub>i</sub>≤2⋅10<sup>5</sup></code>) — the number of elements in the <code>i</code>-th array.</p>

<p>The next line contains <code>n<sub>i</sub></code> integers <code>a<sub>i,1</sub>,a<sub>i,2</sub>,...,a<sub>i,n<sub>i</sub></sub></code> (<code>1≤a<sub>i,j</sub>≤10<sup>9</sup></code>) — the elements of the <code>i</code>-th array.</p>

<p>It is guaranteed that the sum of <code>n</code> and the sum of <code>n<sub>i</sub></code> over all test cases do not exceed the constraints given in the problem.</p>

<h3>Output</h3>

<p>For each test case, output a single line containing a single integer — the maximum beauty of the list of arrays that Olya can achieve.</p>

<h3>Examples</h3>

<div class="example-block">
<pre>
3

2
2
1 2
2
4 3

1
3
100 1 6

3
4
1001 7 1007 5
3
8 11 6
2
2 9 </pre>

</div>

<div class="example-block">
<pre>
5
1
19
</pre>
</div>

<h3>Note</h3>

<p>In the first test case, we can move the integer <code>1</code> from the second array to the first array. Then the beauty is <code>5</code>. It can be shown that this is the maximum possible beauty.</p>

<p>In the second test case, there is only one array, so regardless of the movements, the beauty will be <code>1</code>.</p>
