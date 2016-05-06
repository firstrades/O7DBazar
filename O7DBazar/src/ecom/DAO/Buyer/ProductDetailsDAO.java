package ecom.DAO.Buyer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import ecom.common.ConnectionFactory;
import ecom.model.TwoObjects;

public class ProductDetailsDAO {
	
	public static TwoObjects<Double, String> getSellPriceAndWarranty(long productId) {		
		
		String sql = null;			
		TwoObjects<Double, String> twoObjects = new TwoObjects<>();		
		sql = "SELECT salePriceCustomer, warranty FROM product WHERE product_id = ?";
		
		try (Connection connection = ConnectionFactory.getNewConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement(sql)) {					
							
				preparedStatement.setLong(1, productId);	
				
						try (ResultSet resultSet = preparedStatement.executeQuery()) {					
						
							if (resultSet.next()) {											
								
								twoObjects.setObj1(resultSet.getDouble("salePriceCustomer"));
								twoObjects.setObj2(resultSet.getString("warranty"  ));					
							}	 
						} catch(SQLException e1) { e1.printStackTrace(); }
				
				System.out.println("SQL getSellPriceAndWarranty(long productId) Executed");
				return twoObjects;
				
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {				
			e.printStackTrace();				
		} finally {
			twoObjects = null;
			System.gc();
		}
		
		return null;
	}

	/********** Electronics - Mobile ************/
	
	public Map<String,String> getMobileFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;		
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_mobile_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Internal Storage", resultSet.getString("internal_storage"));
				map.put("O.S.",             resultSet.getString("os"));
				map.put("Touch",            resultSet.getString("touch"));
				map.put("WiFi",             resultSet.getString("wifi"));
				map.put("F.M.",             resultSet.getString("fm"));
				map.put("Front Camera",     resultSet.getString("front_camera"));
				map.put("Rear Camera",      resultSet.getString("rear_camera"));
				map.put("Connectivity",     resultSet.getString("connectivity"));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getMobileFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getMobileFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getMobileFeatures
	
	/********** Electronics - Laptop ************/
	
	public Map<String,String> getLaptopFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;		
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_laptop_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Battery Cell",      resultSet.getString("batteryCell"     ));
				map.put("Graphic Processor", resultSet.getString("graphicProcessor"));
				map.put("HDD Capacity",      resultSet.getString("hddCapacity"     ));
				map.put("O.S.",              resultSet.getString("OS"              ));
				map.put("Power Supply",      resultSet.getString("powerSupply"     ));
				map.put("Processor",         resultSet.getString("processor"       ));
				map.put("Screen Size",       resultSet.getString("screenSize"      ));
				map.put("Web Camera",        resultSet.getString("webCamera"       ));
				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getLaptopFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getLaptopFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getLaptopFeatures
	
	
	/************ Women - Leggings **************/
	
	public Map<String,String> getLeggingsFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_leggings_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Pattern",   resultSet.getString("pattern"));
				map.put("Fabric",    resultSet.getString("fabric"));
				map.put("Style",     resultSet.getString("style"));
				map.put("season",    resultSet.getString("season"));
				map.put("Waistband", resultSet.getString("waistband"));
				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getLeggingsFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getLeggingsFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getLeggingsFeatures
	
	/************ Women - Top **************/
	
	public Map<String,String> getTopFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;		
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_top_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Pattern",  resultSet.getString("pattern" ));
				map.put("Fabric",   resultSet.getString("fabric"  ));
				map.put("Neck",     resultSet.getString("neck"    ));
				map.put("Occasion", resultSet.getString("occasion"));
				map.put("Sleeve",   resultSet.getString("sleeve"  ));
				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getTopFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getTopFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getTopFeatures
	
	/*****************************************************************************************************************/
	/************************************************     MEN     ****************************************************/
	/*****************************************************************************************************************/
	
	/************ Men - T-Shirt **************/
	
	public Map<String,String> getMenTshirtFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_men_tshirt_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Pattern", resultSet.getString("pattern" ));
				map.put("Fabric",  resultSet.getString("fabric"  ));
				map.put("Type",    resultSet.getString("type"  ));
				map.put("Fit",     resultSet.getString("fit"     ));
				map.put("Sleeve",  resultSet.getString("sleeve"  ));
				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getMenTshirtFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getMenTshirtFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getMenTshirtFeatures
	
	/************ Men - Jeans **************/
	public Map<String,String> getMenJeansFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_men_jeans_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Fabric",    resultSet.getString("fabric"    ));
				map.put("BrandFit",  resultSet.getString("brand_fit" ));
				map.put("Pattern",   resultSet.getString("pattern"   ));
				map.put("Pockets",   resultSet.getString("pockets"   ));
				map.put("BeltLoops", resultSet.getString("belt_loops"));
				map.put("Occasion",  resultSet.getString("occasion"  ));				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getMenJeansFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getMenJeansFeatures Executed");
			
			return map;
			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}			
		
		return null;
	}
	
	
	/********************* Kids **************************/
	
	/***************** Boys - Shirts *******************/
	
	public Map<String,String> getBoysShirtsFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_boys_shirt_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Sleeve",  resultSet.getString("sleeve" ));
				map.put("Fabric",  resultSet.getString("fabric" ));
				map.put("Type",    resultSet.getString("type"   ));
				map.put("Fit",     resultSet.getString("fit"    ));
				map.put("Pattern", resultSet.getString("pattern"));
				
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getBoysShirtsFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getBoysShirtsFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}	
		
		return null;
	} //getBoysShirtsFeatures
	
	
	/********** Electronics - Tablet ************/
	
	public Map<String,String> getTabletFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_tablet_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("In the Box",      resultSet.getString("inTheBox"     ));
				map.put("Processor",       resultSet.getString("processor"    ));
				map.put("Color",           resultSet.getString("color"        ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getTabletFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getTabletFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getTabletFeatures
	
	/********** Electronics - Camera ************/
	
	public Map<String,String> getCameraFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_camera_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Type",      resultSet.getString("type"     ));
				map.put("Color",     resultSet.getString("color"));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getCameraFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getCameraFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getCameraFeatures
	
	/********** Electronics - Television ************/
	
	public Map<String,String> getTelevisionFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_television_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Display Size",      resultSet.getString("displaySize"  ));
				map.put("Screen Type",       resultSet.getString("screenType"   ));
				map.put("HDMI",              resultSet.getString("hdmi"         ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getTelevisionFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getTelevisionFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getTelevisionFeatures
	
	/********** Electronics - AirCondition ************/
	
	public Map<String,String> getAirConditionFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_air_condition_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Type",           resultSet.getString("type"          ));
				map.put("Capacity",       resultSet.getString("capacity"      ));
				map.put("Remote Control", resultSet.getString("remoteControl" ));
				map.put("Compressor",     resultSet.getString("compressor"    ));
								
			} else {
				
				connection.commit();
				
				System.out.println("SQL getAirConditionFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getAirConditionFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getAirConditionFeatures
	
	/********** Electronics - Refrigerator ************/
	
	public Map<String,String> getRefrigeratorFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_refrigerator_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Capacity",       resultSet.getString("capacity"     ));
				map.put("Color",          resultSet.getString("color"        ));
				map.put("Number of Door", resultSet.getString("numberOfDoor" ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getRefrigeratorFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getRefrigeratorFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getRefrigeratorFeatures
	
	/********** Electronics - WashingMachine ************/
	
	public Map<String,String> getWashingMachineFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_washing_machine_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Capacity",        resultSet.getString("capacity"     ));
				map.put("In built heater", resultSet.getString("inBuiltHeater"));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getWashingMachineFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getWashingMachineFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getWashingMachineFeatures
	
	/********** Electronics - MicrowaveOven ************/
	
	public Map<String,String> getMicrowaveOvenFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_microwave_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Type",      resultSet.getString("type"     ));
				map.put("Capacity",  resultSet.getString("capacity" ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getMicrowaveOvenFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getMicrowaveOvenFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getMicrowaveOvenFeatures
	
	/********** Electronics - VacuumCleaner ************/
	
	public Map<String,String> getVacuumCleanerFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;		
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_vacuum_cleaner_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Consumption",      resultSet.getString("consumption" ));
				map.put("Type",             resultSet.getString("type"        ));
				map.put("Blower",           resultSet.getString("blower"      ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getVacuumCleanerFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getVacuumCleanerFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getVacuumCleanerFeatures
	
	/********** Electronics - Speaker ************/
	
	public Map<String,String> getSpeakerFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;	
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_speaker_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Sub Woofer",      resultSet.getString("subWoofer"     ));
				map.put("Power Output",    resultSet.getString("powerOutput"   ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getSpeakerFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getSpeakerFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getSpeakerFeatures
	
	/********** Electronics - Geyser ************/
	
	public Map<String,String> getGeyserFeatures(long productId) {		
		
		Connection connection = null; PreparedStatement preparedStatement = null; String sql = null; ResultSet resultSet = null;		
		Map<String,String> map = new HashMap<>();
		
		try {
			connection = ConnectionFactory.getNewConnection();
			connection.setAutoCommit(false);
			
			sql = "SELECT * FROM p_geyser_spec WHERE product_id = ?";
				
			preparedStatement = connection.prepareStatement(sql);			
			preparedStatement.setLong (1,  productId);			
		
			resultSet = preparedStatement.executeQuery();	
			
			if (resultSet.next()) {				
				
				map.put("Mount Type",      resultSet.getString("mountType"     ));
				map.put("Capacity",        resultSet.getString("capacity"      ));
				
			} else {
				
				connection.commit();
				
				System.out.println("SQL getGeyserFeatures Executed and ResultSet is empty...");
				
				return null;
			}
			
			connection.commit();
			
			System.out.println("SQL getGeyserFeatures Executed");
			
			return map;			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e1) {
			try { connection.rollback();     } catch (SQLException e) { e.printStackTrace(); }
			e1.printStackTrace();
		} finally {
			map = null;
			try { preparedStatement.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { connection.close();        } catch (SQLException e) { e.printStackTrace(); }
			System.gc();
		}		
		
		return null;
	} //getGeyserFeatures

}
