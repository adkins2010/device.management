/**
 * 
 */
package com.michael.adkins.devices.management.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author micha
 *
 */
class DeviceDaoTest {
	private static DeviceDao dao = new DeviceDao();
//	private static Device[] deviceArr = {
//		    new Device("12-1222", "3455670-22222", "1-00022221")
//		};

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
//		Map<Integer, Device> deviceMap = new HashMap<>();
//		Device[] deviceArr = {
//			    new Device("12-1222", "3455670-22222", "1-00022221")
//			};
//		deviceMap = IntStream.range(0, deviceArr.length/2).map(i -> i*2).collect(HashMap::new, (newMap,index) -> newMap.put(index, deviceArr[index]),Map::putAll);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#findAll()}.
	 */
	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#save(com.michael.adkins.devices.management.entity.Device)}.
	 */
	@Test
	void testSaveOneDevice_returnsSameDevice() {
		Device device1 = new Device("12-1222", "3455670-22222", "1-00022221");
		assertEquals(device1, dao.save(device1));
	}

	/**
	 * Test method for {@link com.michael.adkins.devices.management.entity.DeviceDao#save(com.michael.adkins.devices.management.entity.Device)}.
	 */
	@Test
	void testSaveTwoDevices_returnsSameDeviceTwice() {
		Device device1 = new Device("12-1222", "3455670-22222", "1-00022221");
		assertEquals(device1, dao.save(device1));
		Device device2 = new Device("13-1333", "3455671-33333", "2-11133332");
		assertEquals(device2, dao.save(device2));
	}
}
