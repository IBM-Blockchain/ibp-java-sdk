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
 * The editOrderer options.
 */
public class EditOrdererOptions extends GenericModel {

  protected String id;
  protected String clusterName;
  protected String displayName;
  protected String apiUrl;
  protected String operationsUrl;
  protected String grpcwpUrl;
  protected String mspId;
  protected Boolean consenterProposalFin;
  protected String location;
  protected String systemChannelId;
  protected List<String> tags;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String clusterName;
    private String displayName;
    private String apiUrl;
    private String operationsUrl;
    private String grpcwpUrl;
    private String mspId;
    private Boolean consenterProposalFin;
    private String location;
    private String systemChannelId;
    private List<String> tags;

    private Builder(EditOrdererOptions editOrdererOptions) {
      this.id = editOrdererOptions.id;
      this.clusterName = editOrdererOptions.clusterName;
      this.displayName = editOrdererOptions.displayName;
      this.apiUrl = editOrdererOptions.apiUrl;
      this.operationsUrl = editOrdererOptions.operationsUrl;
      this.grpcwpUrl = editOrdererOptions.grpcwpUrl;
      this.mspId = editOrdererOptions.mspId;
      this.consenterProposalFin = editOrdererOptions.consenterProposalFin;
      this.location = editOrdererOptions.location;
      this.systemChannelId = editOrdererOptions.systemChannelId;
      this.tags = editOrdererOptions.tags;
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
     * Builds a EditOrdererOptions.
     *
     * @return the new EditOrdererOptions instance
     */
    public EditOrdererOptions build() {
      return new EditOrdererOptions(this);
    }

    /**
     * Adds an tags to tags.
     *
     * @param tags the new tags
     * @return the EditOrdererOptions builder
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
     * @return the EditOrdererOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the clusterName.
     *
     * @param clusterName the clusterName
     * @return the EditOrdererOptions builder
     */
    public Builder clusterName(String clusterName) {
      this.clusterName = clusterName;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the EditOrdererOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the apiUrl.
     *
     * @param apiUrl the apiUrl
     * @return the EditOrdererOptions builder
     */
    public Builder apiUrl(String apiUrl) {
      this.apiUrl = apiUrl;
      return this;
    }

    /**
     * Set the operationsUrl.
     *
     * @param operationsUrl the operationsUrl
     * @return the EditOrdererOptions builder
     */
    public Builder operationsUrl(String operationsUrl) {
      this.operationsUrl = operationsUrl;
      return this;
    }

    /**
     * Set the grpcwpUrl.
     *
     * @param grpcwpUrl the grpcwpUrl
     * @return the EditOrdererOptions builder
     */
    public Builder grpcwpUrl(String grpcwpUrl) {
      this.grpcwpUrl = grpcwpUrl;
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the EditOrdererOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the consenterProposalFin.
     *
     * @param consenterProposalFin the consenterProposalFin
     * @return the EditOrdererOptions builder
     */
    public Builder consenterProposalFin(Boolean consenterProposalFin) {
      this.consenterProposalFin = consenterProposalFin;
      return this;
    }

    /**
     * Set the location.
     *
     * @param location the location
     * @return the EditOrdererOptions builder
     */
    public Builder location(String location) {
      this.location = location;
      return this;
    }

    /**
     * Set the systemChannelId.
     *
     * @param systemChannelId the systemChannelId
     * @return the EditOrdererOptions builder
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
     * @return the EditOrdererOptions builder
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }
  }

  protected EditOrdererOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    clusterName = builder.clusterName;
    displayName = builder.displayName;
    apiUrl = builder.apiUrl;
    operationsUrl = builder.operationsUrl;
    grpcwpUrl = builder.grpcwpUrl;
    mspId = builder.mspId;
    consenterProposalFin = builder.consenterProposalFin;
    location = builder.location;
    systemChannelId = builder.systemChannelId;
    tags = builder.tags;
  }

  /**
   * New builder.
   *
   * @return a EditOrdererOptions builder
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
   * Gets the consenterProposalFin.
   *
   * The state of a pre-created orderer node. A value of `true` means that the orderer node was added as a system
   * channel consenter. This is a manual field. Set it yourself after finishing the raft append flow to indicate that
   * this node is ready for use. See the [Submit config block to orderer](#submit-block) API description for more
   * details about appending raft nodes.
   *
   * @return the consenterProposalFin
   */
  public Boolean consenterProposalFin() {
    return consenterProposalFin;
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

