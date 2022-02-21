package sec_9_inner_and_abstract_classes_and_interfaces.interfaces_challenge;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);


}
