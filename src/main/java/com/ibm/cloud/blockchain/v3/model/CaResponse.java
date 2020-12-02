/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.blockchain.v3.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the details of a CA.
 */
public class CaResponse extends GenericModel {

  protected String id;
  @SerializedName("dep_component_id")
  protected String depComponentId;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("api_url")
  protected String apiUrl;
  @SerializedName("operations_url")
  protected String operationsUrl;
  @SerializedName("config_override")
  protected Map<String, Object> configOverride;
  protected String location;
  protected MspCryptoField msp;
  protected CaResponseResources resources;
  @SerializedName("scheme_version")
  protected String schemeVersion;
  protected CaResponseStorage storage;
  protected List<String> tags;
  protected Double timestamp;
  protected String version;
  protected String zone;

  /**
   * Gets the id.
   *
   * The unique identifier of this component.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the depComponentId.
   *
   * The unique id for the component in Kubernetes. Not available if component was imported.
   *
   * @return the depComponentId
   */
  public String getDepComponentId() {
    return depComponentId;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this CA. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the apiUrl.
   *
   * The gRPC URL for the peer. Typically, client applications would send requests to this URL. Include the protocol,
   * hostname/ip and port.
   *
   * @return the apiUrl
   */
  public String getApiUrl() {
    return apiUrl;
  }

  /**
   * Gets the operationsUrl.
   *
   * The operations URL for the CA. Include the protocol, hostname/ip and port.
   *
   * @return the operationsUrl
   */
  public String getOperationsUrl() {
    return operationsUrl;
  }

  /**
   * Gets the configOverride.
   *
   * The **cached** configuration override that was set for the Kubernetes deployment. Field does not exist if an
   * override was not set of if the component was imported.
   *
   * @return the configOverride
   */
  public Map<String, Object> getConfigOverride() {
    return configOverride;
  }

  /**
   * Gets the location.
   *
   * Indicates where the component is running.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the msp.
   *
   * The msp crypto data.
   *
   * @return the msp
   */
  public MspCryptoField getMsp() {
    return msp;
  }

  /**
   * Gets the resources.
   *
   * The **cached** Kubernetes resource attributes for this component. Not available if CA was imported.
   *
   * @return the resources
   */
  public CaResponseResources getResources() {
    return resources;
  }

  /**
   * Gets the schemeVersion.
   *
   * The versioning of the IBP console format of this JSON.
   *
   * @return the schemeVersion
   */
  public String getSchemeVersion() {
    return schemeVersion;
  }

  /**
   * Gets the storage.
   *
   * The **cached** Kubernetes storage attributes for this component. Not available if CA was imported.
   *
   * @return the storage
   */
  public CaResponseStorage getStorage() {
    return storage;
  }

  /**
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> getTags() {
    return tags;
  }

  /**
   * Gets the timestamp.
   *
   * UTC UNIX timestamp of component onboarding to the UI. In milliseconds.
   *
   * @return the timestamp
   */
  public Double getTimestamp() {
    return timestamp;
  }

  /**
   * Gets the version.
   *
   * The cached Hyperledger Fabric release version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the zone.
   *
   * Specify the Kubernetes zone for the deployment. The deployment will use a k8s node in this zone. Find the list of
   * possible zones by retrieving your Kubernetes node labels: `kubectl get nodes --show-labels`. [More
   * information](https://kubernetes.io/docs/setup/best-practices/multiple-zones).
   *
   * @return the zone
   */
  public String getZone() {
    return zone;
  }
}

