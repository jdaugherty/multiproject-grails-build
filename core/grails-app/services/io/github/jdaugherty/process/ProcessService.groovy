package io.github.jdaugherty.process

import grails.gorm.transactions.Transactional
import org.springframework.transaction.annotation.Propagation

@Transactional(propagation = Propagation.REQUIRES_NEW)
class ProcessService {
	void execute(String example) {
		System.out.println("Do Something")
	}
}