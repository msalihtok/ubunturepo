
package veriyapilariodev1;

public class insan {
    String ad;
    String soyad;
    int yas;
    int kilo;
    int boy;

    public int getYas() {
        return yas;
    }

    public void setYas(int a) {
        if (yas < 0){
            yas = 0;
        }
        yas = a;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int b) {
        if(kilo <0){
            kilo=0;
        }
        kilo = b;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int c) {
        if(boy < 0 ){
            boy = 50;
        }
    }
}
