//Jindarat Rodsadaeng
	//6509650013
	package Question1;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.Collections;
	import javax.swing.Timer;
	public class SoilTempData implements ActionListener {
		private final int REPORT_ROUND  = 10;
		ArrayList<Integer> data;
		private int round;
		private int nextPrintIndex;
		Timer time;
		SoilTempIoT temp;
		public SoilTempData() {
			if(data == null) {
				data = new ArrayList<Integer>();
				round= 0;
				nextPrintIndex = 0;
				temp = new SoilTempIoT();
			}
		}
		public SoilTempData(SoilTempIoT iot) {
			if(data == null) {
				data = new ArrayList<Integer>();
				round = 0;
				nextPrintIndex = 0;
				temp = new SoilTempIoT();
			}
			data.add(iot.getTemp());
		}
		public void start() {
			ActionListener action = new SoilTempData();
			time = new Timer(100,action);
			time.start();
		}
		public void actionPerformed(ActionEvent e) {
			if(round%REPORT_ROUND==0) {
				printStat();
			}
			data.add(temp.getTemp());
			round++;
		}
		
		
		public void printStat() {
			double all = 0;
			double sd = 0;
			double n = 0;
			double average = 0;
			double c=0;
			System.out.println("********** Report Current Data: **********");
			System.out.println("New set of data:");
			if(data.isEmpty()) {
			System.out.println("No data to report!");
			return;
			}
			nextPrintIndex=0;
			for (Integer e: data) {
				if(nextPrintIndex>data.size()-11) {
					System.out.printf(" %d,",e);
				}
				all += e;
				n += Math.pow(e-average, 2);
				nextPrintIndex++;
			}
			average = all / round;
			c= (double)n /(double)round;
			sd = Math.sqrt(c);
			int min = Collections.min(data);
			int max = Collections.max(data);
			System.out.printf("\nTotal records: %d\n", round);
			System.out.println("Statistics:");
			System.out.printf("\tMin = %d\n",min);
			System.out.printf("\tMax = %d\n",max);
			System.out.printf("\tAverage = %.2f\n",average);
			System.out.printf("\tSD = %.2f\n",sd);
			}
		
		
		

	}
}
