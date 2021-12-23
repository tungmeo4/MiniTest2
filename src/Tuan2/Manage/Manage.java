package Tuan2.Manage;

public interface Manage {
    void show();
    void add(String name, int age, double avg);
    void findById(int id);
    void deleteById(int id);
    void editById(int id);
    void sort();
    void totalAvg();
}
