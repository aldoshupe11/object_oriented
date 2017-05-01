import java.util.*;
import java.io.*;

public class Factory implements IFactory{
  private static IFactory m_instance;
  private String[] hold = new String[3];
  public static IFactory getInstance(){
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }

  private Factory() {}

  @Override
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY){
    return new enemyHold[0](x, y, w, h, dX + 5, dY - 5);
  }

  @Override
  public IGameObject createEnemyTwo(int x, int y, int w, int h, int dX, int dY){

    return new enemyHold[1](x, y, w, h, dX - 5, dY + 5);
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY){
    return new Naruto(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects){
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects){
    return new StatusView(objects);
  }

  public String readLine(String text){

  }
}
