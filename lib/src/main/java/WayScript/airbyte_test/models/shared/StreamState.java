/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StreamState {
    @JsonProperty("streamDescriptor")
    public StreamDescriptor streamDescriptor;

    public StreamState withStreamDescriptor(StreamDescriptor streamDescriptor) {
        this.streamDescriptor = streamDescriptor;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("streamState")
    public java.util.Map<String, Object> streamState;

    public StreamState withStreamState(java.util.Map<String, Object> streamState) {
        this.streamState = streamState;
        return this;
    }
    
    public StreamState(@JsonProperty("streamDescriptor") StreamDescriptor streamDescriptor) {
        this.streamDescriptor = streamDescriptor;
  }
}
