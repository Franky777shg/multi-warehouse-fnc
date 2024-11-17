package com.fnc.domain.event.publisher;

import com.fnc.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
