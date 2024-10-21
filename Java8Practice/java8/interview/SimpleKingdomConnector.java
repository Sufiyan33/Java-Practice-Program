package interview;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SimpleKingdomConnector {
	static class Cell {
		int x, y;
		char kingdom;

		Cell(int x, int y, char kingdom) {
			this.x = x;
			this.y = y;
			this.kingdom = kingdom;
		}
	}

	// Directions for moving up, down, left, and right
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static int minimumCells(int n, int m, char[][] grid) {
		Queue<Cell> queue = new LinkedList<>();
		boolean[][] visited = new boolean[n][m];
		Map<Character, Set<Cell>> kingdomMap = new HashMap<>();

		// Initialize kingdom map for 'A', 'B', and 'C'
		kingdomMap.put('A', new HashSet<>());
		kingdomMap.put('B', new HashSet<>());
		kingdomMap.put('C', new HashSet<>());

		// Add kingdom cells ('A', 'B', 'C') to the queue and mark them visited
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char cell = grid[i][j];
				if (cell == 'A' || cell == 'B' || cell == 'C') {
					queue.offer(new Cell(i, j, cell));
					visited[i][j] = true;
					kingdomMap.get(cell).add(new Cell(i, j, cell));
				}
			}
		}

		int minRoads = 0; // Count the number of road cells used
		Set<Character> connectedKingdoms = new HashSet<>();

		// BFS to explore all passable cells
		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				Cell current = queue.poll();
				connectedKingdoms.add(current.kingdom);

				// If all three kingdoms are connected, return the road count
				if (connectedKingdoms.size() == 3)
					return minRoads - 1;

				// Explore neighbors in all four directions
				for (int k = 0; k < 4; k++) {
					int newX = current.x + dx[k];
					int newY = current.y + dy[k];

					if (isValid(newX, newY, n, m, grid, visited)) {
						visited[newX][newY] = true;
						queue.offer(new Cell(newX, newY, current.kingdom));

						// If it's a roadable cell ('*'), increment road count
						if (grid[newX][newY] == '*')
							minRoads++;
					}
				}
			}
		}

		return minRoads; // Return the minimum number of road cells used
	}

	// Helper function to check if a cell is valid and unvisited
	static boolean isValid(int x, int y, int n, int m, char[][] grid, boolean[][] visited) {
		return x >= 0 && x < n && y >= 0 && y < m && !visited[x][y]
				&& (grid[x][y] == '*' || grid[x][y] == 'A' || grid[x][y] == 'B' || grid[x][y] == 'C');
	}

	public static void main(String[] args) {
		// Example test case
		int n = 4, m = 5;
		char[][] grid = { { 'A', 'A', '*', '*', 'B' }, { '+', '*', 'C', 'B', 'C' }, { '*', '+', 'C', 'C', 'C' },
				{ '+', '*', '*', 'C', 'B' } };

		// Call the method and print the result
		System.out.println(minimumCells(n, m, grid)); // Expected output: 2
	}
}
