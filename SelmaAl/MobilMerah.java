import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MobilMerah extends Pendukung
{
    int speed = -15;
    public void act()
    {
        MobilMerah a = new MobilMerah();
        Actor i = getOneIntersectingObject(MobilBiru.class);
        move(speed);
        checkdouble(i);
        end();
    }
}
