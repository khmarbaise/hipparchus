/*
 * Licensed to the Hipparchus project under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The Hipparchus project licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.hipparchus.analysis.differentiation;

import org.hipparchus.dfp.Dfp;
import org.hipparchus.dfp.DfpField;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test for class {@link FieldGradient} on {@link Dfp}.
 */
public class FieldGradientDfpTest extends FieldGradientAbstractTest<Dfp> {

    private static final DfpField FIELD = new DfpField(25);

    @Override
    protected DfpField getValueField() {
        return FIELD;
    }

    @Test
    public void testHashcode() {
        Assert.assertEquals(-1057583321, build(2, 1).hashCode());
    }

    @Override
    @Test
    public void testLinearCombinationReference() {
        doTestLinearCombinationReference(x -> build(x), 5.0e-9, 4.212e-9);
    }
}
