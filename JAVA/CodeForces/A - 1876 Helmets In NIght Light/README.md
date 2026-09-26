<h2><a href="https://codeforces.com/problemset/problem/1876/A">1876A. Helmets in Night Light</a></h2><h3>Easy</h3><hr>

<p>Pak Chanek is the chief of a village named Khuntien. On one night filled with lights, Pak Chanek has a sudden and important announcement that needs to be notified to all of the <code>n</code> residents in Khuntien.</p>

<p>First, Pak Chanek shares the announcement directly to one or more residents with a cost of <code>p</code> for each person. After that, the residents can share the announcement to other residents using a magical helmet-shaped device. However, there is a cost for using the helmet-shaped device. For each <code>i</code>, if the <code>i</code>-th resident has got the announcement at least once (either directly from Pak Chanek or from another resident), he/she can share the announcement to at most <code>a<sub>i</sub></code> other residents with a cost of <code>b<sub>i</sub></code> for each share.</p>

<p>If Pak Chanek can also control how the residents share the announcement to other residents, what is the minimum cost for Pak Chanek to notify all <code>n</code> residents of Khuntien about the announcement?</p>

<h3>Input</h3>

<p>Each test contains multiple test cases. The first line contains an integer <code>t</code> (<code>1≤t≤10<sup>4</sup></code>) — the number of test cases. The following lines contain the description of each test case.</p>

<p>The first line contains two integers <code>n</code> and <code>p</code> (<code>1≤n≤10<sup>5</code>; <code>1≤p≤10<sup>5</code>) — the number of residents and the cost for Pak Chanek to share the announcement to one resident.</p>

<p>The second line contains <code>n</code> integers <code>a<sub>1</sub>,a<sub>2</sub>,a<sub>3</sub>,…,a<sub>n</sub></code> (<code>1≤a<sub>i</sub>≤10<sup>5</code>) — the maximum number of residents that each resident can share the announcement to.</p>

<p>The third line contains <code>n</code> integers <code>b<sub>1</sub>,b<sub>2</sub>,b<sub>3</sub>,…,b<sub>n</sub></code> (<code>1≤b<sub>i</sub>≤10<sup>5</code>) — the cost for each resident to share the announcement to one other resident.</p>

<p>It is guaranteed that the sum of <code>n</code> over all test cases does not exceed <code>10<sup>5</sup></code>.</p>

<h3>Output</h3>

<p>For each test case, output a line containing an integer representing the minimum cost to notify all <code>n</code> residents of Khuntien about the announcement.</p>

<h3>Examples</h3>

<div class="example-block">
<pre>
3

6 3
2 3 2 1 1 3
4 3 2 6 3 6

1 100000
100000
1

4 94
1 4 2 3
103 96 86 57 </pre>

</div>

<div class="example-block">
<pre>
16
100000
265
</pre>
</div>

<h3>Note</h3>

<p>In the first test case, the following is a possible optimal strategy:</p>

<ol>
<li>Pak Chanek shares the announcement directly to the 3-rd, 5-th, and 6-th resident. This requires a cost of <code>p+p+p=3+3+3=9</code>.</li>
<li>The 3-rd resident shares the announcement to the 1-st and 2-nd resident. This requires a cost of <code>b<sub>3</sub>+b<sub>3</sub>=2+2=4</code>.</li>
<li>The 2-nd resident shares the announcement to the 4-th resident. This requires a cost of <code>b<sub>2</sub>=3</code>.</li>
</ol>

<p>The total cost is <code>9+4+3=16</code>. It can be shown that there is no other strategy with a smaller cost.</p>
