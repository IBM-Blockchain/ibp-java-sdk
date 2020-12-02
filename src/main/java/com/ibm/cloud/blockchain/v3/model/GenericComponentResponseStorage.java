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
 * The **cached** Kubernetes storage attributes for this component. [Available on ca/peer/orderer components w/query
 * parameter 'deployment_attrs'].
 */
public class GenericComponentResponseStorage extends GenericModel {

  protected StorageObject ca;
  protected StorageObject peer;
  protected StorageObject orderer;
  protected StorageObject statedb;

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public StorageObject getCa() {
    return ca;
  }

  /**
   * Gets the peer.
   *
   * @return the peer
   */
  public StorageObject getPeer() {
    return peer;
  }

  /**
   * Gets the orderer.
   *
   * @return the orderer
   */
  public StorageObject getOrderer() {
    return orderer;
  }

  /**
   * Gets the statedb.
   *
   * @return the statedb
   */
  public StorageObject getStatedb() {
    return statedb;
  }
}

