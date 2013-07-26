package com.cloudwick.pig;

import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class IsAwesome extends EvalFunc<String> {

	@Override
	public String exec(Tuple t) throws IOException {
		// TODO Auto-generated method stub
		String s= t.get(0).toString();
		int i = (Integer) t.get(1);
		String r = "AWESOME";
		
		if ((s.contains("M") || s.contains("S")) && (i>=22 && i<=26)){
			return r;
			
		}
		
		
		
		return "VARUN";
	}
	
	
}
