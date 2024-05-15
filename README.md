# Java-RobotCoinCollection-DynamicProgramming-Example
The Robot Coin Collection Problem is a challenge where a robot navigates a game board with varying amounts of currency in each cell, aiming to collect the maximum total value using dynamic programming.

 pseudo code: 
 function maxCoins(board):
    N = size(board)
    dp[N][N]
    
    // Başlangıç noktası
    dp[0][0] = board[0][0]
    
    // İlk sütunu doldur
    for i from 1 to N-1:
        dp[i][0] = dp[i-1][0] + board[i][0]
    
    // İlk satırı doldur
    for j from 1 to N-1:
        dp[0][j] = dp[0][j-1] + board[0
