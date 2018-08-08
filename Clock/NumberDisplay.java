
public class NumberDisplay
{
    private int limit;
    private int value;
    private boolean zero;//indica se aceita o valor zero

    public NumberDisplay(int rollOverLimit, int starter, boolean nulo)
    {
        limit = rollOverLimit;
        value = starter;
	zero = nulo;
    }

    public int getValue()
    {
        return value;
    }

    public String getDisplayValue()
    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }

    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    public void increment()
    {
        value = (value + 1) % limit;
	if(zero == false && value == 0){
		value = 1;
	}
    }
}
