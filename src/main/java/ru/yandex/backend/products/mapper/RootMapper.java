package ru.yandex.backend.products.mapper;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class RootMapper {
    public ZonedDateTime formatToUTC(ZonedDateTime time) {
        return time.withZoneSameInstant( ZoneId.of("UTC"));
    }
}
