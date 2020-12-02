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
 * ConfigPeerGossipPvtData.
 */
public class ConfigPeerGossipPvtData extends GenericModel {

  protected String pullRetryThreshold;
  protected Double transientstoreMaxBlockRetention;
  protected String pushAckTimeout;
  protected Double btlPullMargin;
  protected Double reconcileBatchSize;
  protected String reconcileSleepInterval;
  protected Boolean reconciliationEnabled;
  protected Boolean skipPullingInvalidTransactionsDuringCommit;
  protected ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy implicitCollectionDisseminationPolicy;

  /**
   * Builder.
   */
  public static class Builder {
    private String pullRetryThreshold;
    private Double transientstoreMaxBlockRetention;
    private String pushAckTimeout;
    private Double btlPullMargin;
    private Double reconcileBatchSize;
    private String reconcileSleepInterval;
    private Boolean reconciliationEnabled;
    private Boolean skipPullingInvalidTransactionsDuringCommit;
    private ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy implicitCollectionDisseminationPolicy;

    private Builder(ConfigPeerGossipPvtData configPeerGossipPvtData) {
      this.pullRetryThreshold = configPeerGossipPvtData.pullRetryThreshold;
      this.transientstoreMaxBlockRetention = configPeerGossipPvtData.transientstoreMaxBlockRetention;
      this.pushAckTimeout = configPeerGossipPvtData.pushAckTimeout;
      this.btlPullMargin = configPeerGossipPvtData.btlPullMargin;
      this.reconcileBatchSize = configPeerGossipPvtData.reconcileBatchSize;
      this.reconcileSleepInterval = configPeerGossipPvtData.reconcileSleepInterval;
      this.reconciliationEnabled = configPeerGossipPvtData.reconciliationEnabled;
      this.skipPullingInvalidTransactionsDuringCommit = configPeerGossipPvtData.skipPullingInvalidTransactionsDuringCommit;
      this.implicitCollectionDisseminationPolicy = configPeerGossipPvtData.implicitCollectionDisseminationPolicy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerGossipPvtData.
     *
     * @return the new ConfigPeerGossipPvtData instance
     */
    public ConfigPeerGossipPvtData build() {
      return new ConfigPeerGossipPvtData(this);
    }

    /**
     * Set the pullRetryThreshold.
     *
     * @param pullRetryThreshold the pullRetryThreshold
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder pullRetryThreshold(String pullRetryThreshold) {
      this.pullRetryThreshold = pullRetryThreshold;
      return this;
    }

    /**
     * Set the transientstoreMaxBlockRetention.
     *
     * @param transientstoreMaxBlockRetention the transientstoreMaxBlockRetention
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder transientstoreMaxBlockRetention(Double transientstoreMaxBlockRetention) {
      this.transientstoreMaxBlockRetention = transientstoreMaxBlockRetention;
      return this;
    }

    /**
     * Set the pushAckTimeout.
     *
     * @param pushAckTimeout the pushAckTimeout
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder pushAckTimeout(String pushAckTimeout) {
      this.pushAckTimeout = pushAckTimeout;
      return this;
    }

    /**
     * Set the btlPullMargin.
     *
     * @param btlPullMargin the btlPullMargin
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder btlPullMargin(Double btlPullMargin) {
      this.btlPullMargin = btlPullMargin;
      return this;
    }

    /**
     * Set the reconcileBatchSize.
     *
     * @param reconcileBatchSize the reconcileBatchSize
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder reconcileBatchSize(Double reconcileBatchSize) {
      this.reconcileBatchSize = reconcileBatchSize;
      return this;
    }

    /**
     * Set the reconcileSleepInterval.
     *
     * @param reconcileSleepInterval the reconcileSleepInterval
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder reconcileSleepInterval(String reconcileSleepInterval) {
      this.reconcileSleepInterval = reconcileSleepInterval;
      return this;
    }

    /**
     * Set the reconciliationEnabled.
     *
     * @param reconciliationEnabled the reconciliationEnabled
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder reconciliationEnabled(Boolean reconciliationEnabled) {
      this.reconciliationEnabled = reconciliationEnabled;
      return this;
    }

    /**
     * Set the skipPullingInvalidTransactionsDuringCommit.
     *
     * @param skipPullingInvalidTransactionsDuringCommit the skipPullingInvalidTransactionsDuringCommit
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder skipPullingInvalidTransactionsDuringCommit(Boolean skipPullingInvalidTransactionsDuringCommit) {
      this.skipPullingInvalidTransactionsDuringCommit = skipPullingInvalidTransactionsDuringCommit;
      return this;
    }

    /**
     * Set the implicitCollectionDisseminationPolicy.
     *
     * @param implicitCollectionDisseminationPolicy the implicitCollectionDisseminationPolicy
     * @return the ConfigPeerGossipPvtData builder
     */
    public Builder implicitCollectionDisseminationPolicy(ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy implicitCollectionDisseminationPolicy) {
      this.implicitCollectionDisseminationPolicy = implicitCollectionDisseminationPolicy;
      return this;
    }
  }

  protected ConfigPeerGossipPvtData(Builder builder) {
    pullRetryThreshold = builder.pullRetryThreshold;
    transientstoreMaxBlockRetention = builder.transientstoreMaxBlockRetention;
    pushAckTimeout = builder.pushAckTimeout;
    btlPullMargin = builder.btlPullMargin;
    reconcileBatchSize = builder.reconcileBatchSize;
    reconcileSleepInterval = builder.reconcileSleepInterval;
    reconciliationEnabled = builder.reconciliationEnabled;
    skipPullingInvalidTransactionsDuringCommit = builder.skipPullingInvalidTransactionsDuringCommit;
    implicitCollectionDisseminationPolicy = builder.implicitCollectionDisseminationPolicy;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerGossipPvtData builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pullRetryThreshold.
   *
   * Determines the maximum time to attempt to pull private data for a block before that block is committed without the
   * private data.
   *
   * @return the pullRetryThreshold
   */
  public String pullRetryThreshold() {
    return pullRetryThreshold;
  }

  /**
   * Gets the transientstoreMaxBlockRetention.
   *
   * As private data enters the transient store, it is associated with the peer's current ledger's height. This field
   * defines the maximum difference between the current ledger's height on commit, and the private data residing inside
   * the transient store. Private data outside this range is not guaranteed to exist and will be purged periodically.
   *
   * @return the transientstoreMaxBlockRetention
   */
  public Double transientstoreMaxBlockRetention() {
    return transientstoreMaxBlockRetention;
  }

  /**
   * Gets the pushAckTimeout.
   *
   * Maximum time to wait for an acknowledgment from each peer's private data push.
   *
   * @return the pushAckTimeout
   */
  public String pushAckTimeout() {
    return pushAckTimeout;
  }

  /**
   * Gets the btlPullMargin.
   *
   * Block to live pulling margin. Used as a buffer to prevent peers from trying to pull private data from others peers
   * that are soon to be purged. "Soon" defined as blocks that will be purged in the next N blocks. This helps a newly
   * joined peer catch up quicker.
   *
   * @return the btlPullMargin
   */
  public Double btlPullMargin() {
    return btlPullMargin;
  }

  /**
   * Gets the reconcileBatchSize.
   *
   * Determines the maximum batch size of missing private data that will be reconciled in a single iteration. The
   * process of reconciliation is done in an endless loop. The "reconciler" in each iteration tries to pull from the
   * other peers with the most recent missing blocks and this maximum batch size limitation.
   *
   * @return the reconcileBatchSize
   */
  public Double reconcileBatchSize() {
    return reconcileBatchSize;
  }

  /**
   * Gets the reconcileSleepInterval.
   *
   * Determines the time "reconciler" sleeps from the end of an iteration until the beginning of the next iteration.
   *
   * @return the reconcileSleepInterval
   */
  public String reconcileSleepInterval() {
    return reconcileSleepInterval;
  }

  /**
   * Gets the reconciliationEnabled.
   *
   * Determines whether private data reconciliation is enabled or not.
   *
   * @return the reconciliationEnabled
   */
  public Boolean reconciliationEnabled() {
    return reconciliationEnabled;
  }

  /**
   * Gets the skipPullingInvalidTransactionsDuringCommit.
   *
   * Controls whether pulling invalid transaction's private data from other peers need to be skipped during the commit
   * time. If `true` it will be pulled through "reconciler".
   *
   * @return the skipPullingInvalidTransactionsDuringCommit
   */
  public Boolean skipPullingInvalidTransactionsDuringCommit() {
    return skipPullingInvalidTransactionsDuringCommit;
  }

  /**
   * Gets the implicitCollectionDisseminationPolicy.
   *
   * @return the implicitCollectionDisseminationPolicy
   */
  public ConfigPeerGossipPvtDataImplicitCollectionDisseminationPolicy implicitCollectionDisseminationPolicy() {
    return implicitCollectionDisseminationPolicy;
  }
}

