package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJams = new Student("James",5000);
		Student studentTomas = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		studentJams.takeBus(bus100);
		studentJams.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway ("2È£¼±");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
