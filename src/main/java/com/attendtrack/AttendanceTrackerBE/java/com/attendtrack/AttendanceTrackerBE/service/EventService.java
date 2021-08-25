package com.attendtrack.AttendanceTrackerBE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendtrack.AttendanceTrackerBE.exception.ResourceNotFoundException;
import com.attendtrack.AttendanceTrackerBE.model.Event;
import com.attendtrack.AttendanceTrackerBE.repository.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository eventRepository;

	public List<Event> findAll() {
		return eventRepository.findAll();
	}

	public Event save(Event event) {
		return eventRepository.saveAndFlush(event);
	}

	public Event findById(Long id) {
		return eventRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Event not found with id: " + id));
	}

	public void delete(Event event) {
		eventRepository.delete(event);
	}
}
