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
 * Disk space properties. This feature is not available if using a free Kubernetes cluster.
 */
public class CreatePeerBodyStorage extends GenericModel {

  protected StorageObject peer;
  protected StorageObject statedb;

  /**
   * Builder.
   */
  public static class Builder {
    private StorageObject peer;
    private StorageObject statedb;

    private Builder(CreatePeerBodyStorage createPeerBodyStorage) {
      this.peer = createPeerBodyStorage.peer;
      this.statedb = createPeerBodyStorage.statedb;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param peer the peer
     */
    public Builder(StorageObject peer) {
      this.peer = peer;
    }

    /**
     * Builds a CreatePeerBodyStorage.
     *
     * @return the new CreatePeerBodyStorage instance
     */
    public CreatePeerBodyStorage build() {
      return new CreatePeerBodyStorage(this);
    }

    /**
     * Set the peer.
     *
     * @param peer the peer
     * @return the CreatePeerBodyStorage builder
     */
    public Builder peer(StorageObject peer) {
      this.peer = peer;
      return this;
    }

    /**
     * Set the statedb.
     *
     * @param statedb the statedb
     * @return the CreatePeerBodyStorage builder
     */
    public Builder statedb(StorageObject statedb) {
      this.statedb = statedb;
      return this;
    }
  }

  protected CreatePeerBodyStorage(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.peer,
      "peer cannot be null");
    peer = builder.peer;
    statedb = builder.statedb;
  }

  /**
   * New builder.
   *
   * @return a CreatePeerBodyStorage builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public StorageObject peer() {
    return peer;
  }

  /**
   * Gets the statedb.
   *
   * @return the statedb
   */
  public StorageObject statedb() {
    return statedb;
  }
}

