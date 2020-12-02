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
 * Set `config_override` to create the root/initial enroll id and enroll secret as well as enabling custom CA
 * configurations (such as using postgres). See the [Fabric CA configuration
 * file](https://hyperledger-fabric-ca.readthedocs.io/en/release-1.4/serverconfig.html) for more information about each
 * parameter.
 *
 * The field `tlsca` is optional. The IBP console will copy the value of `config_override.ca` into
 * `config_override.tlsca` if `config_override.tlsca` is omitted (which is recommended).
 *
 * *The field **names** below are not case-sensitive.*.
 */
public class CreateCaBodyConfigOverride extends GenericModel {

  protected ConfigCACreate ca;
  protected ConfigCACreate tlsca;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigCACreate ca;
    private ConfigCACreate tlsca;

    private Builder(CreateCaBodyConfigOverride createCaBodyConfigOverride) {
      this.ca = createCaBodyConfigOverride.ca;
      this.tlsca = createCaBodyConfigOverride.tlsca;
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
    public Builder(ConfigCACreate ca) {
      this.ca = ca;
    }

    /**
     * Builds a CreateCaBodyConfigOverride.
     *
     * @return the new CreateCaBodyConfigOverride instance
     */
    public CreateCaBodyConfigOverride build() {
      return new CreateCaBodyConfigOverride(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the CreateCaBodyConfigOverride builder
     */
    public Builder ca(ConfigCACreate ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the CreateCaBodyConfigOverride builder
     */
    public Builder tlsca(ConfigCACreate tlsca) {
      this.tlsca = tlsca;
      return this;
    }
  }

  protected CreateCaBodyConfigOverride(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    ca = builder.ca;
    tlsca = builder.tlsca;
  }

  /**
   * New builder.
   *
   * @return a CreateCaBodyConfigOverride builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public ConfigCACreate ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public ConfigCACreate tlsca() {
    return tlsca;
  }
}

