import java.util.LinkedHashMap;
import java.util.Map;

public class TaxesForElectricMotor implements CarTaxes{

    //Sadece Elektrikli ötv-kdv hesaplama

    // @nesibe

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
        Map<String,Double> result=new LinkedHashMap<>();
        double aracinVergisizBedeli =0;
        double otvRate =0;
        double kdvRate=18;
        if (silindir<85){
            aracinVergisizBedeli = (aracinDegeri/1298)*1000;
            otvRate =10;
        }else if (silindir>=85 && silindir<120){
            aracinVergisizBedeli = (aracinDegeri/1475)*1000;
            otvRate =25;
        }else {
            aracinVergisizBedeli =(aracinDegeri/1888)*1000;
            otvRate =60;
        }
        double otvTax =(aracinVergisizBedeli * otvRate)/100;
        double otvTotal= (aracinVergisizBedeli + otvTax);

        double kdvTax=(otvTotal*18)/100;
        double totalTax=kdvTax+ otvTax;
        result.put("Aracin Vergisiz Bedeli", aracinVergisizBedeli);
        result.put("Otv Orani",otvRate);
        result.put("Otv Tutari",otvTax);
        result.put("KDV Orani",kdvRate);
        result.put("KDV Tutari",kdvTax);
        result.put("Vergiler Toplami",totalTax);
        return result;
    }
}

