package queueTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
// Добавлен коммент

public class header {
	private static Queue<component> queue = new LinkedList<>();
	private static seWorker SeWorker1 = new seWorker();
	private static seWorker SeWorker2 = new seWorker();
        private static seWorker SeWorker3 = new seWorker();
	private static tpWorker TpWorker1 = new tpWorker();
	private static tpWorker TpWorker2 = new tpWorker();
	private static tpWorker TpWorker3 = new tpWorker();
        private static tpWorker TpWorker4 = new tpWorker();
	//private static ArrayList<component> stock = new ArrayList<>(); // Закомментировано
	// В общем то ветка создалась

		   public static void main(String[] args) {
			   seWorker.setQueue(queue);
			   SeWorker1.setObjName("SeWorker1");
			   SeWorker2.setObjName("SeWorker2");
                           SeWorker3.setObjName("SeWorker3");
			   SeWorker1.setSleepingTime(11);
			   SeWorker2.setSleepingTime(21);
                           SeWorker3.setSleepingTime(17);
			   
			   tpWorker.setQueue(queue);
			   TpWorker2.setObjName("TpWorker2");
			   TpWorker1.setObjName("TpWorker1");
			   TpWorker3.setObjName("TpWorker3");
                           TpWorker4.setObjName("TpWorker3");
			   TpWorker1.setSleepingTime(71);
			   TpWorker2.setSleepingTime(25);
			   TpWorker3.setSleepingTime(33);
                           TpWorker4.setSleepingTime(11);
			   
			   SeWorker1.start();
			   SeWorker2.start();
                           SeWorker3.start();
			   
			   TpWorker1.start();
			   TpWorker2.start();
			   TpWorker3.start();
                           TpWorker4.start();
		    }

	}