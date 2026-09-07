<h2><a href="https://codeforces.com/problemset/problem/550/A">550A. Two Substrings</a></h2><h3>Easy</h3><hr>

<p>You are given string <code>s</code>. Your task is to determine if the given string <code>s</code> contains two non-overlapping substrings <code>"AB"</code> and <code>"BA"</code> (the substrings can go in any order).</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The only line of input contains a string <code>s</code> of length between <code>1</code> and <code>10^5</code> consisting of uppercase Latin letters.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print <code>"YES"</code> (without the quotes), if string <code>s</code> contains two non-overlapping substrings <code>"AB"</code> and <code>"BA"</code>, and <code>"NO"</code> otherwise.</p>

<p>&nbsp;</p>

<h3>Examples</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
ABA
</pre>

<p><strong>Output:</strong></p>

<pre>
NO
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
BACFAB
</pre>

<p><strong>Output:</strong></p>

<pre>
YES
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
AXBYBXA
</pre>

<p><strong>Output:</strong></p>

<pre>
NO
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first sample test, despite the fact that there are substrings <code>"AB"</code> and <code>"BA"</code>, their occurrences overlap, so the answer is <code>"NO"</code>.</p>

<p>In the second sample test there are the following occurrences of the substrings: <strong>BA</strong>CF<strong>AB</strong>.</p>

<p>In the third sample test there is no substring <code>"AB"</code> nor substring <code>"BA"</code>.</p>
