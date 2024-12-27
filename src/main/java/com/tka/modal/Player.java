package com.tka.modal;

public class Player {
	 private int playerId;
	    private String name;
	    private Integer age;
	    private String teamname;
	    private String role;
		public Player() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Player(int playerId, String name, Integer age, String teamname, String role) {
			super();
			this.playerId = playerId;
			this.name = name;
			this.age = age;
			this.teamname = teamname;
			this.role = role;
		}
		public int getPlayerId() {
			return playerId;
		}
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getTeamname() {
			return teamname;
		}
		public void setTeamname(String teamname) {
			this.teamname = teamname;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		@Override
		public String toString() {
			return "Player [playerId=" + playerId + ", name=" + name + ", age=" + age + ", teamname=" + teamname
					+ ", role=" + role + "]";
		}

}
