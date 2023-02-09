package abubakir.ecore.com.httpartner;

import lombok.ToString;

import java.util.List;

@ToString
public class GetResponse {

    public List<KeyValueData> keyValueData;
    public boolean success;
    public String errorCode;
    public String errorDesc;
}
