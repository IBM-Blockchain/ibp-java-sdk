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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * EditAdminCertsResponse.
 */
public class EditAdminCertsResponse extends GenericModel {

  @SerializedName("changes_made")
  protected Double changesMade;
  @SerializedName("set_admin_certs")
  protected List<EditAdminCertsResponseSetAdminCertsItem> setAdminCerts;

  /**
   * Gets the changesMade.
   *
   * The total number of admin certificate additions and deletions.
   *
   * @return the changesMade
   */
  public Double getChangesMade() {
    return changesMade;
  }

  /**
   * Gets the setAdminCerts.
   *
   * Array of certs there were set.
   *
   * @return the setAdminCerts
   */
  public List<EditAdminCertsResponseSetAdminCertsItem> getSetAdminCerts() {
    return setAdminCerts;
  }
}

