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
 * ConfigPeerCreatePeer.
 */
public class ConfigPeerCreatePeer extends GenericModel {

  protected String id;
  protected String networkId;
  protected ConfigPeerKeepalive keepalive;
  protected ConfigPeerGossip gossip;
  protected ConfigPeerAuthentication authentication;
  @SerializedName("BCCSP")
  protected Bccsp bccsp;
  protected ConfigPeerClient client;
  protected ConfigPeerDeliveryclient deliveryclient;
  protected ConfigPeerAdminService adminService;
  protected Double validatorPoolSize;
  protected ConfigPeerDiscovery discovery;
  protected ConfigPeerLimits limits;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String networkId;
    private ConfigPeerKeepalive keepalive;
    private ConfigPeerGossip gossip;
    private ConfigPeerAuthentication authentication;
    private Bccsp bccsp;
    private ConfigPeerClient client;
    private ConfigPeerDeliveryclient deliveryclient;
    private ConfigPeerAdminService adminService;
    private Double validatorPoolSize;
    private ConfigPeerDiscovery discovery;
    private ConfigPeerLimits limits;

    private Builder(ConfigPeerCreatePeer configPeerCreatePeer) {
      this.id = configPeerCreatePeer.id;
      this.networkId = configPeerCreatePeer.networkId;
      this.keepalive = configPeerCreatePeer.keepalive;
      this.gossip = configPeerCreatePeer.gossip;
      this.authentication = configPeerCreatePeer.authentication;
      this.bccsp = configPeerCreatePeer.bccsp;
      this.client = configPeerCreatePeer.client;
      this.deliveryclient = configPeerCreatePeer.deliveryclient;
      this.adminService = configPeerCreatePeer.adminService;
      this.validatorPoolSize = configPeerCreatePeer.validatorPoolSize;
      this.discovery = configPeerCreatePeer.discovery;
      this.limits = configPeerCreatePeer.limits;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerCreatePeer.
     *
     * @return the new ConfigPeerCreatePeer instance
     */
    public ConfigPeerCreatePeer build() {
      return new ConfigPeerCreatePeer(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the networkId.
     *
     * @param networkId the networkId
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder networkId(String networkId) {
      this.networkId = networkId;
      return this;
    }

    /**
     * Set the keepalive.
     *
     * @param keepalive the keepalive
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder keepalive(ConfigPeerKeepalive keepalive) {
      this.keepalive = keepalive;
      return this;
    }

    /**
     * Set the gossip.
     *
     * @param gossip the gossip
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder gossip(ConfigPeerGossip gossip) {
      this.gossip = gossip;
      return this;
    }

    /**
     * Set the authentication.
     *
     * @param authentication the authentication
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder authentication(ConfigPeerAuthentication authentication) {
      this.authentication = authentication;
      return this;
    }

    /**
     * Set the bccsp.
     *
     * @param bccsp the bccsp
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder bccsp(Bccsp bccsp) {
      this.bccsp = bccsp;
      return this;
    }

    /**
     * Set the client.
     *
     * @param client the client
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder client(ConfigPeerClient client) {
      this.client = client;
      return this;
    }

    /**
     * Set the deliveryclient.
     *
     * @param deliveryclient the deliveryclient
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder deliveryclient(ConfigPeerDeliveryclient deliveryclient) {
      this.deliveryclient = deliveryclient;
      return this;
    }

    /**
     * Set the adminService.
     *
     * @param adminService the adminService
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder adminService(ConfigPeerAdminService adminService) {
      this.adminService = adminService;
      return this;
    }

    /**
     * Set the validatorPoolSize.
     *
     * @param validatorPoolSize the validatorPoolSize
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder validatorPoolSize(Double validatorPoolSize) {
      this.validatorPoolSize = validatorPoolSize;
      return this;
    }

    /**
     * Set the discovery.
     *
     * @param discovery the discovery
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder discovery(ConfigPeerDiscovery discovery) {
      this.discovery = discovery;
      return this;
    }

    /**
     * Set the limits.
     *
     * @param limits the limits
     * @return the ConfigPeerCreatePeer builder
     */
    public Builder limits(ConfigPeerLimits limits) {
      this.limits = limits;
      return this;
    }
  }

  protected ConfigPeerCreatePeer(Builder builder) {
    id = builder.id;
    networkId = builder.networkId;
    keepalive = builder.keepalive;
    gossip = builder.gossip;
    authentication = builder.authentication;
    bccsp = builder.bccsp;
    client = builder.client;
    deliveryclient = builder.deliveryclient;
    adminService = builder.adminService;
    validatorPoolSize = builder.validatorPoolSize;
    discovery = builder.discovery;
    limits = builder.limits;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerCreatePeer builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * A unique id used to identify this instance.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the networkId.
   *
   * The ID to logically separate one network from another.
   *
   * @return the networkId
   */
  public String networkId() {
    return networkId;
  }

  /**
   * Gets the keepalive.
   *
   * Keep alive settings between the peer server and clients.
   *
   * @return the keepalive
   */
  public ConfigPeerKeepalive keepalive() {
    return keepalive;
  }

  /**
   * Gets the gossip.
   *
   * @return the gossip
   */
  public ConfigPeerGossip gossip() {
    return gossip;
  }

  /**
   * Gets the authentication.
   *
   * @return the authentication
   */
  public ConfigPeerAuthentication authentication() {
    return authentication;
  }

  /**
   * Gets the bccsp.
   *
   * Configures the Blockchain Crypto Service Providers (bccsp).
   *
   * @return the bccsp
   */
  public Bccsp bccsp() {
    return bccsp;
  }

  /**
   * Gets the client.
   *
   * @return the client
   */
  public ConfigPeerClient client() {
    return client;
  }

  /**
   * Gets the deliveryclient.
   *
   * @return the deliveryclient
   */
  public ConfigPeerDeliveryclient deliveryclient() {
    return deliveryclient;
  }

  /**
   * Gets the adminService.
   *
   * Used for administrative operations such as control over logger levels. Only peer administrators can use the
   * service.
   *
   * @return the adminService
   */
  public ConfigPeerAdminService adminService() {
    return adminService;
  }

  /**
   * Gets the validatorPoolSize.
   *
   * Number of go-routines that will execute transaction validation in parallel. By default, the peer chooses the number
   * of CPUs on the machine. It is recommended to use the default values and not set this field.
   *
   * @return the validatorPoolSize
   */
  public Double validatorPoolSize() {
    return validatorPoolSize;
  }

  /**
   * Gets the discovery.
   *
   * The discovery service is used by clients to query information about peers. Such as - which peers have joined a
   * channel, what is the latest channel config, and what possible sets of peers satisfy the endorsement policy (given a
   * smart contract and a channel).
   *
   * @return the discovery
   */
  public ConfigPeerDiscovery discovery() {
    return discovery;
  }

  /**
   * Gets the limits.
   *
   * @return the limits
   */
  public ConfigPeerLimits limits() {
    return limits;
  }
}

