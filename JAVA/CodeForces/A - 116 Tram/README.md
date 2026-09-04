<h2><a href="https://codeforces.com/problemset/problem/116/A">116A. Tram</a></h2><h3>Easy</h3><hr>

<p>Linear Kingdom has exactly one tram line. It has <code>n</code> stops, numbered from <code>1</code> to <code>n</code> in the order of tram's movement. At the <code>i</code>-th stop <code>ai</code> passengers exit the tram, while <code>bi</code> passengers enter it.</p>

<p>The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.</p>

<p>Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity.</p>

<p>Note that at each stop all exiting passengers exit <strong>before</strong> any entering passenger enters the tram.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains a single number <code>n</code> (<code>2 &lt;= n &lt;= 1000</code>) — the number of the tram's stops.</p>

<p>Then <code>n</code> lines follow, each contains two integers <code>ai</code> and <code>bi</code> (<code>0 &lt;= ai, bi &lt;= 1000</code>) — the number of passengers that exits the tram at the <code>i</code>-th stop, and the number of passengers that enter the tram at the <code>i</code>-th stop.</p>

<p>The stops are given from the first to the last stop in the order of tram's movement.</p>

<ul>
	<li>The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop.</li>
	<li>At the last stop, all the passengers exit the tram and it becomes empty.</li>
	<li>No passenger will enter the tram at the last stop. That is, <code>bn = 0</code>.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print a single integer denoting the minimum possible capacity of the tram (<code>0</code> is allowed).</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4
0 3
2 5
4 2
4 0
</pre>

<p><strong>Output:</strong></p>

<pre>
6
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>For the first example, a capacity of <code>6</code> is sufficient:</p>

<ul>
	<li>At the first stop, the number of passengers inside the tram before arriving is <code>0</code>. Then, <code>3</code> passengers enter the tram, and the number of passengers inside the tram becomes <code>3</code>.</li>
	<li>At the second stop, <code>2</code> passengers exit the tram (<code>1</code> passenger remains inside). Then, <code>5</code> passengers enter the tram. There are <code>6</code> passengers inside the tram now.</li>
	<li>At the third stop, <code>4</code> passengers exit the tram (<code>2</code> passengers remain inside). Then, <code>2</code> passengers enter the tram. There are <code>4</code> passengers inside the tram now.</li>
	<li>Finally, all the remaining passengers inside the tram exit the tram at the last stop. There are no passengers inside the tram now.</li>
</ul>

<p>Since the number of passengers inside the tram never exceeds <code>6</code>, a capacity of <code>6</code> is sufficient. Furthermore, it is not possible for the tram to have a capacity less than <code>6</code>. Hence, <code>6</code> is the correct answer.</p>
