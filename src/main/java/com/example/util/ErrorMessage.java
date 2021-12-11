package com.example.util;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
public class ErrorMessage {
    private final String code;
    private final List<Map<String,String>> messages;
}
