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
 * ConfigPeerKeepaliveClient.
 */
public class ConfigPeerKeepaliveClient extends GenericModel {

  protected String interval;
  protected String timeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String interval;
    private String timeout;

    private Builder(ConfigPeerKeepaliveClient configPeerKeepaliveClient) {
      this.interval = configPeerKeepaliveClient.interval;
      this.timeout = configPeerKeepaliveClient.timeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerKeepaliveClient.
     *
     * @return the new ConfigPeerKeepaliveClient instance
     */
    public ConfigPeerKeepaliveClient build() {
      return new ConfigPeerKeepaliveClient(this);
    }

    /**
     * Set the interval.
     *
     * @param interval the interval
     * @return the ConfigPeerKeepaliveClient builder
     */
    public Builder interval(String interval) {
      this.interval = interval;
      return this;
    }

    /**
     * Set the timeout.
     *
     * @param timeout the timeout
     * @return the ConfigPeerKeepaliveClient builder
     */
    public Builder timeout(String timeout) {
      this.timeout = timeout;
      return this;
    }
  }

  protected ConfigPeerKeepaliveClient(Builder builder) {
    interval = builder.interval;
    timeout = builder.timeout;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerKeepaliveClient builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the interval.
   *
   * The time between pings to other peer nodes. Must greater than or equal to the minInterval.
   *
   * @return the interval
   */
  public String interval() {
    return interval;
  }

  /**
   * Gets the timeout.
   *
   * The duration a client waits for a peer's response before it closes the connection.
   *
   * @return the timeout
   */
  public String timeout() {
    return timeout;
  }
}

