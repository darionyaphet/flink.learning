package org.darion.yaphet.functions;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;

public class SumMapFunction implements MapFunction<Tuple2<Integer, Integer>, Integer> {

	private static final long serialVersionUID = 3830811031233724943L;

	@Override
	public Integer map(Tuple2<Integer, Integer> tuple) throws Exception {
		return tuple.f0 + tuple.f1;
	}
}
