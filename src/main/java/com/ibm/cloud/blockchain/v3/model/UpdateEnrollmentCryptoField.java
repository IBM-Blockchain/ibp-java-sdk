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
 * Edit the `enrollment` crypto data of this component. Editing the `enrollment` field is only possible if this
 * component was created using the `crypto.enrollment` field, else see the `crypto.msp` field.
 */
public class UpdateEnrollmentCryptoField extends GenericModel {

  protected CryptoEnrollmentComponent component;
  protected UpdateEnrollmentCryptoFieldCa ca;
  protected UpdateEnrollmentCryptoFieldTlsca tlsca;

  /**
   * Builder.
   */
  public static class Builder {
    private CryptoEnrollmentComponent component;
    private UpdateEnrollmentCryptoFieldCa ca;
    private UpdateEnrollmentCryptoFieldTlsca tlsca;

    private Builder(UpdateEnrollmentCryptoField updateEnrollmentCryptoField) {
      this.component = updateEnrollmentCryptoField.component;
      this.ca = updateEnrollmentCryptoField.ca;
      this.tlsca = updateEnrollmentCryptoField.tlsca;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateEnrollmentCryptoField.
     *
     * @return the new UpdateEnrollmentCryptoField instance
     */
    public UpdateEnrollmentCryptoField build() {
      return new UpdateEnrollmentCryptoField(this);
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the UpdateEnrollmentCryptoField builder
     */
    public Builder component(CryptoEnrollmentComponent component) {
      this.component = component;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the UpdateEnrollmentCryptoField builder
     */
    public Builder ca(UpdateEnrollmentCryptoFieldCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the UpdateEnrollmentCryptoField builder
     */
    public Builder tlsca(UpdateEnrollmentCryptoFieldTlsca tlsca) {
      this.tlsca = tlsca;
      return this;
    }
  }

  protected UpdateEnrollmentCryptoField(Builder builder) {
    component = builder.component;
    ca = builder.ca;
    tlsca = builder.tlsca;
  }

  /**
   * New builder.
   *
   * @return a UpdateEnrollmentCryptoField builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public CryptoEnrollmentComponent component() {
    return component;
  }

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public UpdateEnrollmentCryptoFieldCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public UpdateEnrollmentCryptoFieldTlsca tlsca() {
    return tlsca;
  }
}

