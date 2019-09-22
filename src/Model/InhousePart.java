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
public class InhousePart extends Part {
    
    
    // Private class member
    private int machineID;

    // Constructor
    public InhousePart(int id, double price, int stock, int min, int max, String name, int machineID) {
        super(id, price, stock, min, max, name);
        
        this.machineID = machineID;
    }

    // Getter
    public int getMachineID() {
        return machineID;
    }

    //Setter
    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
    
}
