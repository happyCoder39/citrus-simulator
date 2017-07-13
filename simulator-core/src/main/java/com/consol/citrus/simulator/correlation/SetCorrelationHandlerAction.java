/*
 * Copyright 2006-2017 the original author or authors.
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

package com.consol.citrus.simulator.correlation;

import com.consol.citrus.TestCase;
import com.consol.citrus.actions.AbstractTestAction;
import com.consol.citrus.context.TestContext;

/**
 * @author Christoph Deppisch
 */
public class SetCorrelationHandlerAction extends AbstractTestAction {

    private final TestCase test;
    private CorrelationHandler correlationHandler;

    /**
     * Default constructor.
     *
     * @param test
     */
    public SetCorrelationHandlerAction(TestCase test) {
        this.test = test;
    }

    @Override
    public void doExecute(TestContext context) {
        correlationHandler.setTestContext(context);
        test.getVariableDefinitions().put(CorrelationHandler.class.getName(), correlationHandler);
    }

    /**
     * Sets the correlationHandler property.
     *
     * @param correlationHandler
     */
    public void setCorrelationHandler(CorrelationHandler correlationHandler) {
        this.correlationHandler = correlationHandler;
    }
}