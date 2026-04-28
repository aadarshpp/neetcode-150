# 235. Lowest Common Ancestor of a Binary Search Tree

## Difficulty
Medium

## Complexity
- Time: O(h)
- Space: O(1)

## Approach
Since the tree is a Binary Search Tree (BST), we use its ordering property. Starting from the root, we compare the values of p and q with the current node. If both are smaller, we move left; if both are larger, we move right. Otherwise, the current node is the split point where p and q diverge, making it the Lowest Common Ancestor.

## Links
- [LeetCode](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
- [NeetCode](https://neetcode.io/problems/lowest-common-ancestor-in-binary-search-tree/history?submissionIndex=3)
