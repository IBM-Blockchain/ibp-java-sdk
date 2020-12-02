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
 * MetricsStatsd.
 */
public class MetricsStatsd extends GenericModel {

  /**
   * Either UDP or TCP.
   */
  public interface Network {
    /** udp. */
    String UDP = "udp";
    /** tcp. */
    String TCP = "tcp";
  }

  protected String network;
  protected String address;
  protected String writeInterval;
  protected String prefix;

  /**
   * Builder.
   */
  public static class Builder {
    private String network;
    private String address;
    private String writeInterval;
    private String prefix;

    private Builder(MetricsStatsd metricsStatsd) {
      this.network = metricsStatsd.network;
      this.address = metricsStatsd.address;
      this.writeInterval = metricsStatsd.writeInterval;
      this.prefix = metricsStatsd.prefix;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param network the network
     * @param address the address
     * @param writeInterval the writeInterval
     * @param prefix the prefix
     */
    public Builder(String network, String address, String writeInterval, String prefix) {
      this.network = network;
      this.address = address;
      this.writeInterval = writeInterval;
      this.prefix = prefix;
    }

    /**
     * Builds a MetricsStatsd.
     *
     * @return the new MetricsStatsd instance
     */
    public MetricsStatsd build() {
      return new MetricsStatsd(this);
    }

    /**
     * Set the network.
     *
     * @param network the network
     * @return the MetricsStatsd builder
     */
    public Builder network(String network) {
      this.network = network;
      return this;
    }

    /**
     * Set the address.
     *
     * @param address the address
     * @return the MetricsStatsd builder
     */
    public Builder address(String address) {
      this.address = address;
      return this;
    }

    /**
     * Set the writeInterval.
     *
     * @param writeInterval the writeInterval
     * @return the MetricsStatsd builder
     */
    public Builder writeInterval(String writeInterval) {
      this.writeInterval = writeInterval;
      return this;
    }

    /**
     * Set the prefix.
     *
     * @param prefix the prefix
     * @return the MetricsStatsd builder
     */
    public Builder prefix(String prefix) {
      this.prefix = prefix;
      return this;
    }
  }

  protected MetricsStatsd(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.network,
      "network cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.address,
      "address cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.writeInterval,
      "writeInterval cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.prefix,
      "prefix cannot be null");
    network = builder.network;
    address = builder.address;
    writeInterval = builder.writeInterval;
    prefix = builder.prefix;
  }

  /**
   * New builder.
   *
   * @return a MetricsStatsd builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the network.
   *
   * Either UDP or TCP.
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

