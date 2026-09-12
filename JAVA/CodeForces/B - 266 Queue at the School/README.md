<h2><a href="https://codeforces.com/problemset/problem/266/B">266B. Queue at the School</a></h2><h3>Easy</h3><hr>

<p>During the break the schoolchildren, boys and girls, formed a queue of <code>n</code> people in the canteen. Initially the children stood in the order they entered the canteen. However, after a while the boys started feeling awkward for standing in front of the girls in the queue and they started letting the girls move forward each second.</p>

<p>Let's describe the process more precisely. Let's say that the positions in the queue are sequentially numbered by integers from <code>1</code> to <code>n</code>, at that the person in the position number <code>1</code> is served first.</p>

<p>Then, if at time <code>x</code> a boy stands on the <code>i</code>-th position and a girl stands on the <code>(i + 1)</code>-th position, then at time <code>x + 1</code> the <code>i</code>-th position will have a girl and the <code>(i + 1)</code>-th position will have a boy.</p>

<p>The time is given in seconds.</p>

<p>You've got the initial position of the children, at the initial moment of time. Determine the way the queue is going to look after <code>t</code> seconds.</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains two integers <code>n</code> and <code>t</code> (<code>1 &lt;= n,t &lt;= 50</code>), which represent the number of children in the queue and the time after which the queue will transform into the arrangement you need to find.</p>

<p>The next line contains string <code>s</code>, which represents the schoolchildren's initial arrangement.</p>

<p>If the <code>i</code>-th position in the queue contains a boy, then the <code>i</code>-th character of string <code>s</code> equals <code>"B"</code>, otherwise the <code>i</code>-th character equals <code>"G"</code>.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>Print string <code>a</code>, which describes the arrangement after <code>t</code> seconds.</p>

<p>If the <code>i</code>-th position has a boy after the needed time, then the <code>i</code>-th character <code>a</code> must equal <code>"B"</code>, otherwise it must equal <code>"G"</code>.</p>

<p>&nbsp;</p>

<h3>Examples</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
5 1
BGGBG
</pre>

<p><strong>Output:</strong></p>

<pre>
GBGGB
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
5 2
BGGBG
</pre>

<p><strong>Output:</strong></p>

<pre>
GGBGB
</pre>
</div>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4 1
GGGB
</pre>

<p><strong>Output:</strong></p>

<pre>
GGGB
</pre>
</div>
