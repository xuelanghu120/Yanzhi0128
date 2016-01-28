package com.xingyun.login.wxlogin.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
	private static final String TAG = "ThreadPool";
	private static ThreadPool instance;
	private ThreadPoolExecutor threadPool = null;
	private static final int CORE_POOL_SIZE = 3;
	private static final int MAX_POOL_SIZE = 5;
	private static final int KEEP_ALIVE_TIME = 10; // 10 seconds
	
	private ThreadPool() {
		threadPool = new ThreadPoolExecutor(CORE_POOL_SIZE,MAX_POOL_SIZE,KEEP_ALIVE_TIME,TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(),
                new PriorityThreadFactory("mthread-pool", android.os.Process.THREAD_PRIORITY_BACKGROUND));
	}
	
	public static synchronized ThreadPool getInstance(){
		if(instance == null){
			instance = new ThreadPool();
		}
		return instance;
	}
	
	public void removeJob(Runnable task){
		threadPool.remove(task);
	}
	
	/***
	 * 线程池执行command
	 * @param r
	 */
	public void submmitJob(Runnable r){
		threadPool.execute(r);
	}
	
}
