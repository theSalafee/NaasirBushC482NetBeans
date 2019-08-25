/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author naasirbush
 */
public class OutsourcedPart extends Part {
    
    
    private String companyName;

    public OutsourcedPart(int id, double price, int stock, int min, int max, String name, String companyName) {
        super(id, price, stock, min, max, name);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
}
