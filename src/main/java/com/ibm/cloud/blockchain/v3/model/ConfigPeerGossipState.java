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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Gossip state transfer related configuration.
 */
public class ConfigPeerGossipState extends GenericModel {

  protected Boolean enabled;
  protected String checkInterval;
  protected String responseTimeout;
  protected Double batchSize;
  protected Double blockBufferSize;
  protected Double maxRetries;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String checkInterval;
    private String responseTimeout;
    private Double batchSize;
    private Double blockBufferSize;
    private Double maxRetries;

    private Builder(ConfigPeerGossipState configPeerGossipState) {
      this.enabled = configPeerGossipState.enabled;
      this.checkInterval = configPeerGossipState.checkInterval;
      this.responseTimeout = configPeerGossipState.responseTimeout;
      this.batchSize = configPeerGossipState.batchSize;
      this.blockBufferSize = configPeerGossipState.blockBufferSize;
      this.maxRetries = configPeerGossipState.maxRetries;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerGossipState.
     *
     * @return the new ConfigPeerGossipState instance
     */
    public ConfigPeerGossipState build() {
      return new ConfigPeerGossipState(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the ConfigPeerGossipState builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the checkInterval.
     *
     * @param checkInterval the checkInterval
     * @return the ConfigPeerGossipState builder
     */
    public Builder checkInterval(String checkInterval) {
      this.checkInterval = checkInterval;
      return this;
    }

    /**
     * Set the responseTimeout.
     *
     * @param responseTimeout the responseTimeout
     * @return the ConfigPeerGossipState builder
     */
    public Builder responseTimeout(String responseTimeout) {
      this.responseTimeout = responseTimeout;
      return this;
    }

    /**
     * Set the batchSize.
     *
     * @param batchSize the batchSize
     * @return the ConfigPeerGossipState builder
     */
    public Builder batchSize(Double batchSize) {
      this.batchSize = batchSize;
      return this;
    }

    /**
     * Set the blockBufferSize.
     *
     * @param blockBufferSize the blockBufferSize
     * @return the ConfigPeerGossipState builder
     */
    public Builder blockBufferSize(Double blockBufferSize) {
      this.blockBufferSize = blockBufferSize;
      return this;
    }

    /**
     * Set the maxRetries.
     *
     * @param maxRetries the maxRetries
     * @return the ConfigPeerGossipState builder
     */
    public Builder maxRetries(Double maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }
  }

  protected ConfigPeerGossipState(Builder builder) {
    enabled = builder.enabled;
    checkInterval = builder.checkInterval;
    responseTimeout = builder.responseTimeout;
    batchSize = builder.batchSize;
    blockBufferSize = builder.blockBufferSize;
    maxRetries = builder.maxRetries;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerGossipState builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Controls if the state transfer is enabled or not. If state transfer is active, it syncs up missing blocks and
   * allows lagging peers to catch up with the rest of the network.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the checkInterval.
   *
   * The frequency to check whether a peer is lagging behind enough to request blocks by using state transfer from
   * another peer.
   *
   * @return the checkInterval
   */
  public String checkInterval() {
    return checkInterval;
  }

  /**
   * Gets the responseTimeout.
   *
   * Amount of time to wait for state transfer responses from other peers.
   *
   * @return the responseTimeout
   */
  public String responseTimeout() {
    return responseTimeout;
  }

  /**
   * Gets the batchSize.
   *
   * Number of blocks to request by using state transfer from another peer.
   *
   * @return the batchSize
   */
  public Double batchSize() {
    return batchSize;
  }

  /**
   * Gets the blockBufferSize.
   *
   * Maximum difference between the lowest and highest block sequence number. In order to ensure that there are no holes
   * the actual buffer size is twice this distance.
   *
   * @return the blockBufferSize
   */
  public Double blockBufferSize() {
    return blockBufferSize;
  }

  /**
   * Gets the maxRetries.
   *
   * Maximum number of retries of a single state transfer request.
   *
   * @return the maxRetries
   */
  public Double maxRetries() {
    return maxRetries;
  }
}

