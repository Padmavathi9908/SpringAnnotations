package com.Spring.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SnapDragon implements MobileProcessor {
	
	public void Process()
	{
		
		System.out.println("world best CPU");
	}

}
