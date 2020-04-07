/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MediCareSenior;
import java.util.ArrayList;

/**
 *
 * @author Karishma Murde
 */
public class MediCareSeniorDirectory {
    private ArrayList<MediCareSenior> mediCareSeniorList;
    
    public MediCareSeniorDirectory(){
        this.mediCareSeniorList = new ArrayList<>();
    }

    public ArrayList<MediCareSenior> getMediCareSeniorList() {
        return mediCareSeniorList;
    }

    public void setMediCareSeniorList(ArrayList<MediCareSenior> mediCareSeniorList) {
        this.mediCareSeniorList = mediCareSeniorList;
    }
    
    public MediCareSenior createMediCareSenior(String name, int age){
        MediCareSenior senior = new MediCareSenior();
        senior.setName(name);
        senior.setAge(age);
        senior.setStatus(false);
        mediCareSeniorList.add(senior);
        return senior;
    }
    
    public void removeMediCareSenior(MediCareSenior senior){
        mediCareSeniorList.remove(senior);
    }
    
}
