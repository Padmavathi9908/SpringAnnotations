package com.Spring.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext Factory=new AnnotationConfigApplicationContext(Appconfig.class);
       Samsung obj=Factory.getBean(Samsung.class);
       obj.config();
    }
}
