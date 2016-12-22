package com.dykim1983.integration.repository

import com.dykim1983.integration.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "member", path = "member")
interface MemberRepository : JpaRepository<Member, Long>