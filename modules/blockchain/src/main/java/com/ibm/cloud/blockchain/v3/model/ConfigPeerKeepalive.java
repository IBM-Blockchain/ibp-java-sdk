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
 * Keep alive settings between the peer server and clients.
 */
public class ConfigPeerKeepalive extends GenericModel {

  protected String minInterval;
  protected ConfigPeerKeepaliveClient client;
  protected ConfigPeerKeepaliveDeliveryClient deliveryClient;

  /**
   * Builder.
   */
  public static class Builder {
    private String minInterval;
    private ConfigPeerKeepaliveClient client;
    private ConfigPeerKeepaliveDeliveryClient deliveryClient;

    private Builder(ConfigPeerKeepalive configPeerKeepalive) {
      this.minInterval = configPeerKeepalive.minInterval;
      this.client = configPeerKeepalive.client;
      this.deliveryClient = configPeerKeepalive.deliveryClient;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerKeepalive.
     *
     * @return the new ConfigPeerKeepalive instance
     */
    public ConfigPeerKeepalive build() {
      return new ConfigPeerKeepalive(this);
    }

    /**
     * Set the minInterval.
     *
     * @param minInterval the minInterval
     * @return the ConfigPeerKeepalive builder
     */
    public Builder minInterval(String minInterval) {
      this.minInterval = minInterval;
      return this;
    }

    /**
     * Set the client.
     *
     * @param client the client
     * @return the ConfigPeerKeepalive builder
     */
    public Builder client(ConfigPeerKeepaliveClient client) {
      this.client = client;
      return this;
    }

    /**
     * Set the deliveryClient.
     *
     * @param deliveryClient the deliveryClient
     * @return the ConfigPeerKeepalive builder
     */
    public Builder deliveryClient(ConfigPeerKeepaliveDeliveryClient deliveryClient) {
      this.deliveryClient = deliveryClient;
      return this;
    }
  }

  protected ConfigPeerKeepalive(Builder builder) {
    minInterval = builder.minInterval;
    client = builder.client;
    deliveryClient = builder.deliveryClient;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerKeepalive builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the minInterval.
   *
   * The minimum time between client pings. If a client sends pings more frequently the server disconnects from the
   * client.
   *
   * @return the minInterval
   */
  public String minInterval() {
    return minInterval;
  }

  /**
   * Gets the client.
   *
   * @return the client
   */
  public ConfigPeerKeepaliveClient client() {
    return client;
  }

  /**
   * Gets the deliveryClient.
   *
   * @return the deliveryClient
   */
  public ConfigPeerKeepaliveDeliveryClient deliveryClient() {
    return deliveryClient;
  }
}

