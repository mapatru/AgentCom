package msg;

import java.util.*;
public class ErrFunc {

	public static void main(String[] args) {
		System.out.println("Random number: " + Tutor.getRandom());
		for(int i=1; i<=15; i++) {
		System.out.println("Q" + i + ": Calculate: 30 + " + i + " + (" + Tutor.getRandom() + ")");}
		System.out.println("Pupil's answers: " + pupilAns());
		System.out.println("Correct answers: " + corrAns());
		System.out.println("Test results for each question: " + checkAnswers());
		System.out.println("Test result: " + calculateResult());
		Tutor.getRandom();


	}
	
	// Calculate the correct answers
	public static List<Integer> corrAns() {
		List<Integer> correctAnsw = new ArrayList<Integer>();
		for(int i=1; i<=15; i++) {
		int cAnswer = 30 + i + Tutor.getRandom();
		correctAnsw.add(cAnswer);
	}
		return correctAnsw;}
	
	
	// Calculate the pupil's answers
	public static List<Integer> pupilAns(){
		//Calculated answers
		List<Integer> pupilAnsw = new ArrayList<Integer>();
		
		for(int i=1; i<=15; i++){
			int answer = 30 + i + Tutor.getRandom();
			pupilAnsw.add(answer);
			}
		
//		//Wrong answers scenario
//		List<Integer> pupilAnsw = Arrays.asList(1, 2, 3, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65);
		
		return pupilAnsw;
	}
	
	
	
	// Check the pupil's answers
	private static List<Integer> checkAnswers() {
		List<Integer> l1 = corrAns();
		List<Integer> l2 = pupilAns();
		List<Integer> l3 = new ArrayList<Integer>();
		
		
		for(Integer templist :l1) {
			l3.add(l2.contains(templist) ? 1 : 0);
	
		}
		return (l3);
		
	}
	

	
	// Calculate Test Result
	public static int calculateResult(){
		int score = 0;
		for ( int i : checkAnswers() ) {
	        if ( i == 1 ) {
	            score += i;
	        }
	    }
		return score;
	    
	}
	
	
	

}
