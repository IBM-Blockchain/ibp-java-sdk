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
 * The discovery service is used by clients to query information about peers. Such as - which peers have joined a
 * channel, what is the latest channel config, and what possible sets of peers satisfy the endorsement policy (given a
 * smart contract and a channel).
 */
public class ConfigPeerDiscovery extends GenericModel {

  protected Boolean enabled;
  protected Boolean authCacheEnabled;
  protected Double authCacheMaxSize;
  protected Double authCachePurgeRetentionRatio;
  protected Boolean orgMembersAllowedAccess;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private Boolean authCacheEnabled;
    private Double authCacheMaxSize;
    private Double authCachePurgeRetentionRatio;
    private Boolean orgMembersAllowedAccess;

    private Builder(ConfigPeerDiscovery configPeerDiscovery) {
      this.enabled = configPeerDiscovery.enabled;
      this.authCacheEnabled = configPeerDiscovery.authCacheEnabled;
      this.authCacheMaxSize = configPeerDiscovery.authCacheMaxSize;
      this.authCachePurgeRetentionRatio = configPeerDiscovery.authCachePurgeRetentionRatio;
      this.orgMembersAllowedAccess = configPeerDiscovery.orgMembersAllowedAccess;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerDiscovery.
     *
     * @return the new ConfigPeerDiscovery instance
     */
    public ConfigPeerDiscovery build() {
      return new ConfigPeerDiscovery(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the ConfigPeerDiscovery builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the authCacheEnabled.
     *
     * @param authCacheEnabled the authCacheEnabled
     * @return the ConfigPeerDiscovery builder
     */
    public Builder authCacheEnabled(Boolean authCacheEnabled) {
      this.authCacheEnabled = authCacheEnabled;
      return this;
    }

    /**
     * Set the authCacheMaxSize.
     *
     * @param authCacheMaxSize the authCacheMaxSize
     * @return the ConfigPeerDiscovery builder
     */
    public Builder authCacheMaxSize(Double authCacheMaxSize) {
      this.authCacheMaxSize = authCacheMaxSize;
      return this;
    }

    /**
     * Set the authCachePurgeRetentionRatio.
     *
     * @param authCachePurgeRetentionRatio the authCachePurgeRetentionRatio
     * @return the ConfigPeerDiscovery builder
     */
    public Builder authCachePurgeRetentionRatio(Double authCachePurgeRetentionRatio) {
      this.authCachePurgeRetentionRatio = authCachePurgeRetentionRatio;
      return this;
    }

    /**
     * Set the orgMembersAllowedAccess.
     *
     * @param orgMembersAllowedAccess the orgMembersAllowedAccess
     * @return the ConfigPeerDiscovery builder
     */
    public Builder orgMembersAllowedAccess(Boolean orgMembersAllowedAccess) {
      this.orgMembersAllowedAccess = orgMembersAllowedAccess;
      return this;
    }
  }

  protected ConfigPeerDiscovery(Builder builder) {
    enabled = builder.enabled;
    authCacheEnabled = builder.authCacheEnabled;
    authCacheMaxSize = builder.authCacheMaxSize;
    authCachePurgeRetentionRatio = builder.authCachePurgeRetentionRatio;
    orgMembersAllowedAccess = builder.orgMembersAllowedAccess;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerDiscovery builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * Determines whether the discover service is available or not.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the authCacheEnabled.
   *
   * Determines whether the authentication cache is enabled or not.
   *
   * @return the authCacheEnabled
   */
  public Boolean authCacheEnabled() {
    return authCacheEnabled;
  }

  /**
   * Gets the authCacheMaxSize.
   *
   * Maximum size of the cache. If exceeded a purge takes place.
   *
   * @return the authCacheMaxSize
   */
  public Double authCacheMaxSize() {
    return authCacheMaxSize;
  }

  /**
   * Gets the authCachePurgeRetentionRatio.
   *
   * The proportion (0 - 1) of entries that remain in the cache after the cache is purged due to overpopulation.
   *
   * @return the authCachePurgeRetentionRatio
   */
  public Double authCachePurgeRetentionRatio() {
    return authCachePurgeRetentionRatio;
  }

  /**
   * Gets the orgMembersAllowedAccess.
   *
   * Whether to allow non-admins to perform non-channel scoped queries. When `false`, it means that only peer admins can
   * perform non-channel scoped queries.
   *
   * @return the orgMembersAllowedAccess
   */
  public Boolean orgMembersAllowedAccess() {
    return orgMembersAllowedAccess;
  }
}

