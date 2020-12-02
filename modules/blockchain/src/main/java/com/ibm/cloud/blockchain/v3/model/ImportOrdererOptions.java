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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The importOrderer options.
 */
public class ImportOrdererOptions extends GenericModel {

  protected String clusterName;
  protected String displayName;
  protected String grpcwpUrl;
  protected MspCryptoField msp;
  protected String mspId;
  protected String apiUrl;
  protected String clusterId;
  protected String location;
  protected String operationsUrl;
  protected String systemChannelId;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String clusterName;
    private String displayName;
    private String grpcwpUrl;
    private MspCryptoField msp;
    private String mspId;
    private String apiUrl;
    private String clusterId;
    private String location;
    private String operationsUrl;
    private String systemChannelId;
    private List<String> tags;

    private Builder(ImportOrdererOptions importOrdererOptions) {
      this.clusterName = importOrdererOptions.clusterName;
      this.displayName = importOrdererOptions.displayName;
      this.grpcwpUrl = importOrdererOptions.grpcwpUrl;
      this.msp = importOrdererOptions.msp;
      this.mspId = importOrdererOptions.mspId;
      this.apiUrl = importOrdererOptions.apiUrl;
      this.clusterId = importOrdererOptions.clusterId;
      this.location = importOrdererOptions.location;
      this.operationsUrl = importOrdererOptions.operationsUrl;
      this.systemChannelId = importOrdererOptions.systemChannelId;
      this.tags = importOrdererOptions.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param clusterName the clusterName
     * @param displayName the displayName
     * @param grpcwpUrl the grpcwpUrl
     * @param msp the msp
     * @param mspId the mspId
     */
    public Builder(String clusterName, String displayName, String grpcwpUrl, MspCryptoField msp, String mspId) {
      this.clusterName = clusterName;
      this.displayName = displayName;
      this.grpcwpUrl = grpcwpUrl;
      this.msp = msp;
      this.mspId = mspId;
    }

    /**
     * Builds a ImportOrdererOptions.
     *
     * @return the new ImportOrdererOptions instance
     */
    public ImportOrdererOptions build() {
      return new ImportOrdererOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ImportOrdererOptions builder
     */
    public Builder addTags(String tags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tags,
        "tags cannot be null");
      if (this.tags == null) {
        this.tags = new ArrayList<String>();
      }
      this.tags.add(tags);
      return this;
    }

    /**
     * Set the clusterName.
     *
     * @param clusterName the clusterName
     * @return the ImportOrdererOptions builder
     */
    public Builder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the ImportOrdererOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the grpcwpUrl.
     *
     * @param grpcwpUrl the grpcwpUrl
     * @return the ImportOrdererOptions builder
     */
    public Builder grpcwpUrl(String grpcwpUrl) {
      this.grpcwpUrl = grpcwpUrl;
      return this;
    }

    /**
     * Set the msp.
     *
     * @param msp the msp
     * @return the ImportOrdererOptions builder
     */
    public Builder msp(MspCryptoField msp) {
      this.msp = msp;
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the ImportOrdererOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the ImportOrdererOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the clusterId.
     *
     * @param clusterId the clusterId
     * @return the ImportOrdererOptions builder
     */
    public Builder clusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ImportOrdererOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the ImportOrdererOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the systemChannelId.
     *
     * @param systemChannelId the systemChannelId
     * @return the ImportOrdererOptions builder
     */
    public Builder systemChannelId(String systemChannelId) {
      this.systemChannelId = systemChannelId;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ImportOrdererOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected ImportOrdererOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.clusterName,
      "clusterName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.grpcwpUrl,
      "grpcwpUrl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.msp,
      "msp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mspId,
      "mspId cannot be null");
    clusterName = builder.clusterName;
    displayName = builder.displayName;
    grpcwpUrl = builder.grpcwpUrl;
    msp = builder.msp;
    mspId = builder.mspId;
    apiUrl = builder.apiUrl;
    clusterId = builder.clusterId;
    location = builder.location;
    operationsUrl = builder.operationsUrl;
    systemChannelId = builder.systemChannelId;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a ImportOrdererOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the clusterName.
   *
   * A descriptive name for an ordering service. The parent IBP console tile displays this name.
   *
   * @return the clusterName
   */
  public String clusterName() {
    return clusterName;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive base name for each ordering node. One or more child IBP console tiles display this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the grpcwpUrl.
   *
   * The gRPC web proxy URL in front of the orderer. Include the protocol, hostname/ip and port.
   *
   * @return the grpcwpUrl
   */
  public String grpcwpUrl() {
    return grpcwpUrl;
  }

  /**
   * Gets the msp.
   *
   * The msp crypto data.
   *
   * @return the msp
   */
  public MspCryptoField msp() {
    return msp;
  }

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String mspId() {
    return mspId;
  }

  /**
   * Gets the apiUrl.
   *
   * The gRPC URL for the orderer. Typically, client applications would send requests to this URL. Include the protocol,
   * hostname/ip and port.
   *
   * @return the apiUrl
   */
  public String apiUrl() {
    return apiUrl;
  }

  /**
   * Gets the clusterId.
   *
   * A unique id to identify this rafter cluster. Generated if not provided.
   *
   * @return the clusterId
   */
  public String clusterId() {
    return clusterId;
  }

  /**
   * Gets the location.
   *
   * Indicates where the component is running.
   *
   * @return the location
   */
  public String location() {
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
  public String operationsUrl() {
    return operationsUrl;
  }

  /**
   * Gets the systemChannelId.
   *
   * The name of the system channel. Defaults to `testchainid`.
   *
   * @return the systemChannelId
   */
  public String systemChannelId() {
    return systemChannelId;
  }

  /**
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }
}

