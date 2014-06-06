import java.io.*;
import java.util.*;

// Will keep track of top 5 high scores. Top score is shown on game screen.
// Keeps track of high score names as well.

public class highscore {
    private int max, max2, max3, max4, max5, newScore;
    private String name1, name2, name3, name4, name5, newName;
    private int[] highscores;
    private String[] topPlayers;

    public highscore(int s, String n){
	newScore = s;
	newName = n;
    }

    /*    public int quickSelect(int[] a, int k, int low, int high) {
     	if (low >= high)
       		return high;
       	else {
	    int p = r.nextInt(high-low+1)+low;
	    System.out.println(p);
	    int j = 0;
	    int[] temp = new int[high-low+1];
	    for (int i = low; i<=high; i++) {
		if (a[i] < a[p]) {
		    temp[j] = a[i];
		    j++;
		}
	    }
	    if (j+low == k)
		return a[p];
	    if (j+low>k)
		return quickSelect(a,k,low,low+temp.length-1);
	    temp[j] = a[p];
	    p = j;
	    j++;
	    for (int i = low; i<= high; i++) {
		if (a[i] >= temp[p]) {
		    temp[j] = a[i];
		    j++;
		}
	    }
	    return 
		quickSelect(a,k,(high-temp.length)+1,high);
	}
    }
    */
    
    public void modifyHighScores(int newScore, String newName){
	//int x = highscores.length()-1;
	if (highscores.length() <5){ // skip the process of checking values, add score
	    for (i = 0; i < highscores.length(); i++){
		int n = highscores[i];
		if (newScore > n)
		    highscores.insert(i, newScore);
		    i++;
		    i++;
		    i++;
		    i++; // to avoid adding the score in more than once if it's the maximum value in the list
                else {
                    highscores.insert((highscores.length()-1), newScore);
	    }
	    int t = highscores.get(newScore); // retrieves index
	    topPlayers.insert(t, newName); // adds name to same index of name list
	}
        else {
        	if (newScore > highscores[4]){ // list 
	            for (i = 0; i < 4; i++){
        		int n = highScores[0];
         		if (newScore > n)
	        	    topScores.insert(i, newScore);
	            }
	            int t = highscores.get(newScore);
	            topPlayers.delete(4);
	            topPlayers.insert(t, newName);
               }
	}
    }
}
