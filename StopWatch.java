/********************************
*          StopWatch            *
*-------------------------------*
* -startTime: double            *
* -endTime: double              *
* +StopWatch()                  *
* +start()                      *
* +stop()                       *
* +getElapsedTime(): double     *
* +getStartTime(): double       *
* +getEndTime(): double         *
********************************/

public class StopWatch {
	private double startTime;
	private double endTime;
	
	// No-arg Constructor Set the startTime
	StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	// Resets the startTime
	public void start() {
		startTime = System.currentTimeMillis();
	} 
		
	// Sets the stopTime
	public void stop() {
		endTime = System.currentTimeMillis();
	} 
	
	// Get ElapsedTime
	public double getElapsedTime() {
		return getEndTime() - getStartTime();
	}
	
	// Get ElapsedTime
	public double getStartTime() {
		return startTime;
	}
	
	// Get ElapsedTime
	public double getEndTime() {
		return endTime;
	}


}
