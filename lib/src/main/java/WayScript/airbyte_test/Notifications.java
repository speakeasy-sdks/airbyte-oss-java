/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test;

import WayScript.airbyte_test.utils.HTTPClient;
import WayScript.airbyte_test.utils.HTTPRequest;
import WayScript.airbyte_test.utils.JSON;
import WayScript.airbyte_test.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Notifications {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Notifications(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Try sending a notifications
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.TryNotificationConfigResponse tryNotificationConfig(WayScript.airbyte_test.models.shared.Notification request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/notifications/try");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.TryNotificationConfigResponse res = new WayScript.airbyte_test.models.operations.TryNotificationConfigResponse(contentType, httpRes.statusCode()) {{
            notificationRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.NotificationRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.NotificationRead.class);
                res.notificationRead = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo.class);
                res.notFoundKnownExceptionInfo = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.InvalidInputExceptionInfo.class);
                res.invalidInputExceptionInfo = out;
            }
        }

        return res;
    }
}