# Leetcode 743
## Network delay time
You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.

### Example 1:
<pre><code>
    Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
    Output: 2
</code></pre>

### Example 2:
<pre><code>
    Input: times = [[1,2,1]], n = 2, k = 1
    Output: 1
</code></pre> 

### Example 3:
<pre><code>
    Input: times = [[1,2,1]], n = 2, k = 2
    Output: -1
</code></pre> 

### Constraints:
<ul>
    <li>1 <= k <= n <= 100</li>
    <li>1 <= times.length <= 6000</li>
    <li>times[i].length == 3</li>
    <li>1 <= ui, vi <= n</li>
    <li>ui != vi</li>
    <li>0 <= wi <= 100</li>
    <li>All the pairs (ui, vi) are unique. (i.e., no multiple edges.)</li>
</ul>    
