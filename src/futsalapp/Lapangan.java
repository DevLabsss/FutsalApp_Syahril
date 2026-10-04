/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futsalapp;

/**
 *
 * @author mac
 */
public class Lapangan {
    private int id;
    private String namaLapangan;
    private String tipeLapangan;
    private int hargaPerJam;
    private String status;
    
    public Lapangan(){}
    
    public Lapangan(int id, String namaLapangan, String tipeLapangan, int hargaPerjam, String status) {
        this.id = id;
        this.namaLapangan = namaLapangan;
        this.tipeLapangan = tipeLapangan;
        this.hargaPerJam = hargaPerjam;
        this.status = status;
        
    }
    
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    
    public String getNamaLapangan() { return namaLapangan; }
    public void setNamaLapangan(String namaLapangan) {
        this.namaLapangan = namaLapangan;
    }
    
    public String getTipeLapangan() { return tipeLapangan; }
    public void setTipeLapangan(String namaLapangan) {
        this.tipeLapangan = tipeLapangan;
    }
    
    public int getHargaPerJam() { return hargaPerJam; }
    public void setHargaPerjam(int hargaPerjam){
        this.hargaPerJam = hargaPerJam;
    }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;}
    
}

