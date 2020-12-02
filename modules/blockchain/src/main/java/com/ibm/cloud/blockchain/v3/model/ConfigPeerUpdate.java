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
 * Update the [Fabric Peer configuration
 * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/core.yaml) if you want use custom
 * attributes to configure the Peer. Omit if not.
 *
 * *The field **names** below are not case-sensitive.*.
 */
public class ConfigPeerUpdate extends GenericModel {

  protected ConfigPeerUpdatePeer peer;
  protected ConfigPeerChaincode chaincode;
  protected Metrics metrics;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigPeerUpdatePeer peer;
    private ConfigPeerChaincode chaincode;
    private Metrics metrics;

    private Builder(ConfigPeerUpdate configPeerUpdate) {
      this.peer = configPeerUpdate.peer;
      this.chaincode = configPeerUpdate.chaincode;
      this.metrics = configPeerUpdate.metrics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerUpdate.
     *
     * @return the new ConfigPeerUpdate instance
     */
    public ConfigPeerUpdate build() {
      return new ConfigPeerUpdate(this);
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the ConfigPeerUpdate builder
     */
    public Builder peer(ConfigPeerUpdatePeer peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the chaincode.
     *
     * @param chaincode the chaincode
     * @return the ConfigPeerUpdate builder
     */
    public Builder chaincode(ConfigPeerChaincode chaincode) {
      this.chaincode = chaincode;
      return this;
    }

    /**
     * Set the metrics.
     *
     * @param metrics the metrics
     * @return the ConfigPeerUpdate builder
     */
    public Builder metrics(Metrics metrics) {
      this.metrics = metrics;
      return this;
    }
  }

  protected ConfigPeerUpdate(Builder builder) {
    peer = builder.peer;
    chaincode = builder.chaincode;
    metrics = builder.metrics;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerUpdate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public ConfigPeerUpdatePeer peer() {
    return peer;
  }

  /**
   * Gets the chaincode.
   *
   * @return the chaincode
   */
  public ConfigPeerChaincode chaincode() {
    return chaincode;
  }

  /**
   * Gets the metrics.
   *
   * @return the metrics
   */
  public Metrics metrics() {
    return metrics;
  }
}

