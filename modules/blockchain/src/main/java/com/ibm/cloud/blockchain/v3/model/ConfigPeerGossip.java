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
 * ConfigPeerGossip.
 */
public class ConfigPeerGossip extends GenericModel {

  protected Boolean useLeaderElection;
  protected Boolean orgLeader;
  protected String membershipTrackerInterval;
  protected Double maxBlockCountToStore;
  protected String maxPropagationBurstLatency;
  protected Double maxPropagationBurstSize;
  protected Double propagateIterations;
  protected String pullInterval;
  protected Double pullPeerNum;
  protected String requestStateInfoInterval;
  protected String publishStateInfoInterval;
  protected String stateInfoRetentionInterval;
  protected String publishCertPeriod;
  protected Boolean skipBlockVerification;
  protected String dialTimeout;
  protected String connTimeout;
  protected Double recvBuffSize;
  protected Double sendBuffSize;
  protected String digestWaitTime;
  protected String requestWaitTime;
  protected String responseWaitTime;
  protected String aliveTimeInterval;
  protected String aliveExpirationTimeout;
  protected String reconnectInterval;
  protected ConfigPeerGossipElection election;
  protected ConfigPeerGossipPvtData pvtData;
  protected ConfigPeerGossipState state;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean useLeaderElection;
    private Boolean orgLeader;
    private String membershipTrackerInterval;
    private Double maxBlockCountToStore;
    private String maxPropagationBurstLatency;
    private Double maxPropagationBurstSize;
    private Double propagateIterations;
    private String pullInterval;
    private Double pullPeerNum;
    private String requestStateInfoInterval;
    private String publishStateInfoInterval;
    private String stateInfoRetentionInterval;
    private String publishCertPeriod;
    private Boolean skipBlockVerification;
    private String dialTimeout;
    private String connTimeout;
    private Double recvBuffSize;
    private Double sendBuffSize;
    private String digestWaitTime;
    private String requestWaitTime;
    private String responseWaitTime;
    private String aliveTimeInterval;
    private String aliveExpirationTimeout;
    private String reconnectInterval;
    private ConfigPeerGossipElection election;
    private ConfigPeerGossipPvtData pvtData;
    private ConfigPeerGossipState state;

    private Builder(ConfigPeerGossip configPeerGossip) {
      this.useLeaderElection = configPeerGossip.useLeaderElection;
      this.orgLeader = configPeerGossip.orgLeader;
      this.membershipTrackerInterval = configPeerGossip.membershipTrackerInterval;
      this.maxBlockCountToStore = configPeerGossip.maxBlockCountToStore;
      this.maxPropagationBurstLatency = configPeerGossip.maxPropagationBurstLatency;
      this.maxPropagationBurstSize = configPeerGossip.maxPropagationBurstSize;
      this.propagateIterations = configPeerGossip.propagateIterations;
      this.pullInterval = configPeerGossip.pullInterval;
      this.pullPeerNum = configPeerGossip.pullPeerNum;
      this.requestStateInfoInterval = configPeerGossip.requestStateInfoInterval;
      this.publishStateInfoInterval = configPeerGossip.publishStateInfoInterval;
      this.stateInfoRetentionInterval = configPeerGossip.stateInfoRetentionInterval;
      this.publishCertPeriod = configPeerGossip.publishCertPeriod;
      this.skipBlockVerification = configPeerGossip.skipBlockVerification;
      this.dialTimeout = configPeerGossip.dialTimeout;
      this.connTimeout = configPeerGossip.connTimeout;
      this.recvBuffSize = configPeerGossip.recvBuffSize;
      this.sendBuffSize = configPeerGossip.sendBuffSize;
      this.digestWaitTime = configPeerGossip.digestWaitTime;
      this.requestWaitTime = configPeerGossip.requestWaitTime;
      this.responseWaitTime = configPeerGossip.responseWaitTime;
      this.aliveTimeInterval = configPeerGossip.aliveTimeInterval;
      this.aliveExpirationTimeout = configPeerGossip.aliveExpirationTimeout;
      this.reconnectInterval = configPeerGossip.reconnectInterval;
      this.election = configPeerGossip.election;
      this.pvtData = configPeerGossip.pvtData;
      this.state = configPeerGossip.state;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerGossip.
     *
     * @return the new ConfigPeerGossip instance
     */
    public ConfigPeerGossip build() {
      return new ConfigPeerGossip(this);
    }

    /**
     * Set the useLeaderElection.
     *
     * @param useLeaderElection the useLeaderElection
     * @return the ConfigPeerGossip builder
     */
    public Builder useLeaderElection(Boolean useLeaderElection) {
      this.useLeaderElection = useLeaderElection;
      return this;
    }

    /**
     * Set the orgLeader.
     *
     * @param orgLeader the orgLeader
     * @return the ConfigPeerGossip builder
     */
    public Builder orgLeader(Boolean orgLeader) {
      this.orgLeader = orgLeader;
      return this;
    }

    /**
     * Set the membershipTrackerInterval.
     *
     * @param membershipTrackerInterval the membershipTrackerInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder membershipTrackerInterval(String membershipTrackerInterval) {
      this.membershipTrackerInterval = membershipTrackerInterval;
      return this;
    }

    /**
     * Set the maxBlockCountToStore.
     *
     * @param maxBlockCountToStore the maxBlockCountToStore
     * @return the ConfigPeerGossip builder
     */
    public Builder maxBlockCountToStore(Double maxBlockCountToStore) {
      this.maxBlockCountToStore = maxBlockCountToStore;
      return this;
    }

    /**
     * Set the maxPropagationBurstLatency.
     *
     * @param maxPropagationBurstLatency the maxPropagationBurstLatency
     * @return the ConfigPeerGossip builder
     */
    public Builder maxPropagationBurstLatency(String maxPropagationBurstLatency) {
      this.maxPropagationBurstLatency = maxPropagationBurstLatency;
      return this;
    }

    /**
     * Set the maxPropagationBurstSize.
     *
     * @param maxPropagationBurstSize the maxPropagationBurstSize
     * @return the ConfigPeerGossip builder
     */
    public Builder maxPropagationBurstSize(Double maxPropagationBurstSize) {
      this.maxPropagationBurstSize = maxPropagationBurstSize;
      return this;
    }

    /**
     * Set the propagateIterations.
     *
     * @param propagateIterations the propagateIterations
     * @return the ConfigPeerGossip builder
     */
    public Builder propagateIterations(Double propagateIterations) {
      this.propagateIterations = propagateIterations;
      return this;
    }

    /**
     * Set the pullInterval.
     *
     * @param pullInterval the pullInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder pullInterval(String pullInterval) {
      this.pullInterval = pullInterval;
      return this;
    }

    /**
     * Set the pullPeerNum.
     *
     * @param pullPeerNum the pullPeerNum
     * @return the ConfigPeerGossip builder
     */
    public Builder pullPeerNum(Double pullPeerNum) {
      this.pullPeerNum = pullPeerNum;
      return this;
    }

    /**
     * Set the requestStateInfoInterval.
     *
     * @param requestStateInfoInterval the requestStateInfoInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder requestStateInfoInterval(String requestStateInfoInterval) {
      this.requestStateInfoInterval = requestStateInfoInterval;
      return this;
    }

    /**
     * Set the publishStateInfoInterval.
     *
     * @param publishStateInfoInterval the publishStateInfoInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder publishStateInfoInterval(String publishStateInfoInterval) {
      this.publishStateInfoInterval = publishStateInfoInterval;
      return this;
    }

    /**
     * Set the stateInfoRetentionInterval.
     *
     * @param stateInfoRetentionInterval the stateInfoRetentionInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder stateInfoRetentionInterval(String stateInfoRetentionInterval) {
      this.stateInfoRetentionInterval = stateInfoRetentionInterval;
      return this;
    }

    /**
     * Set the publishCertPeriod.
     *
     * @param publishCertPeriod the publishCertPeriod
     * @return the ConfigPeerGossip builder
     */
    public Builder publishCertPeriod(String publishCertPeriod) {
      this.publishCertPeriod = publishCertPeriod;
      return this;
    }

    /**
     * Set the skipBlockVerification.
     *
     * @param skipBlockVerification the skipBlockVerification
     * @return the ConfigPeerGossip builder
     */
    public Builder skipBlockVerification(Boolean skipBlockVerification) {
      this.skipBlockVerification = skipBlockVerification;
      return this;
    }

    /**
     * Set the dialTimeout.
     *
     * @param dialTimeout the dialTimeout
     * @return the ConfigPeerGossip builder
     */
    public Builder dialTimeout(String dialTimeout) {
      this.dialTimeout = dialTimeout;
      return this;
    }

    /**
     * Set the connTimeout.
     *
     * @param connTimeout the connTimeout
     * @return the ConfigPeerGossip builder
     */
    public Builder connTimeout(String connTimeout) {
      this.connTimeout = connTimeout;
      return this;
    }

    /**
     * Set the recvBuffSize.
     *
     * @param recvBuffSize the recvBuffSize
     * @return the ConfigPeerGossip builder
     */
    public Builder recvBuffSize(Double recvBuffSize) {
      this.recvBuffSize = recvBuffSize;
      return this;
    }

    /**
     * Set the sendBuffSize.
     *
     * @param sendBuffSize the sendBuffSize
     * @return the ConfigPeerGossip builder
     */
    public Builder sendBuffSize(Double sendBuffSize) {
      this.sendBuffSize = sendBuffSize;
      return this;
    }

    /**
     * Set the digestWaitTime.
     *
     * @param digestWaitTime the digestWaitTime
     * @return the ConfigPeerGossip builder
     */
    public Builder digestWaitTime(String digestWaitTime) {
      this.digestWaitTime = digestWaitTime;
      return this;
    }

    /**
     * Set the requestWaitTime.
     *
     * @param requestWaitTime the requestWaitTime
     * @return the ConfigPeerGossip builder
     */
    public Builder requestWaitTime(String requestWaitTime) {
      this.requestWaitTime = requestWaitTime;
      return this;
    }

    /**
     * Set the responseWaitTime.
     *
     * @param responseWaitTime the responseWaitTime
     * @return the ConfigPeerGossip builder
     */
    public Builder responseWaitTime(String responseWaitTime) {
      this.responseWaitTime = responseWaitTime;
      return this;
    }

    /**
     * Set the aliveTimeInterval.
     *
     * @param aliveTimeInterval the aliveTimeInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder aliveTimeInterval(String aliveTimeInterval) {
      this.aliveTimeInterval = aliveTimeInterval;
      return this;
    }

    /**
     * Set the aliveExpirationTimeout.
     *
     * @param aliveExpirationTimeout the aliveExpirationTimeout
     * @return the ConfigPeerGossip builder
     */
    public Builder aliveExpirationTimeout(String aliveExpirationTimeout) {
      this.aliveExpirationTimeout = aliveExpirationTimeout;
      return this;
    }

    /**
     * Set the reconnectInterval.
     *
     * @param reconnectInterval the reconnectInterval
     * @return the ConfigPeerGossip builder
     */
    public Builder reconnectInterval(String reconnectInterval) {
      this.reconnectInterval = reconnectInterval;
      return this;
    }

    /**
     * Set the election.
     *
     * @param election the election
     * @return the ConfigPeerGossip builder
     */
    public Builder election(ConfigPeerGossipElection election) {
      this.election = election;
      return this;
    }

    /**
     * Set the pvtData.
     *
     * @param pvtData the pvtData
     * @return the ConfigPeerGossip builder
     */
    public Builder pvtData(ConfigPeerGossipPvtData pvtData) {
      this.pvtData = pvtData;
      return this;
    }

    /**
     * Set the state.
     *
     * @param state the state
     * @return the ConfigPeerGossip builder
     */
    public Builder state(ConfigPeerGossipState state) {
      this.state = state;
      return this;
    }
  }

  protected ConfigPeerGossip(Builder builder) {
    useLeaderElection = builder.useLeaderElection;
    orgLeader = builder.orgLeader;
    membershipTrackerInterval = builder.membershipTrackerInterval;
    maxBlockCountToStore = builder.maxBlockCountToStore;
    maxPropagationBurstLatency = builder.maxPropagationBurstLatency;
    maxPropagationBurstSize = builder.maxPropagationBurstSize;
    propagateIterations = builder.propagateIterations;
    pullInterval = builder.pullInterval;
    pullPeerNum = builder.pullPeerNum;
    requestStateInfoInterval = builder.requestStateInfoInterval;
    publishStateInfoInterval = builder.publishStateInfoInterval;
    stateInfoRetentionInterval = builder.stateInfoRetentionInterval;
    publishCertPeriod = builder.publishCertPeriod;
    skipBlockVerification = builder.skipBlockVerification;
    dialTimeout = builder.dialTimeout;
    connTimeout = builder.connTimeout;
    recvBuffSize = builder.recvBuffSize;
    sendBuffSize = builder.sendBuffSize;
    digestWaitTime = builder.digestWaitTime;
    requestWaitTime = builder.requestWaitTime;
    responseWaitTime = builder.responseWaitTime;
    aliveTimeInterval = builder.aliveTimeInterval;
    aliveExpirationTimeout = builder.aliveExpirationTimeout;
    reconnectInterval = builder.reconnectInterval;
    election = builder.election;
    pvtData = builder.pvtData;
    state = builder.state;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerGossip builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the useLeaderElection.
   *
   * Decides whether a peer will use a dynamic algorithm for "leader" selection (instead of a static leader). The leader
   * is the peer that establishes a connection with the ordering service (OS). The leader pulls ledger blocks from the
   * OS. It is recommended to use leader election for large networks of peers.
   *
   * @return the useLeaderElection
   */
  public Boolean useLeaderElection() {
    return useLeaderElection;
  }

  /**
   * Gets the orgLeader.
   *
   * Decides whether this peer should be an organization "leader". It maintains a connection with the ordering service
   * and disseminate blocks to peers in its own organization.
   *
   * @return the orgLeader
   */
  public Boolean orgLeader() {
    return orgLeader;
  }

  /**
   * Gets the membershipTrackerInterval.
   *
   * The frequency to poll on membershipTracker.
   *
   * @return the membershipTrackerInterval
   */
  public String membershipTrackerInterval() {
    return membershipTrackerInterval;
  }

  /**
   * Gets the maxBlockCountToStore.
   *
   * Maximum number of blocks that can be stored in memory.
   *
   * @return the maxBlockCountToStore
   */
  public Double maxBlockCountToStore() {
    return maxBlockCountToStore;
  }

  /**
   * Gets the maxPropagationBurstLatency.
   *
   * Maximum time between consecutive message pushes.
   *
   * @return the maxPropagationBurstLatency
   */
  public String maxPropagationBurstLatency() {
    return maxPropagationBurstLatency;
  }

  /**
   * Gets the maxPropagationBurstSize.
   *
   * Maximum number of messages that are stored until a push to remote peers is triggered.
   *
   * @return the maxPropagationBurstSize
   */
  public Double maxPropagationBurstSize() {
    return maxPropagationBurstSize;
  }

  /**
   * Gets the propagateIterations.
   *
   * Number of times a message is pushed to remote peers.
   *
   * @return the propagateIterations
   */
  public Double propagateIterations() {
    return propagateIterations;
  }

  /**
   * Gets the pullInterval.
   *
   * Determines the frequency of pull phases.
   *
   * @return the pullInterval
   */
  public String pullInterval() {
    return pullInterval;
  }

  /**
   * Gets the pullPeerNum.
   *
   * Number of peers to pull from.
   *
   * @return the pullPeerNum
   */
  public Double pullPeerNum() {
    return pullPeerNum;
  }

  /**
   * Gets the requestStateInfoInterval.
   *
   * Determines the frequency of pulling stateInfo messages from peers.
   *
   * @return the requestStateInfoInterval
   */
  public String requestStateInfoInterval() {
    return requestStateInfoInterval;
  }

  /**
   * Gets the publishStateInfoInterval.
   *
   * Determines the frequency of pushing stateInfo messages to peers.
   *
   * @return the publishStateInfoInterval
   */
  public String publishStateInfoInterval() {
    return publishStateInfoInterval;
  }

  /**
   * Gets the stateInfoRetentionInterval.
   *
   * Maximum time a stateInfo message is kept.
   *
   * @return the stateInfoRetentionInterval
   */
  public String stateInfoRetentionInterval() {
    return stateInfoRetentionInterval;
  }

  /**
   * Gets the publishCertPeriod.
   *
   * Time after startup to start including certificates in Alive messages.
   *
   * @return the publishCertPeriod
   */
  public String publishCertPeriod() {
    return publishCertPeriod;
  }

  /**
   * Gets the skipBlockVerification.
   *
   * Decides whether the peer should skip the verification of block messages.
   *
   * @return the skipBlockVerification
   */
  public Boolean skipBlockVerification() {
    return skipBlockVerification;
  }

  /**
   * Gets the dialTimeout.
   *
   * The timeout for dialing a network request.
   *
   * @return the dialTimeout
   */
  public String dialTimeout() {
    return dialTimeout;
  }

  /**
   * Gets the connTimeout.
   *
   * The timeout for a network connection.
   *
   * @return the connTimeout
   */
  public String connTimeout() {
    return connTimeout;
  }

  /**
   * Gets the recvBuffSize.
   *
   * Number of received messages to hold in buffer.
   *
   * @return the recvBuffSize
   */
  public Double recvBuffSize() {
    return recvBuffSize;
  }

  /**
   * Gets the sendBuffSize.
   *
   * Number of sent messages to hold in buffer.
   *
   * @return the sendBuffSize
   */
  public Double sendBuffSize() {
    return sendBuffSize;
  }

  /**
   * Gets the digestWaitTime.
   *
   * Time to wait before the pull-engine processes incoming digests. Should be slightly smaller than requestWaitTime.
   *
   * @return the digestWaitTime
   */
  public String digestWaitTime() {
    return digestWaitTime;
  }

  /**
   * Gets the requestWaitTime.
   *
   * Time to wait before pull-engine removes the incoming nonce. Should be slightly bigger than digestWaitTime.
   *
   * @return the requestWaitTime
   */
  public String requestWaitTime() {
    return requestWaitTime;
  }

  /**
   * Gets the responseWaitTime.
   *
   * Time to wait before the pull-engine ends.
   *
   * @return the responseWaitTime
   */
  public String responseWaitTime() {
    return responseWaitTime;
  }

  /**
   * Gets the aliveTimeInterval.
   *
   * Alive check frequency.
   *
   * @return the aliveTimeInterval
   */
  public String aliveTimeInterval() {
    return aliveTimeInterval;
  }

  /**
   * Gets the aliveExpirationTimeout.
   *
   * Alive expiration timeout.
   *
   * @return the aliveExpirationTimeout
   */
  public String aliveExpirationTimeout() {
    return aliveExpirationTimeout;
  }

  /**
   * Gets the reconnectInterval.
   *
   * Reconnect frequency.
   *
   * @return the reconnectInterval
   */
  public String reconnectInterval() {
    return reconnectInterval;
  }

  /**
   * Gets the election.
   *
   * Leader election service configuration.
   *
   * @return the election
   */
  public ConfigPeerGossipElection election() {
    return election;
  }

  /**
   * Gets the pvtData.
   *
   * @return the pvtData
   */
  public ConfigPeerGossipPvtData pvtData() {
    return pvtData;
  }

  /**
   * Gets the state.
   *
   * Gossip state transfer related configuration.
   *
   * @return the state
   */
  public ConfigPeerGossipState state() {
    return state;
  }
}

