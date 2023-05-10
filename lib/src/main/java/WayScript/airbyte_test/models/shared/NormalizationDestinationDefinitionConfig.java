/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * NormalizationDestinationDefinitionConfig - describes a normalization config for destination definition
 */
public class NormalizationDestinationDefinitionConfig {
    /**
     * a field indicating the type of integration dialect to use for normalization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("normalizationIntegrationType")
    public String normalizationIntegrationType;

    public NormalizationDestinationDefinitionConfig withNormalizationIntegrationType(String normalizationIntegrationType) {
        this.normalizationIntegrationType = normalizationIntegrationType;
        return this;
    }
    
    /**
     * a field indicating the name of the repository to be used for normalization. If the value of the flag is NULL - normalization is not used.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("normalizationRepository")
    public String normalizationRepository;

    public NormalizationDestinationDefinitionConfig withNormalizationRepository(String normalizationRepository) {
        this.normalizationRepository = normalizationRepository;
        return this;
    }
    
    /**
     * a field indicating the tag of the docker repository to be used for normalization.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("normalizationTag")
    public String normalizationTag;

    public NormalizationDestinationDefinitionConfig withNormalizationTag(String normalizationTag) {
        this.normalizationTag = normalizationTag;
        return this;
    }
    
    /**
     * whether the destination definition supports normalization.
     */
    @JsonProperty("supported")
    public Boolean supported;

    public NormalizationDestinationDefinitionConfig withSupported(Boolean supported) {
        this.supported = supported;
        return this;
    }
    
    public NormalizationDestinationDefinitionConfig(@JsonProperty("supported") Boolean supported) {
        this.supported = supported;
  }
}
