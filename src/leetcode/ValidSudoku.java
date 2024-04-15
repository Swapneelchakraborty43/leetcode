package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
		 HashSet<Character>[] rows = new HashSet[9];
	        HashSet<Character>[] columns = new HashSet[9];
	        HashSet<Character>[] subBoxes = new HashSet[9];
	        
	        for (int i = 0; i < 9; i++) {
	            rows[i] = new HashSet<>();
	            columns[i] = new HashSet<>();
	            subBoxes[i] = new HashSet<>();
	        }
	        
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                char num = board[i][j];
	                if (num != '.') {
	                    if (rows[i].contains(num) || columns[j].contains(num) || subBoxes[(i / 3) * 3 + j / 3].contains(num)) {
	                        return false;
	                    }
	                    rows[i].add(num);
	                    columns[j].add(num);
	                    subBoxes[(i / 3) * 3 + j / 3].add(num);
	                }
	            }
	        }
	        System.out.println(rows[1]);
	        
	        for(HashSet s: rows) {
	        	System.out.print(s+", ");
	        	
       }
	        
	        return true;
	}

	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		
		isValidSudoku(board);
//		System.out.println(board);
//		for (int i = 0; i < 8; i++) {
//			for (int j = 0; j < 8; j++) {
//				System.out.print(board[i][j] + " ");
//
//			}
//			System.out.println();
//		}

	}

}
