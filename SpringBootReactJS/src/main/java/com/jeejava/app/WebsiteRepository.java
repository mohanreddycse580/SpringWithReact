package com.jeejava.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class WebsiteRepository {
    private static final Map<Integer, Website> WEBSITES = new HashMap<>();
    private static Integer counter = 1;
    public List<Website> findAll() {
        return new ArrayList<>(WEBSITES.values());
    }
    public Website findById(Integer id) {
        return WEBSITES.get(id);
    }
    public void add(Website website) {
        counter++;
        website.setId(counter);
        WEBSITES.put(counter, website);
    }
    public void update(Website website) {
        WEBSITES.put(website.getId(), website);
    }
    public void delete(Integer id) {
        WEBSITES.remove(id);
    }
}
