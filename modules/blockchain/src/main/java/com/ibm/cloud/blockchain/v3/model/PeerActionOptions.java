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
 * The peerAction options.
 */
public class PeerActionOptions extends GenericModel {

  protected String id;
  protected Boolean restart;
  protected ActionReenroll reenroll;
  protected ActionEnroll enroll;
  protected Boolean upgradeDbs;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean restart;
    private ActionReenroll reenroll;
    private ActionEnroll enroll;
    private Boolean upgradeDbs;

    private Builder(PeerActionOptions peerActionOptions) {
      this.id = peerActionOptions.id;
      this.restart = peerActionOptions.restart;
      this.reenroll = peerActionOptions.reenroll;
      this.enroll = peerActionOptions.enroll;
      this.upgradeDbs = peerActionOptions.upgradeDbs;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a PeerActionOptions.
     *
     * @return the new PeerActionOptions instance
     */
    public PeerActionOptions build() {
      return new PeerActionOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PeerActionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the restart.
     *
     * @param restart the restart
     * @return the PeerActionOptions builder
     */
    public Builder restart(Boolean restart) {
      this.restart = restart;
      return this;
    }

    /**
     * Set the reenroll.
     *
     * @param reenroll the reenroll
     * @return the PeerActionOptions builder
     */
    public Builder reenroll(ActionReenroll reenroll) {
      this.reenroll = reenroll;
      return this;
    }

    /**
     * Set the enroll.
     *
     * @param enroll the enroll
     * @return the PeerActionOptions builder
     */
    public Builder enroll(ActionEnroll enroll) {
      this.enroll = enroll;
      return this;
    }

    /**
     * Set the upgradeDbs.
     *
     * @param upgradeDbs the upgradeDbs
     * @return the PeerActionOptions builder
     */
    public Builder upgradeDbs(Boolean upgradeDbs) {
      this.upgradeDbs = upgradeDbs;
      return this;
    }
  }

  protected PeerActionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    restart = builder.restart;
    reenroll = builder.reenroll;
    enroll = builder.enroll;
    upgradeDbs = builder.upgradeDbs;
  }

  /**
   * New builder.
   *
   * @return a PeerActionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The `id` of the component to modify. Use the [Get all components](#list_components) API to determine the component
   * id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the restart.
   *
   * Set to `true` to restart the component.
   *
   * @return the restart
   */
  public Boolean restart() {
    return restart;
  }

  /**
   * Gets the reenroll.
   *
   * @return the reenroll
   */
  public ActionReenroll reenroll() {
    return reenroll;
  }

  /**
   * Gets the enroll.
   *
   * @return the enroll
   */
  public ActionEnroll enroll() {
    return enroll;
  }

  /**
   * Gets the upgradeDbs.
   *
   * Set to `true` to start the peer's db migration.
   *
   * @return the upgradeDbs
   */
  public Boolean upgradeDbs() {
    return upgradeDbs;
  }
}

