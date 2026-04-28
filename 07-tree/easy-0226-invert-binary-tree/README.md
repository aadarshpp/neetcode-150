# 226. Invert Binary Tree

## Difficulty
Easy

## Complexity
- Time: O(n)
- Space: O(h)

## Approach
We recursively traverse the tree in a depth-first manner. For each node, we swap its left and right children after recursively inverting its subtrees. The recursion ensures that every subtree is inverted before attaching it back to the current node.

## Links
- [LeetCode](https://leetcode.com/problems/invert-binary-tree/)
- [NeetCode](https://neetcode.io/problems/invert-a-binary-tree/question?list=neetcode150)
