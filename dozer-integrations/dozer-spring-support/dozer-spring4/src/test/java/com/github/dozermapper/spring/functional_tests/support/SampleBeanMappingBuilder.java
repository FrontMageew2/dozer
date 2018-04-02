/*
 * Copyright 2005-2018 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.dozermapper.spring.functional_tests.support;

import com.github.dozermapper.core.loader.api.BeanMappingBuilder;
import com.github.dozermapper.spring.vo.Destination;
import com.github.dozermapper.spring.vo.Source;

import static com.github.dozermapper.core.loader.api.FieldsMappingOptions.copyByReference;

public class SampleBeanMappingBuilder extends BeanMappingBuilder {

    @Override
    protected void configure() {
        mapping(Source.class, Destination.class)
                .fields("name", "value", copyByReference());
    }
}
