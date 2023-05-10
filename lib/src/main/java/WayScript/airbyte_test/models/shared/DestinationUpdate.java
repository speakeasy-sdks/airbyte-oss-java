/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DestinationUpdate {
    /**
     * The values required to configure the destination. The schema for this must match the schema return by destination_definition_specifications/get for the destinationDefinition.
     */
    @JsonProperty("connectionConfiguration")
    public Object connectionConfiguration;

    public DestinationUpdate withConnectionConfiguration(Object connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }
    
    @JsonProperty("destinationId")
    public String destinationId;

    public DestinationUpdate withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public DestinationUpdate withName(String name) {
        this.name = name;
        return this;
    }
    
    public DestinationUpdate(@JsonProperty("connectionConfiguration") Object connectionConfiguration, @JsonProperty("destinationId") String destinationId, @JsonProperty("name") String name) {
        this.connectionConfiguration = connectionConfiguration;
        this.destinationId = destinationId;
        this.name = name;
  }
}
