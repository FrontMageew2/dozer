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
package com.github.dozermapper.core.event;

import com.github.dozermapper.core.AbstractDozerTest;
import com.github.dozermapper.core.classmap.ClassMap;
import com.github.dozermapper.core.fieldmap.FieldMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class DozerEventTest extends AbstractDozerTest {

    private DozerEvent dozerEvent;

    @Before
    public void setUp() throws Exception {
        dozerEvent = new DozerEvent(DozerEventType.MAPPING_FINISHED,
                                    mock(ClassMap.class),
                                    mock(FieldMap.class),
                                    mock(Object.class),
                                    mock(Object.class),
                                    mock(Object.class));
    }

    @Test
    public void testToString() {
        String result = dozerEvent.toString();
        assertNotNull(result);
    }
}
