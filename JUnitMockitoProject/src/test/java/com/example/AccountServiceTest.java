package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccountServiceTest {
    @Test
    void testSuccessfulTransfer() {
        AccountRepository repo = mock(AccountRepository.class);
        NotificationService notifier = mock(NotificationService.class);
        Account from = new Account("A", 1000);
        Account to = new Account("B", 500);

        when(repo.findById("A")).thenReturn(from);
        when(repo.findById("B")).thenReturn(to);

        AccountService service = new AccountService(repo, notifier);
        assertTrue(service.transfer("A", "B", 200));

        assertEquals(800, from.getBalance());
        assertEquals(700, to.getBalance());

        verify(repo, times(2)).update(any());
        verify(notifier).send("Transferred 200.0 from A to B");
    }

    @Test
    void testInsufficientBalance() {
        AccountRepository repo = mock(AccountRepository.class);
        NotificationService notifier = mock(NotificationService.class);
        Account from = new Account("A", 100);
        Account to = new Account("B", 500);

        when(repo.findById("A")).thenReturn(from);
        when(repo.findById("B")).thenReturn(to);

        AccountService service = new AccountService(repo, notifier);
        assertFalse(service.transfer("A", "B", 200));
    }

    @Test
    void testMissingAccount() {
        AccountRepository repo = mock(AccountRepository.class);
        NotificationService notifier = mock(NotificationService.class);

        when(repo.findById("A")).thenReturn(null);

        AccountService service = new AccountService(repo, notifier);
        assertFalse(service.transfer("A", "B", 100));
    }
}
