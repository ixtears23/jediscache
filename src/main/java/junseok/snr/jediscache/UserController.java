package junseok.snr.jediscache;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRepository userRepository;

    @GetMapping("/users/{id}/email")
    public String getUserEmail(@PathVariable Long id) {
        return userRepository.findById(id).orElse(User.builder().build()).getEmail();
    }
}
