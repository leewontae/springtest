package org.zerock.sample;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel2 {

    @NonNull
    private Chef chef;

}
