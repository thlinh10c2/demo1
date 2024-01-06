/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Vegetables {
    private String vegetableid;
    private String nameofvegetable;
    private String Desciption;
    private Double price;

    public Vegetables() {
    }

    
    public Vegetables(String vegetableid, String nameofvegetable, String Desciption, Double price) {
        this.vegetableid = vegetableid;
        this.nameofvegetable = nameofvegetable;
        this.Desciption = Desciption;
        this.price = price;
    }
    

    public String getVegetableid() {
        return vegetableid;
    }

    public void setVegetableid(String vegetableid) {
        this.vegetableid = vegetableid;
    }

    public String getNameofvegetable() {
        return nameofvegetable;
    }

    public void setNameofvegetable(String nameofvegetable) {
        this.nameofvegetable = nameofvegetable;
    }

    public String getDesciption() {
        return Desciption;
    }

    public void setDesciption(String Desciption) {
        this.Desciption = Desciption;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
   

}
