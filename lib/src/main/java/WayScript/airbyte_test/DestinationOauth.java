/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test;

import WayScript.airbyte_test.utils.HTTPClient;
import WayScript.airbyte_test.utils.HTTPRequest;
import WayScript.airbyte_test.utils.JSON;
import WayScript.airbyte_test.utils.SerializedBody;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

/**
 * Source OAuth related resources to delegate access from user.
 */
public class DestinationOauth {
	
	private SDKConfiguration sdkConfiguration;

	public DestinationOauth(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Given a destination def ID generate an access/refresh token etc.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.CompleteDestinationOAuthResponse completeDestinationOAuth(WayScript.airbyte_test.models.shared.CompleteDestinationOAuthRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_oauths/complete_oauth");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.CompleteDestinationOAuthResponse res = new WayScript.airbyte_test.models.operations.CompleteDestinationOAuthResponse(contentType, httpRes.statusCode()) {{
            completeOAuthResponse = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), new TypeReference<java.util.Map<String, Object>>() {});
                res.completeOAuthResponse = out;
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

    /**
     * Given a destination connector definition ID, return the URL to the consent screen where to redirect the user to.
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.GetDestinationOAuthConsentResponse getDestinationOAuthConsent(WayScript.airbyte_test.models.shared.DestinationOauthConsentRequest request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_oauths/get_consent_url");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.GetDestinationOAuthConsentResponse res = new WayScript.airbyte_test.models.operations.GetDestinationOAuthConsentResponse(contentType, httpRes.statusCode()) {{
            oAuthConsentRead = null;
            notFoundKnownExceptionInfo = null;
            invalidInputExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.OAuthConsentRead out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.OAuthConsentRead.class);
                res.oAuthConsentRead = out;
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

    /**
     * Sets instancewide variables to be used for the oauth flow when creating this destination. When set, these variables will be injected into a connector's configuration before any interaction with the connector image itself. This enables running oauth flows with consistent variables e.g: the company's Google Ads developer_token, client_id, and client_secret without the user having to know about these variables. - 
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public WayScript.airbyte_test.models.operations.SetInstancewideDestinationOauthParamsResponse setInstancewideDestinationOauthParams(WayScript.airbyte_test.models.shared.SetInstancewideDestinationOauthParamsRequestBody request) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = WayScript.airbyte_test.utils.Utils.generateURL(baseUrl, "/v1/destination_oauths/oauth_params/create");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = WayScript.airbyte_test.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = this.sdkConfiguration.defaultClient;
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        WayScript.airbyte_test.models.operations.SetInstancewideDestinationOauthParamsResponse res = new WayScript.airbyte_test.models.operations.SetInstancewideDestinationOauthParamsResponse(contentType, httpRes.statusCode()) {{
            knownExceptionInfo = null;
            notFoundKnownExceptionInfo = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
        }
        else if (httpRes.statusCode() == 400) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.KnownExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.KnownExceptionInfo.class);
                res.knownExceptionInfo = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (WayScript.airbyte_test.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), WayScript.airbyte_test.models.shared.NotFoundKnownExceptionInfo.class);
                res.notFoundKnownExceptionInfo = out;
            }
        }

        return res;
    }
}