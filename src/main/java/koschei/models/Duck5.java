package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    @Autowired
    private Egg6 egg6;

    @Override
    public String toString() {
        return "в зайце — утка, " +  egg6.toString();
    }
}