class Bank{
    String bName;
    int accBalance;
    long  accNo;
    
    public void printBankDetails(String bName)
    {
        this.bName=bName;
    }
    public void printBankDetails(int accBalance)
    {
        this.accBalance=accBalance;
    }
    public void printBankDetails(String bName, long  accNo)
    {
        this.bName=bName;
        this.accNo=accNo;
        System.out.println(bName+ " "+accNo );
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.bName= "BOB";
        b1.accBalance=26015;
        b1.accNo=2554;

        b1.printBankDetails(b1.bName);
    }
}
