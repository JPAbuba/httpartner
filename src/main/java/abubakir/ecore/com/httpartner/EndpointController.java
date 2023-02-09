package abubakir.ecore.com.httpartner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController()
public class EndpointController {

    List<KeyValueData> internalList = new ArrayList<>();

    @GetMapping(value = "/cassdb/datastash/internal/v1/keyvalueplus")
    public GetResponse get(@RequestParam(value = "key", required = false) String key,
                           @RequestParam(value = "sectionKey", required = false) String sectionKey,
                           @RequestParam(value = "hoursToQuery", required = false) Integer hoursToQuery,
                           @RequestParam(value = "limit", required = false) Integer limit) {
        GetResponse response = new GetResponse();
        response.errorCode = "";
        response.errorDesc = "";
        response.success = true;
        if (sectionKey != null) {
            response.keyValueData = internalList.stream().filter(kv -> kv.key.equals(key)).filter(kv -> kv.sectionKey.equals(sectionKey)).limit(limit).toList();
        } else {
            response.keyValueData = internalList.stream().filter(kv -> kv.key.equals(key)).limit(limit).toList();
        }
        return response;
    }


    @PostMapping(value = "/cassdb/datastash/internal/v1/keyvalueplus")
    public InsertResponse post(@RequestBody InsertRequest request) {
        System.out.println("oi");
        this.internalList.addAll(request.keyValueData);
        return new InsertResponse();
    }
}
