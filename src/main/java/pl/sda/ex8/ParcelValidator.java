package pl.sda.ex8;

import java.util.ArrayList;
import java.util.List;

public class ParcelValidator implements Validator {
    @Override
    public boolean validate(Parcel p) {
        List<String> ruleViolation = new ArrayList<>();


        if (p.getxLenght() + p.getyLenght() + p.getzLenght()>300) {
            ruleViolation.add("Sum of lenghts is over the limit of 300");
            //System.out.println("Sum of lenghts is over the limit of 300");
            //return false;
        }
        if (p.getxLenght()<30 || p.getyLenght()<30 || p.getzLenght()<30) {
            ruleViolation.add("One of dimensions is less than 30");
            //System.out.println("One of dimensions is less than 30");
            //return false;
        }
        if(p.isExpress())
        {
            if(p.getWeigh()>15.0) {
                ruleViolation.add("Weigh exceeds 15");
                //System.out.println("Weigh exceeds 15");
               // return false;
            }else {
                if (p.getWeigh() > 30.0) {
                    ruleViolation.add("Weigh exceeds 30");
                    //System.out.println("Weigh exceeds 30");
                    //return false;
                }
            }
            if(!ruleViolation.isEmpty())
            {
                System.out.println(ruleViolation);
                return false;
            }
        }

        return true;
    }
}
