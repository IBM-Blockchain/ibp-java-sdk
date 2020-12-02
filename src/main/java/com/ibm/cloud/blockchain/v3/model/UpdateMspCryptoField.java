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
 * Edit the `msp` crypto data of this component. Editing the `msp` field is only possible if this component was created
 * using the `crypto.msp` field, else see the `crypto.enrollment` field.
 */
public class UpdateMspCryptoField extends GenericModel {

  protected UpdateMspCryptoFieldCa ca;
  protected UpdateMspCryptoFieldTlsca tlsca;
  protected UpdateMspCryptoFieldComponent component;

  /**
   * Builder.
   */
  public static class Builder {
    private UpdateMspCryptoFieldCa ca;
    private UpdateMspCryptoFieldTlsca tlsca;
    private UpdateMspCryptoFieldComponent component;

    private Builder(UpdateMspCryptoField updateMspCryptoField) {
      this.ca = updateMspCryptoField.ca;
      this.tlsca = updateMspCryptoField.tlsca;
      this.component = updateMspCryptoField.component;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateMspCryptoField.
     *
     * @return the new UpdateMspCryptoField instance
     */
    public UpdateMspCryptoField build() {
      return new UpdateMspCryptoField(this);
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the UpdateMspCryptoField builder
     */
    public Builder ca(UpdateMspCryptoFieldCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the UpdateMspCryptoField builder
     */
    public Builder tlsca(UpdateMspCryptoFieldTlsca tlsca) {
      this.tlsca = tlsca;
      return this;
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the UpdateMspCryptoField builder
     */
    public Builder component(UpdateMspCryptoFieldComponent component) {
      this.component = component;
      return this;
    }
  }

  protected UpdateMspCryptoField(Builder builder) {
    ca = builder.ca;
    tlsca = builder.tlsca;
    component = builder.component;
  }

  /**
   * New builder.
   *
   * @return a UpdateMspCryptoField builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public UpdateMspCryptoFieldCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public UpdateMspCryptoFieldTlsca tlsca() {
    return tlsca;
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public UpdateMspCryptoFieldComponent component() {
    return component;
  }
}

