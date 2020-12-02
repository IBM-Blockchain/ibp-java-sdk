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
 * The `msp` field contains data to allow a component to configure its MSP with an already enrolled identity. Use `msp`
 * or `enrollment`, not both.
 */
public class CryptoObjectMsp extends GenericModel {

  protected MspCryptoComp component;
  protected MspCryptoCa ca;
  protected MspCryptoCa tlsca;

  /**
   * Builder.
   */
  public static class Builder {
    private MspCryptoComp component;
    private MspCryptoCa ca;
    private MspCryptoCa tlsca;

    private Builder(CryptoObjectMsp cryptoObjectMsp) {
      this.component = cryptoObjectMsp.component;
      this.ca = cryptoObjectMsp.ca;
      this.tlsca = cryptoObjectMsp.tlsca;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param component the component
     * @param ca the ca
     * @param tlsca the tlsca
     */
    public Builder(MspCryptoComp component, MspCryptoCa ca, MspCryptoCa tlsca) {
      this.component = component;
      this.ca = ca;
      this.tlsca = tlsca;
    }

    /**
     * Builds a CryptoObjectMsp.
     *
     * @return the new CryptoObjectMsp instance
     */
    public CryptoObjectMsp build() {
      return new CryptoObjectMsp(this);
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the CryptoObjectMsp builder
     */
    public Builder component(MspCryptoComp component) {
      this.component = component;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the CryptoObjectMsp builder
     */
    public Builder ca(MspCryptoCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the CryptoObjectMsp builder
     */
    public Builder tlsca(MspCryptoCa tlsca) {
      this.tlsca = tlsca;
      return this;
    }
  }

  protected CryptoObjectMsp(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.component,
      "component cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ca,
      "ca cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsca,
      "tlsca cannot be null");
    component = builder.component;
    ca = builder.ca;
    tlsca = builder.tlsca;
  }

  /**
   * New builder.
   *
   * @return a CryptoObjectMsp builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public MspCryptoComp component() {
    return component;
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public MspCryptoCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public MspCryptoCa tlsca() {
    return tlsca;
  }
}

