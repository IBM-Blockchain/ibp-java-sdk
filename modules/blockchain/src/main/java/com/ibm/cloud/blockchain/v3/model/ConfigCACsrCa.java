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
 * ConfigCACsrCa.
 */
public class ConfigCACsrCa extends GenericModel {

  protected String expiry;
  protected Double pathlength;

  /**
   * Builder.
   */
  public static class Builder {
    private String expiry;
    private Double pathlength;

    private Builder(ConfigCACsrCa configCaCsrCa) {
      this.expiry = configCaCsrCa.expiry;
      this.pathlength = configCaCsrCa.pathlength;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCACsrCa.
     *
     * @return the new ConfigCACsrCa instance
     */
    public ConfigCACsrCa build() {
      return new ConfigCACsrCa(this);
    }

    /**
     * Set the expiry.
     *
     * @param expiry the expiry
     * @return the ConfigCACsrCa builder
     */
    public Builder expiry(String expiry) {
      this.expiry = expiry;
      return this;
    }

    /**
     * Set the pathlength.
     *
     * @param pathlength the pathlength
     * @return the ConfigCACsrCa builder
     */
    public Builder pathlength(Double pathlength) {
      this.pathlength = pathlength;
      return this;
    }
  }

  protected ConfigCACsrCa(Builder builder) {
    expiry = builder.expiry;
    pathlength = builder.pathlength;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACsrCa builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the expiry.
   *
   * The expiration for the root CA certificate.
   *
   * @return the expiry
   */
  public String expiry() {
    return expiry;
  }

  /**
   * Gets the pathlength.
   *
   * The pathlength field is used to limit CA certificate hierarchy. 0 means that the CA cannot issue CA certs, only
   * entity certificates. 1 means that the CA can issue both.
   *
   * @return the pathlength
   */
  public Double pathlength() {
    return pathlength;
  }
}

