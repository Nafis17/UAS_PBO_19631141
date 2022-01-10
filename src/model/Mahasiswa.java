package model;

public class Mahasiswa {
    private int id;
    private String nama_lengkap;
    private String npm;
    private String alamat;

    public Mahasiswa(){
    
    }
    
    public Mahasiswa(int id,String nama_lengkap){
        this.id = id;
        this.nama_lengkap = nama_lengkap;
    }

    public Mahasiswa(int id, String nama_lengkap, String npm, String alamat) {
        this.id = id;
        this.nama_lengkap = nama_lengkap;
        this.npm = npm;
        this.alamat = alamat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNamaLengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public void setNPM(String npm) {
        this.npm = npm;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getId() {
        return id;
    }

    public String getNamaLengkap() {
        return nama_lengkap;
    }

    public String getNPM() {
        return npm;
    }

    public String getAlamat() {
        return alamat;
    }


    
    
}
