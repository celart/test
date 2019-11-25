package queueTest;

import java.util.Queue;
import java.lang.Math;

public class workerOper implements Runnable{
	private Thread go;
	private static Queue<orderOper> queue;
	private static supervisor sprvs;
	
	public void start() {		
		if (this.go == null) {
			this.go = new Thread(this);
			this.go.start();
		}
	}

	public void run() {
		while(true) {
			orderOper op = getQueue().poll();
			if (op != null) {
				// Надо отправить супервайзеру уведомление о начале работы
			int tSleep =  (int) Math.round(op.getOper().getTime()*Math.random()*2);
			try {
				Thread.sleep(tSleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Надо отправить супервайзеру уведомление о завершении работы
			}
		}
	}

	public static Queue<orderOper> getQueue() {
		return queue;
	}

	public static void setQueue(Queue<orderOper> queue) {
		workerOper.queue = queue;
	}

	public static supervisor getSupervisor() {
		return sprvs;
	}

	public static void setSupervisor(supervisor sprvs) {
		workerOper.sprvs = sprvs;
	}
}

