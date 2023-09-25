package com.deee.deeee.repository;

import com.deee.deeee.model.Instrument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InstrumentRepository extends MongoRepository<Instrument, String> {
}
