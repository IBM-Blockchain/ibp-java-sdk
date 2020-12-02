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
 * ArchiveResponse.
 */
public class ArchiveResponse extends GenericModel {

  protected String message;
  protected String details;

  /**
   * Gets the message.
   *
   * Response message. "ok" indicates the api completed successfully.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the details.
   *
   * Text with the number of notifications that were archived.
   *
   * @return the details
   */
  public String getDetails() {
    return details;
  }
}

