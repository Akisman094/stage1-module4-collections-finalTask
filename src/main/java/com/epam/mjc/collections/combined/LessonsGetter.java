package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for(List<String> dayLessons : timetable.values())
            for(String dayLesson : dayLessons)
                if(!lessons.contains(dayLesson))
                    lessons.add(dayLesson);
        return lessons;
    }
}
