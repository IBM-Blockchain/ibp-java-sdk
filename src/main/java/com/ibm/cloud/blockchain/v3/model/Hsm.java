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
 * The connection details of the HSM (Hardware Security Module).
 */
public class Hsm extends GenericModel {

  protected String pkcs11endpoint;

  /**
   * Builder.
   */
  public static class Builder {
    private String pkcs11endpoint;

    private Builder(Hsm hsm) {
      this.pkcs11endpoint = hsm.pkcs11endpoint;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pkcs11endpoint the pkcs11endpoint
     */
    public Builder(String pkcs11endpoint) {
      this.pkcs11endpoint = pkcs11endpoint;
    }

    /**
     * Builds a Hsm.
     *
     * @return the new Hsm instance
     */
    public Hsm build() {
      return new Hsm(this);
    }

    /**
     * Set the pkcs11endpoint.
     *
     * @param pkcs11endpoint the pkcs11endpoint
     * @return the Hsm builder
     */
    public Builder pkcs11endpoint(String pkcs11endpoint) {
      this.pkcs11endpoint = pkcs11endpoint;
      return this;
    }
  }

  protected Hsm(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pkcs11endpoint,
      "pkcs11endpoint cannot be null");
    pkcs11endpoint = builder.pkcs11endpoint;
  }

  /**
   * New builder.
   *
   * @return a Hsm builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pkcs11endpoint.
   *
   * The url to the HSM. Include the protocol, hostname, and port.
   *
   * @return the pkcs11endpoint
   */
  public String pkcs11endpoint() {
    return pkcs11endpoint;
  }
}

