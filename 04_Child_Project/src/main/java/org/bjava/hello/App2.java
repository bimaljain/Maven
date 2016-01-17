package org.bjava.hello;

import org.bjava.App1;

/**
 * Hello world!
 *
 */
public class App2 
{
    public void hello2 ()
    {
        System.out.println("Hello World2");
        App1 app1 = new App1();
        app1.hello1();
    }
    
    public static void main (String [] args){
    	App2 aap = new App2();
    	aap.hello2();
    	
    }
}
