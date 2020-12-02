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
 * ConfigOrdererMetrics.
 */
public class ConfigOrdererMetrics extends GenericModel {

  /**
   * The metrics provider to use.
   */
  public interface Provider {
    /** disabled. */
    String DISABLED = "disabled";
    /** statsd. */
    String STATSD = "statsd";
    /** prometheus. */
    String PROMETHEUS = "prometheus";
  }

  @SerializedName("Provider")
  protected String provider;
  @SerializedName("Statsd")
  protected ConfigOrdererMetricsStatsd statsd;

  /**
   * Builder.
   */
  public static class Builder {
    private String provider;
    private ConfigOrdererMetricsStatsd statsd;

    private Builder(ConfigOrdererMetrics configOrdererMetrics) {
      this.provider = configOrdererMetrics.provider;
      this.statsd = configOrdererMetrics.statsd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererMetrics.
     *
     * @return the new ConfigOrdererMetrics instance
     */
    public ConfigOrdererMetrics build() {
      return new ConfigOrdererMetrics(this);
    }

    /**
     * Set the provider.
     *
     * @param provider the provider
     * @return the ConfigOrdererMetrics builder
     */
    public Builder provider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Set the statsd.
     *
     * @param statsd the statsd
     * @return the ConfigOrdererMetrics builder
     */
    public Builder statsd(ConfigOrdererMetricsStatsd statsd) {
      this.statsd = statsd;
      return this;
    }
  }

  protected ConfigOrdererMetrics(Builder builder) {
    provider = builder.provider;
    statsd = builder.statsd;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererMetrics builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the provider.
   *
   * The metrics provider to use.
   *
   * @return the provider
   */
  public String provider() {
    return provider;
  }

  /**
   * Gets the statsd.
   *
   * The statsd configuration.
   *
   * @return the statsd
   */
  public ConfigOrdererMetricsStatsd statsd() {
    return statsd;
  }
}

