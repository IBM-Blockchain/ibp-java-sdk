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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EditAdminCertsResponseSetAdminCertsItem.
 */
public class EditAdminCertsResponseSetAdminCertsItem extends GenericModel {

  @SerializedName("base_64_pem")
  protected String base64Pem;
  protected String issuer;
  @SerializedName("not_after_ts")
  protected Double notAfterTs;
  @SerializedName("not_before_ts")
  protected Double notBeforeTs;
  @SerializedName("serial_number_hex")
  protected String serialNumberHex;
  @SerializedName("signature_algorithm")
  protected String signatureAlgorithm;
  protected String subject;
  @SerializedName("X509_version")
  protected Double x509Version;
  @SerializedName("time_left")
  protected String timeLeft;

  /**
   * Gets the base64Pem.
   *
   * A certificate as base 64 encoded PEM. Also known as the signing certificate of an organization admin.
   *
   * @return the base64Pem
   */
  public String getBase64Pem() {
    return base64Pem;
  }

  /**
   * Gets the issuer.
   *
   * The issuer string in the certificate.
   *
   * @return the issuer
   */
  public String getIssuer() {
    return issuer;
  }

  /**
   * Gets the notAfterTs.
   *
   * UTC timestamp of the last ms the certificate is valid.
   *
   * @return the notAfterTs
   */
  public Double getNotAfterTs() {
    return notAfterTs;
  }

  /**
   * Gets the notBeforeTs.
   *
   * UTC timestamp of the earliest ms the certificate is valid.
   *
   * @return the notBeforeTs
   */
  public Double getNotBeforeTs() {
    return notBeforeTs;
  }

  /**
   * Gets the serialNumberHex.
   *
   * The "unique" id of the certificates.
   *
   * @return the serialNumberHex
   */
  public String getSerialNumberHex() {
    return serialNumberHex;
  }

  /**
   * Gets the signatureAlgorithm.
   *
   * The crypto algorithm that signed the public key in the certificate.
   *
   * @return the signatureAlgorithm
   */
  public String getSignatureAlgorithm() {
    return signatureAlgorithm;
  }

  /**
   * Gets the subject.
   *
   * The subject string in the certificate.
   *
   * @return the subject
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Gets the x509Version.
   *
   * The X.509 version/format.
   *
   * @return the x509Version
   */
  public Double getX509Version() {
    return x509Version;
  }

  /**
   * Gets the timeLeft.
   *
   * A friendly (human readable) duration until certificate expiration.
   *
   * @return the timeLeft
   */
  public String getTimeLeft() {
    return timeLeft;
  }
}

