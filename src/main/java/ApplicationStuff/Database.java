package ApplicationStuff;

import entity.TimeTable;

import java.io.IOException;

public class Database {

  public boolean isExisted() {
    return false;
  }

  public void createInitialData() throws IOException {
    Cities c = new Cities();
    c.create();
    TimeTable tt = new TimeTable();
    tt.create();
    // create cities
    // create timetable
    // ...

  }
}
