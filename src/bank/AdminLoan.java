/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class AdminLoan {

    private String LDate;
    private int LNum;
    private float LAmount;
    private String LType;
    private String LPurpose;
    private String LPeriod;
    private String LRate;
    private String LDocCompletion;
    private String LApproval;
    private String LStatus;
    private String LGuarantorName;
    private String LGuarantorNIC;

    public AdminLoan(int LNum, String LDate, String LType, String LPeriod, String LRate, float LAmount, String LPurpose, String LGuarantorName, String LGuarantorNIC, String LDocCompletion, String LApproval, String LStatus) {
        this.LDate = LDate;
        this.LNum = LNum;
        this.LType = LType;
        this.LAmount = LAmount;
        this.LPeriod = LPeriod;
        this.LRate = LRate;
        this.LPurpose = LPurpose;
        this.LDocCompletion = LDocCompletion;
        this.LApproval = LApproval;
        this.LStatus = LStatus;
        this.LGuarantorName = LGuarantorName;
        this.LGuarantorNIC = LGuarantorNIC;

    }

    public String LDate() {
        return LDate;
    }

    public int LNum() {
        return LNum;
    }

    public String LType() {
        return LType;
    }

    public float LAmount() {
        return LAmount;
    }

    public String LPeriod() {
        return LPeriod;
    }

    public String LRate() {
        return LRate;
    }

    public String LPurpose() {
        return LPurpose;
    }

    public String LGuarantorName() {
        return LGuarantorName;
    }

    public String LGuarantorNIC() {
        return LGuarantorNIC;
    }

    public String LDocCompletion() {
        return LDocCompletion;
    }

    public String LApproval() {
        return LApproval;
    }

    public String LStatus() {
        return LStatus;
    }
}
