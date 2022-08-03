package case_study_module2.models;

public class Contract {
    private String contractNumber;
    private String bookingID;
    private long depositAmount;
    private long amountNeedPay;
    private String customID;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingID, long depositAmount, long amountNeedPay, String customID) {
        this.contractNumber = contractNumber;
        this.bookingID = bookingID;
        this.depositAmount = depositAmount;
        this.amountNeedPay = amountNeedPay;
        this.customID = customID;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public long getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(long depositAmount) {
        this.depositAmount = depositAmount;
    }

    public long getAmountNeedPay() {
        return amountNeedPay;
    }

    public void setAmountNeedPay(long amountNeedPay) {
        this.amountNeedPay = amountNeedPay;
    }

    public String getCustomID() {
        return customID;
    }

    public void setCustomID(String customID) {
        this.customID = customID;
    }

    @Override
    public String toString() {
        return "Contract number : " + contractNumber +
                " , booking ID : " + bookingID +
                " , deposit money : " + depositAmount +
                " , total amount need pay : " + amountNeedPay +
                " , customer ID : " + customID + "\n";
    }
}
