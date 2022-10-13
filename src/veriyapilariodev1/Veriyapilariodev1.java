package veriyapilariodev1;

//02185076032 
//Mehmet Salih Tok


public class Veriyapilariodev1 {

    public static void main(String[] args) {
      insan birInsan = new insan();
      NufusDb nufus = new NufusDb();
      
      
      
      String[] adsoyad = new String[] { birInsan.ad="MehmetSalih" , birInsan.soyad="Tok" }; 
      
      int[] yaskiloboy = new int[] {birInsan.yas, birInsan.kilo , birInsan.boy};
      birInsan.setYas(23);
      birInsan.setKilo(62);
      birInsan.setBoy(172);
      
      nufus.insanEkle();
      
      
      
        for (int i=0; i<adsoyad.length; i++)  {
            System.out.println("Ad ve Soyad : " + adsoyad[i]);
            for(int j=0; j<yaskiloboy.length ; j++){
                System.out.println("Yas Kilo ve Boy : " + yaskiloboy[j]);  }
            nufus.insanYazdir(); 
        }
        
       
       
    }
    
}
