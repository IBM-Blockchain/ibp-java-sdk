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
 * ConfigCASigningProfiles.
 */
public class ConfigCASigningProfiles extends GenericModel {

  protected ConfigCASigningProfilesCa ca;
  protected ConfigCASigningProfilesTls tls;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCASigningProfilesCa ca;
    private ConfigCASigningProfilesTls tls;

    private Builder(ConfigCASigningProfiles configCaSigningProfiles) {
      this.ca = configCaSigningProfiles.ca;
      this.tls = configCaSigningProfiles.tls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCASigningProfiles.
     *
     * @return the new ConfigCASigningProfiles instance
     */
    public ConfigCASigningProfiles build() {
      return new ConfigCASigningProfiles(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the ConfigCASigningProfiles builder
     */
    public Builder ca(ConfigCASigningProfilesCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tls.
     *
     * @param tls the tls
     * @return the ConfigCASigningProfiles builder
     */
    public Builder tls(ConfigCASigningProfilesTls tls) {
      this.tls = tls;
      return this;
    }
  }

  protected ConfigCASigningProfiles(Builder builder) {
    ca = builder.ca;
    tls = builder.tls;
  }

  /**
   * New builder.
   *
   * @return a ConfigCASigningProfiles builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * Controls attributes of intermediate CA certificates.
   *
   * @return the ca
   */
  public ConfigCASigningProfilesCa ca() {
    return ca;
  }

  /**
   * Gets the tls.
   *
   * Controls attributes of intermediate tls CA certificates.
   *
   * @return the tls
   */
  public ConfigCASigningProfilesTls tls() {
    return tls;
  }
}

