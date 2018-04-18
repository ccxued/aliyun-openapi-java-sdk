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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.QueryTransferOutInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTransferOutInfoResponseUnmarshaller {

	public static QueryTransferOutInfoResponse unmarshall(QueryTransferOutInfoResponse queryTransferOutInfoResponse, UnmarshallerContext context) {
		
		queryTransferOutInfoResponse.setRequestId(context.stringValue("QueryTransferOutInfoResponse.RequestId"));
		queryTransferOutInfoResponse.setStatus(context.integerValue("QueryTransferOutInfoResponse.Status"));
		queryTransferOutInfoResponse.setEmail(context.stringValue("QueryTransferOutInfoResponse.Email"));
		queryTransferOutInfoResponse.setTransferAuthorizationCodeSendDate(context.stringValue("QueryTransferOutInfoResponse.TransferAuthorizationCodeSendDate"));
		queryTransferOutInfoResponse.setExpirationDate(context.stringValue("QueryTransferOutInfoResponse.ExpirationDate"));
		queryTransferOutInfoResponse.setPendingRequestDate(context.stringValue("QueryTransferOutInfoResponse.PendingRequestDate"));
		queryTransferOutInfoResponse.setResultCode(context.stringValue("QueryTransferOutInfoResponse.ResultCode"));
		queryTransferOutInfoResponse.setResultMsg(context.stringValue("QueryTransferOutInfoResponse.ResultMsg"));
	 
	 	return queryTransferOutInfoResponse;
	}
}