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
 * Controls attributes of intermediate tls CA certificates.
 */
public class ConfigCASigningProfilesTls extends GenericModel {

  protected List<String> usage;
  protected String expiry;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> usage;
    private String expiry;

    private Builder(ConfigCASigningProfilesTls configCaSigningProfilesTls) {
      this.usage = configCaSigningProfilesTls.usage;
      this.expiry = configCaSigningProfilesTls.expiry;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCASigningProfilesTls.
     *
     * @return the new ConfigCASigningProfilesTls instance
     */
    public ConfigCASigningProfilesTls build() {
      return new ConfigCASigningProfilesTls(this);
    }

    /**
     * Adds an usage to usage.
     *
     * @param usage the new usage
     * @return the ConfigCASigningProfilesTls builder
     */
    public Builder addUsage(String usage) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(usage,
        "usage cannot be null");
      if (this.usage == null) {
        this.usage = new ArrayList<String>();
      }
      this.usage.add(usage);
      return this;
    }

    /**
     * Set the usage.
     * Existing usage will be replaced.
     *
     * @param usage the usage
     * @return the ConfigCASigningProfilesTls builder
     */
    public Builder usage(List<String> usage) {
      this.usage = usage;
      return this;
    }

    /**
     * Set the expiry.
     *
     * @param expiry the expiry
     * @return the ConfigCASigningProfilesTls builder
     */
    public Builder expiry(String expiry) {
      this.expiry = expiry;
      return this;
    }
  }

  protected ConfigCASigningProfilesTls(Builder builder) {
    usage = builder.usage;
    expiry = builder.expiry;
  }

  /**
   * New builder.
   *
   * @return a ConfigCASigningProfilesTls builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the usage.
   *
   * @return the usage
   */
  public List<String> usage() {
    return usage;
  }

  /**
   * Gets the expiry.
   *
   * Controls the expiration for signed tls intermediate CA certificates.
   *
   * @return the expiry
   */
  public String expiry() {
    return expiry;
  }
}

