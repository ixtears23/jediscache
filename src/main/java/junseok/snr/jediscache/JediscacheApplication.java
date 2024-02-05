package junseok.snr.jediscache;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class JediscacheApplication implements ApplicationRunner {
    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(JediscacheApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        userRepository.save(User.builder().name("junseok").email("junseok@naver.com").build());
        userRepository.save(User.builder().name("haon").email("haon@gmail.com").build());
        userRepository.save(User.builder().name("luha").email("luha@naver.com").build());
        userRepository.save(User.builder().name("hyesoo").email("hyesoo@gmail.com").build());
    }
}
