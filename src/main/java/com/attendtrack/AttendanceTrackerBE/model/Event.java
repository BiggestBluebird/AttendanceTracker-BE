package com.attendtrack.AttendanceTrackerBE.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "violation")
	private String violation;

	@Column(name = "description")
	private String description;

	@Column(name = "points")
	private Integer points;

	@Column(name = "published")
	private boolean published;

	public Event() {

	}

	public Event(long id, String title, String violation, String description, Integer points, boolean published) {
		super();
		this.id = id;
		this.title = title;
		this.violation = violation;
		this.description = description;
		this.points = points;
		this.published = published;
	}

	public long getId() {
		return id;
	}

//	public void setId(long id) {
//		this.id = id;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getViolation() {
		return violation;
	}

	public void setViolation(String violation) {
		this.violation = violation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public boolean isPublished() {

		return published;
	}

	public void setPublished(boolean isPublished) {

		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", violation=" + violation + ", description=" + description
				+ ", points=" + points + ", published=" + published + "]";
	}

}
