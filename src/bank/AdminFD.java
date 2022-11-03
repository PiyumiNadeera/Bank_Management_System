/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank;

/**
 *
 * @author Piyumi
 */
public class AdminFD {

    private int numFD;
    private int amountFD;
    private String commecementDateFD;
    private String termFD;
    private String interestFD;
    private String nomName;
    private String nomAddress;
    private String nomNIC;

    public AdminFD(int numFD, String commecementDateFD, int amountFD, String termFD, String interestFD, String nomName, String nomAddress, String nomNIC) {
        this.numFD = numFD;
        this.amountFD = amountFD;
        this.commecementDateFD = commecementDateFD;
        this.termFD = termFD;
        this.interestFD = interestFD;
        this.nomName = nomName;
        this.nomAddress = nomAddress;
        this.nomNIC = nomNIC;
    }

    public int getnumFD() {
        return numFD;
    }

    public int getamountFD() {
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
