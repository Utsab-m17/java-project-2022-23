package firstjavaproject.data;

public class Player {
	
	private String pName;
	private int jerseyNum;
	private String position;
	private int goals;
	
	
	
	@Override
	public String toString() {
		return "Player [pName=" + pName + ", jerseyNum=" + jerseyNum + ", position=" + position + ", goals=" + goals
				+ "]";
	}

	//Default Constructor
	public Player() {
		
	}
	
	//Parameterized Constructor
	public Player(String pName, int jerseyNum, String position, int goals) {
		this.pName = pName;
		this.jerseyNum = jerseyNum;
		this.position = position;
		this.goals = goals;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getJerseyNum() {
		return jerseyNum;
	}
	public void setJerseyNum(int jerseyNum) {
		this.jerseyNum = jerseyNum;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	

}
