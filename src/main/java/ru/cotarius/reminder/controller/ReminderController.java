package ru.cotarius.reminder.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.cotarius.reminder.entity.Reminder;
import ru.cotarius.reminder.entity.User;
import ru.cotarius.reminder.service.ReminderService;
import ru.cotarius.reminder.service.UserService;

import java.security.Principal;
import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/remind")
@RequiredArgsConstructor
public class ReminderController {
    private final ReminderService reminderService;
    private final UserService userService;

    @GetMapping
    public String getReminds(Principal principal, Model model) {
        User user = (User) userService.findByUsername(principal.getName());
        List<Reminder> reminds = reminderService.findByUserId(user.getId());
        model.addAttribute("reminds", reminds);
        model.addAttribute("user", user);
        return "reminds";
    }


    @PostMapping
    public String addRemind(Principal principal, String title, String description, LocalDateTime remind) {
        User user = (User) userService.findByUsername(principal.getName());

        Reminder reminder = new Reminder();
        reminder.setTitle(title);
        reminder.setDescription(description);
        reminder.setRemind(remind);
        reminder.setUser(user);

        reminderService.save(reminder);

        return "redirect:/reminds";
    }


}
