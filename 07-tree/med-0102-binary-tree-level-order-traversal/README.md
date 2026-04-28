# 102. Binary Tree Level Order Traversal

## Difficulty
Medium

## Complexity
- Time: O(n)
- Space: O(n)

## Approach
We perform a Breadth-First Search (BFS) using a queue. We start from the root and process nodes level by level. For each level, we first capture the number of nodes currently in the queue (levelSize), then process exactly those nodes while adding their children to the queue for the next level. Each level’s values are stored in a separate list and added to the final result.

## Links
- [LeetCode](https://leetcode.com/problems/binary-tree-level-order-traversal/)
- [NeetCode](https://neetcode.io/problems/level-order-traversal-of-binary-tree/)
