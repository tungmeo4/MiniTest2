package Tuan2.Manage;

import Tuan2.model.Student;

import java.util.ArrayList;

public class StudentManager implements Manage{
    private int id = 1;
    private int index = 0;
    ArrayList<Student> students = new ArrayList<>();

    public StudentManager() {
    }

    public StudentManager(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public void show() {
        for (Student std : students) {
            System.out.println(std);
        }
    }

    @Override
    public void add(String name, int age, double avg) {
        Student student = new Student(id, name, age, avg);
        students.add(index, student);
        index++;
        id++;
    }

    @Override
    public void findById(int id) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void editById(int id) {

    }

    @Override
    public void sort() {

    }

    @Override
    public void totalAvg() {

    }


}
