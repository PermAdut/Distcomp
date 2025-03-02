package bsuir.dc.rest.dto.from

import jakarta.validation.constraints.Size

data class PostFrom(
    val id: Long = 0,
    val issueId: Long = 0,

    @field:Size(min = 2, max = 2048)
    val content: String = ""
)
