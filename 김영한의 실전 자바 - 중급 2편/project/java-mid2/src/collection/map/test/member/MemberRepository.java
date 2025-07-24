package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    private Map<String, Member> map = new HashMap<>();

    public void save(Member member) {
        map.put(member.getId(), member);
    }

    public Member findById(String id) {
        return map.get(id);
    }

    public Member findByName(String name) {
        for (Member member : map.values()) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void remove(String id) {
        map.remove(id);
    }
}
