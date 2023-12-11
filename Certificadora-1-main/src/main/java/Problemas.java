/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author win
 */
public class Problemas {
    public String numero;
    public int nivel;
    public byte resolvido;
    
    public Problemas(){
    numero="";
    nivel=1;
    resolvido=0;
    }
    
        public Problemas(String Numero,int Nivel,byte Resolvido){
        this.numero = Numero;
        this.nivel = Nivel;
        this.resolvido = Resolvido;
        }
        
        public Problemas(Problemas p){
        this.numero=p.getNumero();
        this.nivel=p.getNivel();
        this.resolvido=p.getResolvido();
        }

    public String getNumero() {
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int numero){
        this.nivel = nivel;
    }
    
    public byte getResolvido() {
        return resolvido;
    }

    public void setResolvido(byte resolvido){
        this.resolvido = resolvido;
    }
}
