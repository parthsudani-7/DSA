<h2><a href="https://codeforces.com/problemset/problem/791/A">791A. Bear and Big Brother</a></h2><h3>Easy</h3><hr>

<p>Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.</p>

<p>Right now, Limak and Bob weigh <code>a</code> and <code>b</code> respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.</p>

<p>Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.</p>

<p>After how many full years will Limak become strictly larger (strictly heavier) than Bob?</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The only line of the input contains two integers <code>a</code> and <code>b</code> (<code>1 &lt;= a &lt;= b &lt;= 10</code>) — the weight of Limak and the weight of Bob respectively.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print one integer, denoting the integer number of years after which Limak will become strictly larger than Bob.</p>

<p>&nbsp;</p>

<h3>Examples</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4 7
</pre>

<p><strong>Output:</strong></p>

<pre>
2
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4 9
</pre>

<p><strong>Output:</strong></p>

<pre>
3
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
1 1
</pre>

<p><strong>Output:</strong></p>

<pre>
1
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first sample, Limak weighs <code>4</code> and Bob weighs <code>7</code> initially. After one year their weights are <code>4·3 = 12</code> and <code>7·2 = 14</code> respectively. Limak isn't larger than Bob yet. After the second year weights are <code>36</code> and <code>28</code>, so the first weight is greater than the second one. Limak became larger than Bob after two years so you should print <code>2</code>.</p>

<p>In the second sample, Limak's and Bob's weights in next years are: <code>12</code> and <code>18</code>, then <code>36</code> and <code>36</code>, and finally <code>108</code> and <code>72</code> (after three years). The answer is <code>3</code>. Remember that Limak wants to be larger than Bob and he won't be satisfied with equal weights.</p>

<p>In the third sample, Limak becomes larger than Bob after the first year. Their weights will be <code>3</code> and <code>2</code> then.</p>
