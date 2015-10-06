package javaGradeSchoolMultTable;

// Print out the grade-school multiplication table up to 12 x 12

public class GradeSchoolTables {
	
	public static void multiTables(int max)
	{
		for (int i = 1; i <= max; i++) {
			for(int j = 1; j <= max; j++) {
				System.out.println(String.format ( "%4d", j * i));
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		multiTables(12);
	}
}
