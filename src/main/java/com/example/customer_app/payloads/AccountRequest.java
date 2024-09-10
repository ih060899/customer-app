package com.example.customer_app.payloads;

import com.example.customer_app.constant.AccountStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountRequest {

    @Valid
    private DataPayload data;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DataPayload {
        private AccountStatus accountStatus;
        private boolean lockedAccount;

        @NotEmpty
        private String membershipId;

        @NotEmpty
        private String customerId;

        @Valid
        private Individual individual;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Individual {
        @Valid
        private Identity identity;
        @Valid
        private Contact contact;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Identity {
        @NotEmpty
        @Size(min = 1, max = 50)
        private String firstName;

        @NotEmpty
        @Size(min = 1, max = 50)
        private String lastName;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Contact {
        @Valid
        @Size(min = 1, max = 1)
        private List<Email> emails;

        @Valid
        @Size(min = 1, max = 1)
        private List<Phone> phones;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Email {
        @NotEmpty
        private String address;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Phone {
        @NotEmpty
        private String number;
    }
}
