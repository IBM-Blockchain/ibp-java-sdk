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
 * IdentityAttrs.
 */
public class IdentityAttrs extends GenericModel {

  @SerializedName("hf.Registrar.Roles")
  protected String hfRegistrarRoles;
  @SerializedName("hf.Registrar.DelegateRoles")
  protected String hfRegistrarDelegateRoles;
  @SerializedName("hf.Revoker")
  protected Boolean hfRevoker;
  @SerializedName("hf.IntermediateCA")
  protected Boolean hfIntermediateCa;
  @SerializedName("hf.GenCRL")
  protected Boolean hfGenCrl;
  @SerializedName("hf.Registrar.Attributes")
  protected String hfRegistrarAttributes;
  @SerializedName("hf.AffiliationMgr")
  protected Boolean hfAffiliationMgr;

  /**
   * Builder.
   */
  public static class Builder {
    private String hfRegistrarRoles;
    private String hfRegistrarDelegateRoles;
    private Boolean hfRevoker;
    private Boolean hfIntermediateCa;
    private Boolean hfGenCrl;
    private String hfRegistrarAttributes;
    private Boolean hfAffiliationMgr;

    private Builder(IdentityAttrs identityAttrs) {
      this.hfRegistrarRoles = identityAttrs.hfRegistrarRoles;
      this.hfRegistrarDelegateRoles = identityAttrs.hfRegistrarDelegateRoles;
      this.hfRevoker = identityAttrs.hfRevoker;
      this.hfIntermediateCa = identityAttrs.hfIntermediateCa;
      this.hfGenCrl = identityAttrs.hfGenCrl;
      this.hfRegistrarAttributes = identityAttrs.hfRegistrarAttributes;
      this.hfAffiliationMgr = identityAttrs.hfAffiliationMgr;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IdentityAttrs.
     *
     * @return the new IdentityAttrs instance
     */
    public IdentityAttrs build() {
      return new IdentityAttrs(this);
    }

    /**
     * Set the hfRegistrarRoles.
     *
     * @param hfRegistrarRoles the hfRegistrarRoles
     * @return the IdentityAttrs builder
     */
    public Builder hfRegistrarRoles(String hfRegistrarRoles) {
      this.hfRegistrarRoles = hfRegistrarRoles;
      return this;
    }

    /**
     * Set the hfRegistrarDelegateRoles.
     *
     * @param hfRegistrarDelegateRoles the hfRegistrarDelegateRoles
     * @return the IdentityAttrs builder
     */
    public Builder hfRegistrarDelegateRoles(String hfRegistrarDelegateRoles) {
      this.hfRegistrarDelegateRoles = hfRegistrarDelegateRoles;
      return this;
    }

    /**
     * Set the hfRevoker.
     *
     * @param hfRevoker the hfRevoker
     * @return the IdentityAttrs builder
     */
    public Builder hfRevoker(Boolean hfRevoker) {
      this.hfRevoker = hfRevoker;
      return this;
    }

    /**
     * Set the hfIntermediateCa.
     *
     * @param hfIntermediateCa the hfIntermediateCa
     * @return the IdentityAttrs builder
     */
    public Builder hfIntermediateCa(Boolean hfIntermediateCa) {
      this.hfIntermediateCa = hfIntermediateCa;
      return this;
    }

    /**
     * Set the hfGenCrl.
     *
     * @param hfGenCrl the hfGenCrl
     * @return the IdentityAttrs builder
     */
    public Builder hfGenCrl(Boolean hfGenCrl) {
      this.hfGenCrl = hfGenCrl;
      return this;
    }

    /**
     * Set the hfRegistrarAttributes.
     *
     * @param hfRegistrarAttributes the hfRegistrarAttributes
     * @return the IdentityAttrs builder
     */
    public Builder hfRegistrarAttributes(String hfRegistrarAttributes) {
      this.hfRegistrarAttributes = hfRegistrarAttributes;
      return this;
    }

    /**
     * Set the hfAffiliationMgr.
     *
     * @param hfAffiliationMgr the hfAffiliationMgr
     * @return the IdentityAttrs builder
     */
    public Builder hfAffiliationMgr(Boolean hfAffiliationMgr) {
      this.hfAffiliationMgr = hfAffiliationMgr;
      return this;
    }
  }

  protected IdentityAttrs(Builder builder) {
    hfRegistrarRoles = builder.hfRegistrarRoles;
    hfRegistrarDelegateRoles = builder.hfRegistrarDelegateRoles;
    hfRevoker = builder.hfRevoker;
    hfIntermediateCa = builder.hfIntermediateCa;
    hfGenCrl = builder.hfGenCrl;
    hfRegistrarAttributes = builder.hfRegistrarAttributes;
    hfAffiliationMgr = builder.hfAffiliationMgr;
  }

  /**
   * New builder.
   *
   * @return a IdentityAttrs builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the hfRegistrarRoles.
   *
   * @return the hfRegistrarRoles
   */
  public String hfRegistrarRoles() {
    return hfRegistrarRoles;
  }

  /**
   * Gets the hfRegistrarDelegateRoles.
   *
   * @return the hfRegistrarDelegateRoles
   */
  public String hfRegistrarDelegateRoles() {
    return hfRegistrarDelegateRoles;
  }

  /**
   * Gets the hfRevoker.
   *
   * @return the hfRevoker
   */
  public Boolean hfRevoker() {
    return hfRevoker;
  }

  /**
   * Gets the hfIntermediateCa.
   *
   * @return the hfIntermediateCa
   */
  public Boolean hfIntermediateCa() {
    return hfIntermediateCa;
  }

  /**
   * Gets the hfGenCrl.
   *
   * @return the hfGenCrl
   */
  public Boolean hfGenCrl() {
    return hfGenCrl;
  }

  /**
   * Gets the hfRegistrarAttributes.
   *
   * @return the hfRegistrarAttributes
   */
  public String hfRegistrarAttributes() {
    return hfRegistrarAttributes;
  }

  /**
   * Gets the hfAffiliationMgr.
   *
   * @return the hfAffiliationMgr
   */
  public Boolean hfAffiliationMgr() {
    return hfAffiliationMgr;
  }
}

