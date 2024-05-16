# Java-RobotCoinCollection-DynamicProgramming-Example
The Robot Coin Collection Problem is a challenge where a robot navigates a game board with varying amounts of currency in each cell, aiming to collect the maximum total value using dynamic programming.

pseudo code: 

    function maxCoins(grid):
    rows = number of rows in grid
    cols = number of columns in grid
    dp = 2D array of size rows x cols initialized with zeros
    
    // Base case: first cell
    dp[0][0] = grid[0][0]
    
    // Fill first row
    for j from 1 to cols-1:
        dp[0][j] = dp[0][j-1] + grid[0][j]
    
    // Fill first column
    for i from 1 to rows-1:
        dp[i][0] = dp[i-1][0] + grid[i][0]
    
    // Fill rest of the cells
    for i from 1 to rows-1:
        for j from 1 to cols-1:
            dp[i][j] = max(dp[i-1][j], dp[i][j-1]) + grid[i][j]
    
    return dp[rows-1][cols-1]
