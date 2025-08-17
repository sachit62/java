# LeetCode 73 - Set Matrix Zeroes

## Problem Description
Given an `m x n` integer matrix, if an element is 0, set its entire row and column to 0's.

You must do it **in place**.

**Example 1:**
```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
```

**Example 2:**
```
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

**Constraints:**
- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 200`
- `-2^31 <= matrix[i][j] <= 2^31 - 1`

## Intuition

The key insight is to use the first row and first column of the matrix as markers to store information about which rows and columns should be set to zero. This approach allows us to solve the problem in-place without using extra space.

## Approach

1. **Use first row and first column as markers**: Instead of using additional arrays to track which rows/columns contain zeros, we use the matrix itself.

2. **Handle the special case of matrix[0][0]**: Since both the first row and first column use matrix[0][0] as a marker, we need a separate variable `col0` to track if the first column should be zero.

3. **Two-pass solution**: 
   - First pass: Mark the rows and columns that should be zero
   - Second pass: Apply the zeroes based on the markers

## Algorithm

1. **Initialize**: Set `col0 = 1` to track if the first column should be zero.

2. **First Pass - Marking**:
   - Iterate through the matrix
   - When `matrix[i][j] == 0`:
     - Set `matrix[i][0] = 0` (mark row i)
     - If `j != 0`, set `matrix[0][j] = 0` (mark column j)
     - If `j == 0`, set `col0 = 0` (mark first column)

3. **Second Pass - Applying**:
   - Iterate from `i = 1` to `n-1` and `j = 1` to `m-1`
   - If `matrix[0][j] == 0` OR `matrix[i][0] == 0`, set `matrix[i][j] = 0`

4. **Handle First Row**:
   - If `matrix[0][0] == 0`, set all elements in the first row to 0

5. **Handle First Column**:
   - If `col0 == 0`, set all elements in the first column to 0

## Time and Space Complexity

- **Time Complexity**: O(m × n) - We traverse the matrix twice
- **Space Complexity**: O(1) - We use only a constant amount of extra space

## Solution Code

```java
import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Marking in the 0th row, 0th col
        int col0 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        // Marking the untouched part of the matrix
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Mark the 0th row on the basis of matrix[0][0]
        if (matrix[0][0] == 0) {
            for (int j = 1; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Mark 0th col on the basis of col0
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
```

## Detailed Trace Examples

### Example 1: `[[1,1,1],[1,0,1],[1,1,1]]`

**Initial Matrix:**
```
[1, 1, 1]
[1, 0, 1]
[1, 1, 1]
```

**Step 1: First Pass - Marking**
- `matrix[1][1] = 0` (found zero at row 1, col 1)
  - Set `matrix[1][0] = 0` (mark row 1)
  - Set `matrix[0][1] = 0` (mark col 1)
  - `col0 = 1` (unchanged since j ≠ 0)

**After First Pass:**
```
[1, 0, 1]  ← matrix[0][1] = 0 marks col 1
[0, 0, 1]  ← matrix[1][0] = 0 marks row 1
[1, 1, 1]
```

**Step 2: Second Pass - Applying**
- `matrix[1][1]`: `matrix[0][1] == 0` OR `matrix[1][0] == 0` → Set to 0
- `matrix[1][2]`: `matrix[0][2] == 1` AND `matrix[1][0] == 0` → Set to 0
- `matrix[2][1]`: `matrix[0][1] == 0` OR `matrix[2][0] == 1` → Set to 0

**After Second Pass:**
```
[1, 0, 1]
[0, 0, 0]
[1, 0, 1]
```

**Step 3: Handle First Row**
- `matrix[0][0] = 1` ≠ 0 → No change needed

**Step 4: Handle First Column**
- `col0 = 1` ≠ 0 → No change needed

**Final Result:**
```
[1, 0, 1]
[0, 0, 0]
[1, 0, 1]
```

---

### Example 2: `[[0,1,2,0],[3,4,5,2],[1,3,1,5]]`

**Initial Matrix:**
```
[0, 1, 2, 0]
[3, 4, 5, 2]
[1, 3, 1, 5]
```

**Step 1: First Pass - Marking**
- `matrix[0][0] = 0` (found zero at row 0, col 0)
  - Set `matrix[0][0] = 0` (mark row 0)
  - Set `col0 = 0` (mark first column since j == 0)

- `matrix[0][3] = 0` (found zero at row 0, col 3)
  - Set `matrix[0][0] = 0` (mark row 0, already 0)
  - Set `matrix[0][3] = 0` (mark col 3)

**After First Pass:**
```
[0, 1, 2, 0]  ← matrix[0][0] = 0 marks row 0, matrix[0][3] = 0 marks col 3
[3, 4, 5, 2]
[1, 3, 1, 5]
col0 = 0 (marks first column)
```

**Step 2: Second Pass - Applying**
- `matrix[1][1]`: `matrix[0][1] == 1` AND `matrix[1][0] == 3` → No change
- `matrix[1][2]`: `matrix[0][2] == 2` AND `matrix[1][0] == 3` → No change
- `matrix[1][3]`: `matrix[0][3] == 0` OR `matrix[1][0] == 3` → Set to 0
- `matrix[2][1]`: `matrix[0][1] == 1` AND `matrix[2][0] == 1` → No change
- `matrix[2][2]`: `matrix[0][2] == 2` AND `matrix[2][0] == 1` → No change
- `matrix[2][3]`: `matrix[0][3] == 0` OR `matrix[2][0] == 1` → Set to 0

**After Second Pass:**
```
[0, 1, 2, 0]
[3, 4, 5, 0]
[1, 3, 1, 0]
```

**Step 3: Handle First Row**
- `matrix[0][0] = 0` → Set all elements in first row to 0

**After Handling First Row:**
```
[0, 0, 0, 0]
[3, 4, 5, 0]
[1, 3, 1, 0]
```

**Step 4: Handle First Column**
- `col0 = 0` → Set all elements in first column to 0

**Final Result:**
```
[0, 0, 0, 0]
[0, 4, 5, 0]
[0, 3, 1, 0]
```

## Alternative Approaches

### Approach 1: Using Extra Space
- Use two boolean arrays to track which rows and columns contain zeros
- Time: O(m × n), Space: O(m + n)

### Approach 2: Brute Force with Marking
- Use a special value (like Integer.MIN_VALUE) to mark cells that should be zero
- Time: O(m × n), Space: O(1) but modifies input data

## Key Insights

1. **In-place modification**: The challenge is to modify the matrix without using extra space
2. **Marker technique**: Using the first row and column as markers is a clever way to store information
3. **Special case handling**: The first row and column need special handling since they overlap at matrix[0][0]
4. **Two-pass approach**: First pass to mark, second pass to apply changes

## Common Mistakes

1. **Forgetting to handle matrix[0][0]**: This cell affects both the first row and first column
2. **Modifying markers during iteration**: This can lead to incorrect results
3. **Not considering edge cases**: Empty matrices or matrices with only one row/column

