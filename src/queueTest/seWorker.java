package queueTest;

import java.util.LinkedList;
import java.util.Queue;

public class seWorker implements Runnable{
	private String objName="seWorker";
	private Thread go;
	private static Boolean flag=true;
	private int sleepingTime = 100;
	private static Queue<component> queue;// = new LinkedList<>();
	
	public void start() {
		System.out.println("Запуск " + this.objName);
		if (seWorker.queue == null) {
			queue = new LinkedList<>();
		}
		
		if (this.go == null) {
			this.go = new Thread(this);
			this.go.start();
		}
	}	
	
	public void setSleepingTime(int t) {
		this.sleepingTime = t;
	}
	
	public boolean add(component c) {
		return queue.add(c);
	}
	
	public Queue<component> getQueue() {
		return queue;
	}

	public String getObjName() {
		return objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	

	public static Boolean getFlag() {
		return flag;
	}

	public static void stop() {
		seWorker.flag = false;
	}

	public static void setQueue(Queue<component> queue) {
		seWorker.queue = queue;
	}

	public void run() {
		int i=0;
		while(seWorker.flag) {
			try {
				Thread.sleep(this.sleepingTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			component c = new component();
			c.setInp1(""+i);
			c.setFrom(getObjName());
			getQueue().offer(c);
			System.out.println( getObjName() + " Отправлен: " + i);
			i++;
		}
	}
}
