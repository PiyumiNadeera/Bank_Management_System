/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class AdminSavings {

    private int accNum;
    private String accType;
    private String purpose;
    private String debitCard;
    private String nomName;
    private String nomAddress;
    private String nomNIC;

    public AdminSavings(int accNum, String accType, String purpose, String debitCard, String nomName, String nomAddress, String nomNIC) {
        this.accNum = accNum;
        this.accType = accType;
        this.purpose = purpose;
        this.debitCard = debitCard;
        this.nomName = nomName;
        this.nomAddress = nomAddress;
        this.nomNIC = nomNIC;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getAccType() {
        return accType;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public String getNomName() {
        return nomName;
    }

    public String getNomAddress() {
        return nomAddress;
    }

    public String getNomNIC() {
        return nomNIC;
    }

}
