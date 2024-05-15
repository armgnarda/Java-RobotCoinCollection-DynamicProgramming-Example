import java.util.Arrays;

public class RobotCoinCollection {

	// Board Size
	static int N = 4;
	// Board
	static int[][] board = {
			{1, 0, 3, 0},
			{2, 1, 0, 5},
			{0, 4, 1, 0},
			{6, 0, 2, 9}
	};
	
	public static int maxCoins() {
		int[][] dp = new int[N][N];
		dp[0][0] = board[0][0];
		
		// fill the first column
		for (int i = 1; i < N; i++) {
			dp[i][0] = dp[i-1][0] + board[i][0];
		}
		// fill the first row
		for (int i = 1; i < N; i++) {
			dp[0][i] = dp[0][i-1] + board[0][i];
		}
		// fill the rest blanks
		for (int i = 1; i < N; i++) {
			for (int j = 1; j < N; j++) {
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + board[i][j];
			}
		}
		// return max amount of coin
		return dp[N-1][N-1];
	}
	
	public static void main(String[] args) {
		System.out.print("Maximum amount of money the robot can collect: " + maxCoins());
	}
}
