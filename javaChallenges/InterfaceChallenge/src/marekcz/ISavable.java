package marekcz;

import java.util.List;

public interface ISavable {
    //ArrayList<String> savedObjectList = new ArrayList<String>();

    List<String> write();
    void load(List<String> savedObject);

}
