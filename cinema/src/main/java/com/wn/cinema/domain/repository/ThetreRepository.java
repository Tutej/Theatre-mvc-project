package com.wn.cinema.domain.repository;

import java.util.List;

import com.wn.cinema.domain.Audithorium;
import com.wn.cinema.domain.Movie;
import com.wn.cinema.domain.Seat;

public interface ThetreRepository {

	List<Audithorium> getAllAudithoriums();

	Audithorium getAudithoriumBySize ();

}
