package com.smartcea.memcached;

import com.meetup.memcached.MemcachedClient;
import com.meetup.memcached.SockIOPool;

public class MemcachedUtils {

	private static final MemcachedClient memClient = new MemcachedClient();

	/** default
	 * you can completed it by configuration.
	 */
	static {
		String[] servers = {"127.0.0.1:11211"};
		Integer[] weights = {3};
		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(servers);
		pool.setWeights(weights);
		pool.setNagle(false);
		pool.setSocketTO(3000);
		pool.setSocketConnectTO(0);
		pool.initialize();
	}

	/**
	 * get
	 * @return memcachedClient
	 */
	public static MemcachedClient getMemcacheClient(){
		return memClient;
	}
}
