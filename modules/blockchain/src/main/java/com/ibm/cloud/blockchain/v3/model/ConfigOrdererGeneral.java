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
 * ConfigOrdererGeneral.
 */
public class ConfigOrdererGeneral extends GenericModel {

  @SerializedName("Keepalive")
  protected ConfigOrdererKeepalive keepalive;
  @SerializedName("BCCSP")
  protected Bccsp bccsp;
  @SerializedName("Authentication")
  protected ConfigOrdererAuthentication authentication;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigOrdererKeepalive keepalive;
    private Bccsp bccsp;
    private ConfigOrdererAuthentication authentication;

    private Builder(ConfigOrdererGeneral configOrdererGeneral) {
      this.keepalive = configOrdererGeneral.keepalive;
      this.bccsp = configOrdererGeneral.bccsp;
      this.authentication = configOrdererGeneral.authentication;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererGeneral.
     *
     * @return the new ConfigOrdererGeneral instance
     */
    public ConfigOrdererGeneral build() {
      return new ConfigOrdererGeneral(this);
    }

    /**
     * Set the keepalive.
     *
     * @param keepalive the keepalive
     * @return the ConfigOrdererGeneral builder
     */
    public Builder keepalive(ConfigOrdererKeepalive keepalive) {
      this.keepalive = keepalive;
      return this;
    }

    /**
     * Set the bccsp.
     *
     * @param bccsp the bccsp
     * @return the ConfigOrdererGeneral builder
     */
    public Builder bccsp(Bccsp bccsp) {
      this.bccsp = bccsp;
      return this;
    }

    /**
     * Set the authentication.
     *
     * @param authentication the authentication
     * @return the ConfigOrdererGeneral builder
     */
    public Builder authentication(ConfigOrdererAuthentication authentication) {
      this.authentication = authentication;
      return this;
    }
  }

  protected ConfigOrdererGeneral(Builder builder) {
    keepalive = builder.keepalive;
    bccsp = builder.bccsp;
    authentication = builder.authentication;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererGeneral builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the keepalive.
   *
   * Keep alive settings for the GRPC server.
   *
   * @return the keepalive
   */
  public ConfigOrdererKeepalive keepalive() {
    return keepalive;
  }

  /**
   * Gets the bccsp.
   *
   * Configures the Blockchain Crypto Service Providers (bccsp).
   *
   * @return the bccsp
   */
  public Bccsp bccsp() {
    return bccsp;
  }

  /**
   * Gets the authentication.
   *
   * Contains configuration parameters that are related to authenticating client messages.
   *
   * @return the authentication
   */
  public ConfigOrdererAuthentication authentication() {
    return authentication;
  }
}

