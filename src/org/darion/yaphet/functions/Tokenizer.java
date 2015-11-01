package org.darion.yaphet.functions;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.util.Collector;

public class Tokenizer implements FlatMapFunction<String, String> {

	private static final long serialVersionUID = 2350322299357354023L;

	@Override
	public void flatMap(String line, Collector<String> collector) throws Exception {
		for (String token : line.split("\\W")) {
			collector.collect(token);
		}
	}
}
