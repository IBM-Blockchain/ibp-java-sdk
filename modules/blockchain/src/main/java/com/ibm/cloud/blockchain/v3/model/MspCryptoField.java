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
 * The msp crypto data.
 */
public class MspCryptoField extends GenericModel {

  protected MspCryptoFieldCa ca;
  protected MspCryptoFieldTlsca tlsca;
  protected MspCryptoFieldComponent component;

  /**
   * Builder.
   */
  public static class Builder {
    private MspCryptoFieldCa ca;
    private MspCryptoFieldTlsca tlsca;
    private MspCryptoFieldComponent component;

    private Builder(MspCryptoField mspCryptoField) {
      this.ca = mspCryptoField.ca;
      this.tlsca = mspCryptoField.tlsca;
      this.component = mspCryptoField.component;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param tlsca the tlsca
     * @param component the component
     */
    public Builder(MspCryptoFieldTlsca tlsca, MspCryptoFieldComponent component) {
      this.tlsca = tlsca;
      this.component = component;
    }

    /**
     * Builds a MspCryptoField.
     *
     * @return the new MspCryptoField instance
     */
    public MspCryptoField build() {
      return new MspCryptoField(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the MspCryptoField builder
     */
    public Builder ca(MspCryptoFieldCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the MspCryptoField builder
     */
    public Builder tlsca(MspCryptoFieldTlsca tlsca) {
      this.tlsca = tlsca;
      return this;
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the MspCryptoField builder
     */
    public Builder component(MspCryptoFieldComponent component) {
      this.component = component;
      return this;
    }
  }

  protected MspCryptoField(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tlsca,
      "tlsca cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.component,
      "component cannot be null");
    ca = builder.ca;
    tlsca = builder.tlsca;
    component = builder.component;
  }

  /**
   * New builder.
   *
   * @return a MspCryptoField builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public MspCryptoFieldCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public MspCryptoFieldTlsca tlsca() {
    return tlsca;
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public MspCryptoFieldComponent component() {
    return component;
  }
}

