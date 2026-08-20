<h2><a href="https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1">Rat in a Maze</a></h2><h3>Medium</h3><hr><p>Given a binary matrix <code>maze[][]</code> of size <code>n &times; n</code> containing values <code>0</code> and <code>1</code>, find all possible paths for a rat to travel from the source cell <code>(0, 0)</code> to the destination cell <code>(n - 1, n - 1)</code>. The rat can move in four directions: up (<code>'U'</code>), down (<code>'D'</code>), left (<code>'L'</code>), and right (<code>'R'</code>).</p>

<ul>
	<li><code>1</code> represents an open cell through which the rat can move.</li>
	<li><code>0</code> represents a blocked cell that cannot be traversed.</li>
</ul>

<p>The rat can move only through open cells and cannot visit the same cell more than once in a path. Return all valid paths as strings consisting of <code>'U'</code>, <code>'D'</code>, <code>'L'</code>, and <code>'R'</code>, representing the sequence of moves taken by the rat.</p>

<p><strong>Note:</strong> Return the paths in lexicographically increasing order. If no valid path exists, return an empty list.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">maze[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]</span></p>

<p><strong>Output:</strong> <span class="example-io">["DDRDRR", "DRDDRR"]</span></p>

<p><strong>Explanation:</strong> There are two valid paths from the source cell (0, 0) to the destination cell (3, 3): <code>"DDRDRR"</code> and <code>"DRDDRR"</code>.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">maze[][] = [[1, 0], [1, 0]]</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>

<p><strong>Explanation:</strong> No path exists as the destination cell (1, 1) is blocked.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= n &lt;= 5</code></li>
	<li><code>0 &lt;= maze[i][j] &lt;= 1</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Expected Complexities:</strong></p>

<ul>
	<li><strong>Time Complexity:</strong> <code>O(4<sup>n * n</sup>)</code></li>
	<li><strong>Auxiliary Space:</strong> <code>O(n * n)</code></li>
</ul>
