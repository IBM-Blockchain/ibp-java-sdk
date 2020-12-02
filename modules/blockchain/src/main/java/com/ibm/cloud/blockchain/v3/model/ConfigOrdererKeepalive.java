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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Keep alive settings for the GRPC server.
 */
public class ConfigOrdererKeepalive extends GenericModel {

  @SerializedName("ServerMinInterval")
  protected String serverMinInterval;
  @SerializedName("ServerInterval")
  protected String serverInterval;
  @SerializedName("ServerTimeout")
  protected String serverTimeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String serverMinInterval;
    private String serverInterval;
    private String serverTimeout;

    private Builder(ConfigOrdererKeepalive configOrdererKeepalive) {
      this.serverMinInterval = configOrdererKeepalive.serverMinInterval;
      this.serverInterval = configOrdererKeepalive.serverInterval;
      this.serverTimeout = configOrdererKeepalive.serverTimeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererKeepalive.
     *
     * @return the new ConfigOrdererKeepalive instance
     */
    public ConfigOrdererKeepalive build() {
      return new ConfigOrdererKeepalive(this);
    }

    /**
     * Set the serverMinInterval.
     *
     * @param serverMinInterval the serverMinInterval
     * @return the ConfigOrdererKeepalive builder
     */
    public Builder serverMinInterval(String serverMinInterval) {
      this.serverMinInterval = serverMinInterval;
      return this;
    }

    /**
     * Set the serverInterval.
     *
     * @param serverInterval the serverInterval
     * @return the ConfigOrdererKeepalive builder
     */
    public Builder serverInterval(String serverInterval) {
      this.serverInterval = serverInterval;
      return this;
    }

    /**
     * Set the serverTimeout.
     *
     * @param serverTimeout the serverTimeout
     * @return the ConfigOrdererKeepalive builder
     */
    public Builder serverTimeout(String serverTimeout) {
      this.serverTimeout = serverTimeout;
      return this;
    }
  }

  protected ConfigOrdererKeepalive(Builder builder) {
    serverMinInterval = builder.serverMinInterval;
    serverInterval = builder.serverInterval;
    serverTimeout = builder.serverTimeout;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererKeepalive builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the serverMinInterval.
   *
   * The minimum time between client pings. If a client sends pings more frequently the server will disconnect from the
   * client.
   *
   * @return the serverMinInterval
   */
  public String serverMinInterval() {
    return serverMinInterval;
  }

  /**
   * Gets the serverInterval.
   *
   * The time between pings to clients.
   *
   * @return the serverInterval
   */
  public String serverInterval() {
    return serverInterval;
  }

  /**
   * Gets the serverTimeout.
   *
   * The duration the server will wait for a response from a client before closing the connection.
   *
   * @return the serverTimeout
   */
  public String serverTimeout() {
    return serverTimeout;
  }
}

