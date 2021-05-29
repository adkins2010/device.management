/**
 * 
 */
package com.michael.adkins.devices.management.entity;

import java.util.Objects;

/**
 * @author micha
 *
 */
public class Device {
	private Integer id;
	private String serialNumber;
	private String machineCode;
	private String deviceName;
	/**
	 * 
	 */
	public Device() {
		super();
	}
	/**
	 * @param id
	 */
	public Device(Integer id) {
		super();
		this.id = id;
	}
	/**
	 * @param serialNumber
	 * @param machineCode
	 * @param deviceName
	 */
	public Device(String serialNumber, String machineCode, String deviceName) {
		super();
		this.serialNumber = serialNumber;
		this.machineCode = machineCode;
		this.deviceName = deviceName;
	}
	/**
	 * @param id
	 * @param serialNumber
	 * @param machineCode
	 * @param deviceName
	 */
	public Device(Integer id, String serialNumber, String machineCode, String deviceName) {
		super();
		this.id = id;
		this.serialNumber = serialNumber;
		this.machineCode = machineCode;
		this.deviceName = deviceName;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the machineCode
	 */
	public String getMachineCode() {
		return machineCode;
	}
	/**
	 * @param machineCode the machineCode to set
	 */
	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}
	/**
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	@Override
	public String toString() {
		return "Device [id=" + id + ", serialNumber=" + serialNumber + ", machineCode=" + machineCode + ", deviceName="
				+ deviceName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(/*deviceName,*/ id, machineCode, serialNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Device))
			return false;
		Device other = (Device) obj;
		return /*Objects.equals(deviceName, other.deviceName) &&*/ Objects.equals(id, other.id)
				&& Objects.equals(machineCode, other.machineCode) && Objects.equals(serialNumber, other.serialNumber);
	}
	
}
