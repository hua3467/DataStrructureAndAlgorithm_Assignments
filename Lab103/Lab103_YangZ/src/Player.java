/**
 *
 * @author zhenhuayang
 */
public class Player {
    private String playerName;
    private String positionPlayed;
    private int jerseyNum;
    
    public Player(String name, String position, int jersey){
        this.playerName = name;
        this.positionPlayed = position;
        this.jerseyNum = jersey;
    }
    
    public String getPlayerName(){
        return playerName;
    }
    public String getPosition(){
        return positionPlayed;
    }
    public int getJersey(){
        return jerseyNum;
    }
    
    public void setName(String newName){
        playerName = newName;
    }
    public void setPosition(String newPosition){
        positionPlayed = newPosition;
    }
    public void setJersey(int newJersey){
        jerseyNum = newJersey;
    }
    
    public String toString(){
        return this.getClass().getName() + " @ " + 
                playerName + " : " +
                positionPlayed + " : " +
                jerseyNum + " | ";
    }
    
    public boolean equals(Object o){
        if(!(o instanceof Player))
            return false;
        else{
            Player p = (Player) o;
            return this.playerName.equals(p.playerName)  &&
                    this.positionPlayed.equals(p.positionPlayed) &&
                    this.jerseyNum == p.jerseyNum;
        }
    }
    
}
