/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperationCreate {
    @JsonProperty("name")
    public String name;

    public OperationCreate withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("operatorConfiguration")
    public OperatorConfiguration operatorConfiguration;

    public OperationCreate withOperatorConfiguration(OperatorConfiguration operatorConfiguration) {
        this.operatorConfiguration = operatorConfiguration;
        return this;
    }
    
    @JsonProperty("workspaceId")
    public String workspaceId;

    public OperationCreate withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    
    public OperationCreate(@JsonProperty("name") String name, @JsonProperty("operatorConfiguration") OperatorConfiguration operatorConfiguration, @JsonProperty("workspaceId") String workspaceId) {
        this.name = name;
        this.operatorConfiguration = operatorConfiguration;
        this.workspaceId = workspaceId;
  }
}
