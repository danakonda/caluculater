package com.interfaces;

public class nicecar {
private Engine engine;
private media player=new cdplayer();
public nicecar() {
  this.engine=new powerengine();
}
public nicecar(Engine engine) {
    this.engine=engine;
}
public void start() {
    
    engine.start();
}

public void startmusic() {
    
    player.start();
}

public void stopmusic() {
  
    player.stop();
}
public void upgradeengine() {
    
   this.engine=new electicEngine();
}
}