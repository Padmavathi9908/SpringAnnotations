package com.Spring.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MediaTek implements MobileProcessor
{
 public void Process() {
		System.out.println("2nd best CPU");
		
		
	}
}
