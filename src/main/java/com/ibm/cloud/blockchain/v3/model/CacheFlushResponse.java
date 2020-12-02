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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CacheFlushResponse.
 */
public class CacheFlushResponse extends GenericModel {

  public interface Flushed {
    /** couch_cache. */
    String COUCH_CACHE = "couch_cache";
    /** iam_cache. */
    String IAM_CACHE = "iam_cache";
    /** proxy_cache. */
    String PROXY_CACHE = "proxy_cache";
    /** session_cache. */
    String SESSION_CACHE = "session_cache";
  }

  protected String message;
  protected List<String> flushed;

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
   * Gets the flushed.
   *
   * The name of the caches that were cleared.
   *
   * @return the flushed
   */
  public List<String> getFlushed() {
    return flushed;
  }
}

