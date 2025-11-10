
class segitiga {
    private double alas;
    private double tinggi;
    private double sisiA,sisiB,sisiC;
    
    public segitiga() {}

    public segitiga(double alas,double tinggi,double sisiA,double sisiB,double sisiC){
        this.alas = alas;
        this.tinggi= tinggi;
        this.sisiA = sisiA;
        this.sisiB= sisiB;
        this.sisiC= sisiC;
    } 
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getSisiA(){
        return sisiA;
    }
    public void setSisiA(double sisiA){
        this.sisiA = sisiA; 
    }
    public double getSisiB(){
        return sisiB;
    }
    public void setSisiB(double sisiB){
        this.sisiB = sisiB;
    }
    public double getSisiC(){
        return sisiC;
    }
    public void setSisiC(double sisiC){
        this.sisiC = sisiC;
    }
    public double getLuas(){
        return 0.5*alas*tinggi;
    }
    public double getKeliling(){
        return sisiA + sisiB + sisiC;
    }  
}

class persegi{
    private double sisi;

    public persegi(){}
    public persegi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
}

class lingkaran{
    private double jarijari;

    public lingkaran(){}
    public lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double getJarijari(){
        return jarijari;
    }
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public double getLuas(){
        return Math.PI*jarijari*jarijari;
    }
    public double getKeliling(){
        return 2*Math.PI*jarijari;
    }
}
public class tigakelas {
    public static void main(String[] args) {
       
        segitiga sgt = new segitiga(6, 4, 5, 6, 7);
        System.out.println("=== Segitiga ===");
        System.out.println("Luas: " + sgt.getLuas());
        System.out.println("Keliling: " + sgt.getKeliling());

       
        persegi p = new persegi(5);
        System.out.println("\n=== Persegi ===");
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());

       
        lingkaran l = new lingkaran(7);
        System.out.println("\n=== Lingkaran ===");
        System.out.printf("Luas: %.2f\n" , l.getLuas());
        System.out.printf("Keliling: %.2f\n" , l.getKeliling());
    }
}




