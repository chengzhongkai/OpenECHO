/*
 * Copyright 2012 Sony Computer Science Laboratories, Inc. <info@kadecot.net>
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
package com.sonycsl.echo.eoj.device.house.proxy;

import com.sonycsl.echo.eoj.device.house.PanelBoardsMeter;

public class PanelBoardsMeterProxy extends PanelBoardsMeter {
	@SuppressWarnings("unused")
	private static final String TAG = PanelBoardsMeterProxy.class
			.getSimpleName();
	private final PanelBoardsMeterProxy self = this;

	private byte mInstanceCode;
	
	public PanelBoardsMeterProxy(byte instanceCode) {
		mInstanceCode = instanceCode;
	}
	
	@Override
	protected byte[] getForwardIntegralPowerConsumptionValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getBackwardIntegralPowerConsumptionValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getIntegralPowerConsumptionUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getPower() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean setInstallationLocation(byte[] arg) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected byte[] getInstallationLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getError() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getMakerCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getAnnoPropertyMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getSetPropertyMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected byte[] getGetPropertyMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte getInstanceCode() {
		return mInstanceCode;
	}

	@Override
	public Setter set() {
		return new SetterProxy(ESV_SETI);
	}

	@Override
	public Setter setC() {
		return new SetterProxy(ESV_SETC);
	}

	@Override
	public Getter get() {
		return new GetterProxy();
	}

	@Override
	public Informer inform() {
		return new InformerProxy();
	}
	
}