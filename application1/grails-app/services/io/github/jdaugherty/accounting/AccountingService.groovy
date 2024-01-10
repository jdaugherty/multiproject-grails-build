package io.github.jdaugherty.accounting

import grails.compiler.GrailsCompileStatic
import grails.gorm.transactions.Transactional
import groovy.transform.CompileDynamic
import io.github.jdaugherty.process.ProcessService

@Transactional
@GrailsCompileStatic
class AccountingService {
	ProcessService processService

	void doSomething() {
		processService.execute('aprocess')
	}
}