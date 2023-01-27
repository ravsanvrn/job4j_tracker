package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        Double score = 0D;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
                count++;
            }
        }
        return count == 0 ? 0 : score / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            Double score = 0D;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), pupil.subjects().size() == 0 ? 0 : score / pupil.subjects().size()));
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = 0;
                if (linkedHashMap.containsKey(subject.name())) {
                    score += linkedHashMap.get(subject.name());
                }
                linkedHashMap.put(subject.name(), score + subject.score());
            }
        }
        for (String key : linkedHashMap.keySet()) {
            Integer value = linkedHashMap.get(key);
            list.add(new Label(key, value / pupils.size()));
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            Double score = 0D;
            for (Subject subject : pupil.subjects()) {
                score += subject.score();
            }
            list.add(new Label(pupil.name(), score));
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = 0;
                if (linkedHashMap.containsKey(subject.name())) {
                    score += linkedHashMap.get(subject.name());
                }
                linkedHashMap.put(subject.name(), score + subject.score());
            }
        }
        for (String key : linkedHashMap.keySet()) {
            Integer value = linkedHashMap.get(key);
            list.add(new Label(key, value));
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}