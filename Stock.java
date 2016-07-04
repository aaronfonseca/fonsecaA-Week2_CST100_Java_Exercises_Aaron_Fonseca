                /********************************************
*                    Stock                  *
*-------------------------------------------*
* symbol: String                            *
* name: String                              *
* previousClosingPrice: double              *
* currentPrice: double                      *
* Stock(newSymbol: String, newName: String) *
* getChangePercent(): double                *
********************************************/

public class Stock {

	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	// Construct a stock with a new Symbol and Name
	Stock(String newSymbol, String newName)
	{
		symbol = newSymbol;
		name = newName;
	}
	
	// Find the percentage change
	double getChangePercent()
	{
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
			

}
