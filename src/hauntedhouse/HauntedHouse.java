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

import javax.swing.*;
import java.util.*;
import java.awt.Font;
import java.util.regex.Pattern;

public class HauntedHouse { 
    
    private HauntedHouseRoom currentRoom;
    private String map;
    private int itemsExplored; // adan
    
    //Constructor
    public HauntedHouse(HauntedHouseRoom inCurrentRoom, String inMap) {
        
        currentRoom = inCurrentRoom;
        map = inMap;
        
        //Set fixed-width font for the ASCII art.
        //Used as reference: http://stackoverflow.com/questions/17059575/how-to-change-the-font-in-joptionpane-showinputdialog-jtextfield
        Font font = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        UIManager.put("OptionPane.messageFont", font);
        
    }
    
    //Inputs the next action from the user, does what they say, returns true to keep going, false to stop.
    public boolean processAction() {
        
        //Declare array containing the text of the commands to be displayed
        String[] commands = new String[currentRoom.items.length + currentRoom.paths.length];
        
        //Add paths to array
        for (int a = 0; a < currentRoom.paths.length; a++) {
            commands[a] = "Go to " + currentRoom.paths[a].name;
        }
        
        //Add items to array
        for (int a = currentRoom.paths.length; a < currentRoom.paths.length + currentRoom.items.length; a++) {
            commands[a] = "Examine " + currentRoom.items[a - currentRoom.paths.length].name;
        }
        
        //Display the map and ask what to do next.
        //Referenced http://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
        
        String result = (String) JOptionPane.showInputDialog(null, drawCurrentMap() + "\n\nCurrently at area: " + currentRoom.name + "\nWhat would you like to do next?", "Haunted House", JOptionPane.PLAIN_MESSAGE, null, commands, commands[0]);
        while (result == null) {
            //result = (String) JOptionPane.showInputDialog(null, drawCurrentMap() + "\n\nCurrently at area: " + currentRoom.name + "\nWhat would you like to do next?", "Haunted House", JOptionPane.PLAIN_MESSAGE, null, commands, commands[0]);
            System.exit(1);
        }
        
        //Find the index of the item in the array of commands
        int findItem = Arrays.asList(commands).indexOf(result);
        
        System.out.println(findItem);
        
        //If command is a new location
        if (findItem < currentRoom.paths.length) {
            currentRoom = currentRoom.paths[findItem];
            return true;
        }
        
        //Else it's an item
        else {
            JOptionPane.showMessageDialog(null, drawCurrentMap() + "\n\n" + currentRoom.items[findItem - currentRoom.paths.length].result + "\nGame Over!", "Haunted House", JOptionPane.PLAIN_MESSAGE);
            itemsExplored++; //adan
            
            System.out.println("Number of items explored so far: " + itemsExplored);
            
            //adan
            if (itemsExplored <= HauntedHouseItem.itemCount)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    //Draws the current map with current location marked with periods and returns it as a String
    private String drawCurrentMap() {
        
        //Replace all characters of the matching room symbol with periods.
        String current = map.replaceAll(Character.toString(currentRoom.symbol), ".");
        
        //Replace all characters with spaces, except uppercase letters, digits, #, -, ., | and newlines
        //Referenced this page http://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
        current = current.replaceAll("[^\\p{IsUpperCase}\\p{IsDigit}#\\-\\|\\.\r\n]", " ");
       
        return current;
    }
}
