package com.smartcea.memcached;

import com.meetup.memcached.MemcachedClient;

public class SmartMemcached {

	public static void main(String[] args) {
		MemcachedClient memClient = MemcachedUtils.getMemcacheClient();
//		memClient.set("name", "hell");
		memClient.add("name", "what");
		memClient.replace("name", "what");
		memClient.delete("name");
		memClient.set("email","zhangdeqing0223@126.com");
		System.out.println("**********************************");
		System.out.println(memClient.get("name"));
		System.out.println("**********************************");
		System.out.println(memClient.get("email"));
		System.out.println("**********************************");
		
	}

}
