package abubakir.ecore.com.httpartner;

import lombok.ToString;

import java.util.List;

@ToString
public class InsertRequest {

    public boolean syncInsert;
    public List<KeyValueData> keyValueData;
}
