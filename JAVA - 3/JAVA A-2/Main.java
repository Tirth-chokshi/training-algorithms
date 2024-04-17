class Bank {
    double getRateOfInterest() { return 0.0; }
}

class SBI extends Bank {
    double getRateOfInterest() { return 8.0; }
}

class ICICI extends Bank {
    double getRateOfInterest() { return 7.0; }
}

class AXIS extends Bank {
    double getRateOfInterest() { return 9.0; }
}

public class Main {
    public static void main(String[] args) {
        Bank sbiBank = new SBI();
        Bank iciciBank = new ICICI();
        Bank axisBank = new AXIS();

        System.out.println("SBI Bank Rate of Interest: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("ICICI Bank Rate of Interest: " + iciciBank.getRateOfInterest() + "%");
        System.out.println("AXIS Bank Rate of Interest: " + axisBank.getRateOfInterest() + "%");
    }
}
