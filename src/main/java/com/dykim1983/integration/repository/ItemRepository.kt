package com.dykim1983.integration.repository

import com.dykim1983.integration.domain.Item
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "item", path = "item")
interface ItemRepository : JpaRepository<Item, Long>