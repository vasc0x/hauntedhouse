//********************************************************************************
// PANTHERID:  [4000392]
// CLASS: COP 2210 – [Fall, 2015]
// ASSIGNMENT # [3]
// DATE: [10/28/2015]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hauntedhouse;

public class HauntedHouseItem {
    
    protected String name, result;
    public static int itemCount = 0; //adan
    
    //Constructor
    public HauntedHouseItem(String inName, String inResult) {
        
        name = inName;
        result = inResult;
        itemCount++; //adan
        
    }
    
}
