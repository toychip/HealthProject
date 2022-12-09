package com.example.demo.muscle.service;

import com.example.demo.muscle.dto.MuscleResponseVO;
import com.example.demo.muscle.entity.MuscleEntity;
//import com.example.demo.muscle.repository.MuscleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MuscleService {

//    private final MuscleRepository muscleRepository;
//
//    @Transactional()
//    public List<MuscleResponseVO> getMuscle(String muscle, String equipment) {
//        List<MuscleEntity> byMuscleAndEquipment = muscleRepository.findByMuscleAndEquipment(muscle, equipment);
//        List<MuscleResponseVO> muscleResponseVOList = new ArrayList<>();
//        for (MuscleEntity m : byMuscleAndEquipment) {
//            MuscleResponseVO s = MuscleResponseVO.tomuscleVO(m);
//            muscleResponseVOList.add(s);
//        }
//        return muscleResponseVOList;
//    }

}
