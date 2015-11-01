package org.darion.yaphet.functions;

import org.apache.flink.api.common.functions.MapPartitionFunction;
import org.apache.flink.util.Collector;

/**
 * 
 * @author Darion.Yaphet
 *
 */
public class PartitionCounterMapPartition implements MapPartitionFunction<String, Long> {

	private static final long serialVersionUID = 3725597772261747405L;

	@Override
	public void mapPartition(Iterable<String> arg0, Collector<Long> arg1) throws Exception {

	}

}
