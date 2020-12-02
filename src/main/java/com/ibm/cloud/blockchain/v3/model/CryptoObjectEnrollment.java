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
 * This `enrollment` field contains data that allows a component to enroll an identity for itself. Use `enrollment` or
 * `msp`, not both.
 */
public class CryptoObjectEnrollment extends GenericModel {

  protected CryptoEnrollmentComponent component;
  protected CryptoObjectEnrollmentCa ca;
  protected CryptoObjectEnrollmentTlsca tlsca;

  /**
   * Builder.
   */
  public static class Builder {
    private CryptoEnrollmentComponent component;
    private CryptoObjectEnrollmentCa ca;
    private CryptoObjectEnrollmentTlsca tlsca;

    private Builder(CryptoObjectEnrollment cryptoObjectEnrollment) {
      this.component = cryptoObjectEnrollment.component;
      this.ca = cryptoObjectEnrollment.ca;
      this.tlsca = cryptoObjectEnrollment.tlsca;
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
    public Builder(CryptoEnrollmentComponent component, CryptoObjectEnrollmentCa ca, CryptoObjectEnrollmentTlsca tlsca) {
      this.component = component;
      this.ca = ca;
      this.tlsca = tlsca;
    }

    /**
     * Builds a CryptoObjectEnrollment.
     *
     * @return the new CryptoObjectEnrollment instance
     */
    public CryptoObjectEnrollment build() {
      return new CryptoObjectEnrollment(this);
    }

    /**
     * Set the component.
     *
     * @param component the component
     * @return the CryptoObjectEnrollment builder
     */
    public Builder component(CryptoEnrollmentComponent component) {
      this.component = component;
      return this;
    }

    /**
     * Set the ca.
     *
     * @param ca the ca
     * @return the CryptoObjectEnrollment builder
     */
    public Builder ca(CryptoObjectEnrollmentCa ca) {
      this.ca = ca;
      return this;
    }

    /**
     * Set the tlsca.
     *
     * @param tlsca the tlsca
     * @return the CryptoObjectEnrollment builder
     */
    public Builder tlsca(CryptoObjectEnrollmentTlsca tlsca) {
      this.tlsca = tlsca;
      return this;
    }
  }

  protected CryptoObjectEnrollment(Builder builder) {
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
   * @return a CryptoObjectEnrollment builder
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
  public CryptoObjectEnrollmentCa ca() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public CryptoObjectEnrollmentTlsca tlsca() {
    return tlsca;
  }
}

