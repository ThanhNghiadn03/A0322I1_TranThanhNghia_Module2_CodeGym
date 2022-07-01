package ss08_cleancode_refactoring.BaiTap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int currentScore1, int currentScore2) {
        String score = "";
        int tempScore=0;
        if (currentScore1==currentScore2)
        {
            switch (currentScore1)
            {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else {
            boolean player1FullScrore = currentScore1 >= 4;
            boolean player2FullScore = currentScore2 >= 4;
            if (player1FullScrore || player2FullScore)
            {
                int minusResult = currentScore1-currentScore2;
                if (minusResult==1) score ="Advantage player1";
                else if (minusResult ==-1) score ="Advantage player2";
                else if (minusResult>=2) score = "Win for player1";
                else score ="Win for player2";
            }
            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = currentScore1;
                    else { score+="-"; tempScore = currentScore2;}
                    switch(tempScore)
                    {
                        case 0:
                            score+="Love";
                            break;
                        case 1:
                            score+="Fifteen";
                            break;
                        case 2:
                            score+="Thirty";
                            break;
                        case 3:
                            score+="Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}