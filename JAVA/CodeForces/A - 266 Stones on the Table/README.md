<h2><a href="https://codeforces.com/problemset/problem/266/A">266A. Stones on the Table</a></h2><h3>Easy</h3><hr><p>There are <code>n</code> stones on the table in a row, each of them can be red, green, or blue. Count the minimum number of stones to take from the table so that any two neighboring stones have different colors. Stones in a row are considered neighboring if there are no other stones between them.</p>

<p>&nbsp;</p>
<p><strong>Input</strong></p>
<p>The first line contains integer <code>n</code> (<code>1 &lt;= n &lt;= 50</code>) — the number of stones on the table.</p>
<p>The next line contains string <code>s</code>, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character <code>s</code> equals <code>'R'</code>, if the i-th stone is red, <code>'G'</code>, if it's green and <code>'B'</code>, if it's blue.</p>

<p>&nbsp;</p>
<p><strong>Output</strong></p>
<p>Print a single integer — the answer to the problem.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 3, s = "RRG"</span></p>

<p><strong>Output:</strong> <span class="example-io">1</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 5, s = "RRRRR"</span></p>

<p><strong>Output:</strong> <span class="example-io">4</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">n = 4, s = "BRBG"</span></p>

<p><strong>Output:</strong> <span class="example-io">0</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 50</code></li>
	<li><code>s</code> consists of characters <code>'R'</code>, <code>'G'</code>, and <code>'B'</code> only.</li>
</ul>
