package ch07.review;

public class Score {
	
	public int score;
	
	public Score() {
		System.out.println("시험 점수를 입력해주세요");
	}
	
	public void grade(int Score) {
		
		if(Score >=90)
			System.out.println("A");
		else if (Score >= 80)
			System.out.println("B");
		else if (Score >= 70)
			System.out.println("C");
		else if (Score >= 60)
			System.out.println("D");
		else
			System.out.println("F");
		
	
	}
	
	

}
