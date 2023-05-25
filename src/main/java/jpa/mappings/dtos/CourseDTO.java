package jpa.mappings.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CourseDTO {
    private Long id;
    private String name;
    private List<Long> studentIds;
}
