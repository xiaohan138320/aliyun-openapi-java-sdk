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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SaveBatchTaskForCreatingOrderRedeemRequest extends RpcAcsRequest<SaveBatchTaskForCreatingOrderRedeemResponse> {
	
	public SaveBatchTaskForCreatingOrderRedeemRequest() {
		super("Domain", "2018-01-29", "SaveBatchTaskForCreatingOrderRedeem");
	}

	private List<OrderRedeemParam> orderRedeemParams;

	private String userClientIp;

	private String lang;

	public List<OrderRedeemParam> getOrderRedeemParams() {
		return this.orderRedeemParams;
	}

	public void setOrderRedeemParams(List<OrderRedeemParam> orderRedeemParams) {
		this.orderRedeemParams = orderRedeemParams;	
		if (orderRedeemParams != null) {
			for (int depth1 = 0; depth1 < orderRedeemParams.size(); depth1++) {
				putQueryParameter("OrderRedeemParam." + (depth1 + 1) + ".CurrentExpirationDate" , orderRedeemParams.get(depth1).getCurrentExpirationDate());
				putQueryParameter("OrderRedeemParam." + (depth1 + 1) + ".DomainName" , orderRedeemParams.get(depth1).getDomainName());
			}
		}	
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public static class OrderRedeemParam {

		private Long currentExpirationDate;

		private String domainName;

		public Long getCurrentExpirationDate() {
			return this.currentExpirationDate;
		}

		public void setCurrentExpirationDate(Long currentExpirationDate) {
			this.currentExpirationDate = currentExpirationDate;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	@Override
	public Class<SaveBatchTaskForCreatingOrderRedeemResponse> getResponseClass() {
		return SaveBatchTaskForCreatingOrderRedeemResponse.class;
	}

}
