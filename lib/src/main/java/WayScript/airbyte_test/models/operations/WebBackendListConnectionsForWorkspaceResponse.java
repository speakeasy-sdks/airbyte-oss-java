/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class WebBackendListConnectionsForWorkspaceResponse {
    
    public String contentType;

    public WebBackendListConnectionsForWorkspaceResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Input failed validation
     */
    
    public WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo;

    public WebBackendListConnectionsForWorkspaceResponse withInvalidInputExceptionInfo(WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo invalidInputExceptionInfo) {
        this.invalidInputExceptionInfo = invalidInputExceptionInfo;
        return this;
    }
    
    /**
     * Object with given id was not found.
     */
    
    public WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo;

    public WebBackendListConnectionsForWorkspaceResponse withNotFoundKnownExceptionInfo(WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo notFoundKnownExceptionInfo) {
        this.notFoundKnownExceptionInfo = notFoundKnownExceptionInfo;
        return this;
    }
    
    
    public Integer statusCode;

    public WebBackendListConnectionsForWorkspaceResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public WebBackendListConnectionsForWorkspaceResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * Successful operation
     */
    
    public WayScript.airbyte_test.models.shared.WebBackendConnectionReadList webBackendConnectionReadList;

    public WebBackendListConnectionsForWorkspaceResponse withWebBackendConnectionReadList(WayScript.airbyte_test.models.shared.WebBackendConnectionReadList webBackendConnectionReadList) {
        this.webBackendConnectionReadList = webBackendConnectionReadList;
        return this;
    }
    
    public WebBackendListConnectionsForWorkspaceResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
