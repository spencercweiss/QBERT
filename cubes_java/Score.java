public class Score {

    private int score; // current score
    private int lives; // current life count
    private int bonuslives; // points allotted towards extra lives
// you receive an extra life after 8000 points, then one for every 14000 points after that
    private int newpoints;
    
    public Score(int s, int l, int b, int p){
      score = s;
      lives = l;
      bonuslives = b;
      newpoints = p;
    }
    
    
    public void updateScore(int n, int sb){
	newpoints = n;
	if (sb > 0)
		newpoints += (1000 + ((sb-1) * 250));
	score += newpoints;
	bonuslives += newpoints;
	if (score < 15000 && bonuslives > 8000) {
	    lives += 1;
	    bonuslives -= 8000;
	}
	if (score > 15000 && bonuslives > 14000) {
	    lives += 1;
	    bonuslives -= 14000;
	}
    }
    
    public int getScore(){
    	return score;
    }
}
