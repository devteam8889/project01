import java.util.LinkedHashMap;
import java.util.Map;

public class Taxes_For_Minubus implements CarTaxes {
    /**
     * @author Hasbi Kaynak
     */

    /*
    midibüs ötv-kdv hesaplama
       input: araç satış fiyatı (int)
       output: Map<String,Integer> Aracın Vergisiz Bedeli	Ötv Oranı	Ötv Tutarı	KDV Oranı	KDV Tutarı	Vergiler Toplamı
     */
    @Override
    public Map<String, Integer> taxForAutomobile(int carPrice) {
        return null;
    }

    @Override
    public Map<String, Integer> taxForMinibus(int carPrice) {
        Map<String, Integer> result = new LinkedHashMap<>();
        int otvTax = (carPrice * 220) / 100; // if engine cylinder volume greater than 2000 cm3.
        int kdvTax = (otvTax+carPrice) * 18 / 100;
        int sumTax = otvTax + kdvTax;
        result.put("Minibus price without taxes", carPrice-sumTax);
        result.put("Otv Rate", 220);
        result.put("Otv Total", otvTax);
        result.put("KDV Rate", 18);
        result.put("KDV Total", kdvTax);
        result.put("Sum of Totals", sumTax);
        return result;

    }

    @Override
    public Map<String, Double> taxForAutomobile(Double aracinDegeri, int silindir) {
        return null;
    }

    @Override
    public Map<String, Double> taxForElectricMotor(Double aracinDegeri, int silindir) {
        return null;
    }

}
