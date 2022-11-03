/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class FD {

    private int numFD;
    private float amountFD;
    private String commecementDateFD;
    private String termFD;
    private String interestFD;

    public FD(int numFD, float amountFD, String commecementDateFD, String termFD, String interestFD) {
        this.numFD = numFD;
        this.amountFD = amountFD;
        this.commecementDateFD = commecementDateFD;
        this.termFD = termFD;
        this.interestFD = interestFD;
    }

    public int getnumFD() {
        return numFD;
    }

    public float getamountFD() {
        return amountFD;
    }

    public String getcommecementDateFD() {
        return commecementDateFD;
    }

    public String gettermFD() {
        return termFD;
    }

    public String getinterestFD() {
        return interestFD;
    }
}
