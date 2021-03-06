/*
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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.UpdateCoverPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdateCoverPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdateCoverPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCoverPipelineResponseUnmarshaller {

	public static UpdateCoverPipelineResponse unmarshall(UpdateCoverPipelineResponse updateCoverPipelineResponse, UnmarshallerContext context) {
		
		updateCoverPipelineResponse.setRequestId(context.stringValue("UpdateCoverPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdateCoverPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdateCoverPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdateCoverPipelineResponse.Pipeline.State"));
		pipeline.setPriority(context.integerValue("UpdateCoverPipelineResponse.Pipeline.Priority"));
		pipeline.setRole(context.stringValue("UpdateCoverPipelineResponse.Pipeline.Role"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdateCoverPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("UpdateCoverPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		updateCoverPipelineResponse.setPipeline(pipeline);
	 
	 	return updateCoverPipelineResponse;
	}
}