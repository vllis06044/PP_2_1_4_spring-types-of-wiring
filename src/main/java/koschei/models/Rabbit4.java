package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    private Duck5 duck5;

    @Override
    public String toString() {
        return "в сундуке — заяц, " +  duck5.toString();
    }
}