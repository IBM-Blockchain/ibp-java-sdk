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
 * Override the [Fabric Peer configuration
 * file](https://github.com/hyperledger/fabric/blob/release-1.4/sampleconfig/core.yaml) if you want use custom
 * attributes to configure the Peer. Omit if not.
 *
 * *The field **names** below are not case-sensitive.*.
 */
public class ConfigPeerCreate extends GenericModel {

  protected ConfigPeerCreatePeer peer;
  protected ConfigPeerChaincode chaincode;
  protected Metrics metrics;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigPeerCreatePeer peer;
    private ConfigPeerChaincode chaincode;
    private Metrics metrics;

    private Builder(ConfigPeerCreate configPeerCreate) {
      this.peer = configPeerCreate.peer;
      this.chaincode = configPeerCreate.chaincode;
      this.metrics = configPeerCreate.metrics;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerCreate.
     *
     * @return the new ConfigPeerCreate instance
     */
    public ConfigPeerCreate build() {
      return new ConfigPeerCreate(this);
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the ConfigPeerCreate builder
     */
    public Builder peer(ConfigPeerCreatePeer peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the chaincode.
     *
     * @param chaincode the chaincode
     * @return the ConfigPeerCreate builder
     */
    public Builder chaincode(ConfigPeerChaincode chaincode) {
      this.chaincode = chaincode;
      return this;
    }

    /**
     * Set the metrics.
     *
     * @param metrics the metrics
     * @return the ConfigPeerCreate builder
     */
    public Builder metrics(Metrics metrics) {
      this.metrics = metrics;
      return this;
    }
  }

  protected ConfigPeerCreate(Builder builder) {
    peer = builder.peer;
    chaincode = builder.chaincode;
    metrics = builder.metrics;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerCreate builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public ConfigPeerCreatePeer peer() {
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

