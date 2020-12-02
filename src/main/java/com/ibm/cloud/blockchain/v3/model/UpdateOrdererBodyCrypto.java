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
 * UpdateOrdererBodyCrypto.
 */
public class UpdateOrdererBodyCrypto extends GenericModel {

  protected UpdateEnrollmentCryptoField enrollment;
  protected UpdateMspCryptoField msp;

  /**
   * Builder.
   */
  public static class Builder {
    private UpdateEnrollmentCryptoField enrollment;
    private UpdateMspCryptoField msp;

    private Builder(UpdateOrdererBodyCrypto updateOrdererBodyCrypto) {
      this.enrollment = updateOrdererBodyCrypto.enrollment;
      this.msp = updateOrdererBodyCrypto.msp;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateOrdererBodyCrypto.
     *
     * @return the new UpdateOrdererBodyCrypto instance
     */
    public UpdateOrdererBodyCrypto build() {
      return new UpdateOrdererBodyCrypto(this);
    }

    /**
     * Set the enrollment.
     *
     * @param enrollment the enrollment
     * @return the UpdateOrdererBodyCrypto builder
     */
    public Builder enrollment(UpdateEnrollmentCryptoField enrollment) {
      this.enrollment = enrollment;
      return this;
    }

    /**
     * Set the msp.
     *
     * @param msp the msp
     * @return the UpdateOrdererBodyCrypto builder
     */
    public Builder msp(UpdateMspCryptoField msp) {
      this.msp = msp;
      return this;
    }
  }

  protected UpdateOrdererBodyCrypto(Builder builder) {
    enrollment = builder.enrollment;
    msp = builder.msp;
  }

  /**
   * New builder.
   *
   * @return a UpdateOrdererBodyCrypto builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enrollment.
   *
   * Edit the `enrollment` crypto data of this component. Editing the `enrollment` field is only possible if this
   * component was created using the `crypto.enrollment` field, else see the `crypto.msp` field.
   *
   * @return the enrollment
   */
  public UpdateEnrollmentCryptoField enrollment() {
    return enrollment;
  }

  /**
   * Gets the msp.
   *
   * Edit the `msp` crypto data of this component. Editing the `msp` field is only possible if this component was
   * created using the `crypto.msp` field, else see the `crypto.enrollment` field.
   *
   * @return the msp
   */
  public UpdateMspCryptoField msp() {
    return msp;
  }
}

