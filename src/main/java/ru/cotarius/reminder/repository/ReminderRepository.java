package ru.cotarius.reminder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cotarius.reminder.entity.Reminder;

@Repository
public interface ReminderRepository extends JpaRepository<Reminder, Long> {
    Reminder findReminderByTitle(String title);
    Reminder findReminderByDescription(String description);
//    Reminder findReminderByDate(LocalDate date);
//    Reminder findReminderByTime(LocalTime time);
}
