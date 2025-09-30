package Week1.Day7.Advanced;

//Store student roll numbers in a TreeSet and print them in sorted order.
public class Students implements Comparable<Students> {
    //Fields
    private int SNo;
    private String rollNumber;

    //Constructor
    public Students(String rollNumber, int SNo) {
        setRollNumber(rollNumber);
        setSNo(SNo);
    }

    //getter and setter
    public String getRollNumber(){ return rollNumber;}
    public int getSNo() { return SNo;}
    public void setRollNumber(String rollNumber) {
        if(rollNumber == null || rollNumber.isEmpty()){
            this.rollNumber = "UNKNOWN";
        } else {
            this.rollNumber = rollNumber;
        }
    }

    public void setSNo(int SNo) {
        if(SNo <=0){
            this.SNo = 99;
        } else {
            this.SNo = SNo;
        }
    }

    //Define natural ordering (By rollNumber here)
    @Override
    public int compareTo(Students other){
        return this.rollNumber.compareTo(other.rollNumber);
    }

    @Override
    public String toString() {
        return  "{Roll: " + rollNumber + ", SNo: " + SNo + "}";
    }
}
