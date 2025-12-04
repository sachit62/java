# DSA Patterns – Complete Guide

This document summarizes the core problem-solving patterns used in Data Structures & Algorithms. Each pattern includes a clear explanation and typical use-cases to help you recognize when to apply it.

---

## 1. Prefix Sum

Used for cumulative operations on arrays where repeated range queries are needed.

Common Use-Cases:
- Range sum queries
- Subarray sum equals K
- Frequency difference arrays

---

## 2. Two Pointers

Used when traversing arrays/strings from both ends or comparing elements efficiently.

Common Use-Cases:
- Pair sum in sorted arrays
- Palindrome checking
- Shrinking/sliding range problems

---

## 3. Sliding Window

Used for subarray/substring problems requiring continuous segments (fixed or variable length).

Benefits: Reduces O(n²) → O(n)

Common Use-Cases:
- Longest substring without repeating characters
- Max sum subarray of size K
- Variable window problems

---

## 4. Fast and Slow Pointer

Used when relative movement between pointers helps detect states.

Common Use-Cases:
- Linked list cycle detection
- Finding middle element
- Linked list intersection

---

## 5. Three Pointers

When three running indices help maintain order or partitions.

Common Use-Cases:
- Dutch National Flag problem
- Merge sorted arrays
- In-place rearrangements

---

## 6. Monotonic Stack

Stack maintained in increasing or decreasing order for efficient nearest element queries.

Common Use-Cases:
- Next greater/smaller element
- Stock span problem
- Largest rectangle in histogram

---

## 7. Top-K Elements

Useful for selecting top-k largest/smallest elements efficiently.

Common Tools: Heaps, Priority Queue, Quickselect

Common Use-Cases:
- K largest or smallest elements
- K frequent elements
- Ranking and streaming data

---

## 8. Overlapping Interval

Involves combining or comparing time/space intervals.

Common Use-Cases:
- Merge intervals
- Meeting room scheduling
- Conflict/overlap detection

---

## 9. Modified Binary Search

Used on arrays with special structure or monotonic property.

Common Use-Cases:
- Search in rotated sorted array
- First/last occurrences
- Peak element
- Monotonic conditions

---

## 10. Binary Tree Traversal

Standard tree traversal techniques.

Types:
- Inorder
- Preorder
- Postorder
- Level order (BFS)

Common Use-Cases:
- BST operations
- Expression tree parsing

---

## 11. DFS (Depth-First Search)

Explores deeply before backtracking.

Common Use-Cases:
- Connected components
- Cycle detection
- Islands problems
- Pathfinding

---

## 12. BFS (Breadth-First Search)

Explores nodes level by level.

Common Use-Cases:
- Shortest path in unweighted graphs
- Multi-source BFS
- Level-order traversal

---

## 13. Matrix Traversal

Grid-based traversal techniques.

Common Use-Cases:
- Flood fill
- Spiral matrix
- DP tabulation
- Islands in 2D grid

---

## 14. Backtracking

Used to explore all possibilities with pruning.
When all combinations or permutations are there think of backtracking.

Common Use-Cases:
- Subsets
- Permutations
- N-Queens
- Sudoku solver

---

## 15. Dynamic Programming

Used for problems with overlapping subproblems and optimal substructure.

Common Use-Cases:
- Knapsack
- LIS
- Matrix DP
- DP on trees

---

## 16. Union Find (Disjoint Set Union)

Efficient for merging sets and checking connectivity.

Common Use-Cases:
- Connected components
- Cycle detection
- Kruskal’s MST
- Accounts merging

---

## 17. Greedy

Used when local optimal choices lead to the global best solution.

Common Use-Cases:
- Activity selection
- Jump Game
- Minimum platforms
- Huffman coding

---

