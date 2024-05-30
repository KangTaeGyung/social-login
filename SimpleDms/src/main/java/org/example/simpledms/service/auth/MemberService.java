package org.example.simpledms.service.auth;

import lombok.RequiredArgsConstructor;
import org.example.simpledms.model.entity.auth.Member;
import org.example.simpledms.repository.auth.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * fileName : MemberService
 * author : GGG
 * date : 2024-04-15
 * description :
 */
@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public boolean existsById(String email) {
        boolean result = memberRepository.existsById(email);

        return result;
    }

    public void save(Member member) {
        memberRepository.save(member);
    }
}
