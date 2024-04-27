package ru.cotarius.reminder.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.cotarius.reminder.entity.Reminder;
import ru.cotarius.reminder.repository.ReminderRepository;

@Service
@RequiredArgsConstructor
public class ReminderService {

    private final ReminderRepository reminderRepository;

    public Reminder save(Reminder reminder) {
        return reminderRepository.save(reminder);
    }

    public void delete(Reminder reminder) {
        reminderRepository.delete(reminder);
    }

    public Reminder update(Reminder reminder) {
        //TODO: сделана заглушка
        return reminderRepository.save(reminder);
    }

    public Reminder findByTitle(String title) {
        return reminderRepository.findReminderByTitle(title);
    }

    public Reminder findByDescription(String description) {
        return reminderRepository.findReminderByDescription(description);
    }

//    public Reminder findByDate(LocalDate date) {
//        return reminderRepository.findReminderByDate(date);
//    }
//
//    public Reminder findByTime(LocalTime time) {
//        return reminderRepository.findReminderByTime(time);
//    }
}
