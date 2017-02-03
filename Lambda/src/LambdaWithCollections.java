

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LambdaWithCollections {

	public static void main(String[] args) {
		// POJO - plain java object
		// Java Beans are POJO's with getters and setters.
		class TimeSheet {
			// Properties.
			private int eid;
			public TimeSheet(int eid, String name, int hours) {
				super();
				this.eid = eid;
				this.name = name;
				if (hours < 20 || hours > 45)
					System.out.println("Not Valid!");
				this.hours = hours;
			}

			private String name;
			@Override
			public String toString() {
				return "TimeSheet [eid=" + eid + ", name=" + name + ", hours=" + hours + "]";
			}

			private int hours;

			public int getEid() {
				return eid;
			}

			public void setEid(int eid) {
				this.eid = eid;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getHours() {
				return hours;
			}

			public void setHours(int hours) {
				if (hours < 20 || hours > 45)
					System.out.println("Not Valid!");
				this.hours = hours;
			}
		}
		
		ArrayList<TimeSheet> timeSheets = new ArrayList<>();
		timeSheets.add(new TimeSheet(3, "Ratman", 25));
		timeSheets.add(new TimeSheet(2, "Zombie", 30));
		timeSheets.add(new TimeSheet(1, "Anne", 35));
		
//		//Sort the collection using Comparator.
//		class TimeSheetComparator implements Comparator<TimeSheet>{
//			@Override
//			public int compare(TimeSheet timeSheet1, TimeSheet timeSheet2) {
//				//return timeSheet1.getName().compareTo(timeSheet2.getName());
//				if( timeSheet1.eid > timeSheet2.eid)
//					return 1;
//				else if( timeSheet1.eid < timeSheet2.eid)
//					return -1;
//				else return 0;
//			}
//		}
//		
//		Collections.sort(timeSheets, new TimeSheetComparator());
		
		//Sort the collection using Comparator using anonymous class
//		Collections.sort(timeSheets, new Comparator<TimeSheet>(){
//			@Override
//			public int compare(TimeSheet timeSheet1, TimeSheet timeSheet2) {
//				return timeSheet1.getName().compareTo(timeSheet2.getName());
//			}
//		});
		
		// Anonymous Inner class replaced with Lambda expression [containing
		// type information].
		
//		Collections.sort(timeSheets,(TimeSheet timeSheet1, TimeSheet timeSheet2)
//				-> timeSheet1.getName().compareTo(timeSheet2.getName()));

		Collections.sort(timeSheets,( timeSheet1,  timeSheet2)
				-> timeSheet1.getName().compareTo(timeSheet2.getName()));
		
		//Iterate through the collection
//		Iterator iterator = timeSheets.iterator();
//		while(iterator.hasNext()){
//			//System.out.println(iterator.next());
//			TimeSheet timeSheet = (TimeSheet) iterator.next();
//			System.out.println(timeSheet.getEid() + "\t" + timeSheet.getName() + "\t" + timeSheet.getHours());		
//		}
		
		timeSheets.forEach((timeSheet)->{System.out.println(timeSheet.getName());});
		
		//permutaions
		// if single statement then {} not necessary (timeSheet)->System.out.println(timeSheet.getName())
		timeSheets.forEach((timeSheet)->System.out.println(timeSheet.getName()));
		//if single parameter timeSheet->System.out.println(timeSheet.getName());
		timeSheets.forEach(timeSheet->System.out.println(timeSheet.getName()));
		
	// this is lambda expression.
		
	}
	
}
