import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MyClass implements CarTaxes {

    /**
     * @author Cem Sultan
     */
    @Override
    public Map<String, Integer> taxForAutomobile(int carPrice) {
        Map<String, Integer> result = new LinkedHashMap<>();
        int otvTax = (carPrice * 220) / 100; // if engine cylinder volume greater than 2000 cm3.
        int kdvTax = (otvTax+carPrice) * 18 / 100;
        int sumTax = otvTax + kdvTax;
        result.put("Aracin Vergisiz Bedeli", carPrice-sumTax);
        result.put("Otv Orani", 220);
        result.put("Otv Tutari", otvTax);
        result.put("KDV Orani", 18);
        result.put("KDV Tutari", kdvTax);
        result.put("Vergiler Toplami", sumTax);
        return result;
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
