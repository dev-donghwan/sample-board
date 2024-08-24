package com.donghwan.javaboard.email;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class EmailSenderUnitTest {

    @Mock
    private JavaMailSender mailSender;

    @InjectMocks
    private EmailSender sender;

    @Test
    @DisplayName("[성공] 이메일 전송")
    void success_email_send() {
        //given
        String givenTo = "test@example.com";
        String givenSubject = "Test Subject";
        String givenBody = "Test Body";

        //when
        sender.send(givenTo, givenSubject, givenBody);

        //then
        ArgumentCaptor<SimpleMailMessage> messageCaptor = ArgumentCaptor.forClass(SimpleMailMessage.class);
        verify(mailSender, times(1)).send(messageCaptor.capture());

        SimpleMailMessage capturedMessage = messageCaptor.getValue();
        assertThat(givenTo).isEqualTo(capturedMessage.getTo()[0]);
        assertThat(givenSubject).isEqualTo(capturedMessage.getSubject());
        assertThat(givenBody).isEqualTo(capturedMessage.getText());
    }

    @Test
    @DisplayName("[실패] 이메일 전송")
    void failure_email_send() {
        //given
        willThrow(MailSendException.class).given(mailSender).send(any(SimpleMailMessage.class));

        //when
        MailSendException exception = assertThrows(MailSendException.class, () -> sender.send("", "", ""));

        //then
        assertThat(exception)
                .isInstanceOf(MailSendException.class);
    }
}