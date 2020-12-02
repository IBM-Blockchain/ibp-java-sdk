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
 * The editPeer options.
 */
public class EditPeerOptions extends GenericModel {

  protected String id;
  protected String displayName;
  protected String apiUrl;
  protected String operationsUrl;
  protected String grpcwpUrl;
  protected String mspId;
  protected String location;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String displayName;
    private String apiUrl;
    private String operationsUrl;
    private String grpcwpUrl;
    private String mspId;
    private String location;
    private List<String> tags;

    private Builder(EditPeerOptions editPeerOptions) {
      this.id = editPeerOptions.id;
      this.displayName = editPeerOptions.displayName;
      this.apiUrl = editPeerOptions.apiUrl;
      this.operationsUrl = editPeerOptions.operationsUrl;
      this.grpcwpUrl = editPeerOptions.grpcwpUrl;
      this.mspId = editPeerOptions.mspId;
      this.location = editPeerOptions.location;
      this.tags = editPeerOptions.tags;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a EditPeerOptions.
     *
     * @return the new EditPeerOptions instance
     */
    public EditPeerOptions build() {
      return new EditPeerOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the EditPeerOptions builder
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
     * Set the id.
     *
     * @param id the id
     * @return the EditPeerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the EditPeerOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the EditPeerOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the EditPeerOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the grpcwpUrl.
     *
     * @param grpcwpUrl the grpcwpUrl
     * @return the EditPeerOptions builder
     */
    public Builder grpcwpUrl(String grpcwpUrl) {
      this.grpcwpUrl = grpcwpUrl;
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the EditPeerOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the EditPeerOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the tags.
     * Existing tags will be replaced.
     *
     * @param tags the tags
     * @return the EditPeerOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected EditPeerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    displayName = builder.displayName;
    apiUrl = builder.apiUrl;
    operationsUrl = builder.operationsUrl;
    grpcwpUrl = builder.grpcwpUrl;
    mspId = builder.mspId;
    location = builder.location;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a EditPeerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to modify. Use the [Get all components](#list_components) API to determine the component
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
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
   * Gets the tags.
   *
   * @return the tags
   */
  public List<String> tags() {
    return tags;
  }
}

