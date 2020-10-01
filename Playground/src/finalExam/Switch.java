package finalExam;

public class Switch {
	
	//Class variables
	public enum Position { Off, On };
	private Position position;
	
	/**
	 * Switch constructor that accepts no arguments
	 */
	public Switch() {
	}
	
	/**
	 * Switch constructor that accepts a Position object
	 * @param position object
	 */
	public Switch(Position position) {
		this.position = position;
	}

	/**
	 * set the switch position to on
	 */
	public void on(){
		this.position = Position.On;
	}
	
	/**
	 * Set the switch position to off
	 */
	public void off(){
		this.position = Position.Off;
	}
	
	/**
	 * Get the current position of the switch
	 * @return position string
	 */
	public Position getPosition(){
		return position;
		
	}
	
	@Override
	public String toString() {
		return "Switch [position=" + position + "]";
	}
	
	public static void main(String[] args){ 
    
		Switch s1 = new Switch();
    
		System.out.println(s1);
    
		s1.on();
    
		System.out.println(s1);
    
		s1.off();
    
		System.out.println(s1);
  }
}
