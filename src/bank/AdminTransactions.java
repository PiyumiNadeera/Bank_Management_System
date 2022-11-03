/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class AdminTransactions {
     private String tDate;
    private String tType;
    private String tDescription;
    private float tAmount;
    private float tBalance;

    public AdminTransactions(String tDate, String tType, String tDescription, float tAmount, float tBalance) {
        this.tDate = tDate;
        this.tType = tType;
        this.tDescription = tDescription;
        this.tAmount = tAmount;
        this.tBalance = tBalance;
    }

    public String getDate() {
        return tDate;
    }

    public String getType() {
        return tType;
    }

    public String getDescription() {
        return tDescription;
    }

    public float getAmount() {
        return tAmount;
    }

    public float getBalance() {
        return tBalance;
    }
}
