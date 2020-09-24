
package tugasinterface;

public class Arsipku implements Biodata, Nilai {
    public static void main(String[]args){
        Arsipku vs = new Arsipku();
        vs.namakelompok();
        vs.tempatlahir();
        vs.hobi();
        vs.Agama();
        vs.BahasaIndonesia();
        vs.Matematika();
        vs.Namapembuat();
    }
    public void namakelompok(){
        System.out.println("Nama Kelompok           : Moh.Ali Andriansyah");
        System.out.println("                        : Restu Doni Hermawan");
        System.out.println("                        : Sofyan Sauri");
    }
    public void tempatlahir(){
        System.out.println("Tempat Lahir            : Jember 29 Juli 2002");
        System.out.println("                        : Jember 19 Januari 2003");
        System.out.println("                        : Jember 08 Mei 2003");
    }
    public void hobi(){
        System.out.println("Hobi                    : Gamers");
        System.out.println("                        : Animers");
        System.out.println("                        : Sepeda");
    }
    public void Agama(){
        System.out.println("Nilai Agama             : 90");
        System.out.println("                        : 87");
        System.out.println("                        : 85");
    }
    public void BahasaIndonesia(){
        System.out.println("Nilai Bahasa Indonesia  : 87");
        System.out.println("                        : 85");
        System.out.println("                        : 90");
    }
    public void Matematika(){
        System.out.println("Nilai Matematika        : 85");
        System.out.println("                        : 90");
        System.out.println("                        : 87");
    }
    public void Namapembuat(){
        System.out.println("Pembuat                 : Sofyan Sauri");
    }
}
