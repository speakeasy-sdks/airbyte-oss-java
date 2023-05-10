/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DestinationRead - Successful operation
 */
public class DestinationRead {
    /**
     * The values required to configure the destination. The schema for this must match the schema return by destination_definition_specifications/get for the destinationDefinition.
     */
    @JsonProperty("connectionConfiguration")
    public Object connectionConfiguration;

    public DestinationRead withConnectionConfiguration(Object connectionConfiguration) {
        this.connectionConfiguration = connectionConfiguration;
        return this;
    }
    
    @JsonProperty("destinationDefinitionId")
    public String destinationDefinitionId;

    public DestinationRead withDestinationDefinitionId(String destinationDefinitionId) {
        this.destinationDefinitionId = destinationDefinitionId;
        return this;
    }
    
    @JsonProperty("destinationId")
    public String destinationId;

    public DestinationRead withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonProperty("destinationName")
    public String destinationName;

    public DestinationRead withDestinationName(String destinationName) {
        this.destinationName = destinationName;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("icon")
    public String icon;

    public DestinationRead withIcon(String icon) {
        this.icon = icon;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public DestinationRead withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public DestinationRead withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public DestinationRead(@JsonProperty("connectionConfiguration") Object connectionConfiguration, @JsonProperty("destinationDefinitionId") String destinationDefinitionId, @JsonProperty("destinationId") String destinationId, @JsonProperty("destinationName") String destinationName, @JsonProperty("name") String name, @JsonProperty("workspaceId") String workspaceId) {
        this.connectionConfiguration = connectionConfiguration;
        this.destinationDefinitionId = destinationDefinitionId;
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.name = name;
        this.workspaceId = workspaceId;
  }
}
