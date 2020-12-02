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
 * Update the [Fabric CA configuration
 * file](https://hyperledger-fabric-ca.readthedocs.io/en/release-1.4/serverconfig.html) if you want use custom
 * attributes to configure advanced CA features. Omit if not.
 *
 * *The field **names** below are not case-sensitive.*.
 */
public class UpdateCaBodyConfigOverride extends GenericModel {

  protected ConfigCAUpdate ca;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCAUpdate ca;

    private Builder(UpdateCaBodyConfigOverride updateCaBodyConfigOverride) {
      this.ca = updateCaBodyConfigOverride.ca;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ca the ca
     */
    public Builder(ConfigCAUpdate ca) {
      this.ca = ca;
    }

    /**
     * Builds a UpdateCaBodyConfigOverride.
     *
     * @return the new UpdateCaBodyConfigOverride instance
     */
    public UpdateCaBodyConfigOverride build() {
      return new UpdateCaBodyConfigOverride(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the UpdateCaBodyConfigOverride builder
     */
    public Builder ca(ConfigCAUpdate ca) {
      this.ca = ca;
      return this;
    }
  }

  protected UpdateCaBodyConfigOverride(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    ca = builder.ca;
  }

  /**
   * New builder.
   *
   * @return a UpdateCaBodyConfigOverride builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public ConfigCAUpdate ca() {
    return ca;
  }
}

