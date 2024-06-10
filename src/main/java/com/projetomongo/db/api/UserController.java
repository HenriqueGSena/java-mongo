package com.projetomongo.db.api;

import com.projetomongo.db.api.request.UserRequestDTO;
import com.projetomongo.db.api.response.UserResponseDTO;
import com.projetomongo.db.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> savesDataUsers(@RequestBody UserRequestDTO userRequestDTO) {
        return ResponseEntity.ok(userService.saveUsers(userRequestDTO));
    }

    @GetMapping
    public ResponseEntity<UserResponseDTO> searchUserByEmail(@RequestParam("email") String email) {
        return ResponseEntity.ok(userService.searchDataUser(email));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteDataUser(@RequestParam("email") String email) {
        userService.deleteDataUser(email);
        return ResponseEntity.accepted().build();
    }
}
