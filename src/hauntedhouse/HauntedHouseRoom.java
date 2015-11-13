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

public class HauntedHouseRoom {

    protected char symbol; //Corresponding symbol in the ASCII art. Cannot be capital letter, space, #, |, -, or period.
    protected String name;
    protected HauntedHouseRoom[] paths;
    protected HauntedHouseItem[] items;
    
    //Constructor
    public HauntedHouseRoom(String inName, char inSymbol, HauntedHouseItem[] inItems) {
        
        name = inName;
        items = inItems;
        symbol = inSymbol;
        
    }
    
    //Sets the paths equal to the array passed as an argument
    public void setPaths(HauntedHouseRoom[] inPaths) {
        
        paths = inPaths;
        
    }
    
}
