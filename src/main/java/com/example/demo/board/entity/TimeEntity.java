package com.example.demo.board.entity;//package com.seven.board.entity;
//
//
//import lombok.Getter;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.Column;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
//import java.time.LocalDateTime;
//
//@Getter
//@MappedSuperclass // 테이블에 매핑하지 않고, 자식entity에게 매핑정보를 상속하기 위한 애노테이션
//@EntityListeners(AuditingEntityListener.class) // jpa에게 해당 entity는 auditing기능을 사용한다는것을 알리는 애노테이션
//public class TimeEntity {
//    @CreatedDate
//    @Column(updatable = false)
//    private LocalDateTime createdDate;
//
//    @LastModifiedDate
//    private LocalDateTime modifiedDate;
//
//
//}
