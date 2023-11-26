package baseball;

public class BaseBallTeam {
    // フィールド
    private String name; // 球団名
    private int win; // 勝ち数
    private int lose; // 負け数
    private int draw; // 引き分け数

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // 勝率を求めるメソッド
    public double getRate() {
        double rate = (double)this.win / ((double)this.win + (double)this.lose);
        return rate;
    }

    // getter と setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }


    // 成績を表示するメソッド
    public void report() {
        System.out.println
        (this.name + " の2022年の成績は " + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は " + getRate() + "です。");
    }

}
