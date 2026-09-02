<h2><a href="https://codeforces.com/problemset/problem/431/A">431A. Black Square</a></h2><h3>Easy</h3><hr>

<p>Quite recently, a very smart student named Jury decided that lectures are boring, so he downloaded a game called "Black Square" on his super cool touchscreen phone.</p>

<p>In this game, the phone's screen is divided into four vertical strips. Each second, a black square appears on some of the strips. According to the rules of the game, Jury must use this second to touch the corresponding strip to make the square go away. As Jury is both smart and lazy, he counted that he wastes exactly <code>ai</code> calories on touching the <code>i</code>-th strip.</p>

<p>You've got a string <code>s</code>, describing the process of the game and numbers <code>a1, a2, a3, a4</code>. Calculate how many calories Jury needs to destroy all the squares.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains four space-separated integers <code>a1, a2, a3, a4</code> (<code>0 &lt;= a1, a2, a3, a4 &lt;= 10^4</code>).</p>

<p>The second line contains string <code>s</code> (<code>1 &lt;= |s| &lt;= 10^5</code>), where the <code>i</code>-th character of the string equals:</p>

<ul>
	<li><code>"1"</code>, if the square appears on the first strip;</li>
	<li><code>"2"</code>, if it appears on the second strip;</li>
	<li><code>"3"</code>, if it appears on the third strip;</li>
	<li><code>"4"</code>, if it appears on the fourth strip.</li>
</ul>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print a single integer — the total number of calories that Jury wastes.</p>

<p>&nbsp;</p>

<h3>Examples</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
1 2 3 4
123214
</pre>

<p><strong>Output:</strong></p>

<pre>
13
</pre>

</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
1 5 3 2
11221
</pre>

<p><strong>Output:</strong></p>

<pre>
13
</pre>

</div>
