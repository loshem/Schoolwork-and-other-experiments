
public class AlarmClock
{

	public static void main(String[] args)
	{
		Alarm timer = new Alarm();
		
		timer.setHour(12);
		timer.setMinute(0);
		timer.setSecond(0);
		
		timer.setTimerSet(true);
		
		//place holder for code to utilize Alarm class
		
		System.out.println("The alarm is currently set to " + timer);
	}

}
