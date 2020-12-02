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
 * Leader election service configuration.
 */
public class ConfigPeerGossipElection extends GenericModel {

  protected String startupGracePeriod;
  protected String membershipSampleInterval;
  protected String leaderAliveThreshold;
  protected String leaderElectionDuration;

  /**
   * Builder.
   */
  public static class Builder {
    private String startupGracePeriod;
    private String membershipSampleInterval;
    private String leaderAliveThreshold;
    private String leaderElectionDuration;

    private Builder(ConfigPeerGossipElection configPeerGossipElection) {
      this.startupGracePeriod = configPeerGossipElection.startupGracePeriod;
      this.membershipSampleInterval = configPeerGossipElection.membershipSampleInterval;
      this.leaderAliveThreshold = configPeerGossipElection.leaderAliveThreshold;
      this.leaderElectionDuration = configPeerGossipElection.leaderElectionDuration;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerGossipElection.
     *
     * @return the new ConfigPeerGossipElection instance
     */
    public ConfigPeerGossipElection build() {
      return new ConfigPeerGossipElection(this);
    }

    /**
     * Set the startupGracePeriod.
     *
     * @param startupGracePeriod the startupGracePeriod
     * @return the ConfigPeerGossipElection builder
     */
    public Builder startupGracePeriod(String startupGracePeriod) {
      this.startupGracePeriod = startupGracePeriod;
      return this;
    }

    /**
     * Set the membershipSampleInterval.
     *
     * @param membershipSampleInterval the membershipSampleInterval
     * @return the ConfigPeerGossipElection builder
     */
    public Builder membershipSampleInterval(String membershipSampleInterval) {
      this.membershipSampleInterval = membershipSampleInterval;
      return this;
    }

    /**
     * Set the leaderAliveThreshold.
     *
     * @param leaderAliveThreshold the leaderAliveThreshold
     * @return the ConfigPeerGossipElection builder
     */
    public Builder leaderAliveThreshold(String leaderAliveThreshold) {
      this.leaderAliveThreshold = leaderAliveThreshold;
      return this;
    }

    /**
     * Set the leaderElectionDuration.
     *
     * @param leaderElectionDuration the leaderElectionDuration
     * @return the ConfigPeerGossipElection builder
     */
    public Builder leaderElectionDuration(String leaderElectionDuration) {
      this.leaderElectionDuration = leaderElectionDuration;
      return this;
    }
  }

  protected ConfigPeerGossipElection(Builder builder) {
    startupGracePeriod = builder.startupGracePeriod;
    membershipSampleInterval = builder.membershipSampleInterval;
    leaderAliveThreshold = builder.leaderAliveThreshold;
    leaderElectionDuration = builder.leaderElectionDuration;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerGossipElection builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the startupGracePeriod.
   *
   * Longest time the peer will wait for stable membership during leader election startup.
   *
   * @return the startupGracePeriod
   */
  public String startupGracePeriod() {
    return startupGracePeriod;
  }

  /**
   * Gets the membershipSampleInterval.
   *
   * Frequency that gossip membership samples to check its stability.
   *
   * @return the membershipSampleInterval
   */
  public String membershipSampleInterval() {
    return membershipSampleInterval;
  }

  /**
   * Gets the leaderAliveThreshold.
   *
   * Amount of time after the last declaration message for the peer to perform another leader election.
   *
   * @return the leaderAliveThreshold
   */
  public String leaderAliveThreshold() {
    return leaderAliveThreshold;
  }

  /**
   * Gets the leaderElectionDuration.
   *
   * Amount of time between the peer sending a propose message and it declaring itself as a leader.
   *
   * @return the leaderElectionDuration
   */
  public String leaderElectionDuration() {
    return leaderElectionDuration;
  }
}

