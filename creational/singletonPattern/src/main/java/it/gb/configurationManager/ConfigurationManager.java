package it.gb.configurationManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConfigurationManager {

    private Map<String, Object> configurations;

    // Auto thread safe lazy loading on Java SE 17+
    private static class LazyHolder {
        static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }
    
    private ConfigurationManager() {
        super();
        configurations = new HashMap<String, Object>();
    }

    public static ConfigurationManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    /**
     * 
     * @param key
     * @param value
     * @return the previous value of the specified key in this configuration, or null if it did not have one
     */
    public Object setConfiguration(String key, String value) {
        return configurations.put(key, value);
    }
    
    /**
     * 
     * @param key
     * @param value
     * @return the previous value of the specified key in this configuration, or null if it did not have one
     */
    public Object setConfiguration(String key, Integer value) {
        return configurations.put(key, value);
    }

    /**
     * 
     * @param key
     * @param value
     * @return the previous value of the specified key in this configuration, or null if it did not have one
     */
    public Object setConfiguration(String key, Boolean value) {
        return configurations.put(key, value);
    }

    
    public String getStringConfiguration(String key) throws ClassCastException {
        return String.valueOf((String)configurations.get(key));
    }

    public Integer getIntegerConfiguration(String key) throws ClassCastException {
        return Integer.valueOf((Integer)configurations.get(key));
    }

    public Boolean getBooleanConfiguration(String key) throws ClassCastException {
        return Boolean.valueOf((Boolean)configurations.get(key));
    }

    public List<String> listConfigurations() {
        List<String> keys = new ArrayList<String>(configurations.keySet());
        return keys;
    }
}
