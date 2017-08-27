public class Solution{
  public double dpOdds(double wr, int numGames){
    double[] w = new double[numGames];
    double[] l = new double[numGames];
    w[0] = wr;
    l[0] = 1 - wr;
    for(int i = 1; i < numGames; i++){
      w[i] = wr * w[i - 1] + wr * l[i - 1];
      l[i] = (1 - wr) * w[i - 1];
    }
    return w[numGames - 1] + l[numGames - 1];
  }
  public static void main(String[] args){
    Solution x = new Solution();
    for(double i = 0.9; i <= 0.91; i += 0.001){
      System.out.println("Win %: " + i + "  Probability: "  + x.dpOdds(i,82));
    }
  }
}