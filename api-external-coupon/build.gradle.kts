dependencies {
	implementation(project(":client"))
	implementation("org.springframework.boot:spring-boot-starter-web")
}

dependencyManagement {
	imports{
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.1")
	}
}