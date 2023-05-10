/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhookConfigRead - the readable info for a webhook config; omits sensitive info e.g. auth token
 */
public class WebhookConfigRead {
    @JsonProperty("id")
    public String id;

    public WebhookConfigRead withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * human-readable name e.g. for display in UI
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    public String name;

    public WebhookConfigRead withName(String name) {
        this.name = name;
        return this;
    }
    
    public WebhookConfigRead(@JsonProperty("id") String id) {
        this.id = id;
  }
}
