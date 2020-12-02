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
 * GenericComponentResponseMsp.
 */
public class GenericComponentResponseMsp extends GenericModel {

  protected GenericComponentResponseMspCa ca;
  protected GenericComponentResponseMspTlsca tlsca;
  protected GenericComponentResponseMspComponent component;

  /**
   * Gets the ca.
   *
   * @return the ca
   */
  public GenericComponentResponseMspCa getCa() {
    return ca;
  }

  /**
   * Gets the tlsca.
   *
   * @return the tlsca
   */
  public GenericComponentResponseMspTlsca getTlsca() {
    return tlsca;
  }

  /**
   * Gets the component.
   *
   * @return the component
   */
  public GenericComponentResponseMspComponent getComponent() {
    return component;
  }
}

