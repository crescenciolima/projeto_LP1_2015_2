/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholp1;

/**
 *
 * @author Bruno
 */
public abstract class Voo {
    protected String numeroV;
    protected int diaC;
    protected int diaP;
    protected double horarioP;
    protected double horarioC;
    protected String cidadeP;
    protected String cidadeC;
    
    public Voo(String numeroV, int diaC, int diaP, double horarioP, double horarioC, String cidadeP, String cidadeC){
        this.numeroV = numeroV;
        this.diaC = diaC;
        this.diaP = diaP;
        this.horarioP = horarioP;
        this.horarioC = horarioC;
        this.cidadeP = cidadeP;
        this.cidadeC = cidadeC;
    }
    
    public String getNumeroV(){
        return numeroV;
    }
    
    public void setNumeroV(String numeroV){
        this.numeroV = numeroV;
    }

    public int getDiaC(){
        return diaC;
    }
    
    public void setDiaC(int diaC){
        this.diaC = diaC;
    }
    
    public int getDiaP(){
        return diaP;
    }
    
    public void setDiaP(int diaP){
        this.diaP = diaP;
    }
    
    public double getHorarioP(){
        return horarioP;
    }
    
    public void setHorarioP(double horarioP){
        this.horarioP = horarioP;
    }
    
    public double getHorarioC(){
        return horarioC;
    }
    
    public void setHorarioC(double horarioC){
        this.horarioC = horarioC;
    }
    
    public String getCidadeP(){
        return cidadeP;
    }
    
    public void setCidadeP(String cidadeP){
        this.cidadeC = cidadeP;
    }
    
    public String getCidadeC(){
        return cidadeC;
    }
    
    public void setCidadeC(String cidadeC){
        this.cidadeC = cidadeC;
    }
}