package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devProjects = new ArrayList<>();
        for(String project : projects.keySet())
            for(String projDev : projects.get(project))
                if(developer.equals(projDev))
                {
                    devProjects.add(project);
                    break;
                }

        //Sorting
        devProjects.sort(new MyStringComparator());

        return  devProjects;
    }
}

class MyStringComparator implements Comparator<String>
{
    public int compare(String a, String b)
    {
        if(a.length() !=b.length())
            return b.length() - a.length();
        else
            return b.compareTo(a);
    }
}
