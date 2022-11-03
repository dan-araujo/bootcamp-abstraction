package com.bootcamp.domain;

import java.util.*;

public class Dev {
    private String name;
    private Set<Contents> registeredContent = new LinkedHashSet<>();
    private Set<Contents> completedContent = new LinkedHashSet<>();

    public void registerBootcamp(Bootcamp bootcamp) {
        this.registeredContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs();
    }

    public void toProgress() {
        Optional<Contents> contents = this.registeredContent.stream().findFirst();
        if(contents.isPresent()) {
            this.completedContent.add(contents.get());
            this.registeredContent.remove(contents.get());
        } else {
            System.err.println("You are not registered in any content!");
        }
    }

    public double calculateTotalXP() {
        Iterator<Contents> iterator = this.completedContent.iterator();
        double sum = 0;
        while(iterator.hasNext()) {
            double next = iterator.next().calculateXP();
            sum += next;
        }
        return sum;
    }

    public Set<Contents> getRegisteredContent() {
        return registeredContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegisteredContent(Set<Contents> registeredContent) {
        this.registeredContent = registeredContent;
    }

    public Set<Contents> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Contents> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(registeredContent, dev.registeredContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registeredContent, completedContent);
    }
}
