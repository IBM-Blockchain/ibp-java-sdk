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
 * Contains the details of an ordering node.
 */
public class OrdererResponse extends GenericModel {

  /**
   * The type of Fabric orderer. Currently, only the type `"raft"` is supported.
   * [etcd/raft](/docs/blockchain?topic=blockchain-ibp-console-build-network#ibp-console-build-network-ordering-console).
   */
  public interface OrdererType {
    /** raft. */
    String RAFT = "raft";
  }

  protected String id;
  @SerializedName("dep_component_id")
  protected String depComponentId;
  @SerializedName("api_url")
  protected String apiUrl;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("grpcwp_url")
  protected String grpcwpUrl;
  protected String location;
  @SerializedName("operations_url")
  protected String operationsUrl;
  @SerializedName("orderer_type")
  protected String ordererType;
  @SerializedName("config_override")
  protected Map<String, Object> configOverride;
  @SerializedName("consenter_proposal_fin")
  protected Boolean consenterProposalFin;
  @SerializedName("node_ou")
  protected NodeOu nodeOu;
  protected MspCryptoField msp;
  @SerializedName("msp_id")
  protected String mspId;
  protected OrdererResponseResources resources;
  @SerializedName("scheme_version")
  protected String schemeVersion;
  protected OrdererResponseStorage storage;
  @SerializedName("system_channel_id")
  protected String systemChannelId;
  protected List<String> tags;
  protected Double timestamp;
  protected String type;
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
   * Gets the apiUrl.
   *
   * The gRPC URL for the orderer. Typically, client applications would send requests to this URL. Include the protocol,
   * hostname/ip and port.
   *
   * @return the apiUrl
   */
  public String getApiUrl() {
    return apiUrl;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive base name for each ordering node. One or more child IBP console tiles display this name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the grpcwpUrl.
   *
   * The gRPC web proxy URL in front of the orderer. Include the protocol, hostname/ip and port.
   *
   * @return the grpcwpUrl
   */
  public String getGrpcwpUrl() {
    return grpcwpUrl;
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
   * Gets the operationsUrl.
   *
   * Used by Fabric health checker to monitor the health status of this orderer node. For more information, see [Fabric
   * documentation](https://hyperledger-fabric.readthedocs.io/en/release-1.4/operations_service.html). Include the
   * protocol, hostname/ip and port.
   *
   * @return the operationsUrl
   */
  public String getOperationsUrl() {
    return operationsUrl;
  }

  /**
   * Gets the ordererType.
   *
   * The type of Fabric orderer. Currently, only the type `"raft"` is supported.
   * [etcd/raft](/docs/blockchain?topic=blockchain-ibp-console-build-network#ibp-console-build-network-ordering-console).
   *
   * @return the ordererType
   */
  public String getOrdererType() {
    return ordererType;
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
   * Gets the consenterProposalFin.
   *
   * The state of a pre-created orderer node. A value of `true` means that the orderer node was added as a system
   * channel consenter. This is a manual field. Set it yourself after finishing the raft append flow to indicate that
   * this node is ready for use. See the [Submit config block to orderer](#submit-block) API description for more
   * details about appending raft nodes.
   *
   * @return the consenterProposalFin
   */
  public Boolean isConsenterProposalFin() {
    return consenterProposalFin;
  }

  /**
   * Gets the nodeOu.
   *
   * @return the nodeOu
   */
  public NodeOu getNodeOu() {
    return nodeOu;
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
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String getMspId() {
    return mspId;
  }

  /**
   * Gets the resources.
   *
   * The **cached** Kubernetes resource attributes for this component. Not available if orderer was imported.
   *
   * @return the resources
   */
  public OrdererResponseResources getResources() {
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
   * The **cached** Kubernetes storage attributes for this component. Not available if orderer was imported.
   *
   * @return the storage
   */
  public OrdererResponseStorage getStorage() {
    return storage;
  }

  /**
   * Gets the systemChannelId.
   *
   * The name of the system channel. Defaults to `testchainid`.
   *
   * @return the systemChannelId
   */
  public String getSystemChannelId() {
    return systemChannelId;
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
   * Gets the type.
   *
   * The type of this component. Such as: "fabric-peer", "fabric-ca", "fabric-orderer", etc.
   *
   * @return the type
   */
  public String getType() {
    return type;
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

