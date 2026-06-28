package com.cognizant;

public class MyService {
    private final ExternalApi externalApi;

    // Constructor injection (makes it easy to inject mocks)
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
