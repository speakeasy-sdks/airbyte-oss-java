/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GrantDestinationDefinitionToWorkspaceResponse {
    
    public String contentType;

    public GrantDestinationDefinitionToWorkspaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public GrantDestinationDefinitionToWorkspaceResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Object with given id was not found.
     */
    
    public WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo;

    public GrantDestinationDefinitionToWorkspaceResponse withNotFoundKnownExceptionInfo(WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo) {
        this.notFoundKnownExceptionInfo = notFoundKnownExceptionInfo;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionRead privateDestinationDefinitionRead;

    public GrantDestinationDefinitionToWorkspaceResponse withPrivateDestinationDefinitionRead(WayScript.airbyte_test.models.shared.PrivateDestinationDefinitionRead privateDestinationDefinitionRead) {
        this.privateDestinationDefinitionRead = privateDestinationDefinitionRead;
        return this;
    }
    
    
    public Integer statusCode;

    public GrantDestinationDefinitionToWorkspaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GrantDestinationDefinitionToWorkspaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GrantDestinationDefinitionToWorkspaceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
