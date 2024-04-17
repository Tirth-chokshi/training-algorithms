class Vehical{
	int numOfTyers () {return 0;}
}
	class Bike extends Vehical{
		int numOfTyers () {return 2;}
	}
	class Rickshaw extends Vehical{
		int numOfTyers () {return 3;}
	}
	class Car extends Vehical{
		int numOfTyers () {return 4;}
	}
	class Truck extends Vehical {
		int numOfTyers() {return 6;}
	}
	class Vcall{
		public static void main(String args[]) {
			Bike bike = new Bike();
			Rickshaw rickshaw = new Rickshaw();
			Car car = new Car();
			Truck truck = new Truck();
			
			System.out.println("Bike number of tyers: "+bike.numOfTyers());
			System.out.println("Rickshaw number of tyers: "+rickshaw.numOfTyers());
			System.out.println("Car number of tyers: "+car.numOfTyers());
			System.out.println("Truck number of tyers: "+truck.numOfTyers());
		}
	}