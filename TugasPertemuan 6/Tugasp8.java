package kelasP6;

public class main {
    public static void main(String[] args) {
        
        // 1. Objek Persegi
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi     : " + persegi.getSisi());
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());

        // 2. Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(9);
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Jari-jari: " + lingkaran.getJari());
        System.out.println("Luas     : " + lingkaran.getLuas());
        System.out.println("Keliling : " + lingkaran.getKeliling());

        // 3. Objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(7);
        pp.setLebar(3);
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Panjang  : " + pp.getPanjang());
        System.out.println("Lebar    : " + pp.getLebar());
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());

        // 4. Objek Segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(7);
        segitiga.setTinggi(9);
        segitiga.setSisiMiring(10); // Misal segitiga siku-siku (6, 8, 10)
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas        : " + segitiga.getAlas());
        System.out.println("Tinggi      : " + segitiga.getTinggi());
        System.out.println("Sisi Miring : " + segitiga.getSisiMiring());
        System.out.println("Luas        : " + segitiga.getLuas());
        System.out.println("Keliling    : " + segitiga.getKeliling());
    }
}

class BangunDatar {
    
    protected float luas() {
        return 0;
    }

    protected float keliling() {
        return 0;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}

class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return sisi;
    }

    @Override
    protected float luas() {
        return sisi * sisi;
    }

    @Override
    protected float keliling() {
        return 4 * sisi;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}


class Lingkaran extends BangunDatar {
    private float jari;

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return jari;
    }

    @Override
    protected float luas() {
        return (float) (Math.PI * jari * jari);
    }

    @Override
    protected float keliling() {
        return (float) (2 * Math.PI * jari);
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}


class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public float getLebar() {
        return lebar;
    }

    @Override
    protected float luas() {
        return panjang * lebar;
    }

    @Override
    protected float keliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}


class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    private float sisiMiring;

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(float sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public float getSisiMiring() {
        return sisiMiring;
    }

    @Override
    protected float luas() {
        return 0.5f * alas * tinggi;
    }

    @Override
    protected float keliling() {
        // Keliling segitiga = alas + tinggi + sisi miring
        return alas + tinggi + sisiMiring;
    }

    @Override
    public float getLuas() {
        return luas();
    }

    @Override
    public float getKeliling() {
        return keliling();
    }
}