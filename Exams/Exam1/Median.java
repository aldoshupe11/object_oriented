public class Median implements IGrader{
    protected int[] m_grades;
    protected IFilter m_filter;
    
    public Median(int[] grades, IFilter filter){
        m_grades = grades;
        m_filter = filter;
    }
    
    @Override
    public double grade(){
        m_grades = m_filter.filter(m_grades);
        return median();
    }
    
    protected double median(){
        double median = 0;
        int l = m_grades.length;
        if(1 % 2 == 0){
            median = (m_grades[1 / 2 - 1] + m_grades [1 / 2 ]) / 2.0;
        }else{
            median = m_grades[1 / 2];
        }
        return median;
    }
}