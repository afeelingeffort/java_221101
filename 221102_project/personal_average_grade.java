/*
 math, science, korean
{ 20, 30,  85}
{ 60, 43,  78}
{ 86, 75,  99}
{ 90, 60,  77}
{ 59, 90,  50}
{50, 100, 85}
    
    col 과목이고
    row 학생이다.
    
    각 과목마다 평균.
    각 학생마다 평균.
    전체 평균.
    과목 점수별 등급 매기기 (0~30, 31~60, 61~90, 91~100) DCBA
    평균에 대한 등급 매기기 (0~30, 31~60, 61~90, 91~100) 4,3,2,1 등급
    
    
    
*/

public class personal_average_grade {

	public static void main(String[] args) {
		int[][] score = { 
				{ 20, 30, 85 }, 
				{ 60, 43, 78 }, 
				{ 86, 75, 99 }, 
				{ 90, 60, 77 }, 
				{ 59, 90, 50 },
				{ 50, 100, 85 } };
		
		int mathTotal = 0, scienceTotal = 0, korTotal = 0;
		float overall_average = 0.0f, student_average = 0.0f;
		float math_average = 0.0f, science_average = 0.0f, kor_average = 0.0f;
//		float student1 = 0.0f, student2 = 0.0f, student3 = 0.0f, student4 = 0.0f, student5 = 0.0f, student6 = 0.0f;
		System.out.println("학생\t수학\t과학\t국어\t학생 평균");
		System.out.println("----------------------------------------");
		
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			int student_sum=0;

			mathTotal += score[i][0];
			scienceTotal += score[i][1];
			korTotal += score[i][2];

			System.out.printf("학생%d", (i + 1));

			for (int j = 0; j < score[i].length; j++) {
				student_sum+=score[i][j];
				sum += score[i][j];
				System.out.printf("\t%d", score[i][j]);

//				student1 += score[0][j];
//				student2 += score[1][j];
//				student3 += score[2][j];
//				student4 += score[3][j];
//				student5 += score[4][j];
//				student6 += score[5][j];
				overall_average = (float)sum/ (score.length*score[0].length);	//전체 평균 구하는 건 모르겠다.
			}

			math_average = (float) mathTotal / score.length;
			science_average = (float) scienceTotal / score.length;
			kor_average = (float) korTotal / score.length;
		
			
			
			
			char grade = ' ';

			if (student_average >= 91) {
				grade = '1';
			} else if (student_average >= 61) {
				grade = '2';
			} else if (student_average >= 31) {
				grade = '3';
			} else {
				grade = '4';
			}
			
			student_average = (float) student_sum / score[i].length;
			System.out.printf("\t%.2f \t%c%n", student_average, grade);
		}
		
		float[] score2 = {math_average, science_average, kor_average};
		char[] grade2= new char[3];
		
		for (int i = 0; i < score2.length; i++) {
			
			if (score2[i]>= 91 ) {
				grade2[i] = 'A';
			} else if (score2[i] >= 61 ) {
				grade2[i] = 'B';
			} else if (score2[i] >= 31) {
				grade2[i] = 'C';
			} else {
				grade2[i] = 'D';
			}
		}
		
		
//		char grade=' ';
//		
//		if (math_average>=91&&science_average>=91&&kor_average>=91) {
//			grade = 'A';
//		} else if (math_average>=61&&science_average>=61&&kor_average>=61) {
//			grade = 'B';
//		} else if (math_average>=31&&science_average>=31&&kor_average>=31) {
//			grade = 'C';
//		} else {
//			grade = 'D';
//		}
		
		System.out.println("-----------------------------------------");
		
		System.out.printf("과목평균 %.2f %c  %.2f %c  %.2f %c  %.2f%n ", score2[0],grade2[0],score2[1],grade2[1],score2[2],grade2[2],
				overall_average);
		
	}
}
//		float student_avg1 = 0, student_avg2 = 0, student_avg3 = 0, student_avg4 = 0, student_avg5 = 0, student_avg6=0;
//		float subject_avg1 = 0, subject_avg2 = 0, subject_avg3 = 0, overall_avg = 0;
//		float student1=0, student2=0, student3=0, student4=0, student5=0, student6=0;
//		int mathTotal = 0, scienceTotal = 0, KoreanTotal = 0;
//		
//		for (int i = 0; i < score.length; i++) {
//			mathTotal += score[i][0];
//			scienceTotal += score[i][1];
//			KoreanTotal += score[i][2];
//
//			subject_avg1 = mathTotal / (float) score.length;
//			subject_avg2 = scienceTotal / (float) score.length;
//			subject_avg3 = KoreanTotal / (float) score.length;
//			
//
//			for (int j = 0; j < score[i].length; j++) {
//				int sum=0;
//				sum += score[i][j];
//				overall_avg = sum / (float) score.length;
//				
//				student_avg1 += score[0][j];
//				student_avg2 += score[1][j];
//				student_avg3 += score[2][j];
//				student_avg4 += score[3][j];
//				student_avg5 += score[4][j];
//				student_avg6 += score[5][j];
//				
//				student1=student_avg1/(float)score[i].length;
//				student2=student_avg2/(float)score[i].length;
//				student3=student_avg3/(float)score[i].length;
//				student4=student_avg4/(float)score[i].length;
//				student5=student_avg5/(float)score[i].length;
//				
//				char grade=' ';
//				int subject_score=0;
//				
//				if (subject_score >= 91) {
//					grade = 'A';
//				} else if (subject_score >= 61) {
//					grade = 'B';
//				} else if (subject_score >= 31) {
//					grade = 'C';
//				} else {
//					grade = 'D';
//				}
//
//				char grade2 = ' ';
//				int average_grade2 = 0;
//
//				if (average_grade2 >= 91) {
//					grade2 = '1';
//				} else if (average_grade2 >= 61) {
//					grade2 = '2';
//				} else if (average_grade2 >= 31) {
//					grade2 = '3';
//				} else {
//					grade2 = '4';
//				}
//				
//			}
//
//		}
//		System.out.println("수학 평균: " + subject_avg1);
//		System.out.println("과학 평균: " + subject_avg2);
//		System.out.println("국어 평균: " + subject_avg3);
//		System.out.println("전체 평균: " + overall_avg);
//		System.out.println("학생 1 평균: "+student1);
//		System.out.println("학생 2 평균: "+student2);
//		System.out.println("학생 3 평균: "+student3);
//		System.out.println("학생 4 평균: "+student4);
//		System.out.println("학생 5 평균: "+student5);
//		System.out.println("학생 6 평균: "+student6);
		
