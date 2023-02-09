package abubakir.ecore.com.httpartner;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.ToString;
import org.springframework.lang.Nullable;

@ToString
public class KeyValueData {
    public String creationDateTime;
    public String key;
    public String sectionKey;

    public JsonNode dataValue;
}
