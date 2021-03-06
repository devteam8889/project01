import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


    //@author Eren
    public class Motosiklet implements CarTaxes{
        @Override
        public Map<String, Integer> taxForAutomobile(int carPrice) {
            return null;
        }

        @Override
        public Map<String, Integer> taxForMinibus(int carPrice) {
            return null;
        }

        @Override
        public Map<String, Double> taxForAutomobile(Double aracinDegeri, int silindir) {

            // Method creator: Eren
            Map<String, Double> result = new LinkedHashMap<>();
            double aracinVergisizBedeli = 0;
            double ötvOrani = 0;
            double ötvTutari = 0;
            double kdvOrani =18.00;
            if (silindir > 250){
                ötvOrani = 37.00;
                aracinVergisizBedeli = (aracinDegeri*10000)/(137*118);
                ötvTutari = aracinVergisizBedeli*37/100;
            }else {
                ötvOrani = 8.00;
                aracinVergisizBedeli = (aracinDegeri*10000)/(108*118);
                ötvTutari = aracinVergisizBedeli*8/100;
            }
            double kdvTutari = (aracinVergisizBedeli+ötvTutari)*18/100;
            double vergilerToplami = ötvTutari + kdvTutari;
            result.put("Aracin Vergisiz Bedeli", aracinVergisizBedeli);
            result.put("Otv Orani",ötvOrani);
            result.put("Otv Tutari",ötvTutari);
            result.put("KDV Orani",kdvOrani);
            result.put("KDV Tutari",kdvTutari);
            result.put("Vergiler Toplami",vergilerToplami);
            return result;
        }

        @Override
        public Map<String, Double> taxForElectricMotor(Double aracinDegeri, int silindir) {
            return null;
        }
    }

