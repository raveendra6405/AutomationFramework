package com.log.progs;

import org.apache.log4j.Logger;

public class Forlooplogs {
public static Logger log=Logger.getLogger("actions");
	public static void main(String[] args)
	{
		log.info("starting of loop");
			
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
			log.info("even no"+i);
			}
		}
		log.info("ending of loop");
	}

}
