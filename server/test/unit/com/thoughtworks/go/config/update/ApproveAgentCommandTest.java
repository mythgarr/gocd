/*************************GO-LICENSE-START*********************************
 * Copyright 2014 ThoughtWorks, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *************************GO-LICENSE-END***********************************/

package com.thoughtworks.go.config.update;

import com.thoughtworks.go.config.CruiseConfig;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class ApproveAgentCommandTest {

    @Test
    public void shouldAddAnAgentToAgentsConfig() throws Exception {
        String uuid = "uuid";
        CruiseConfig cruiseConfig = new CruiseConfig();
        ApproveAgentCommand command = new ApproveAgentCommand(uuid, "remote", "8153");

        command.update(cruiseConfig);

        assertThat(cruiseConfig.agents().size(), is(1));
    }
}