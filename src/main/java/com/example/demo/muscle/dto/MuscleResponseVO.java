package com.example.demo.muscle.dto;

import com.example.demo.muscle.entity.MuscleEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MuscleResponseVO {

    private String muscle;
    private String exercise;
    private String equipment;
    private String difficult;
    private String image1;
    private String image2;
    private String step;

    public static MuscleResponseVO tomuscleVO(MuscleEntity muscleEntity) {
        MuscleResponseVO muscleResponseVO = new MuscleResponseVO();
        muscleResponseVO.setMuscle(muscleEntity.getMuscle());
        muscleResponseVO.setExercise(muscleEntity.getExercise());
        muscleResponseVO.setEquipment(muscleEntity.getEquipment());
        muscleResponseVO.setDifficult(muscleEntity.getDifficult());
        muscleResponseVO.setImage1(muscleEntity.getImage1());
        muscleResponseVO.setImage2(muscleEntity.getImage2());
        muscleResponseVO.setStep(muscleEntity.getStep());

        return muscleResponseVO;

    }

}
