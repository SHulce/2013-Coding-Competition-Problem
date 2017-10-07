package com.sf.codingcomp.duck;

import java.lang.reflect.Method;

public class DuckFinder {

	public static <T> boolean isADuck(T objectToCheck) {

		boolean isItADuck = false;
		
		 
			
		boolean looks = looksLikeADuck(objectToCheck, "looksLikeADuck");
		boolean quacks = quacksLikeADuck(objectToCheck, "quacksLikeADuck");
		
		if (quacks && looks == true) { 
			isItADuck = true;
		}
			
	
		return isItADuck;
	}
	
	private static <T> boolean looksLikeADuck(T objectToCheck, String methodName) { 
		boolean looks = false;
		
		for (Method method : objectToCheck.getClass().getMethods()) { 
			if (method.getName().equals(methodName)) { 
				looks = true;
				break;
			}
		}
		
		return looks;
		
	}
	
	private static <T> boolean quacksLikeADuck(T objectToCheck, String methodName) { 
		boolean quacks = false;
		
		for (Method method : objectToCheck.getClass().getMethods()) { 
			if (method.getName().equals(methodName)) { 
				quacks = true;
				break;
			}
		}
		
		return quacks;
	}

}
