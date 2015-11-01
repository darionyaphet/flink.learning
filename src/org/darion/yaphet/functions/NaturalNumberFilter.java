package org.darion.yaphet.functions;

import org.apache.flink.api.common.functions.FilterFunction;

public class NaturalNumberFilter implements FilterFunction<Integer>{

	private static final long serialVersionUID = 2394835250189308505L;

	@Override
	public boolean filter(Integer number) throws Exception {
		return number>=0;
	}

}
