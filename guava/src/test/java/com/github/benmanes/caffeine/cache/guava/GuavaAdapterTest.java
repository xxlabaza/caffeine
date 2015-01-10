/*
 * Copyright 2015 Ben Manes. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.benmanes.caffeine.cache.guava;

import junit.framework.TestCase;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.testing.CacheSpec.Loader;
import com.github.benmanes.caffeine.guava.CaffeinatedGuava;
import com.google.common.testing.SerializableTester;

/**
 * @author ben.manes@gmail.com (Ben Manes)
 */
public final class GuavaAdapterTest extends TestCase {

  public void testSerializable() {
    SerializableTester.reserialize(CaffeinatedGuava.build(Caffeine.newBuilder()));
    SerializableTester.reserialize(CaffeinatedGuava.build(Caffeine.newBuilder(), Loader.IDENTITY));
  }
}