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
 * See this [topic](/docs/blockchain?topic=blockchain-ibp-v2-apis#ibp-v2-apis-config) for instructions on how to build a
 * crypto object.
 */
public class CryptoObject extends GenericModel {

  protected CryptoObjectEnrollment enrollment;
  protected CryptoObjectMsp msp;

  /**
   * Builder.
   */
  public static class Builder {
    private CryptoObjectEnrollment enrollment;
    private CryptoObjectMsp msp;

    private Builder(CryptoObject cryptoObject) {
      this.enrollment = cryptoObject.enrollment;
      this.msp = cryptoObject.msp;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CryptoObject.
     *
     * @return the new CryptoObject instance
     */
    public CryptoObject build() {
      return new CryptoObject(this);
    }

    /**
     * Set the enrollment.
     *
     * @param enrollment the enrollment
     * @return the CryptoObject builder
     */
    public Builder enrollment(CryptoObjectEnrollment enrollment) {
      this.enrollment = enrollment;
      return this;
    }

    /**
     * Set the msp.
     *
     * @param msp the msp
     * @return the CryptoObject builder
     */
    public Builder msp(CryptoObjectMsp msp) {
      this.msp = msp;
      return this;
    }
  }

  protected CryptoObject(Builder builder) {
    enrollment = builder.enrollment;
    msp = builder.msp;
  }

  /**
   * New builder.
   *
   * @return a CryptoObject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enrollment.
   *
   * This `enrollment` field contains data that allows a component to enroll an identity for itself. Use `enrollment` or
   * `msp`, not both.
   *
   * @return the enrollment
   */
  public CryptoObjectEnrollment enrollment() {
    return enrollment;
  }

  /**
   * Gets the msp.
   *
   * The `msp` field contains data to allow a component to configure its MSP with an already enrolled identity. Use
   * `msp` or `enrollment`, not both.
   *
   * @return the msp
   */
  public CryptoObjectMsp msp() {
    return msp;
  }
}

