package com.jhorwitz.trivia.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PLAYER")
public class Player {

    @Id
    @GeneratedValue
    private Long id;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "SCORE")
	private int score;
	@Column(name = "NAME")
	private String name;
	@Column(name = "TEAM")
	private String team;
	@Column(name = "DATE")
	private Date updatedTime;


    public Player() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", updatedTime=" + updatedTime +
                '}';
    }





}