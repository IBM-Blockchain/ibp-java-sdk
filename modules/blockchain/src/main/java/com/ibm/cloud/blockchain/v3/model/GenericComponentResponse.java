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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the details of a component. Not all components have the same fields, see description of each field for
 * details.
 */
public class GenericComponentResponse extends GenericModel {

  /**
   * The type of this component [Available on all component types].
   */
  public interface Type {
    /** fabric-peer. */
    String FABRIC_PEER = "fabric-peer";
    /** fabric-ca. */
    String FABRIC_CA = "fabric-ca";
    /** fabric-orderer. */
    String FABRIC_ORDERER = "fabric-orderer";
  }

  protected String id;
  protected String type;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("grpcwp_url")
  protected String grpcwpUrl;
  @SerializedName("api_url")
  protected String apiUrl;
  @SerializedName("operations_url")
  protected String operationsUrl;
  protected GenericComponentResponseMsp msp;
  @SerializedName("msp_id")
  protected String mspId;
  protected String location;
  @SerializedName("node_ou")
  protected NodeOuGeneral nodeOu;
  protected GenericComponentResponseResources resources;
  @SerializedName("scheme_version")
  protected String schemeVersion;
  @SerializedName("state_db")
  protected String stateDb;
  protected GenericComponentResponseStorage storage;
  protected Double timestamp;
  protected List<String> tags;
  protected String version;
  protected String zone;

  /**
   * Gets the id.
   *
   * The unique identifier of this component. [Available on all component types].
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of this component [Available on all component types].
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the displayName.
   *
   * The displayed name of this component. [Available on all component types].
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the grpcwpUrl.
   *
   * The URL for the grpc web proxy for this component. [Available on peer/orderer components].
   *
   * @return the grpcwpUrl
   */
  public String getGrpcwpUrl() {
    return grpcwpUrl;
  }

  /**
   * Gets the apiUrl.
   *
   * The gRPC URL for the component. Typically, client applications would send requests to this URL. [Available on
   * ca/peer/orderer components].
   *
   * @return the apiUrl
   */
  public String getApiUrl() {
    return apiUrl;
  }

  /**
   * Gets the operationsUrl.
   *
   * Used by Fabric health checker to monitor health status of the node. For more information, see [Fabric
   * documentation](https://hyperledger-fabric.readthedocs.io/en/release-1.4/operations_service.html). [Available on
   * ca/peer/orderer components].
   *
   * @return the operationsUrl
   */
  public String getOperationsUrl() {
    return operationsUrl;
  }

  /**
   * Gets the msp.
   *
   * @return the msp
   */
  public GenericComponentResponseMsp getMsp() {
    return msp;
  }

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component. [Available on all components].
   *
   * @return the mspId
   */
  public String getMspId() {
    return mspId;
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
   * Gets the nodeOu.
   *
   * @return the nodeOu
   */
  public NodeOuGeneral getNodeOu() {
    return nodeOu;
  }

  /**
   * Gets the resources.
   *
   * The **cached** Kubernetes resource attributes for this component. [Available on ca/peer/orderer components w/query
   * parameter 'deployment_attrs'].
   *
   * @return the resources
   */
  public GenericComponentResponseResources getResources() {
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
   * Gets the stateDb.
   *
   * The type of ledger database for a peer. [Available on peer components w/query parameter 'deployment_attrs'].
   *
   * @return the stateDb
   */
  public String getStateDb() {
    return stateDb;
  }

  /**
   * Gets the storage.
   *
   * The **cached** Kubernetes storage attributes for this component. [Available on ca/peer/orderer components w/query
   * parameter 'deployment_attrs'].
   *
   * @return the storage
   */
  public GenericComponentResponseStorage getStorage() {
    return storage;
  }

  /**
   * Gets the timestamp.
   *
   * UNIX timestamp of component creation, UTC, ms. [Available on all components].
   *
   * @return the timestamp
   */
  public Double getTimestamp() {
    return timestamp;
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
   * Gets the version.
   *
   * The cached Hyperledger Fabric version for this component. [Available on ca/peer/orderer components w/query
   * parameter 'deployment_attrs'].
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the zone.
   *
   * The Kubernetes zone of this component's deployment. [Available on ca/peer/orderer components w/query parameter
   * 'deployment_attrs'].
   *
   * @return the zone
   */
  public String getZone() {
    return zone;
  }
}

