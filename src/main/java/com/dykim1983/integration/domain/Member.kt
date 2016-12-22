package com.dykim1983.integration.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Member(
        var name: String = "",
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0)