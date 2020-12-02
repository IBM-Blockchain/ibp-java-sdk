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
 * The importPeer options.
 */
public class ImportPeerOptions extends GenericModel {

  protected String displayName;
  protected String grpcwpUrl;
  protected MspCryptoField msp;
  protected String mspId;
  protected String apiUrl;
  protected String location;
  protected String operationsUrl;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String displayName;
    private String grpcwpUrl;
    private MspCryptoField msp;
    private String mspId;
    private String apiUrl;
    private String location;
    private String operationsUrl;
    private List<String> tags;

    private Builder(ImportPeerOptions importPeerOptions) {
      this.displayName = importPeerOptions.displayName;
      this.grpcwpUrl = importPeerOptions.grpcwpUrl;
      this.msp = importPeerOptions.msp;
      this.mspId = importPeerOptions.mspId;
      this.apiUrl = importPeerOptions.apiUrl;
      this.location = importPeerOptions.location;
      this.operationsUrl = importPeerOptions.operationsUrl;
      this.tags = importPeerOptions.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param displayName the displayName
     * @param grpcwpUrl the grpcwpUrl
     * @param msp the msp
     * @param mspId the mspId
     */
    public Builder(String displayName, String grpcwpUrl, MspCryptoField msp, String mspId) {
      this.displayName = displayName;
      this.grpcwpUrl = grpcwpUrl;
      this.msp = msp;
      this.mspId = mspId;
    }

    /**
     * Builds a ImportPeerOptions.
     *
     * @return the new ImportPeerOptions instance
     */
    public ImportPeerOptions build() {
      return new ImportPeerOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the ImportPeerOptions builder
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
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the ImportPeerOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the grpcwpUrl.
     *
     * @param grpcwpUrl the grpcwpUrl
     * @return the ImportPeerOptions builder
     */
    public Builder grpcwpUrl(String grpcwpUrl) {
      this.grpcwpUrl = grpcwpUrl;
      return this;
    }

    /**
     * Set the msp.
     *
     * @param msp the msp
     * @return the ImportPeerOptions builder
     */
    public Builder msp(MspCryptoField msp) {
      this.msp = msp;
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the ImportPeerOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the ImportPeerOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the ImportPeerOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the ImportPeerOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the ImportPeerOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected ImportPeerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.grpcwpUrl,
      "grpcwpUrl cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.msp,
      "msp cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mspId,
      "mspId cannot be null");
    displayName = builder.displayName;
    grpcwpUrl = builder.grpcwpUrl;
    msp = builder.msp;
    mspId = builder.mspId;
    apiUrl = builder.apiUrl;
    location = builder.location;
    operationsUrl = builder.operationsUrl;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a ImportPeerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this peer. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the grpcwpUrl.
   *
   * The gRPC web proxy URL in front of the peer. Include the protocol, hostname/ip and port.
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
   * The gRPC URL for the peer. Typically, client applications would send requests to this URL. Include the protocol,
   * hostname/ip and port.
   *
   * @return the apiUrl
   */
  public String apiUrl() {
    return apiUrl;
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
   * Used by Fabric health checker to monitor the health status of this peer. For more information, see [Fabric
   * documentation](https://hyperledger-fabric.readthedocs.io/en/release-1.4/operations_service.html). Include the
   * protocol, hostname/ip and port.
   *
   * @return the operationsUrl
   */
  public String operationsUrl() {
    return operationsUrl;
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

