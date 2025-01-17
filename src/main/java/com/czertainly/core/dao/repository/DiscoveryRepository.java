package com.czertainly.core.dao.repository;

import com.czertainly.core.dao.entity.DiscoveryHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional
public interface DiscoveryRepository extends SecurityFilterRepository<DiscoveryHistory, Long> {

    Optional<DiscoveryHistory> findByUuid(UUID uuid);

	Optional<DiscoveryHistory> findByName(String name);

    @Query("SELECT DISTINCT connectorName FROM DiscoveryHistory ")
    List<String> findDistinctConnectorName();
}
