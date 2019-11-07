package entity;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class TimeTable {
    private final List<TimetableLine> data = new ArrayList<TimetableLine>();

    public TimeTable() throws IOException {
        if (isExisted()) {
            load();
        } else {
            create();
        }
    }

    public boolean isExisted() {
        return false;
    }

    public void load() {
        // load the timetable from file
    }

    public void create() throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File("src/main/java/Data/cities.txt")
                )
        );

        // read the cities from file
        // create the timetable
        // write the timetable to file
    }
}
