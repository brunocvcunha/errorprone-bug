package org.brunocvcunha.errorprone;

import java.util.Map;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

@Builder
@Getter
public class Task {

    @Singular("data")
    private Map<String, Object> taskData;
    
}
