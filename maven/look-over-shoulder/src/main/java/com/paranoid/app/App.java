package com.paranoid.app;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        Random r = new Random();
        if (r.nextInt(3) == 0) {
            System.out.println( "Oh dear lord! You were right! THEY are finally here to get you! Run for your life! Stop reading right now and dive out the window or something!" );
        } else {
            System.out.println( "Oh thank God, there's nothing there... yet." );
        }
    }
}
