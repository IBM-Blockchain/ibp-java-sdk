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
 * GetFabricVersionsResponseVersions.
 */
public class GetFabricVersionsResponseVersions extends GenericModel {

  protected FabricVersionDictionary ca;
  protected FabricVersionDictionary peer;
  protected FabricVersionDictionary orderer;

  /**
   * Gets the ca.
   *
   * A supported release of Fabric for this component type.
   *
   * @return the ca
   */
  public FabricVersionDictionary getCa() {
    return ca;
  }

  /**
   * Gets the peer.
   *
   * A supported release of Fabric for this component type.
   *
   * @return the peer
   */
  public FabricVersionDictionary getPeer() {
    return peer;
  }

  /**
   * Gets the orderer.
   *
   * A supported release of Fabric for this component type.
   *
   * @return the orderer
   */
  public FabricVersionDictionary getOrderer() {
    return orderer;
  }
}

