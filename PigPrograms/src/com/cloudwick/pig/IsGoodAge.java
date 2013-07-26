package com.cloudwick.pig;

import java.io.IOException;

import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;

public class IsGoodAge extends FilterFunc {

	@Override
	public Boolean exec(Tuple t) throws IOException {
		// TODO Auto-generated method stub
		int age = (Integer) t.get(0);
		String hometown = t.get(1).toString();
		if (hometown.equals("KHAMMAM") && age>=25){
			return true;
		}
		else{
			return false;
		}
	
		
		
	}

}
