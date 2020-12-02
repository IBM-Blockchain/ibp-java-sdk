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
 * Metrics.
 */
public class Metrics extends GenericModel {

  /**
   * Metrics provider to use. Can be either 'statsd', 'prometheus', or 'disabled'.
   */
  public interface Provider {
    /** statsd. */
    String STATSD = "statsd";
    /** prometheus. */
    String PROMETHEUS = "prometheus";
    /** disabled. */
    String DISABLED = "disabled";
  }

  protected String provider;
  protected MetricsStatsd statsd;

  /**
   * Builder.
   */
  public static class Builder {
    private String provider;
    private MetricsStatsd statsd;

    private Builder(Metrics metrics) {
      this.provider = metrics.provider;
      this.statsd = metrics.statsd;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param provider the provider
     */
    public Builder(String provider) {
      this.provider = provider;
    }

    /**
     * Builds a Metrics.
     *
     * @return the new Metrics instance
     */
    public Metrics build() {
      return new Metrics(this);
    }

    /**
     * Set the provider.
     *
     * @param provider the provider
     * @return the Metrics builder
     */
    public Builder provider(String provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Set the statsd.
     *
     * @param statsd the statsd
     * @return the Metrics builder
     */
    public Builder statsd(MetricsStatsd statsd) {
      this.statsd = statsd;
      return this;
    }
  }

  protected Metrics(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.provider,
      "provider cannot be null");
    provider = builder.provider;
    statsd = builder.statsd;
  }

  /**
   * New builder.
   *
   * @return a Metrics builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the provider.
   *
   * Metrics provider to use. Can be either 'statsd', 'prometheus', or 'disabled'.
   *
   * @return the provider
   */
  public String provider() {
    return provider;
  }

  /**
   * Gets the statsd.
   *
   * @return the statsd
   */
  public MetricsStatsd statsd() {
    return statsd;
  }
}

