package Comparator;

import java.util.Comparator;

class SalaryComparator implements Comparator<Student> {
    @Override
    public int compare(Student e1, Student e2) {
        return e1.marks-e2.marks;
    }
    
}