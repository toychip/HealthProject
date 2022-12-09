package com.example.demo.muscle.entity;


import com.example.demo.muscle.dto.MuscleResponseVO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "exercise_data_correct")
public class MuscleEntity {
    @Id // pk 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    private String muscle;
    private String exercise;
    private String equipment;
    private String difficult;
    private String image1;
    private String image2;
    private String step;

    public static MuscleEntity tomuscleEntity(MuscleResponseVO muscleResponseVO) {
        MuscleEntity muscleEntity = new MuscleEntity();
        muscleEntity.setMuscle(muscleResponseVO.getMuscle());
        muscleEntity.setExercise(muscleResponseVO.getExercise());
        muscleEntity.setEquipment(muscleResponseVO.getEquipment());
        muscleEntity.setDifficult(muscleResponseVO.getDifficult());
        muscleEntity.setImage1(muscleResponseVO.getImage1());
        muscleEntity.setImage2(muscleResponseVO.getImage2());
        muscleEntity.setStep(muscleResponseVO.getStep());

        return muscleEntity;
    }
}
