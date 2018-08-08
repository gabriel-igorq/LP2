public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;
    private boolean am;
    
    public ClockDisplay()
    {
        hours = new NumberDisplay(13, 12, false);
        minutes = new NumberDisplay(60, 0, true);
	am = true;
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute, boolean state)
    {
        hours = new NumberDisplay(13, 12, false);
        minutes = new NumberDisplay(60, 0, true);
	if((hour>0 && hour <13) && (minute>0 && minute<60)){
        	setTime(hour, minute, state);
	}
	updateDisplay();
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute, boolean state)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
	am = state;
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
	if(am == true){
        	displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " AM";
    	} else {
		displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + " PM";
	}
    }
}
