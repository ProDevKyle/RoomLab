package Rooms;

import People.Person;

public class LunchRoom extends Room
{
    public LunchRoom(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("You enter the lunchroom!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
