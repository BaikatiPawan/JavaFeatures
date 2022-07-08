package com.baikati.methodref;

import java.util.List;

public interface InstructorFactory {
    Instructor getInstructor(int id, String name, int yearsOfExp, List<String> courses, boolean isOnlineCourse);
}
