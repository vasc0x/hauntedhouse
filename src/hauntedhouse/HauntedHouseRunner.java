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

public class HauntedHouseRunner {
    
    //The map. Different lower-case letters represent different areas.
    public static String map = 
        "               FLOOR 1                                   FLOOR 2\n" +
        "\n" +
        "#######################################  #######################################\n" +
        "#bbbbbbbbbbbbbbbbbbbbb|aaFRONT DOORaaa#  #jjjjjjjjjjjjjjjjjjjjj##iiiiiiiiiiiiii#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb|aaaaaaaaaaaaaaa#  #jjjjjjjjjjjjjjjjjjjjjj|iiiiiiiiiiiiii#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#------##------##  #jjjjjjjjjjjjjjjjjjjjjj|iiiiMASTERiiii#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#cccccc#dddddddd#  #jjjjjjjjjjjjjjjjjjjjjj|iiiBATHROOMiii#\n" +
        "#bbbbbLIVING ROOMbbbbb#cccccc#dddddddd#  #jjjMASTER BEDROOMjjjj##iiiiiiiiiiiiii#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#cccccc#dSTAIRSd#  #jjjjjjjjjjjjjjjjjjjjj#################\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#cccccc#dddddddd#  #jjjjjjjjjjjjjjjjjjjjj#kkkkkk#dddddddd#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#cHALLc#dddddddd#  #jjjjjjjjjjjjjjjjjjjjj#kkkkkk#dddddddd#\n" +
        "#bbbbbbbbbbbbbbbbbbbbb#cccccc#dddddddd#  #jjjjjjjjjjjjjjjjjjjjj#kkkkkk#dddddddd#\n" +
        "###############----####cccccc#dddddddd#  #jjjjjjjjjjjjjjjjjjjjj#kkkkkk#dSTAIRSd#\n" +
        "#eeeeeeeeee#ffffffffff#cccccc#dddddddd#  #######------##########kkkkkk#dddddddd#\n" +
        "#eePANTRYee#fBATHROOMf#cccccc#dddddddd#  #kkkkkkkkkkkkkkkkkkkkkkkkkkkk#dddddddd#\n" +
        "#eeeeeeeeee#ffffffffff#cccccc##########  #kkkkkkkkkkkkHALLkkkkkkkkkkkk##------##\n" +
        "##----##################----###########  #kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk#\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  #kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk#\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  ###########-----#########-----#########\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  #lllllllllllllllllll#mmmmmmmmmmmmmmmmm#\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  #llllBEDROOM 2llllll#mmmmmBEDROOM 1mmm#\n" +
        "#gggggggKITCHENgggggg#hhDINING ROOMhhh#  #lllllllllllllllllll#mmmmmmmmmmmmmmmmm#\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  #llllllllllll###############mmmmmmmmmm#\n" +
        "#gggggggggggggggggggg|hhhhhhhhhhhhhhhh#  #llllllllllll#nnnnnnnnnnnnn#mmmmmmmmmm#\n" +
        "#gggggggggggggggggggg|hhhhhhhhhhhhhhhh#  #llllllllllll|nnBATHROOMnnn|mmmmmmmmmm#\n" +
        "#gggggggggggggggggggg#hhhhhhhhhhhhhhhh#  #llllllllllll#nnnnnnnnnnnnn#mmmmmmmmmm#\n" +
        "#######################################  #######################################";
    
    public static void main (String[] args) {
          
        //Set up the Haunted House
        HauntedHouse house = setUpHouse();
        
        System.out.println("Total number of items: " + HauntedHouseItem.itemCount);
        
        //While processing the next action returns true, keep processing actions
        while (house.processAction());
        
    }
    
    //Declares all the items and rooms, then returns a HauntedHouse object with the current room set as the front door
    public static HauntedHouse setUpHouse() {
        
        //Declare all items here
        HauntedHouseItem chest = new HauntedHouseItem("Chest", "A ghost escapes and scares you to death.");
        HauntedHouseItem candelabra = new HauntedHouseItem("Candelabra", "They light up by themselves, and you see a death shadow.");
        HauntedHouseItem refrigerator = new HauntedHouseItem("Refrigerator", "You open the refrigerator and find some delicious soul food.");
        HauntedHouseItem dustyrecipebox = new HauntedHouseItem("Dusty Recipe Box", "You open it up and a recipe for chocolate devil's food cake appears out of nowhere.");
        HauntedHouseItem cabinet = new HauntedHouseItem("Cabinet", "The dishes and glasses start flying at you as soon as you open the door. You get hit in the head and feel yourself start moving towards a light.");
        HauntedHouseItem broom = new HauntedHouseItem("Broom", "The broom flies up in the air as soon as you touch it.");
        HauntedHouseItem floor1mirror = new HauntedHouseItem("Mirror", "You see a bloody face looking back at you.");
        HauntedHouseItem floor1shower = new HauntedHouseItem("Shower", "The room suddenly steams up, and you feel fingers touching the back of your neck.");
        HauntedHouseItem rockingchair = new HauntedHouseItem("Rocking Chair", "The chair starts rocking by itself with no one in it.");
        HauntedHouseItem window = new HauntedHouseItem("Window", "You see a child outside on a swing who suddenly disappears.");
        HauntedHouseItem dollhouse = new HauntedHouseItem("Doll House", "The dolls start dancing on their own.");
        HauntedHouseItem dresser = new HauntedHouseItem("Dresser", "A ghost flies out of the dresser as soon as you open it and flies right through your body.");
        HauntedHouseItem jewelrybox = new HauntedHouseItem("Jewelry Box", "You find the cursed Hope Diamond and feel your doom.");
        HauntedHouseItem intricateoillamp = new HauntedHouseItem("Intricate Oil Lamp", "You rub the lamp. A genie pops out and says he'll grant you 3 wishes.");
        HauntedHouseItem mastershower = new HauntedHouseItem("Shower", "You suddenly hear singing in the shower, but no one is there.");
        HauntedHouseItem floor2mirror = new HauntedHouseItem("Mirror", "You see a bloody face looking back at you.");
        HauntedHouseItem floor2shower = new HauntedHouseItem("Shower", "The room suddenly steams up and you feel fingers touching the back of your neck.");
        
        //Declare all rooms here
        HauntedHouseRoom frontdoor = new HauntedHouseRoom("Front Door", 'a', new HauntedHouseItem[]{});
        HauntedHouseRoom floor1hall = new HauntedHouseRoom("Floor 1 Hall", 'c', new HauntedHouseItem[]{});
        HauntedHouseRoom floor2hall = new HauntedHouseRoom("Floor 2 Hall", 'k', new HauntedHouseItem[]{});
        HauntedHouseRoom livingroom = new HauntedHouseRoom("Living Room", 'b', new HauntedHouseItem[]{chest});
        HauntedHouseRoom stairs = new HauntedHouseRoom("Stairs", 'd', new HauntedHouseItem[]{});
        HauntedHouseRoom floor1bathroom = new HauntedHouseRoom("Bathroom", 'f', new HauntedHouseItem[]{floor1mirror, floor1shower});
        HauntedHouseRoom diningroom = new HauntedHouseRoom("Dining Room", 'h', new HauntedHouseItem[]{candelabra});
        HauntedHouseRoom kitchen = new HauntedHouseRoom("Kitchen", 'g', new HauntedHouseItem[]{refrigerator, cabinet});
        HauntedHouseRoom pantry = new HauntedHouseRoom("Pantry", 'e', new HauntedHouseItem[]{dustyrecipebox, broom});
        HauntedHouseRoom bedroom1 = new HauntedHouseRoom("Bedroom 1", 'm', new HauntedHouseItem[]{rockingchair, window});
        HauntedHouseRoom bedroom2 = new HauntedHouseRoom("Bedroom 2", 'l', new HauntedHouseItem[]{dollhouse, dresser});
        HauntedHouseRoom masterbathroom = new HauntedHouseRoom("Master Bathroom", 'i', new HauntedHouseItem[]{intricateoillamp, mastershower});
        HauntedHouseRoom masterbedroom = new HauntedHouseRoom("Master Bedroom", 'j', new HauntedHouseItem[]{jewelrybox});
        HauntedHouseRoom floor2bathroom = new HauntedHouseRoom("Bathroom", 'n', new HauntedHouseItem[]{floor2mirror, floor2shower});
        
        //Set all paths here        
        frontdoor.setPaths(new HauntedHouseRoom[]{livingroom, floor1hall, stairs});
        floor1hall.setPaths(new HauntedHouseRoom[]{diningroom, frontdoor});
        livingroom.setPaths(new HauntedHouseRoom[]{floor1bathroom, frontdoor});
        floor1bathroom.setPaths(new HauntedHouseRoom[]{livingroom});
        diningroom.setPaths(new HauntedHouseRoom[]{kitchen, floor1hall});
        kitchen.setPaths(new HauntedHouseRoom[]{pantry, diningroom});
        pantry.setPaths(new HauntedHouseRoom[]{kitchen});
        stairs.setPaths(new HauntedHouseRoom[]{floor2hall, frontdoor});
        floor2hall.setPaths(new HauntedHouseRoom[]{bedroom1, bedroom2, masterbedroom, stairs});
        bedroom1.setPaths(new HauntedHouseRoom[]{floor2bathroom, floor2hall});
        bedroom2.setPaths(new HauntedHouseRoom[]{floor2bathroom, floor2hall});
        masterbedroom.setPaths(new HauntedHouseRoom[]{masterbathroom, floor2hall});
        masterbathroom.setPaths(new HauntedHouseRoom[]{masterbedroom});
        floor2bathroom.setPaths(new HauntedHouseRoom[]{bedroom1, bedroom2});
        
        return new HauntedHouse(frontdoor, map);
    }
    
}
