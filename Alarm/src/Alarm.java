
public class Alarm
{
	private int second = 0, minute = 0, hour = 0;
	public boolean isTimerSet()
	{
		return timerSet;
	}

	public void setTimerSet(boolean timerSet)
	{
		this.timerSet = timerSet;
	}

	boolean timerSet = true;

	public int getSecond()
	{
		return second;
	}

	public void setSecond(int second)
	{
		if(second > 60 || second < 0)
			System.out.println("Error. Invalid time");
		else
		this.second = second;
	}

	@Override
	public String toString()
	{
		return hour + ":" + minute + ":"
				+ second;
	}

	public int getMinute()
	{
		return minute;
	}

	public void setMinute(int minute)
	{
		if(minute > 60 || minute < 0)
			System.out.println("Error. Invalid time");
		else
		this.minute = minute;
	}

	public int getHour()
	{
		return hour;
	}

	public void setHour(int hour)
	{
		if(hour > 24 || hour < 0)
			System.out.println("Error. Invalid time");
		else
		this.hour = hour;
	}
}
