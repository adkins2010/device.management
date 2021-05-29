/**
 * 
 */
package com.michael.adkins.devices.management.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author micha
 *
 */
@Component
public class DeviceDao {
//	private static List<Device> devices = new ArrayList<Device>();
	private static Set<Device> deviceSet = new HashSet<Device>();
	private static Random random = new Random();
	private static Set<Integer> keySet = new LinkedHashSet<Integer>();
//	static {
//		//TODO initialize devices
//	}
	
	public List<Device> findAll() {
		return List.copyOf(deviceSet);
	}
	
	public Device save(Device device) {
		if(device.getId() == null) {
			Integer key = createId();
			keySet.add(key);
			device.setId(null);
		}
		return (deviceSet.add(device) ? device : null);
		
	}
	
	private static Integer createId() {
		Integer key = null;
		do {
			key = random.nextInt(deviceSet.size());
		} while(keySet.contains(key) && keySet.size() > 0);
		return key;
	}
}
