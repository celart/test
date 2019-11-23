package queueTest;

import java.util.LinkedList;
import java.util.Queue;

public class tpWorker implements Runnable{
	private String objName="tpWorker";
	private Thread go;
	private static Boolean flag=true;
	private int sleepingTime = 100;
	private static Queue<component> queue;// = new LinkedList<>();
	
	public void start() {
		System.out.println("Запущен " + this.objName);
		if (tpWorker.queue == null) {
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
		tpWorker.flag = false;
	}

	public static void setQueue(Queue<component> queue) {
		tpWorker.queue = queue;
	}

	public void run() {
		component c;
		while(tpWorker.flag | ((c=getQueue().poll()) != null)) {
			if (c != null) {
				System.out.println("Получен: "+ getObjName()+" "+ c.getInp1() + " от " + c.getFrom());
				try {
					Thread.sleep(this.sleepingTime);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Получен: "+ getObjName()+" "+ c.getInp1() + " от " + c.getFrom());
				c.setInp2(c.getInp1());
			} else {
				System.out.println("Ожидание " + getObjName());
			}
		}
	}
}
