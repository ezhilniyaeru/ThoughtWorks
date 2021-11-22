public class BharatBank {
    private int principalAmount;
    private int numberOfMonths = 3;
    private int rateOfInterest;

    public BharatBank(int principalAmount, int accountType) {
        this.principalAmount = principalAmount;
        if (accountType == 1) {
            this.rateOfInterest = 0;
        } else {
            this.rateOfInterest = 3;
        }
    }

    public int deposit(int depositAmount) {
        principalAmount += depositAmount;
        return principalAmount;
    }

    public int withDraw(int withDrawAmount) {
        principalAmount -= withDrawAmount;
        return principalAmount;
    }

    public double calculateInterest() {

        double interest = (principalAmount * (numberOfMonths) * (rateOfInterest)) / 1200;
        return interest;
    }

    public static void main(String[] args) {
        BharatBank gopal = new BharatBank(50000, 1);
        gopal.deposit(10000);
        System.out.println(gopal.calculateInterest());
        BharatBank amritha = new BharatBank(100000, 0);
        System.out.println(amritha.calculateInterest());
        amritha.withDraw(45000);
    }

}
