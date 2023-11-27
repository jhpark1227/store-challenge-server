package junhyeok.umcStudy.web.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

public class StoreRequestDTO {
    @Getter
    public static class Create{
        @NotNull
        String name;
        @NotNull
        String address;
        @NotNull
        Long regionId;
    }

}
