<h2><a href="https://codeforces.com/problemset/problem/1913/B">1913B. Swap and Delete</a></h2><h3>Easy</h3><hr>

<p>You are given a binary string <code>s</code> (a string consisting only of <code>0</code>s and <code>1</code>s).</p>

<p>You can perform two types of operations on <code>s</code>:</p>

<ol>
	<li>Delete one character from <code>s</code>. This operation costs <code>1</code> coin.</li>
	<li>Swap any pair of characters in <code>s</code>. This operation is free (costs <code>0</code> coins).</li>
</ol>

<p>You can perform these operations any number of times and in any order.</p>

<p>Let's name a string you've got after performing operations above as <code>t</code>. The string <code>t</code> is <strong>good</strong> if for each <code>i</code> from <code>1</code> to <code>|t|</code> <code>ti != si</code> (<code>|t|</code> is the length of the string <code>t</code>).</p>

<p>The empty string is <strong>always good</strong>.</p>

<p>Note that you are comparing the resulting string <code>t</code> with the <strong>initial string</strong> <code>s</code>.</p>

<p>What is the minimum total cost to make the string <code>t</code> good?</p>

<p>&nbsp;</p>

<h3>Input</h3>

<p>The first line contains a single integer <code>t</code> (<code>1 &lt;= t &lt;= 10^4</code>) — the number of test cases. Then <code>t</code> test cases follow.</p>

<p>The only line of each test case contains a binary string <code>s</code> (<code>1 &lt;= |s| &lt;= 2 * 10^5</code>; <code>si ∈ {0, 1}</code>) — the initial string, consisting of <code>0</code>s and <code>1</code>s.</p>

<p><strong>Additional constraint on the input:</strong> the total length of all strings <code>s</code> doesn't exceed <code>2 * 10^5</code>.</p>

<p>&nbsp;</p>

<h3>Output</h3>

<p>For each test case, print one integer — the minimum total cost to make string <code>t</code> good.</p>

<p>&nbsp;</p>

<h3>Example</h3>

<div class="example-block">
<p><strong>Input:</strong></p>

<pre>
4
0
011
0101110001
111100
</pre>

<p><strong>Output:</strong></p>

<pre>
1
1
0
4
</pre>
</div>

<p>&nbsp;</p>

<h3>Note</h3>

<p>In the first test case, you have to delete a character from <code>s</code> to get the empty string <code>t</code>. Only then <code>t</code> becomes good. One deletion costs <code>1</code> coin.</p>

<p>In the second test case, you can, for example, delete the second character from <code>s</code> to get the string <code>01</code>, and then swap the first and second characters to get the string <code>t = 10</code>. String <code>t</code> is good, since <code>t1 != s1</code> and <code>t2 != s2</code>. The total cost is <code>1</code> coin.</p>

<p>In the third test case, you can, for example, swap <code>s1</code> with <code>s2</code>, swap <code>s3</code> with <code>s4</code>, swap <code>s5</code> with <code>s7</code>, swap <code>s6</code> with <code>s8</code> and swap <code>s9</code> with <code>s10</code>. You'll get <code>t = 1010001110</code>. All swap operations are free, so the total cost is <code>0</code>.</p>
