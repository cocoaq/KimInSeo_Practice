package P_9;

public class Puser {

	static String name;
	int life = 3;
	boolean you = false;
	public Puser(String name, int life, boolean you) {
		super();
		this.name = name;
		this.life = life;
		this.you = you;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLife() {
		return life;
	}
	public int setLife() {
		return this.life = life;
	}
	public boolean isYou() {
		return you;
	}
	public void setYou(boolean you) {
		this.you = you;
	}
	@Override
	public String toString() {
		return "유저 이름 : " + name + "\n남은 생명 : " + life + "\n얻은 것 : " + you ;
	}


}
