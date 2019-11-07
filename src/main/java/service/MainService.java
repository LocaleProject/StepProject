package service;

import ApplicationStuff.Menu;

public class MainService {
  public String menuContent() {
    return new Menu().show();
  }
}
