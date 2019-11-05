package com.zahitziyagurel.asyasporcenter.Values;

public class Urun {
    private String UrunAdi="Ürün Adı",ImagePath,id;
    private int count40=0,count41=0,count42=0,count43=0,count44=0,count45=0;
    private float fiyat=160;

    public Urun setUrunAdi(String urunAdi) {
        UrunAdi = urunAdi;
        return this;
    }

    public Urun setImagePath(String imagePath) {
        ImagePath = imagePath;
        return this;
    }

    public Urun setId(String id) {
        this.id = id;
        return this;
    }

    public Urun setCount40(int count40) {
        this.count40 = count40;
        return this;
    }

    public Urun setCount41(int count41) {
        this.count41 = count41;
        return this;
    }

    public Urun setCount42(int count42) {
        this.count42 = count42;
        return this;
    }

    public Urun setCount43(int count43) {
        this.count43 = count43;
        return this;
    }

    public Urun setCount44(int count44) {
        this.count44 = count44;
        return this;
    }

    public Urun setCount45(int count45) {
        this.count45 = count45;
        return this;
    }

    public Urun setFiyat(float fiyat) {
        this.fiyat = fiyat;
        return this;
    }

    public String getUrunAdi() {
        return UrunAdi;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getId() {
        return id;
    }

    public int getCount40() {
        return count40;
    }

    public int getCount41() {
        return count41;
    }

    public int getCount42() {
        return count42;
    }

    public int getCount43() {
        return count43;
    }

    public int getCount44() {
        return count44;
    }

    public int getCount45() {
        return count45;
    }

    public float getFiyat() {
        return fiyat;
    }
}
