
public class board{
	// DANIEL TIU SUBMISSION
	//BOARD CLASS ROUGH DRAFT
	
	//create array list with 10 empty elements
	// during turn phase use hand/turn class to update boards 
	
	
	/**
	 * tempuraScoring determines the sashimi score based on the number of tempura cards	
	 */
	public int tempuraScoring{
		int tempuraScoring()
			return (total tempura cards /2) * 5
		
					
	/**
	 * sashimiScoring determines the sashimi score based on the number of sashimi cards				
	 * @return
	 */
	public int sashimiScoring() 
		return(total sahsimi cards/3) * 10
		
				
	/**
	 * 	dumplingScoring determines the dumpling score based on the number of dumpling cards		
	 */
	public int dumplingScoring()
		if total dumpling cards == 1
			return 1
		elif total dumpling cards  == 2
			return 3
		elif total dumpling cards == 3
			return 6
		elif total dumpling cards == 4
			return 10
		elif total dumpling cards == 5
			return 15
	
					
	/**
	 * wasabiNigiriScoring determines the nigiri score based on the nigiri and wasabi cards
	 */
	public int wasabiNigiri()
		if there is a wasabi card and a nigiri card
			return(nigiri value x 3)
		elif there is a nigiri card and no wasabi card
			return (nigiri value)
			
		else
			return 0
	
					
	/**
	 * puddingScoring determines the score based on the number of pudding cards on all boards and allocates points to the
	 * player with the most pudding cards, and removes points from the player with the least amount of pudding cards.
	 * Will need to implement way to split points when there is a tie for first and last place
	 */
	public int puddingScoring()
		if total pudding cards > everyone elses
		return 6
		elif total pudding cards < everyone elses
		return -6
		else
		return 0
	
				
	/**
	 * makiScoring determines the makis core based on who has the most and second most maki cards. Will implement first and 
	 * second place splitting of points when there are ties.
	 */
	public int makiScoring()
		if total maki cards > everyone else
			return 5
		elif total maki cards == second place
			return 3
		else
			return 0
					
	/**
	 * totalScore takes the sum of all the card scores on the board and displays it
	 */
	public totalScore()
		return tempuraScoring + sashimiScoring + dumplingScoring +wasabiNigiriScoring + puddingScoring + makiScoring
						
			
		

	}

}
