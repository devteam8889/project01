import java.util.Map;

public interface CarTaxes {

    /*
    1. otomobil ötv-kdv hesaplama
       input: motor silindir hacmi (int), araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    2. motosiklet ötv-kdv hesaplama
       input: motor silindir hacmi (int), araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    3. otobüs ötv-kdv hesaplama
       input: araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    4. midibüs ötv-kdv hesaplama
       input: araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    5. minibüs ötv-kdv hesaplama
       input: araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    6. Benzinli-Elektrikli (Hybrid) ötv-kdv hesaplama
       input: motor silindir hacmi (int), araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
    7. Sadece Elektrikli ötv-kdv hesaplama
       input: motor silindir hacmi (int), araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
     */

    Map<String, Integer> taxForAutomobile(int carPrice);

}
