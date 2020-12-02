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
 * ConfigCARegistry.
 */
public class ConfigCARegistry extends GenericModel {

  protected Double maxenrollments;
  protected List<ConfigCARegistryIdentitiesItem> identities;

  /**
   * Builder.
   */
  public static class Builder {
    private Double maxenrollments;
    private List<ConfigCARegistryIdentitiesItem> identities;

    private Builder(ConfigCARegistry configCaRegistry) {
      this.maxenrollments = configCaRegistry.maxenrollments;
      this.identities = configCaRegistry.identities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param maxenrollments the maxenrollments
     * @param identities the identities
     */
    public Builder(Double maxenrollments, List<ConfigCARegistryIdentitiesItem> identities) {
      this.maxenrollments = maxenrollments;
      this.identities = identities;
    }

    /**
     * Builds a ConfigCARegistry.
     *
     * @return the new ConfigCARegistry instance
     */
    public ConfigCARegistry build() {
      return new ConfigCARegistry(this);
    }

    /**
     * Adds an identities to identities.
     *
     * @param identities the new identities
     * @return the ConfigCARegistry builder
     */
    public Builder addIdentities(ConfigCARegistryIdentitiesItem identities) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(identities,
        "identities cannot be null");
      if (this.identities == null) {
        this.identities = new ArrayList<ConfigCARegistryIdentitiesItem>();
      }
      this.identities.add(identities);
      return this;
    }

    /**
     * Set the maxenrollments.
     *
     * @param maxenrollments the maxenrollments
     * @return the ConfigCARegistry builder
     */
    public Builder maxenrollments(Double maxenrollments) {
      this.maxenrollments = maxenrollments;
      return this;
    }

    /**
     * Set the identities.
     * Existing identities will be replaced.
     *
     * @param identities the identities
     * @return the ConfigCARegistry builder
     */
    public Builder identities(List<ConfigCARegistryIdentitiesItem> identities) {
      this.identities = identities;
      return this;
    }
  }

  protected ConfigCARegistry(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.maxenrollments,
      "maxenrollments cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.identities,
      "identities cannot be null");
    maxenrollments = builder.maxenrollments;
    identities = builder.identities;
  }

  /**
   * New builder.
   *
   * @return a ConfigCARegistry builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the maxenrollments.
   *
   * Default maximum number of enrollments per id. Set -1 for infinite.
   *
   * @return the maxenrollments
   */
  public Double maxenrollments() {
    return maxenrollments;
  }

  /**
   * Gets the identities.
   *
   * @return the identities
   */
  public List<ConfigCARegistryIdentitiesItem> identities() {
    return identities;
  }
}

