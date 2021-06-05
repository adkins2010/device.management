/**
 * 
 */
package com.michael.adkins.devices.management.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.stereotype.Component;

/**
 * @author micha
 *
 */
@Component
public class DeviceDao {
	private static Map<Integer, Device> deviceMap = new HashMap<>();
	private static Random random = new Random();

//	static {
//		Device[] deviceArr = {
//			    new Device("12-1222", "3455670-22222", "1-00022221")
//			};
//		deviceMap = IntStream.range(0, deviceArr.length/2).map(i -> i*2).collect(HashMap::new, (newMap,index) -> newMap.put(index, deviceArr[index]),Map::putAll);
//		
//	}
	
	public List<Device> findAll() {
		return List.copyOf(deviceMap.values());
	}
	
	public Device save(Device device) {
		if(device.getId() == null) {
			Integer key = createId();
			device.setId(key);
		}
		deviceMap.put(device.getId(), device);
		return device;
	}
	
	private static Integer createId() {
		Integer key = null;
		Set<Integer> keySet = deviceMap.keySet();
		do {
			try {
				key = random.nextInt(keySet.size());
			} catch (IllegalArgumentException e) {
				key = 0;
			}
		} while(keySet.contains(key) && keySet.size() > 0);
		return key;
	}
}
