/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class LoanDetails {

    private String LDate;
    private String LNum;
    private float LAmount;
    private String LPeriod;
    private String LRate;
    private String LDocCompletion;
    private String LApproval;
    private String LStatus;

    public LoanDetails(String LDate, String LNum, float LAmount, String LPeriod, String LRate, String LDocCompletion, String LApproval, String LStatus) {
        this.LDate = LDate;
        this.LNum = LNum;
        this.LAmount = LAmount;
        this.LPeriod = LPeriod;
        this.LRate = LRate;
        this.LDocCompletion = LDocCompletion;
        this.LApproval = LApproval;
        this.LStatus = LStatus;

    }

    public String LDate() {
        return LDate;
    }

    public String LNum() {
        return LNum;
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
