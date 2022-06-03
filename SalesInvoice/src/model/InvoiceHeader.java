
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Taroook-3ashry
 */

public class InvoiceHeader {
    private int invNum;
    private String customerName;
    private Date invDate;
    private ArrayList<InvoiceLine> lines;  

    public InvoiceHeader(int invNum, String customerName, Date invDate) {
        this.invNum = invNum;
        this.customerName = customerName;
        this.invDate = invDate;
    }

    public Date getInvDate() {
        return invDate;
    }
    
    public int getInvNum() {
        return invNum;
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public void setInvNum(int invNum) {
        this.invNum = invNum;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        String str = "InvoiceHeader{" + "invNum=" + invNum + ", customerName=" + customerName + ", invDate=" + invDate + '}';
        for (InvoiceLine line : getLines()) {
            str += "\n\t" + line;
        }
        return str;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null)
            lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    public double getInvTotal() {
        double total = 0.0;
        for (InvoiceLine line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public void addInvLine(InvoiceLine line) {
        getLines().add(line);
    }
    
    public String getDataCSV() {
        DateFormat invDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return "" + getInvNum() + "," + invDateFormat.format(getInvDate()) + "," + getCustomerName();
    }
    
}