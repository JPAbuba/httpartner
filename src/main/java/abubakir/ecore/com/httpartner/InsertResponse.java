package abubakir.ecore.com.httpartner;

import lombok.ToString;

@ToString
public class InsertResponse {
    public int duration = 10;
    public boolean insertStatus = true;
    public boolean postProcessStatus = false;
    public boolean asynchronous = true;
}
