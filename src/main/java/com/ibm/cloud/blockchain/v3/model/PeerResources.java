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
 * CPU and memory properties. This feature is not available if using a free Kubernetes cluster.
 */
public class PeerResources extends GenericModel {

  protected ResourceObjectFabV2 chaincodelauncher;
  protected ResourceObjectCouchDb couchdb;
  protected ResourceObject statedb;
  protected ResourceObjectFabV1 dind;
  protected ResourceObjectFabV1 fluentd;
  protected ResourceObject peer;
  protected ResourceObject proxy;

  /**
   * Builder.
   */
  public static class Builder {
    private ResourceObjectFabV2 chaincodelauncher;
    private ResourceObjectCouchDb couchdb;
    private ResourceObject statedb;
    private ResourceObjectFabV1 dind;
    private ResourceObjectFabV1 fluentd;
    private ResourceObject peer;
    private ResourceObject proxy;

    private Builder(PeerResources peerResources) {
      this.chaincodelauncher = peerResources.chaincodelauncher;
      this.couchdb = peerResources.couchdb;
      this.statedb = peerResources.statedb;
      this.dind = peerResources.dind;
      this.fluentd = peerResources.fluentd;
      this.peer = peerResources.peer;
      this.proxy = peerResources.proxy;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PeerResources.
     *
     * @return the new PeerResources instance
     */
    public PeerResources build() {
      return new PeerResources(this);
    }

    /**
     * Set the chaincodelauncher.
     *
     * @param chaincodelauncher the chaincodelauncher
     * @return the PeerResources builder
     */
    public Builder chaincodelauncher(ResourceObjectFabV2 chaincodelauncher) {
      this.chaincodelauncher = chaincodelauncher;
      return this;
    }

    /**
     * Set the couchdb.
     *
     * @param couchdb the couchdb
     * @return the PeerResources builder
     */
    public Builder couchdb(ResourceObjectCouchDb couchdb) {
      this.couchdb = couchdb;
      return this;
    }

    /**
     * Set the statedb.
     *
     * @param statedb the statedb
     * @return the PeerResources builder
     */
    public Builder statedb(ResourceObject statedb) {
      this.statedb = statedb;
      return this;
    }

    /**
     * Set the dind.
     *
     * @param dind the dind
     * @return the PeerResources builder
     */
    public Builder dind(ResourceObjectFabV1 dind) {
      this.dind = dind;
      return this;
    }

    /**
     * Set the fluentd.
     *
     * @param fluentd the fluentd
     * @return the PeerResources builder
     */
    public Builder fluentd(ResourceObjectFabV1 fluentd) {
      this.fluentd = fluentd;
      return this;
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the PeerResources builder
     */
    public Builder peer(ResourceObject peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the proxy.
     *
     * @param proxy the proxy
     * @return the PeerResources builder
     */
    public Builder proxy(ResourceObject proxy) {
      this.proxy = proxy;
      return this;
    }
  }

  protected PeerResources(Builder builder) {
    chaincodelauncher = builder.chaincodelauncher;
    couchdb = builder.couchdb;
    statedb = builder.statedb;
    dind = builder.dind;
    fluentd = builder.fluentd;
    peer = builder.peer;
    proxy = builder.proxy;
  }

  /**
   * New builder.
   *
   * @return a PeerResources builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the chaincodelauncher.
   *
   * This field requires the use of Fabric v2.1.* and higher.
   *
   * @return the chaincodelauncher
   */
  public ResourceObjectFabV2 chaincodelauncher() {
    return chaincodelauncher;
  }

  /**
   * Gets the couchdb.
   *
   * *Legacy field name* Use the field `statedb` instead. This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the couchdb
   */
  public ResourceObjectCouchDb couchdb() {
    return couchdb;
  }

  /**
   * Gets the statedb.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the statedb
   */
  public ResourceObject statedb() {
    return statedb;
  }

  /**
   * Gets the dind.
   *
   * This field requires the use of Fabric v1.4.* and **lower**.
   *
   * @return the dind
   */
  public ResourceObjectFabV1 dind() {
    return dind;
  }

  /**
   * Gets the fluentd.
   *
   * This field requires the use of Fabric v1.4.* and **lower**.
   *
   * @return the fluentd
   */
  public ResourceObjectFabV1 fluentd() {
    return fluentd;
  }

  /**
   * Gets the peer.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the peer
   */
  public ResourceObject peer() {
    return peer;
  }

  /**
   * Gets the proxy.
   *
   * This field requires the use of Fabric v1.4.* and higher.
   *
   * @return the proxy
   */
  public ResourceObject proxy() {
    return proxy;
  }
}

