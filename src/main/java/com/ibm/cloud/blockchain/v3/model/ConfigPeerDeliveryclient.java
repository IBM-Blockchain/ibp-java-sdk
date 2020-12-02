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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigPeerDeliveryclient.
 */
public class ConfigPeerDeliveryclient extends GenericModel {

  protected String reconnectTotalTimeThreshold;
  protected String connTimeout;
  protected String reConnectBackoffThreshold;
  protected List<ConfigPeerDeliveryclientAddressOverridesItem> addressOverrides;

  /**
   * Builder.
   */
  public static class Builder {
    private String reconnectTotalTimeThreshold;
    private String connTimeout;
    private String reConnectBackoffThreshold;
    private List<ConfigPeerDeliveryclientAddressOverridesItem> addressOverrides;

    private Builder(ConfigPeerDeliveryclient configPeerDeliveryclient) {
      this.reconnectTotalTimeThreshold = configPeerDeliveryclient.reconnectTotalTimeThreshold;
      this.connTimeout = configPeerDeliveryclient.connTimeout;
      this.reConnectBackoffThreshold = configPeerDeliveryclient.reConnectBackoffThreshold;
      this.addressOverrides = configPeerDeliveryclient.addressOverrides;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerDeliveryclient.
     *
     * @return the new ConfigPeerDeliveryclient instance
     */
    public ConfigPeerDeliveryclient build() {
      return new ConfigPeerDeliveryclient(this);
    }

    /**
     * Adds an addressOverrides to addressOverrides.
     *
     * @param addressOverrides the new addressOverrides
     * @return the ConfigPeerDeliveryclient builder
     */
    public Builder addAddressOverrides(ConfigPeerDeliveryclientAddressOverridesItem addressOverrides) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(addressOverrides,
        "addressOverrides cannot be null");
      if (this.addressOverrides == null) {
        this.addressOverrides = new ArrayList<ConfigPeerDeliveryclientAddressOverridesItem>();
      }
      this.addressOverrides.add(addressOverrides);
      return this;
    }

    /**
     * Set the reconnectTotalTimeThreshold.
     *
     * @param reconnectTotalTimeThreshold the reconnectTotalTimeThreshold
     * @return the ConfigPeerDeliveryclient builder
     */
    public Builder reconnectTotalTimeThreshold(String reconnectTotalTimeThreshold) {
      this.reconnectTotalTimeThreshold = reconnectTotalTimeThreshold;
      return this;
    }

    /**
     * Set the connTimeout.
     *
     * @param connTimeout the connTimeout
     * @return the ConfigPeerDeliveryclient builder
     */
    public Builder connTimeout(String connTimeout) {
      this.connTimeout = connTimeout;
      return this;
    }

    /**
     * Set the reConnectBackoffThreshold.
     *
     * @param reConnectBackoffThreshold the reConnectBackoffThreshold
     * @return the ConfigPeerDeliveryclient builder
     */
    public Builder reConnectBackoffThreshold(String reConnectBackoffThreshold) {
      this.reConnectBackoffThreshold = reConnectBackoffThreshold;
      return this;
    }

    /**
     * Set the addressOverrides.
     * Existing addressOverrides will be replaced.
     *
     * @param addressOverrides the addressOverrides
     * @return the ConfigPeerDeliveryclient builder
     */
    public Builder addressOverrides(List<ConfigPeerDeliveryclientAddressOverridesItem> addressOverrides) {
      this.addressOverrides = addressOverrides;
      return this;
    }
  }

  protected ConfigPeerDeliveryclient(Builder builder) {
    reconnectTotalTimeThreshold = builder.reconnectTotalTimeThreshold;
    connTimeout = builder.connTimeout;
    reConnectBackoffThreshold = builder.reConnectBackoffThreshold;
    addressOverrides = builder.addressOverrides;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerDeliveryclient builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the reconnectTotalTimeThreshold.
   *
   * Total time to spend retrying connections to ordering nodes before giving up and returning an error.
   *
   * @return the reconnectTotalTimeThreshold
   */
  public String reconnectTotalTimeThreshold() {
    return reconnectTotalTimeThreshold;
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
   * Gets the reConnectBackoffThreshold.
   *
   * Maximum delay between consecutive connection retry attempts to ordering nodes.
   *
   * @return the reConnectBackoffThreshold
   */
  public String reConnectBackoffThreshold() {
    return reConnectBackoffThreshold;
  }

  /**
   * Gets the addressOverrides.
   *
   * A list of orderer endpoint addresses in channel configurations that should be overridden. Typically used when the
   * original orderer addresses no longer exist.
   *
   * @return the addressOverrides
   */
  public List<ConfigPeerDeliveryclientAddressOverridesItem> addressOverrides() {
    return addressOverrides;
  }
}

