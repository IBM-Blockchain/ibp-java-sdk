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
 * ConfigCACors.
 */
public class ConfigCACors extends GenericModel {

  protected Boolean enabled;
  protected List<String> origins;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private List<String> origins;

    private Builder(ConfigCACors configCaCors) {
      this.enabled = configCaCors.enabled;
      this.origins = configCaCors.origins;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param enabled the enabled
     * @param origins the origins
     */
    public Builder(Boolean enabled, List<String> origins) {
      this.enabled = enabled;
      this.origins = origins;
    }

    /**
     * Builds a ConfigCACors.
     *
     * @return the new ConfigCACors instance
     */
    public ConfigCACors build() {
      return new ConfigCACors(this);
    }

    /**
     * Adds an origins to origins.
     *
     * @param origins the new origins
     * @return the ConfigCACors builder
     */
    public Builder addOrigins(String origins) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(origins,
        "origins cannot be null");
      if (this.origins == null) {
        this.origins = new ArrayList<String>();
      }
      this.origins.add(origins);
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the ConfigCACors builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the origins.
     * Existing origins will be replaced.
     *
     * @param origins the origins
     * @return the ConfigCACors builder
     */
    public Builder origins(List<String> origins) {
      this.origins = origins;
      return this;
    }
  }

  protected ConfigCACors(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enabled,
      "enabled cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.origins,
      "origins cannot be null");
    enabled = builder.enabled;
    origins = builder.origins;
  }

  /**
   * New builder.
   *
   * @return a ConfigCACors builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the origins.
   *
   * @return the origins
   */
  public List<String> origins() {
    return origins;
  }
}

