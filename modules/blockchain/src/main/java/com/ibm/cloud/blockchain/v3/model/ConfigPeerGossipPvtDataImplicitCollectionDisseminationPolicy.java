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
 * ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.
 */
public class ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy extends GenericModel {

  protected Double requiredPeerCount;
  protected Double maxPeerCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Double requiredPeerCount;
    private Double maxPeerCount;

    private Builder(ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy configPeerGossipPvtDataImplicitCollectionDisseminationPolicy) {
      this.requiredPeerCount = configPeerGossipPvtDataImplicitCollectionDisseminationPolicy.requiredPeerCount;
      this.maxPeerCount = configPeerGossipPvtDataImplicitCollectionDisseminationPolicy.maxPeerCount;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy.
     *
     * @return the new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy instance
     */
    public ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy build() {
      return new ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy(this);
    }

    /**
     * Set the requiredPeerCount.
     *
     * @param requiredPeerCount the requiredPeerCount
     * @return the ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy builder
     */
    public Builder requiredPeerCount(Double requiredPeerCount) {
      this.requiredPeerCount = requiredPeerCount;
      return this;
    }

    /**
     * Set the maxPeerCount.
     *
     * @param maxPeerCount the maxPeerCount
     * @return the ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy builder
     */
    public Builder maxPeerCount(Double maxPeerCount) {
      this.maxPeerCount = maxPeerCount;
      return this;
    }
  }

  protected ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy(Builder builder) {
    requiredPeerCount = builder.requiredPeerCount;
    maxPeerCount = builder.maxPeerCount;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the requiredPeerCount.
   *
   * Defines the minimum number of peers to successfully disseminate private data during endorsement.
   *
   * @return the requiredPeerCount
   */
  public Double requiredPeerCount() {
    return requiredPeerCount;
  }

  /**
   * Gets the maxPeerCount.
   *
   * Defines the maximum number of peers to attempt to disseminate private data during endorsement.
   *
   * @return the maxPeerCount
   */
  public Double maxPeerCount() {
    return maxPeerCount;
  }
}

