/*
 * Copyright (c) 2011 David Saff
 * Copyright (c) 2011 Christian Gruber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.truth0.subjects;

import com.google.common.annotations.GwtCompatible;

import org.truth0.FailureStrategy;


/**
 * Propositions for boolean subjects
 *
 * @author Christian Gruber (cgruber@israfil.net)
 */
@GwtCompatible
public class BooleanSubject extends Subject<BooleanSubject, Boolean> {

  public BooleanSubject(FailureStrategy failureStrategy, Boolean subject) {
    super(failureStrategy, subject);
  }

  public void isTrue() {
    if (getSubject() == null || !getSubject()) {
      failWithRawMessage("%s was expected to be true, but was false", booleanSubject());
    }
  }

  public void isFalse() {
    if (getSubject() == null || getSubject()) {
      failWithRawMessage("%s was expected to be false, but was true", booleanSubject());
    }
  }

  private String booleanSubject() {
    return label() == null ? "The subject" : getDisplaySubject();
  }
}
