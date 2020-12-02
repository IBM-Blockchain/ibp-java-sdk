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
 * ConfigPeerClient.
 */
public class ConfigPeerClient extends GenericModel {

  protected String connTimeout;

  /**
   * Builder.
   */
  public static class Builder {
    private String connTimeout;

    private Builder(ConfigPeerClient configPeerClient) {
      this.connTimeout = configPeerClient.connTimeout;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param connTimeout the connTimeout
     */
    public Builder(String connTimeout) {
      this.connTimeout = connTimeout;
    }

    /**
     * Builds a ConfigPeerClient.
     *
     * @return the new ConfigPeerClient instance
     */
    public ConfigPeerClient build() {
      return new ConfigPeerClient(this);
    }

    /**
     * Set the connTimeout.
     *
     * @param connTimeout the connTimeout
     * @return the ConfigPeerClient builder
     */
    public Builder connTimeout(String connTimeout) {
      this.connTimeout = connTimeout;
      return this;
    }
  }

  protected ConfigPeerClient(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.connTimeout,
      "connTimeout cannot be null");
    connTimeout = builder.connTimeout;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerClient builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

