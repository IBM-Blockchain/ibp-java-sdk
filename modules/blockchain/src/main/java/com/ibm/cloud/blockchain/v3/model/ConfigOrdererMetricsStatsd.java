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
 * The statsd configuration.
 */
public class ConfigOrdererMetricsStatsd extends GenericModel {

  /**
   * Network protocol to use.
   */
  public interface Network {
    /** udp. */
    String UDP = "udp";
    /** tcp. */
    String TCP = "tcp";
  }

  @SerializedName("Network")
  protected String network;
  @SerializedName("Address")
  protected String address;
  @SerializedName("WriteInterval")
  protected String writeInterval;
  @SerializedName("Prefix")
  protected String prefix;

  /**
   * Builder.
   */
  public static class Builder {
    private String network;
    private String address;
    private String writeInterval;
    private String prefix;

    private Builder(ConfigOrdererMetricsStatsd configOrdererMetricsStatsd) {
      this.network = configOrdererMetricsStatsd.network;
      this.address = configOrdererMetricsStatsd.address;
      this.writeInterval = configOrdererMetricsStatsd.writeInterval;
      this.prefix = configOrdererMetricsStatsd.prefix;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererMetricsStatsd.
     *
     * @return the new ConfigOrdererMetricsStatsd instance
     */
    public ConfigOrdererMetricsStatsd build() {
      return new ConfigOrdererMetricsStatsd(this);
    }

    /**
     * Set the network.
     *
     * @param network the network
     * @return the ConfigOrdererMetricsStatsd builder
     */
    public Builder network(String network) {
      this.network = network;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the ConfigOrdererMetricsStatsd builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the writeInterval.
     *
     * @param writeInterval the writeInterval
     * @return the ConfigOrdererMetricsStatsd builder
     */
    public Builder writeInterval(String writeInterval) {
      this.writeInterval = writeInterval;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the ConfigOrdererMetricsStatsd builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected ConfigOrdererMetricsStatsd(Builder builder) {
    network = builder.network;
    address = builder.address;
    writeInterval = builder.writeInterval;
    prefix = builder.prefix;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererMetricsStatsd builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the network.
   *
   * Network protocol to use.
   *
   * @return the network
   */
  public String network() {
    return network;
  }

  /**
   * Gets the address.
   *
   * The address of the statsd server. Include hostname/ip and port.
   *
   * @return the address
   */
  public String address() {
    return address;
  }

  /**
   * Gets the writeInterval.
   *
   * The frequency at which locally cached counters and gauges are pushed to statsd.
   *
   * @return the writeInterval
   */
  public String writeInterval() {
    return writeInterval;
  }

  /**
   * Gets the prefix.
   *
   * The string that is prepended to all emitted statsd metrics.
   *
   * @return the prefix
   */
  public String prefix() {
    return prefix;
  }
}

