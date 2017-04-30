public class EnemyOne extends GameObject{
  public EnemyOne(int x, int y, int w, int h, int dX, int dY){
    super("./chibiitatchi.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh){
    m_x = (m_x + 1) + (m_dX - 1);
    m_y = m_y + m_dY;

    if (m_x > maxw)
      m_x = 0;
    else if (m_x < 0)
      m_x = maxw;

    if (m_y > maxh)
      m_y = 0;
    else if (m_y < 0)
      m_y = maxh;

  }
}
